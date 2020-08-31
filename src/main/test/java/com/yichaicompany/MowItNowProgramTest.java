package com.yichaicompany;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MowItNowProgramTest {

    @Nested
    class NoCommandSent {

        @Test
        void shouldNotMoveMower() {
            assertFinalMowPosition("00N", 0, 0, 'N');
            assertFinalMowPosition("11N", 1, 1, 'N');
        }

    }

    private void assertFinalMowPosition(String expectedFinalMowPosition,
                                        int finalMowPositionX,
                                        int finalMowPositionY,
                                        Character finalMowOrientation) {
        assertEquals(expectedFinalMowPosition, new MowItNowProgram().mow(finalMowPositionX, finalMowPositionY, finalMowOrientation));
    }


}