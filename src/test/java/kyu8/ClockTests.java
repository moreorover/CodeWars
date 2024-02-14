package kyu8;

import org.example.kyu8.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockTests {
    @Test
    void test1(){
        assertEquals(61000, Clock.Past(0,1,1));
    }
}
