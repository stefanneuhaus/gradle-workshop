/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics.recap;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void failingOnPurpose() {
        fail("failing on purpose");
    }
}