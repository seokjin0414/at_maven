package me.test1;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {
    public static void main(String[] args) {
        /*try {
            new ByteBuddy().redefine(Moja.class)
                    .method(named("pullOut")).intercept(FixedValue.value("BUBUBUBU!"))
                    .make().saveIn(new File("/Users/jin/IdeaProjects/at_maven/target/classes"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        System.out.println(new Moja().pullOut());
    }

}
