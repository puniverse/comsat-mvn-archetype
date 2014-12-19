package ${groupId};

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;

import java.io.IOException;

/**
 * NOP implementation of the {@link PersistenceService}
 *
 * @author circlespainter
 */
public class NOPPersistenceServiceImpl implements PersistenceService {

    @Override
    @Suspendable
    public void store(Data pb) throws IOException, InterruptedException, SuspendExecution  {
        Fiber.sleep(1000);
    }
}