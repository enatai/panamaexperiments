package cppexperiments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import libcppexperiments.CalcDistance;
import libcppexperiments.Point2d;
import libcppexperiments.Point3d;
import org.junit.jupiter.api.Test;

/**
 * @author Rel enatai@proton.me
 */
public class HappyTests {

    @Test
    public void test_class() {
        var pointPtr = Arena.ofAuto().allocate(Point2d.sizeof());
        Point2d.Point2d(pointPtr, 10, 12);
        assertEquals("[x=10,y=12]", toStringPoint2d(pointPtr));
        assertEquals(123, Point2d.distance(pointPtr));
    }
    
    @Test
    public void test_class_with_override_method() {
        var pointPtr = Arena.ofAuto().allocate(Point3d.sizeof());
        Point3d.Point3d(pointPtr, 10, 12, 14);
        assertEquals("[x=10,y=12,z=14]", toStringPoint3d(pointPtr));
        assertEquals(123, Point2d.distance(pointPtr));
        assertEquals(10, Point2d.getX(pointPtr));
        assertEquals(222, Point3d.distance(pointPtr));
    }
    
    @Test
    public void test_dynamic_dispatch() {
        var point2dPtr = Arena.ofAuto().allocate(Point2d.sizeof());
        Point2d.Point2d(point2dPtr, 20, 22);
        var point3dPtr = Arena.ofAuto().allocate(Point3d.sizeof());
        Point3d.Point3d(point3dPtr, 30, 32, 34);
        assertEquals(123, CalcDistance.calcDistance(point2dPtr));
        assertEquals(222, CalcDistance.calcDistance(point3dPtr));
    }

    private String toStringPoint2d(MemorySegment pointPtr) {
        return "[x=" + Point2d.getX(pointPtr) + ",y=" + Point2d.getY(pointPtr) + "]";
    }
    
    private String toStringPoint3d(MemorySegment pointPtr) {
        return "[x=" + Point2d.getX(pointPtr) + ",y=" + Point2d.getY(pointPtr) + ",z=" + Point3d.getZ(pointPtr) +"]";
    }
}
