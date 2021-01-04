package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @DisplayName("Test proper view name is returned for index page")
    @Test
    void index() {
        assertEquals("index", indexController.index(), "Wrong view returned");
    }

    @Disabled
    @Test
    void oupsHandler() {
        assertThrows(RuntimeException.class, () -> indexController.oupsHandler());
        assertEquals(indexController.oupsHandler(), "notimplemented", () -> "this is some expensive message to build");
    }

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
            System.out.println("------> I got here");
        });
    }

    @Test
    void testTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
            System.out.println("------> I got here");
        });
    }

    @Test
    void testAssumptionTrue() {
        //if this test is failed it is ignored
        assumeTrue("Guru".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));

    }

    @Test
    void testAssumptionTrueAssumptionIsTrue() {
        assumeTrue("Guru".equalsIgnoreCase(System.getenv("GURU")));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMACOS(){
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows(){
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testOnJre(){

    }

    @EnabledIfEnvironmentVariable(named ="USER",matches = "seanc")
    @Test
    void testIfUserSeanc(){

    }

}
