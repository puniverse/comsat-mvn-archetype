package testgroup.web.it;

import junit.framework.TestCase;

import java.net.URL;
import java.net.HttpURLConnection;

public class WebappIT extends TestCase
{
    private String port = "8080";

    public void setUp() throws Exception
    {
        super.setUp();
        port = System.getProperty("servlet.port");
    }

    public void testCallIndexPage() throws Exception
    {
        URL url = new URL("http://localhost:" + port + "/comsat-servlet-container-jersey-maven-template/fiber-servlet-hello");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();
        assertEquals(200, connection.getResponseCode());
    }
}
