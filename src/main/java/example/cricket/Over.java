package example.cricket;

import java.util.Random;

import static java.lang.Math.*;

public class Over {

    private final int target;
    private int sum;

    public Over(int i) {
        this.target = i;
        this.sum=0;
    }

    public int currentRun() {
        int max = 6;
        int min=0;
        Random random = new Random();
        int runScored = random.nextInt((max-min)+1)+min;
        return runScored;
    }

    public int RunsThisOVer()
    {
        int cnt=0;
        while(sum<target&&cnt<6)
        {
            sum+=currentRun();
            cnt++;
        }
        return sum;
    }

}
