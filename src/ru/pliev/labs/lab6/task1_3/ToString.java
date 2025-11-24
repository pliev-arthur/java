package ru.pliev.labs.lab6.task1_3;

import ru.pliev.labs.lab6.task1_2.Mode;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ToString {
    Mode value() default Mode.YES;
}