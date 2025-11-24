package ru.pliev.labs.lab6.task1_2;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {
    Class<?> value();
}