package ru.pliev.labs.lab6.task1_3;

import java.lang.reflect.Field;

public class ToStringProcessor {

    public static <T> String toString(T object) throws Exception {
        if (object == null) {
            return "null";
        }

        Class<?> clazz = object.getClass();
        String result = clazz.getSimpleName() + "{";

        boolean includeByDefault = true;
        if (clazz.isAnnotationPresent(ToString.class)) {
            ToString classAnnotation = clazz.getAnnotation(ToString.class);
            includeByDefault = (classAnnotation.value() == Mode.YES);
        }

        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            field.setAccessible(true);
            boolean includeField = includeByDefault;
            if (field.isAnnotationPresent(ToString.class)) {
                ToString fieldAnnotation = field.getAnnotation(ToString.class);
                includeField = (fieldAnnotation.value() == Mode.YES);
            }

            if (includeField) {
                try {
                    if (!firstField) {
                        result += ", ";
                    }
                    result += field.getName() + "=" + field.get(object);
                    firstField = false;
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        result += "}";
        return result;
    }
}