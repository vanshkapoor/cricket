package example.cricket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverTest {
    @Test
    void CheckRunLessThanEqualTo6() {
        Over over =  new Over(36);
        int currentRun = over.currentRun();
        assertTrue(currentRun<=6&&currentRun>=0);
    }

    @Test
    void shouldReturnTrueIfRunsExceedTarget() {
        MockOver over = new MockOver(10);
        int Overruns = over.RunsThisOVer();
        assertEquals(Overruns, 10);
    }
}
