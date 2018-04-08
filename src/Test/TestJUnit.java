package Test;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;


public class TestJUnit {
    MessageUtil messageUtil = new MessageUtil("Robert");

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Ignore
    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        String message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }

    @Test
    public void testAdd() {
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNotNull(str);
    }
}

