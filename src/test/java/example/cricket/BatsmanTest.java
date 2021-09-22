package example.cricket;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BatsmanTest {
    @Test
    void shouldReturnRunsScoreBetweenZeroAndSixWhenBatsmanIsNormal() {
        Batsman batsman = new NormalBatsman();

        int currentRun = batsman.bat();

        assertTrue(currentRun <= 6 && currentRun >= 0);
    }

    @Test
    void shouldReturnRunsScoreZeroOrFourOrSixWhenBatsmanIsHitter() {
        Batsman batsman = new HitterBatsman();
        List<Integer> expectedRuns = Arrays.asList(0, 4, 6);

        int currentRun = batsman.bat();

        assertTrue(expectedRuns.contains(currentRun));
    }

    @Test
    void shouldReturnRunsScoreBetweenZeroAndThreeWhenBatsmanIsDefensive() {
        Batsman batsman = new DefensiveBatsman();
        List<Integer> expectedRuns = Arrays.asList(0, 1, 2, 3);

        int currentRun = batsman.bat();

        assertTrue(expectedRuns.contains(currentRun));
    }
}
