package com.dummy.grcp.greeting.server;

import java.util.Random;

import com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetDeadlineResponse;
import com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetEveryoneResponse;
import com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetManyTimesResponse;
import com.dummy.grcp.greeting.protofilesgreet.GreetRequest;
import com.dummy.grcp.greeting.protofilesgreet.GreetResponse;
import com.dummy.grcp.greeting.protofilesgreet.GreetServiceGrpc.GreetServiceImplBase;
import com.dummy.grcp.greeting.protofilesgreet.Greeting;
import com.dummy.grcp.greeting.protofilesgreet.LongGreetRequest;
import com.dummy.grcp.greeting.protofilesgreet.LongGreetResponse;
import com.dummy.grcp.greeting.protofilesgreet.TestGreetRequest;
import com.dummy.grcp.greeting.protofilesgreet.TestGreetResponse;

import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceImplBase{

	@Override
	public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {

		//Estract greeting
		Greeting greeting = request.getGreeting();
		String firstName = greeting.getFirstName();

		String lastname = greeting.getLastName();

		//create rsponse 
		String result = "Hello "+ firstName + " " + lastname;
		GreetResponse response = GreetResponse .newBuilder()
				.setResult(result)
				.build();

		//send response 
		responseObserver.onNext(response);

		//complete the rpc call
		responseObserver.onCompleted();
		//super.greet(request, responseObserver);
	}

	@Override
	public void greetManyTimes(GreetManyTimesRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {

		String firstName = request.getGreeting().getFirstName();
		String lastname = request.getGreeting().getLastName();
		try {
			for (int i = 0; i < 10; i++) {
				String result = "Hello "+firstName + " "+ lastname + " times "+i;
				GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder()
						.setResult(result)
						.build();

				responseObserver.onNext(response);

				Thread.sleep(1000);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			responseObserver.onCompleted();
		}

		//super.greetManyTimes(request, responseObserver);
	}

	@Override
	public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {

		StreamObserver<LongGreetRequest> requestObserver = new StreamObserver<LongGreetRequest>() {

			String result = "";

			@Override
			public void onNext(LongGreetRequest value) {
				//Client sends a message
				result += " Hello "+value.getGreeting().getFirstName() + " " 
						+ value.getGreeting().getLastName() + " !!!!! " ;
			}

			@Override
			public void onError(Throwable t) {
				// Client send an error

			}

			@Override
			public void onCompleted() {
				// Client is done
				//Aqui queremos retornar el responseObserver
				responseObserver.onNext(LongGreetResponse
						.newBuilder()
						.setResult(result)
						.build());
				responseObserver.onCompleted();
			}

		};

		return requestObserver;
		//return super.longGreet(responseObserver);
	}

	@Override
	public StreamObserver<GreetEveryoneRequest> greetEveryone(StreamObserver<GreetEveryoneResponse> responseObserver) {

		StreamObserver<GreetEveryoneRequest> requestObserver = new StreamObserver<GreetEveryoneRequest>() {

			@Override
			public void onNext(GreetEveryoneRequest value) {

				if(value.getGreeting().getFirstName().equalsIgnoreCase("CC")) {
					responseObserver.onError(Status.INVALID_ARGUMENT
							.withDescription("Nombre no permitido "+value.getGreeting().getFirstName())
							.augmentDescription("Manda otro nombre")
							.asRuntimeException()
							);
				}else {
					String response = "Hello "+value.getGreeting().getFirstName()+" "+value.getGreeting().getLastName();

					GreetEveryoneResponse greetResponse = GreetEveryoneResponse.newBuilder()
							.setResult(response)
							.build();

					responseObserver.onNext(greetResponse);
				}

			}

			@Override
			public void onError(Throwable t) {
				System.out.println(t.getMessage());
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};

		return requestObserver;
		//return super.greetEveryone(responseObserver);
	}


	@Override
	public StreamObserver<TestGreetRequest> greetTest(StreamObserver<TestGreetResponse> responseObserver) {

		Random randNumber = new Random();

		StreamObserver<TestGreetRequest> requestObserver = new StreamObserver<TestGreetRequest>() {

			@Override
			public void onNext(TestGreetRequest value) {

				System.out.println("Server send the stream "+randNumber.nextInt(10));
				TestGreetResponse response = TestGreetResponse.newBuilder()
						.setNumber(randNumber.nextInt(10))
						.build();
				responseObserver.onNext(response);

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}

		};

		return requestObserver;
	}
	
	
	@Override
	public void greetDeadline(GreetDeadlineRequest request, StreamObserver<GreetDeadlineResponse> responseObserver) {
		
		Context current = Context.current();
		
		for (int i = 0; i < 3; i++) {
			if (!current.isCancelled()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				return; 
			}
			
		}
		
		System.out.println("Send response");
		responseObserver.onNext(
				GreetDeadlineResponse.newBuilder()
				.setResult("Hola "+request.getGreeting().getFirstName())
				.build());
		
		responseObserver.onCompleted();
	}

}
