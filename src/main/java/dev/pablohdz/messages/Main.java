package dev.pablohdz.messages;

// TODO: 6/24/21 create basic endpoint
// TODO: 6/24/21 deploy to heroku
// TODO: 6/24/21 create docker container
// TODO: 6/24/21 create pod kubernetes

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            System.out.println("Start App");
            server.setExecutor(null);
            server.start();

            System.out.println("The server is on in port 8080");
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
            System.out.println("Sorry one errors occurred to create the server");
        }
    }
}
