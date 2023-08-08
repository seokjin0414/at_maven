package me.test2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Book> bookClass = Book.class;

        /*Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        Class<?> aClass1 = Class.forName("me.test2.Book");*/

        //Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);


        /*Book book = new Book();
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            try {
                f.setAccessible(true);
                System.out.printf("%s %s\n", f, f.get(book));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });*/

//        Arrays.stream(bookClass.getMethods()).forEach(System.out::println);

//        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);

//        System.out.println(MyBook.class.getSuperclass());

//        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);

       /* Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
            int modifiers = f.getModifiers();
            System.out.println(f);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
        });*/



        Arrays.stream(Book.class.getDeclaredFields()).forEach(f -> {
//            Arrays.stream(f.getAnnotations()).forEach(System.out::println);
            Arrays.stream(f.getAnnotations()).forEach(a -> {
                if (a instanceof MyAnnotation) {
                    MyAnnotation myAnnotation =(MyAnnotation) a;
                    System.out.println(myAnnotation.value());
                    System.out.println(myAnnotation.number());
                }
            });
        });


    }
}
