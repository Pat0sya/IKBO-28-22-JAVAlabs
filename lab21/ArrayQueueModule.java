package mirea.javalabs.lab21;

import java.util.ArrayList;

public class ArrayQueueModule {
    private static ArrayList<Integer> queue = new ArrayList<>(); // переменная класса для хранения очереди

    public static void enqueue(int item) {
        // Добавить элемент в очередь.
        queue.add(item);
    }

    public static int element() {
        // Вернуть первый элемент в очереди.
        if (!queue.isEmpty()) {
            return queue.get(0);
        } else {
            return -1; // или выбросить исключение, в зависимости от требований
        }
    }

    public static int dequeue() {
        // Удалить и вернуть первый элемент в очереди.
        if (!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            return -1; // или выбросить исключение, в зависимости от требований
        }
    }

    public static int size() {
        // Текущий размер очереди.
        return queue.size();
    }

    public static boolean isEmpty() {
        // Проверить, является ли очередь пустой.
        return queue.isEmpty();
    }

    public static void clear() {
        // Удалить все элементы из очереди.
        queue.clear();
    }
}

