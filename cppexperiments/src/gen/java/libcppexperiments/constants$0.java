// Generated by jextract

package libcppexperiments;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(8)
    ).withName("Point");
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_ZN5happy5Point8distanceEv",
        constants$0.const$1
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(8),
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y")
    ).withName("Point2d");
    static final VarHandle const$4 = constants$0.const$3.varHandle(MemoryLayout.PathElement.groupElement("x"));
    static final VarHandle const$5 = constants$0.const$3.varHandle(MemoryLayout.PathElement.groupElement("y"));
}


