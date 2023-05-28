// Generated by jextract

package libcppexperiments;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 *  * int distance(struct Point* this$);
 * }
 */
public class Point {

    public static MemoryLayout $LAYOUT() {
        return constants$0.const$0;
    }
    public static MethodHandle distance$MH() {
        return RuntimeHelper.requireNonNull(constants$0.const$2,"_ZN5happy5Point8distanceEv");
    }
/**
 * {@snippet :
 * int distance(struct Point* this$);
 * }
 */
    public static int distance(MemorySegment this$) {
        var mh$ = distance$MH();
        try {
            return (int)mh$.invokeExact(this$);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

