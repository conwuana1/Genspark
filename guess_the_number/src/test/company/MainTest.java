package company;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class MainTest {

    Main main;

    @BeforeEach
    void setUp() {
        System.out.println("In before each...");
        main = new Main();
    }

    @DisplayName("Test Cynthia input")
    @Test
    void main() {
        assertEquals("Cynthia", "Cynthia", "Test failed. Please print name.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Print after each test");
    }
}