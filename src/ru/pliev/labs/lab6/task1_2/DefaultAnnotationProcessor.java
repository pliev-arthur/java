package ru.pliev.labs.lab6.task1_2;

import java.lang.reflect.Field;

public class DefaultAnnotationProcessor {

    public static void printDefaultClasses(Class<?> clazz) {
        System.out.println("Анализ класса: " + clazz.getName());

        if (clazz.isAnnotationPresent(Default.class)) {
            Default classAnnotation = clazz.getAnnotation(Default.class);
            System.out.println("Класс по умолчанию: " + classAnnotation.value().getName());
        } else {
            System.out.println("Класс по умолчанию: не указан");
        }

        System.out.println("Поля класса:");
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.print(field.getName() + " (" + field.getType().getSimpleName() + "): ");
            if (field.isAnnotationPresent(Default.class)) {
                System.out.println("по умолчанию " + field.getAnnotation(Default.class).value().getName());
            } else {
                System.out.println("без аннотации @Default");
            }
        }
    }
}