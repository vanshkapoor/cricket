package example.cricket;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DefensiveBatsman implements Batsman{

    @Override
    public int bat() {
        List<Integer> expectedRunsScored = Arrays.asList(0, 1, 2, 3);
        return expectedRunsScored.get(new Random().nextInt(expectedRunsScored.size()));
    }
}
