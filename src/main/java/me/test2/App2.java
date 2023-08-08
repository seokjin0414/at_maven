package me.test2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> book2Class = Class.forName("me.test2.Book2");
        Constructor<?> constructor = book2Class.getConstructor(null);
        Book2 book2 = (Book2) constructor.newInstance();
        System.out.println(book2);
    }

}
