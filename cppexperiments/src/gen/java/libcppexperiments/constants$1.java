// Generated by jextract

package libcppexperiments;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_ZN5happy7Point2dC1Eii",
        constants$1.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_ZN5happy7Point2d4getXEv",
        constants$0.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_ZN5happy7Point2d4getYEv",
        constants$0.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_ZN5happy7Point2d8distanceEv",
        constants$0.const$1
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(16),
        JAVA_INT.withName("z"),
        MemoryLayout.paddingLayout(4)
    ).withName("Point3d");
}


