import ws.BankService;

import javax.xml.ws.Endpoint;

public class ServeurJaxWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8686/";
        Endpoint.publish(url,new BankService());
        System.out.println("Web Service deployeé sur "+url);
    }
}
