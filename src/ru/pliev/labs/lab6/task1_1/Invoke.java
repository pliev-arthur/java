package ru.pliev.labs.lab6.task1_1;

import java.lang.annotation.*;

/**
 * Аннотация для автоматического вызова методов через Reflection API.
 * <p>
 * Аннотация {@code @Invoke} предназначена для пометки методов, которые должны быть
 * автоматически вызваны обработчиком {@link InvokeAnnotatedMethods} во время выполнения программы.
 * </p>
 *
 * <p><b>Характеристики аннотации:</b></p>
 * <ul>
 *   <li>Цель применения: только МЕТОД</li>
 *   <li>Доступна во время исполнения программы</li>
 *   <li>Не имеет свойств</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>
 * {@code
 * public class ExampleClass {
 *     @Invoke
 *     public void annotatedMethod() {
 *         System.out.println("Этот метод будет вызван автоматически");
 *     }
 * }
 * }
 * </pre>
 *
 * @see InvokeAnnotatedMethods
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Invoke {
}