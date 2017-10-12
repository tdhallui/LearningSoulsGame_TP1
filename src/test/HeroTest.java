import com.sun.istack.internal.Nullable;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HeroTest {
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
    public void existClass() {
        try {
            Class.forName("lsg.characters.Hero");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        }
    }

    @Test
    public void existNameAttribute() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Field f = c.getDeclaredField("name");

            Assert.assertTrue("attribute name should be a string", f.getType().getName() == "java.lang.String");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called name");
        }
    }

    @Test
    public void existLifeAttribute() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Field f = c.getDeclaredField("life");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called life");
        }
    }

    @Test
    public void existMaxLifeAttribute() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Field f = c.getDeclaredField("maxLife");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called maxLife");
        }
    }

    @Test
    public void existStaminaAttribute() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Field f = c.getDeclaredField("stamina");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called stamina");
        }
    }

    @Test
    public void existMaxStaminaAttribute() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Field f = c.getDeclaredField("maxStamina");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called maxStamina");
        }
    }

    @Test
    public void existGetName() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getMethod("getName");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (String)", m.getReturnType() == String.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getName");
        }
    }

    @Test
    public void existSetName() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("setName", new Class[]{String.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setName");
        }
    }

    @Test
    public void existGetLife() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("getLife");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getLife");
        }
    }

    @Test
    public void existSetLife() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("setLife", new Class[]{int.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type 'int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setLife");
        }
    }

    @Test
    public void existGetMaxLife() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("getMaxLife");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getMaxLife");
        }
    }

    @Test
    public void existSetMaxLife() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("setMaxLife", new Class[]{int.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type (int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setMaxLife");
        }
    }

    @Test
    public void existGetStamina() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("getStamina");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getStamina");
        }
    }

    @Test
    public void existSetStamina() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("setStamina", new Class[]{int.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type (int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setStamina");
        }
    }

    @Test
    public void existGetMaxStamina() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("getMaxStamina");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getMaxStamina");
        }
    }

    @Test
    public void existSetMaxStamina() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getDeclaredMethod("setMaxStamina", int.class);

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type (int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setMaxStamina");
        }
    }

    @Nullable
    private Constructor<?> searchConstructorWithAStringParameter(Class<?> c) {
        for (Constructor<?> constructor : c.getConstructors()) {
            if (constructor.getParameterCount() == 1 && constructor.getParameterTypes()[0].getName() == "java.lang.String") {
                return constructor;
            }
        }
        return null;
    }

    @Test
    public void existConstructor() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Constructor<?> constructor = searchConstructorWithAStringParameter(c);

            if (constructor == null) {
                Assert.fail("should have a constructor with a string parameter");
            } else {
                Object o = constructor.newInstance("supertoto");
                Method gn = c.getMethod("getName");
                Method gl = c.getMethod("getLife");
                Method gs = c.getMethod("getStamina");

                Assert.assertTrue("wrong name (supertoto)", gn.invoke(o) == "supertoto");
                Assert.assertTrue("wrong life (100)", ((Integer) (gl.invoke(o))).equals(new Integer(100)));
                Assert.assertTrue("wrong stamina (50)", ((Integer) (gs.invoke(o))).equals(new Integer(50)));
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            Assert.fail("should have methods called getName, getLife and getStamina");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Nullable
    private Constructor<?> searchDefaultConstructor(Class<?> c) {
        for (Constructor<?> constructor : c.getConstructors()) {
            if (constructor.getParameterCount() == 0) {
                return constructor;
            }
        }
        return null;
    }

    @Test
    public void existDefaultConstructor() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Constructor<?> constructor = searchDefaultConstructor(c);

            if (constructor == null) {
                Assert.fail("should have a default constructor");
            } else {
                Object o = constructor.newInstance();
                Method gn = c.getMethod("getName");
                Method gl = c.getMethod("getLife");
                Method gs = c.getMethod("getStamina");

                Assert.assertTrue("wrong default name (Gregooninator)", gn.invoke(o) == "Gregooninator");
                Assert.assertTrue("wrong life (100)", ((Integer) (gl.invoke(o))).equals(new Integer(100)));
                Assert.assertTrue("wrong stamina (50)", ((Integer) (gs.invoke(o))).equals(new Integer(50)));
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            Assert.fail("should have methods called getName, getLife and getStamina");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrintStats() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Constructor<?> constructor = searchDefaultConstructor(c);
            Object o = constructor.newInstance();
            Method ps = c.getMethod("printStats");

            ps.invoke(o);
            try {
                Method m = c.getMethod("isAlive");

                Assert.assertEquals("[ lsg.characters.Hero ]\tGregooninator\tLIFE: 100\tSTAMINA: 50\t(ALIVE)\n", outContent.toString());
            } catch (NoSuchMethodException e) {
                Assert.assertEquals("[ lsg.characters.Hero ]\tGregooninator\tLIFE: 100\tSTAMINA: 50\n", outContent.toString());
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a method called printStats");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testToString() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Constructor<?> constructor = searchDefaultConstructor(c);
            Object o = constructor.newInstance();
            Method ts = c.getMethod("toString");

            try {
                Method m = c.getMethod("isAlive");

                Assert.assertEquals("[ lsg.characters.Hero ]\tGregooninator\tLIFE: 100\tSTAMINA: 50\t(ALIVE)", (String)(ts.invoke(o)));
            } catch (NoSuchMethodException e) {
                Assert.assertEquals("[ lsg.characters.Hero ]\tGregooninator\tLIFE: 100\tSTAMINA: 50", (String)(ts.invoke(o)));
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a method called toString");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMain() {
        try {
            Class<?> c = Class.forName("lsg.LearningSoulsGame");
            Class<?> c2 = Class.forName("lsg.characters.Hero");
            Method m = c.getMethod("main", String[].class);
            Object[] args = new Object[1];

            args[0] = new String[] {};
            m.invoke(null, args);
            try {
                Method m2 = c2.getMethod("isAlive");

                Assert.assertEquals("[ lsg.characters.Hero ]\tGregooninator\tLIFE: 100\tSTAMINA: 50\t(ALIVE)", outContent.toString().split("\n", 2)[0]);
            } catch (NoSuchMethodException e) {
                Assert.assertEquals("[ lsg.characters.Hero ]\tGregooninator\tLIFE: 100\tSTAMINA: 50\n", outContent.toString());
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.LearningSoulsGame");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIsAlive() {
        try {
            Class<?> c = Class.forName("lsg.characters.Hero");
            Method m = c.getMethod("isAlive");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (boolean)", m.getReturnType() == boolean.class);

            Constructor<?> constructor = searchDefaultConstructor(c);
            Object o = constructor.newInstance();
            Method ia = c.getMethod("isAlive");

            Assert.assertTrue("lsg.characters.Hero should be alive", (Boolean) (ia.invoke(o)));
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called lsg.characters.Hero");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called isAlive");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}