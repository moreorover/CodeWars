package kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringRepeatTests {
    @Test
    void test4a() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    }

    @Test
    void test3Hello() {
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }

    @Test
    void test5empty() {
        assertEquals("", StringRepeat.repeatStr(5, ""));
    }

    @Test
    void test0kata() {
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }
}
