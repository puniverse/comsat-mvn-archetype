package ${groupId};

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;
import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author circlespainter
 */
@Singleton
@Path("/")
public class Resource {
    @Inject
    PersistenceService ps;

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    @Suspendable
    public String hello() throws SuspendExecution, InterruptedException {
        Fiber.sleep(100);
        return "Hello world";
    }

    @POST
    @Path("data")
    @Consumes(MediaType.APPLICATION_JSON)
    @Suspendable
    public void store(Data data) throws IOException, InterruptedException, SuspendExecution  {
        ps.store(data);
    }
}