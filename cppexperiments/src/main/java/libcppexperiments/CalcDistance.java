package libcppexperiments;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

/**
 * Currently jextract will treat calcDistance as C function and will not use mangled symbol for it.
 * 
 * This class provides workaround for it by calling mangled symbol instead.
 */
public class CalcDistance {

    static final MethodHandle mh = RuntimeHelper.downcallHandle(
        "_ZN5happy12calcDistanceEPNS_5PointE",
        constants$0.const$1
    );

    public static int calcDistance(MemorySegment p) {
        try {
            return (int)mh.invokeExact(p);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}
