package example.cricket;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Batsman {
    protected final BatsmanType batsmanType;

    public Batsman(BatsmanType batsmanType) {
        this.batsmanType = batsmanType;
    }

    public int bat() {
        if (batsmanType == BatsmanType.NORMAL) {
            int min = 0;
            int max = 6;
            return new Random().nextInt((max - min) + 1) + min;
        }
        List<Integer> expectedRunsScored = Arrays.asList(0, 4, 6);
        Random rand = new Random();
        return expectedRunsScored.get(rand.nextInt(expectedRunsScored.size()));
    }
}
