package testgroup.web;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;

import java.io.IOException;

/**
 * @author circlespainter
 */
public interface PersistenceService {
    @Suspendable
    public void store(Data d) throws IOException, InterruptedException, SuspendExecution;
}
