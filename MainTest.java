import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void reverseString() {
        String test1 = "Hello";
        String test1Expect = "olleH";
        assertEquals(test1Expect, Main.reverseString(test1));

        String test2 = "";
        String test2Expect = "";
        assertEquals(test2Expect, Main.reverseString(test2));

        String test3 = "Hello World!";
        String test3Expect = "!dlroW olleH";
        assertEquals(test3Expect, Main.reverseString(test3));
    }
}