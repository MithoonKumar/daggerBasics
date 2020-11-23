package TestPublicPrivate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        TestClass testClass = new TestClass();
        Method method = testClass.getClass().getDeclaredMethod("method");
        method.setAccessible(true);
        Object r = method.invoke(testClass);
    }
}
