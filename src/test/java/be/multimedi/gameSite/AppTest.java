package be.multimedi.gameSite;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AppTest {

    @BeforeAll
    void startSomething() {
        System.out.println("Starting something");
    }

    @BeforeEach
    void createSomething() {
        System.out.println("Creating something");
    }

    @Test
    @DisplayName("sampleMyTest")
    void sampleTest() {
        assertTrue(true, "This should be true!");
    }

    @Test
    @DisplayName("failMyTest")
    void failTest() {
        boolean failTheTest = false;
        if (failTheTest) {
            System.out.println("Oh NO!");
            fail("I made a programming mistake here!");
        } else {
            System.out.println("Lucky me!");
            assertTrue(true);
        }
    }

    @AfterEach
    void closeSomething() {
        System.out.println("Closing something");
    }

    @AfterAll
    void endSomething() {
        System.out.println("Ending something");
    }
}
