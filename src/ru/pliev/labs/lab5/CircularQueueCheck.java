package ru.pliev.labs.lab5;

import java.util.*;

public class CircularQueueCheck {
    public static <T> boolean hasEqualNeighbors(Queue<T> queue) throws NullPointerException {
        if (queue.isEmpty() || queue.size() == 1) {
            return false;
        }

        Queue<T> tempQueue = new LinkedList<>(queue);

        T first = tempQueue.peek();
        T current = tempQueue.poll();
        T next;

        while (!tempQueue.isEmpty()) {
            next = tempQueue.poll();
            if (Objects.equals(current, next)) {
                return true;
            }
            current = next;
        }
        return Objects.equals(current, first);
    }
}