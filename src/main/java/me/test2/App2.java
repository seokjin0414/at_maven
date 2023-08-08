package me.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> book2Class = Class.forName("me.test2.Book2");
        /*Constructor<?> constructor = book2Class.getConstructor(null);
        Book2 book2 = (Book2) constructor.newInstance();
        System.out.println(book2);*/

        Constructor<?> constructor = book2Class.getConstructor(String.class);
        Book2 book2 = (Book2) constructor.newInstance("mYBook");
        System.out.println(book2);

        /*Field a = Book2.class.getDeclaredField("A");
        System.out.println(a.get(null));
        a.set(null, "BBBBBBB");
        System.out.println(a.get(null));*/

        /*Field b = Book2.class.getDeclaredField("B");
        b.setAccessible(true);
        System.out.println(b.get(book2));
        b.set(book2, "BBBBBBBBBBB");
        System.out.println(b.get(book2));*/

        /*Method c = Book2.class.getDeclaredMethod("c");
        c.setAccessible(true);
        c.invoke(book2);*/

        Method sum = Book2.class.getDeclaredMethod("sum", int.class, int.class);
        int invoke = (int) sum.invoke(book2, 1, 2);
        System.out.println(invoke);
    }

}
