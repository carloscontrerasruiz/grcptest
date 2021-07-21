package com.dummy.grcp.greeting.client;


import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLException;

import com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse;
import com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse;
import com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetResponse;
import com.dummy.grcp.greeting.protofilesgreet.GreetServiceGrpc;
import com.dummy.grcp.greeting.protofilesgreet.Greeting;
import com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest;
import com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse;
import com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest;
import com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse;

import io.grpc.Deadline;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GreetingClient {

	private static int respServer = 7;

	public static void main(String[] args) throws SSLException {
		System.out.println("Start client");

		//create the channel
		/*ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
				.usePlaintext()
				.build();*/
		
		//Create secure channel
		ManagedChannel secureChannel = NettyChannelBuilder.forAddress("localhost",9090)
				.sslContext(GrpcSslContexts
								.forClient()
								.trustManager(new File("ssl/ca.crt"))
								.build()
							).build();

		//calling unary client
		//GreetingClient.unaryClient(channel);

		//Calling stream server client
		//GreetingClient.streamServerClient(channel);

		//Calling stream client CLIENT
		//GreetingClient.streamClient_Client(channel);

		//Calling bidirectional streaming
		//GreetingClient.bidireccionalStream(channel);

		//calling test random numbers
		//GreetingClient.testBidireccionalStream(channel);

		//deadline
		GreetingClient.unaryClientDeadline(secureChannel);

		System.out.println("Shutting down channel");
		secureChannel.shutdown();
	}



	private static void unaryClient(ManagedChannel channel) {
		//unary client block stub
		GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

		//create request
		Greeting greeting = Greeting.newBuilder()
				.setFirstName("Carlos")
				.setLastName("CC")
				.build();
		GreetRequest request = GreetRequest.newBuilder()
				.setGreeting(greeting)
				.build();

		//call server and print response
		GreetResponse response = greetClient.greet(request);
		System.out.println(response.getResult());
	}

	private static void streamServerClient(ManagedChannel channel) {
		//streamServer client block stub
		GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

		GreetManyTimesRequest request = GreetManyTimesRequest
				.newBuilder()
				.setGreeting(
						Greeting.newBuilder()
						.setFirstName("Carlos")
						.setLastName("CC server Stream")
						)
				.build();


		greetClient.greetManyTimes(request)
		.forEachRemaining(response ->{
			System.out.println(response.getResult());
		});

	}

	private static void streamClient_Client(ManagedChannel channel) {
		GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

		CountDownLatch latch = new CountDownLatch(1);

		StreamObserver<LongGreetRequest> requestObserver = asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {

			@Override
			public void onNext(LongGreetResponse value) {
				// We get a response from server
				//par este tipo de llamada este metodo solo se ejecutara una vez ya que 
				//el stream los hace el cliente el servidor solo enviara una respuesta
				System.out.println("Recevied response from the server ");
				System.out.println(value.getResult());
			}

			@Override
			public void onError(Throwable t) {
				// we get an error from server 

			}

			@Override
			public void onCompleted() {
				// the server is done sending us data 
				//se ejecutar una vez he inmediatamente dspues del onNext
				System.out.println("The server is completed to send data");
				latch.countDown();
			}
		});


		for (int i = 0; i < 10; i++) {

			System.out.println("Enviando mensaje "+i);

			requestObserver.onNext(
					LongGreetRequest
					.newBuilder()
					.setGreeting(
							Greeting
							.newBuilder()
							.setFirstName("Carlos "+i)
							.setLastName(" CC client Stream")
							.build()
							)
					.build()
					);
		}

		//Le decimos al servidor que terminamos de enviar informacion
		requestObserver.onCompleted();

		try {
			latch.await(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	private static void bidireccionalStream(ManagedChannel channel) {

		GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

		CountDownLatch latch = new CountDownLatch(1);

		StreamObserver<GreetEveryoneRequest>  requestObserver = asyncClient.greetEveryone(new StreamObserver<GreetEveryoneResponse>() {

			@Override
			public void onNext(GreetEveryoneResponse value) {
				System.out.println("Response from server "+ value.getResult());
			}

			@Override
			public void onError(Throwable t) {
				System.out.println(t.getMessage());
			}

			@Override
			public void onCompleted() {
				System.out.println("El servidor termino de regresar info");
				latch.countDown();
			}
		});

		Arrays.asList("Carlos","cc","Maria","Martha").forEach(
				name->{
					try {
						System.out.println("RequestClient :"+name);
						requestObserver.onNext(GreetEveryoneRequest.newBuilder()
								.setGreeting(Greeting.newBuilder()
										.setFirstName(name)
										.build()
										).build());


						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}catch(StatusRuntimeException e){
						System.out.println(e.getMessage());
					}
				}
				);

		requestObserver.onCompleted();
		try {
			latch.await(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	private static void testBidireccionalStream(ManagedChannel channel) {

		Random randNumber = new Random();

		GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

		CountDownLatch latch = new CountDownLatch(1);


		StreamObserver<TestGreetRequest>  requestObserver = asyncClient.greetTest(
				new StreamObserver<TestGreetResponse>() {

					@Override
					public void onNext(TestGreetResponse value) {
						System.out.println("Response from server "+ value.getNumber());
					}

					@Override
					public void onError(Throwable t) {

					}

					@Override
					public void onCompleted() {
						System.out.println("El servidor termino de regresar info");
						latch.countDown();
					}
				});


		for (int i = 0; i < 100; i++) {
			int rand = randNumber.nextInt(10);
			if(rand == GreetingClient.respServer) {
				System.out.println("Se termina respuesta del client "+GreetingClient.respServer+" -- "+rand);
				break;
			}else {
				System.out.println("Se envia request al servifor "+rand);
				requestObserver.onNext(TestGreetRequest.newBuilder()
						.setNumber(rand)
						.build()
						);

			}
		}

		requestObserver.onCompleted();

		try {
			latch.await(3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void unaryClientDeadline(ManagedChannel channel) {

		//unary client block stub
		GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

		//create request
		Greeting greeting = Greeting.newBuilder()
				.setFirstName("Carlos")
				.setLastName("CC")
				.build();
		GreetDeadlineRequest request = GreetDeadlineRequest.newBuilder()
				.setGreeting(greeting)
				.build();

		//add deadline
		try {
			GreetDeadlineResponse response = greetClient.withDeadline(Deadline.after(2000, TimeUnit.MILLISECONDS))
					.greetDeadline(request);
			System.out.println(response.getResult());
		}catch(StatusRuntimeException e) {
			if (e.getStatus() == Status.DEADLINE_EXCEEDED) {
				System.out.println("Time excedded");
			}else {
				e.printStackTrace();
			}
		}

		//add deadline
		try {
			GreetDeadlineResponse response = greetClient.withDeadline(Deadline.after(100, TimeUnit.MILLISECONDS))
					.greetDeadline(request);
			System.out.println(response.getResult());
		}catch(StatusRuntimeException e) {
			if (e.getStatus().getCode() == Status.DEADLINE_EXCEEDED.getCode()) {
				System.out.println("Time excedded");
			}else {
				e.printStackTrace();
			}
			
		}



	}

}


























