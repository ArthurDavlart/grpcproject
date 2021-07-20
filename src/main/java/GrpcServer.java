import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.GreeterServiceImpl;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new GreeterServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }
}
