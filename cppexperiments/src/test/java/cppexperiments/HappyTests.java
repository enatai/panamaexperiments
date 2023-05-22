package cppexperiments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import libcppexperiments.Point2d;
import org.junit.jupiter.api.Test;

/**
 * @author Rel enatai@proton.me
 */
public class HappyTests {

    @Test
    public void test() {
        var pointPtr = Arena.ofAuto().allocate(Point2d.sizeof());
        Point2d.Point2d(pointPtr, 10, 12);
        assertEquals("[x=10,y=12]", toString(pointPtr));
        assertEquals(123, Point2d.distance(pointPtr));
    }
    
    private String toString(MemorySegment pointPtr) {
        return "[x=" + Point2d.getX(pointPtr) + ",y=" + Point2d.getY(pointPtr) + "]";
    }
}
