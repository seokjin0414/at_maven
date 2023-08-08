package me.test1;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {
    public static void main(String[] args) {

        // 독립적으로 실행해야함
        /*try {
            new ByteBuddy().redefine(Moja.class)
                    .method(named("pullOut")).intercept(FixedValue.value("BUBUBUBU!"))
                    .make().saveIn(new File("/Users/jin/IdeaProjects/at_maven/target/classes"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // 다른 곳에서 해당 class를 호출하면 의미가 없다.
       /* ClassLoader classLoader = Masulsa.class.getClassLoader();
        TypePool typePool = TypePool.Default.of(classLoader);

        try {
            new ByteBuddy().redefine(
                    typePool.describe("me.test1.Moja").resolve(), ClassFileLocator.ForClassLoader.of(classLoader))
                    .method(named("pullOut")).intercept(FixedValue.value("BUBUBUBU!"))
                    .make().saveIn(new File("/Users/jin/IdeaProjects/at_maven/target/classes"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println(new Moja().pullOut());
    }

}
