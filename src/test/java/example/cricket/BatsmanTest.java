package example.cricket;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BatsmanTest {
    @Test
    void CheckRunLessThanEqualTo6() {
        Batsman batsman = new Batsman(BatsmanType.NORMAL);
        int currentRun = batsman.bat();
        assertTrue(currentRun <= 6 && currentRun >= 0);
    }

    @Test
    void shouldReturnRunsScoredWhenBatsmanIsHitter() {
        Batsman batsman = new Batsman(BatsmanType.HITTER);
        int currentRun = batsman.bat();
        List<Integer> expectedRuns = Arrays.asList(0, 4, 6);
        assertTrue(expectedRuns.contains(currentRun));
    }
}
