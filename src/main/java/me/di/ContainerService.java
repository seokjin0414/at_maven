package me.di;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ContainerService   {

    public static <T> T getObject(Class<T> classType) {
        T instanse = creatInstanse(classType);
        Arrays.stream(classType.getDeclaredFields()).forEach(f -> {
            if (f.getAnnotation(Inject.class) != null) {
                Object fieldInstance = creatInstanse(f.getType());
                f.setAccessible(true);
                try {
                    f.set(instanse, fieldInstance);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        return instanse;
    }

    private static <T> T creatInstanse(Class<T> classType) {
        try {
            return classType.getConstructor(null).newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}
