package testgroup.web;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;
import java.io.IOException;

import javax.inject.Singleton;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author circlespainter
 */
@Singleton
@Path("/")
public class Resource {
    /* @Inject */ PersistenceService ps = new NOPPersistenceServiceImpl();

    @POST
    @Path("data")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Suspendable
    public void store(Data data) throws IOException, InterruptedException, SuspendExecution  {
        ps.store(data);
    }
}
