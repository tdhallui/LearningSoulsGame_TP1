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

public class MonsterTest {
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
            Class.forName("characters.Monster");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        }
    }

    @Test
    public void existNameAttribute() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Field f = c.getDeclaredField("name");

            Assert.assertTrue("attribute name should be a string", f.getType().getName() == "java.lang.String");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called name");
        }
    }

    @Test
    public void existLifeAttribute() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Field f = c.getDeclaredField("life");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called life");
        }
    }

    @Test
    public void existMaxLifeAttribute() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Field f = c.getDeclaredField("maxLife");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called maxLife");
        }
    }

    @Test
    public void existStaminaAttribute() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Field f = c.getDeclaredField("stamina");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called stamina");
        }
    }

    @Test
    public void existMaxStaminaAttribute() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Field f = c.getDeclaredField("maxStamina");

            Assert.assertTrue("attribute name should be a int", f.getType().getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchFieldException e) {
            Assert.fail("should have an attribute called maxStamina");
        }
    }

    @Test
    public void existGetName() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getMethod("getName");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (String)", m.getReturnType() == String.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getName");
        }
    }

    @Test
    public void existSetName() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getDeclaredMethod("setName", new Class[]{String.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setName");
        }
    }

    @Test
    public void existGetLife() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getMethod("getLife");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getLife");
        }
    }

    @Test
    public void existSetLife() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getDeclaredMethod("setLife", new Class[]{int.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type 'int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setLife");
        }
    }

    @Test
    public void existGetMaxLife() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getMethod("getMaxLife");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getMaxLife");
        }
    }

    @Test
    public void existSetMaxLife() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getDeclaredMethod("setMaxLife", new Class[]{int.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type (int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setMaxLife");
        }
    }

    @Test
    public void existGetStamina() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getMethod("getStamina");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getStamina");
        }
    }

    @Test
    public void existSetStamina() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getDeclaredMethod("setStamina", new Class[]{int.class});

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type (int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called setStamina");
        }
    }

    @Test
    public void existGetMaxStamina() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getMethod("getMaxStamina");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (int)", m.getReturnType() == int.class);
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            Assert.fail("should have a setter method called getMaxStamina");
        }
    }

    @Test
    public void existSetMaxStamina() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getDeclaredMethod("setMaxStamina", int.class);

            Assert.assertTrue("wrong parameter number (1)", m.getParameterCount() == 1);
            Assert.assertTrue("wrong parameter type (int)", m.getParameterTypes()[0].getName() == "int");
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
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
            Class<?> c = Class.forName("characters.Monster");
            Constructor<?> constructor = searchConstructorWithAStringParameter(c);

            if (constructor == null) {
                Assert.fail("should have a constructor with a string parameter");
            } else {
                Object o = constructor.newInstance("supertoto");
                Method gn = c.getMethod("getName");
                Method gl = c.getMethod("getLife");
                Method gs = c.getMethod("getStamina");

                Assert.assertTrue("wrong name (supertoto)", gn.invoke(o) == "supertoto");
                Assert.assertTrue("wrong life (10)", ((Integer)(gl.invoke(o))).equals(new Integer(10)));
                Assert.assertTrue("wrong stamina (10)", ((Integer)(gs.invoke(o))).equals(new Integer(10)));
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
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
            Class<?> c = Class.forName("characters.Monster");
            Constructor<?> constructor = searchDefaultConstructor(c);

            if (constructor == null) {
                Assert.fail("should have a default constructor");
            } else {
                Object o = constructor.newInstance();
                Method gn = c.getMethod("getName");
                Method gl = c.getMethod("getLife");
                Method gs = c.getMethod("getStamina");

                try {
                    Field f = c.getField("INSTANCES_COUNT");

                    Assert.assertTrue("wrong default name (characters.Monster)", gn.invoke(o) == "characters.Monster");
                } catch (NoSuchFieldException e) {
                    Assert.assertTrue("wrong default name (Monster_xxx)", ((String)(gn.invoke(o))).substring(0, 8).equals("Monster_"));
                }
                Assert.assertTrue("wrong life (10)", ((Integer)(gl.invoke(o))).equals(new Integer(10)));
                Assert.assertTrue("wrong stamina (10)", ((Integer)(gs.invoke(o))).equals(new Integer(10)));
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrintStats() {
        Class<?> c = null;
        try {
            c = Class.forName("characters.Monster");
            Constructor<?> constructor = searchDefaultConstructor(c);
            Object o = constructor.newInstance();
            Method ps = c.getMethod("printStats");

            ps.invoke(o);
            try {
                Field f = c.getDeclaredField("INSTANCES_COUNT");
                String str = outContent.toString().replaceAll("Monster_[0-9]\t", "");

                Assert.assertEquals("[ characters.Monster ]\tLIFE: 10\tSTAMINA: 10\t(ALIVE)\n", str);
            } catch (NoSuchFieldException e) {
                Assert.assertEquals("[ characters.Monster ]\tcharacters.Monster\tLIFE: 10\tSTAMINA: 10\t(ALIVE)\n", outContent.toString());
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testToString() {
        Class<?> c = null;
        try {
            c = Class.forName("characters.Monster");
            Constructor<?> constructor = searchDefaultConstructor(c);
            Object o = constructor.newInstance();
            Method ts = c.getMethod("toString");

            try {
                Field f = c.getDeclaredField("INSTANCES_COUNT");
                String str = ((String)(ts.invoke(o))).replaceAll("Monster_[0-9]\t", "");

                Assert.assertEquals("[ characters.Monster ]\tLIFE: 10\tSTAMINA: 10\t(ALIVE)", str);
            } catch (NoSuchFieldException e) {
                Assert.assertEquals("[ characters.Monster ]\tcharacters.Monster\tLIFE: 10\tSTAMINA: 10\t(ALIVE)", (String)(ts.invoke(o)));
            }
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIsAlive() {
        try {
            Class<?> c = Class.forName("characters.Monster");
            Method m = c.getMethod("isAlive");

            Assert.assertTrue("wrong parameter number (0)", m.getParameterCount() == 0);
            Assert.assertTrue("wrong return type (boolean)", m.getReturnType() == boolean.class);

            Constructor<?> constructor = searchDefaultConstructor(c);
            Object o = constructor.newInstance();
            Method ia = c.getMethod("isAlive");

            Assert.assertTrue("characters.Monster should be alive", (Boolean)(ia.invoke(o)));
        } catch (ClassNotFoundException e) {
            Assert.fail("should have a class called characters.Monster");
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