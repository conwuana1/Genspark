package company;

import static org.junit.jupiter.api.Assertions.*;

import company.Main;
import org.junit.jupiter.api.*;

class MainTest {

    company.Main main;

    @BeforeEach
    void setUp() {
       main = new Main();
    }

    @Test
    void main() {
        assertEquals(1,1,"Something went wrong...");
    }

    @AfterEach
    void tearDown() {
    }
}