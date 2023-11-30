package ji;

import static org.junit.Assert.*;
import org.junit.Test;

import ji.PASET7.Line;
import ji.PASET7.Vector2;

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

    @Test
    public void LineCheck_PS7() {
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);

        assertEquals(-1.25, slope1, 0.01);
        assertEquals(true, onLine1);

        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5, -2);

        assertEquals(0.625, slope2, 0.001);
        assertEquals(false, onLine2);
    }

    @Test
    public void VectorCheck_PS7() {
        Vector2 v1 = new Vector2(1, 0);
        
        v1 = v1.add(v1);

        assertEquals(2, v1.r, 0.0);
        assertEquals(0, v1.theta, 0.0);
        
        v1 = v1.add(new Vector2(2, 7));

        assertEquals(3.745, v1.r, 0.001);
        assertEquals(0.358, v1.theta, 0.001);

        Vector2 v2 = v1.scalarMultiply(4);

        assertEquals(14.983, v2.r, 0.001);
        assertEquals(0.358, v2.theta, 0.001);

        Vector2 v3 = v2.subtract(v1);

        assertEquals(11.237, v3.r, 0.001);
        assertEquals(0.358, v3.theta, 0.001);
    }
}