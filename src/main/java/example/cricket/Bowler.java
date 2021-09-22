package example.cricket;

import java.util.Random;

public class Bowler {

    protected final BowlerType bowlertype;

    public Bowler(BowlerType bowlertype) {
        this.bowlertype = bowlertype;
    }

    public int bowl(){
        int min = 0;
        int max = 6;
        return new Random().nextInt((max - min) + 1) + min;
    }
}
