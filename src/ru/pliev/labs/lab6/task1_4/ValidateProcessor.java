package ru.pliev.labs.lab6.task1_4;

import ru.pliev.labs.lab6.task1_2.Default;

import java.lang.reflect.Field;

public class ValidateProcessor {
    public static void printValidatedThings(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Validate.class)) {
            Validate validateAnnotation = clazz.getAnnotation(Validate.class);
            Class<?>[] classesToValidate = validateAnnotation.value();

            System.out.println("Класс " + clazz.getSimpleName() + " аннотирован @Validate");
            System.out.println("Список классов:");

            for (Class<?> validationClass : classesToValidate) {
                System.out.println(validationClass.getName());
            }
            System.out.println();
        } else {
            System.out.println("Класс " + clazz.getSimpleName() + " не аннотирован @Validate\n");
        }
    }
}
