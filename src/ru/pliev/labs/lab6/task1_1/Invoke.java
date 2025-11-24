package ru.pliev.labs.lab6.task1_1;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Invoke {
}
