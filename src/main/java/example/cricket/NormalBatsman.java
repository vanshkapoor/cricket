package example.cricket;

import java.util.Random;

public class NormalBatsman implements Batsman{

    @Override
    public int bat() {
        int min = 0;
        int max = 6;
        return new Random().nextInt((max - min) + 1) + min;
    }
}