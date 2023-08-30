// Generated by jextract

package libcexperiments;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct A {
 *     int a;
 *     int b;
 * };
 * }
 */
public class A {

    public static MemoryLayout $LAYOUT() {
        return constants$0.const$0;
    }
    public static VarHandle a$VH() {
        return constants$0.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int a;
     * }
     */
    public static int a$get(MemorySegment seg) {
        return (int)constants$0.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int a;
     * }
     */
    public static void a$set(MemorySegment seg, int x) {
        constants$0.const$1.set(seg, x);
    }
    public static int a$get(MemorySegment seg, long index) {
        return (int)constants$0.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void a$set(MemorySegment seg, long index, int x) {
        constants$0.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle b$VH() {
        return constants$0.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int b;
     * }
     */
    public static int b$get(MemorySegment seg) {
        return (int)constants$0.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int b;
     * }
     */
    public static void b$set(MemorySegment seg, int x) {
        constants$0.const$2.set(seg, x);
    }
    public static int b$get(MemorySegment seg, long index) {
        return (int)constants$0.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void b$set(MemorySegment seg, long index, int x) {
        constants$0.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


