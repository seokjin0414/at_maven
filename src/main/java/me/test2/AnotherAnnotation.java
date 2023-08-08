package me.test2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR,ElementType.METHOD})
@Inherited  // 상속가능
public @interface AnotherAnnotation {

    String name() default "shin";

    int number() default 100;

    // 명시없이 가능
    String value() default "jin";
}
