package skanny.udp.server;

public class Main {

    public static void main(String[] args) {
        int port = 50002;
        // UdpUnicastServer server = new UdpUnicastServer(port);
        UdpUnicastClient client = new UdpUnicastClient(port);
        
        client.run();

    }

}
