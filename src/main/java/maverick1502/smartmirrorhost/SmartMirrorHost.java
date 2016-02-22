package maverick1502.smartmirrorhost;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;


public class SmartMirrorHost {

    private static HttpServer server;

    public static void main(String args[])
    {
        String server = "localhost";
        String port = "8080";
        String address = "api";

        try
        {
            if(args.length == 3)
            {
                server = args[0];
                port = args[1];
                address = args[2];
            }

            String httpServerString = String.format("http://%s:%s/%s", server, port, address);

            setServer(HttpServerFactory.create( httpServerString ));
            getServer().start();

            System.out.println( "Server started..." );
            System.out.println( httpServerString );

            Runtime.getRuntime().addShutdownHook( new Thread() {
                @Override public void run() {
                    getServer().stop( 0 );
                    System.out.println("Server stopped");
                }
            } );

        }
        catch(Exception ex)
        {
            System.out.println("Error: " + ex.toString());
        }
    }

    private static HttpServer getServer() {
        return server;
    }

    private static void setServer(HttpServer server) {
        SmartMirrorHost.server = server;
    }
}
