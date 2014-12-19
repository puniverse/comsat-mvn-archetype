package ${groupId};

import junit.framework.TestCase;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import java.net.URL;
import java.net.HttpURLConnection;

public class WebAppIT extends TestCase {
    private String port = "8080";

    public void setUp() throws Exception {
        super.setUp();
        port = System.getProperty("servlet.port");
    }

    public void testCallIndexPage() throws Exception {
        URL url = new URL("http://localhost:" + port + "/${artifactId}/fiber-servlet-hello");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        assertEquals(200, connection.getResponseCode());
    }

    public void testCallRest() throws Exception {
        Client client = ClientBuilder.newBuilder().build();
        String payload = "{\"f1\" : \"v1\", \"f2\" : \"v2\"}";
        assertEquals(200, client.target("http://localhost" + port + "/${artifactId}/fiber-jaxrs/data").request().post(Entity.entity(payload, MediaType.APPLICATION_JSON)).getStatus());
    }
}