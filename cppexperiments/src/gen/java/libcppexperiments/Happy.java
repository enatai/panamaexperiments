// Generated by jextract

package libcppexperiments;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class Happy  {

    public static final OfByte C_CHAR = JAVA_BYTE;
    public static final OfShort C_SHORT = JAVA_SHORT;
    public static final OfInt C_INT = JAVA_INT;
    public static final OfLong C_LONG = JAVA_LONG;
    public static final OfLong C_LONG_LONG = JAVA_LONG;
    public static final OfFloat C_FLOAT = JAVA_FLOAT;
    public static final OfDouble C_DOUBLE = JAVA_DOUBLE;
    public static final AddressLayout C_POINTER = RuntimeHelper.POINTER;
    public static MethodHandle return10$MH() {
        return RuntimeHelper.requireNonNull(constants$2.const$6,"_ZN5happy8return10Ev");
    }
    /**
     * {@snippet :
     * int return10();
     * }
     */
    public static int return10() {
        var mh$ = return10$MH();
        try {
            return (int)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle calcDistance$MH() {
        return RuntimeHelper.requireNonNull(constants$3.const$0,"_Z12calcDistancePN5happy5PointE");
    }
    /**
     * {@snippet :
     * int calcDistance(struct Point* p);
     * }
     */
    public static int calcDistance(MemorySegment p) {
        var mh$ = calcDistance$MH();
        try {
            return (int)mh$.invokeExact(p);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


