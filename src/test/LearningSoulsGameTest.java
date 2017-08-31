package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LearningSoulsGameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testMain() {
        try {
            Class<?> c = Class.forName("LearningSoulsGame");
            Method m = c.getMethod("main", String[].class);
            Object[] args = new Object[1];

            args[0] = new String[] {};
            m.invoke(null, args);
            Assert.assertEquals("[ Hero ]\tGregooninator\tLIFE: 100\tSTAMINA: 50\t(ALIVE)\n" +
                    "[ Monster ]\tStudentatort\tLIFE: 10\tSTAMINA: 10\t(ALIVE)\n" +
                    "[ Monster ]\tMonster_7\tLIFE: 10\tSTAMINA: 10\t(ALIVE)\n" +
                    "[ Monster ]\tMonster_8\tLIFE: 10\tSTAMINA: 10\t(ALIVE)\n", outContent.toString());
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called LearningSoulsGame");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a static method called main");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}