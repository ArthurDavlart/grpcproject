//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import io.grpc.examples.GreeterGrpc;
//import io.grpc.examples.HelloReply;
//import io.grpc.examples.HelloRequest;
//
//public class GrpcClient {
//    public static void main(String[] args) {
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
//                .usePlaintext()
//                .build();
//
//        GreeterGrpc.GreeterBlockingStub stub
//                = GreeterGrpc.newBlockingStub(channel);
//
//        HelloReply helloResponse = stub.sayHello(HelloRequest.newBuilder()
//                .setName("Baeldung gRPC")
//                .build());
//
//        channel.shutdown();
//    }
//}