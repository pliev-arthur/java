package ru.pliev.labs.lab6.task1_2;

import ru.pliev.labs.lab6.task1_4.Validate;

import java.lang.annotation.*;

@Validate({String.class, Integer.class})
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {
    Class<?> value();
}