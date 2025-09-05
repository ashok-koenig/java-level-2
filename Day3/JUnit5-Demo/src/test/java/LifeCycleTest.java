import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LifeCycleTest {
    @BeforeAll
    static void setupAll(){
        System.out.println("@BeforeAll - run once before all tests");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("@AfterAll - run once after all tests");
    }
    @BeforeEach
    void setup(){
        System.out.println("@BeforeEach - run before each test");
    }

    @AfterEach
    void tearDown(){
        System.out.println("@AfterEach - run after each test");
    }

    @Test
    void testOne(){
        System.out.println("Test 1 is running");
        assertTrue(true);
    }

    @Test
    void testTwo(){
        System.out.println("Test 2 is running");
        assertFalse(false);
    }
}
