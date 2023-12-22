package mirea.javalabs.lab21;

public class TestArrayQueue {
    public static void main(String[] args) {

        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println(ArrayQueueModule.size()); // Вывод: 2
        System.out.println(ArrayQueueModule.dequeue()); // Вывод: 1
        System.out.println(ArrayQueueModule.element()); // Вывод: 2
        System.out.println(ArrayQueueModule.isEmpty()); // Вывод: false
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // Вывод: true


        ArrayQueueADT queueADT = new ArrayQueueADT();
        queueADT.enqueue(1);
        queueADT.enqueue(2);
        System.out.println(queueADT.size()); // Вывод: 2
        System.out.println(queueADT.dequeue()); // Вывод: 1
        System.out.println(queueADT.element()); // Вывод: 2
        System.out.println(queueADT.isEmpty()); // Вывод: false
        queueADT.clear();
        System.out.println(queueADT.isEmpty()); // Вывод: true


        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.size()); // Вывод: 2
        System.out.println(queue.dequeue()); // Вывод: 1
        System.out.println(queue.element()); // Вывод: 2
        System.out.println(queue.isEmpty()); // Вывод: false
        queue.clear();
        System.out.println(queue.isEmpty()); // Вывод: true
    }
}

