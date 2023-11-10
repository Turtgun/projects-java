package ji;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    @Test
    public void AdditionPatternCheck() {
        AdditionPattern plus3 = new AdditionPattern(2, 3);

        assertEquals(2, plus3.currentNumber());
        
        plus3.next();

        assertEquals(5, plus3.currentNumber());

        plus3.next();
        plus3.next();

        assertEquals(11, plus3.currentNumber());

        plus3.prev();
        plus3.prev();
        plus3.prev();

        assertEquals(2,plus3.currentNumber());

        plus3.prev();

        assertEquals(2,plus3.currentNumber());
    }

    @Test
    public void FrogHopperCheck() {
        FrogHopper tr = new FrogHopper(2.75);

        assertEquals(0, tr.qualifyingJumps());
        assertEquals(0.0, tr.averageDistance(), 0.001);

        tr.addJumpDistance(2.5);
        tr.addJumpDistance(1.75);
        
        assertEquals(0, tr.qualifyingJumps());
        assertEquals(2.125, tr.averageDistance(), 0.001);

        tr.addJumpDistance(3.0);

        assertEquals(1, tr.qualifyingJumps());
        assertEquals(2.416, tr.averageDistance(), 0.001);

        tr.addJumpDistance(2.75);
        tr.addJumpDistance(2.7);

        assertEquals(2, tr.qualifyingJumps());
        assertEquals(2.54, tr.averageDistance(), 0.001);
    }
}
