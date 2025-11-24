package ru.pliev.labs.lab6.task1_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class InvokeAnnotatedMethods {

    public static <T, A extends Annotation> void invoke(T object, Class<A> annotationClass) throws Exception {
        Class<?> targetClass = object.getClass();
        Method[] methods = targetClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(annotationClass)) {
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }
}