package me.test2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited  // 상속가능
public @interface MyAnnotation {

    String name() default "shin";

    int number() default 100;

    // 명시없이 가능
    String value() default "jin";
}
