package example.cricket;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class MatchTest {

    @Test
    void shouldReturnTrueIfBatsmanWon() {
        Bowler mockBowler = Mockito.mock(Bowler.class);
        Batsman mockBatsman = Mockito.mock(NormalBatsman.class);
        Match match = new Match(10, 2, mockBatsman, mockBowler);

        when(mockBatsman.bat()).thenReturn(2);
        when(mockBatsman.bat()).thenReturn(3);

        match.playOver();
        boolean batsmanWon = match.isBatsmanWon();

        assertTrue(batsmanWon);
    }
    @Test
    void shouldReturnFalseIfBatsmanCouldNotChaseTarget() {
        Bowler mockBowler = Mockito.mock(Bowler.class);
        Batsman mockBatsman = Mockito.mock(Batsman.class);
        Match match = new Match(50, 2, mockBatsman, mockBowler);

        when(mockBatsman.bat()).thenReturn(2);
        when(mockBowler.bowl()).thenReturn(2);

        match.playOver();
        boolean batsmanWon = match.isBatsmanWon();
        assertFalse(batsmanWon);
    }

    @Test
    void shouldReturnFalseIfBatsmanOutBeforeCompletingTarget() {
        Bowler mockBowler = Mockito.mock(Bowler.class);
        Batsman mockBatsman = Mockito.mock(Batsman.class);
        Match match = new Match(5, 2, mockBatsman, mockBowler);

        when(mockBatsman.bat()).thenReturn(2);
        when(mockBowler.bowl()).thenReturn(2);

        match.playOver();
        boolean batsmanWon = match.isBatsmanWon();
        assertFalse(batsmanWon);
    }


}
