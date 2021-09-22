package example.cricket;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BatsmanTest {
    @Test
    void shouldReturnRunsScoredBetweenZeroAndSixWhenBatsmanIsNormal() {
        Batsman batsman = new NormalBatsman();
        int currentRun = batsman.bat();
        assertTrue(currentRun <= 6 && currentRun >= 0);
    }

    @Test
    void shouldReturnRunsScoredZeroOrFourOrSixWhenBatsmanIsHitter() {
        Batsman batsman = new HitterBatsman();
        int currentRun = batsman.bat();
        List<Integer> expectedRuns = Arrays.asList(0, 4, 6);
        assertTrue(expectedRuns.contains(currentRun));
    }

    @Test
    void shouldReturnRunsScoredBetweenZeroAndThreeWhenBatsmanIsDefensive() {
        Batsman batsman = new HitterBatsman();
        int currentRun = batsman.bat();
        List<Integer> expectedRuns = Arrays.asList(0, 1, 2, 3);
        assertTrue(expectedRuns.contains(currentRun));
    }
}
