package testgroup.web;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Jersey's configuration class
 *
 * @author circlespainter
 */
public class JerseyApplication extends ResourceConfig {
    public JerseyApplication() {
        register(JacksonFeature.class); // Support jackson
    }
}