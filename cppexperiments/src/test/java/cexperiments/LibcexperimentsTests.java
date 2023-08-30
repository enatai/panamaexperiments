package cexperiments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.foreign.Arena;
import java.lang.foreign.SegmentAllocator;
import libcexperiments.A;
import libcexperiments.B;
import libcexperiments.Libcexperiments;
import org.junit.jupiter.api.Test;

/**
 * C related experiments
 * 
 * @author Rel enatai@proton.me
 */
public class LibcexperimentsTests {

    @Test
    public void test_return_struct() {
        var alloc = SegmentAllocator.slicingAllocator(Arena.ofAuto().allocate(B.sizeof()));
        assertEquals(10, A.a$get(B.a$slice(Libcexperiments.returnStruct(alloc))));
    }
}
