package example.cricket;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum BatsmanType {

    NORMAL{
        @Override
        public int bat(){
            int min = 0;
            int max = 6;
            return new Random().nextInt((max - min) + 1) + min;
        }
    },
    HITTER{
        @Override
        public int bat(){
            List<Integer> expectedRunsScored = Arrays.asList(0, 4, 6);
            return expectedRunsScored.get(new Random().nextInt(expectedRunsScored.size()));
        }
    };
    public abstract int bat();
}
