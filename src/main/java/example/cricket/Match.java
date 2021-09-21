package example.cricket;

public class Match {

    private final int target;
    private int numberOfOvers;
    private Bowler bowler;
    private final Batsman batsman;
    private int runsScored;

    public Match(int target, int numberOfOvers, Batsman batsman, Bowler bowler) {
        this.target = target;
        this.numberOfOvers = numberOfOvers;
        this.bowler = bowler;
        this.runsScored = 0;
        this.batsman = batsman;
    }

    public void playOver() {
        int ballsThrown = 0;
        int sum = 0;
        if (!isBatsmanWon()) {
            while (ballsThrown < 6 * numberOfOvers) {
                int runsByBatsman = batsman.bat();
                int runsByBowler = bowler.bowl();
                if (isBatsmanOut(runsByBatsman, runsByBowler)) break;
                sum += runsByBatsman;
                ballsThrown++;
            }
        }
        runsScored = sum;
    }

    private boolean isBatsmanOut(int runsByBatsman, int runsByBowler) {
        return runsByBatsman == runsByBowler;
    }

    public boolean isBatsmanWon() {
        return runsScored >= target;
    }
}
