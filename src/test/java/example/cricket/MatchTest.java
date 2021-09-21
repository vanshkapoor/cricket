package example.cricket;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatchTest {

    @Test
    void shouldReturnTrueIfBatsmanWon() {
        MockBatsman mockBatsman = new MockBatsman(BatsmanType.NORMAL);
        MockBowler mockBowler = new MockBowler();
        Match match = new Match(10, 2, mockBatsman, mockBowler);

        match.playOver();
        boolean batsmanWon = match.isBatsmanWon();
        assertTrue(batsmanWon);
    }
    @Test
    void shouldReturnFalseIfBatsmanLost() {
        MockBatsman mockBatsman = new MockBatsman(BatsmanType.NORMAL);
        MockBowler mockBowler = new MockBowler();
        Match match = new Match(40, 2, mockBatsman, mockBowler);

        match.playOver();
        boolean batsmanWon = match.isBatsmanWon();
        assertFalse(batsmanWon);
    }

    @Test
    void shouldReturnTrueIfHitterBatsmanWon() {
        MockBatsman mockBatsman = new MockBatsman(BatsmanType.HITTER);
        MockBowler mockBowler = new MockBowler();
        Match match = new Match(10, 2, mockBatsman, mockBowler);

        match.playOver();
        boolean batsmanWon = match.isBatsmanWon();
        assertTrue(batsmanWon);
    }
    @Test
    void shouldReturnFalseIfHitterBatsmanLost() {
        MockBatsman mockBatsman = new MockBatsman(BatsmanType.HITTER);
        MockBowler mockBowler = new MockBowler();
        Match match = new Match(50, 2, mockBatsman, mockBowler);

        match.playOver();
        boolean batsmanWon = match.isBatsmanWon();
        assertFalse(batsmanWon);
    }

}
