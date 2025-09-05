import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertEquals(){
        int expected = 10;
        int actual = 5 + 5;
        assertEquals(expected, actual, "Values should match");
    }
    @Test
    void testAssertTrue(){
        assertTrue( 3<4, "Condition should be true");
    }

    @Test
    void testAssertFalse(){
        assertFalse(10<5, "Condition should be false");
    }

    @Test
    void testAssertNull(){
        Object obj = null;
        assertNull(obj, "Object should be null");
    }

    @Test
    void testAssertNotNull(){
        String str = "JUnit";
        assertNotNull(str, "String should not be null");
    }

    @Test
    void testAssertArrayEquals(){
        int[] expected = {1, 2, 3};
        int[] actual = {1,2,3};
        assertArrayEquals(expected, actual, "Arrays should match");
    }

    @Test
    void testAssertThrows(){
        assertThrows(ArithmeticException.class, ()-> { int result = 10/0; });
    }
}
