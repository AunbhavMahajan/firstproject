package main.java.server;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

public class GrizzlyServer {

    public static void main(String[] args) throws IOException {
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        ResourceConfig resourceConfig = new ResourceConfig(RestResource.class);
        GrizzlyHttpServerFactory.createHttpServer(baseUri, resourceConfig);
        System.out.println("Press enter to stop the server...");
        System.in.read();
    }
}
