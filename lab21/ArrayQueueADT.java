package mirea.javalabs.lab21;

import java.util.ArrayList;

public class ArrayQueueADT {
    private ArrayList<Integer> queue = new ArrayList<>(); // переменная экземпляра для хранения очереди

    public void enqueue(int item) {
        // Добавить элемент в очередь.
        queue.add(item);
    }

    public int element() {
        // Вернуть первый элемент в очереди.
        if (!queue.isEmpty()) {
            return queue.get(0);
        } else {
            return -1; // или выбросить исключение, в зависимости от требований
        }
    }

    public int dequeue() {
        // Удалить и вернуть первый элемент в очереди.
        if (!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            return -1; // или выбросить исключение, в зависимости от требований
        }
    }

    public int size() {
        // Текущий размер очереди.
        return queue.size();
    }

    public boolean isEmpty() {
        // Проверить, является ли очередь пустой.
        return queue.isEmpty();
    }

    public void clear() {
        // Удалить все элементы из очереди.
        queue.clear();
    }
}
