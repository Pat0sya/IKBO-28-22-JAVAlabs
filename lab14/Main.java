package mirea.javalabs.lab14;

public class Main {
    public static void main(String[] args) {
        // Создание
        WaitList<Integer> waitList = new WaitList<>();
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(4);
        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>();

        // Добавление
        waitList.add(5);
        boundedWaitList.add("A");
        unfairWaitList.add('X');

        // Проверка
        System.out.println("waitList содержит 42: " + waitList.contains(42));
        System.out.println("boundedWaitList содержит 'B': " + boundedWaitList.contains("B"));
        System.out.println("unfairWaitList содержит 'X': " + unfairWaitList.contains('X'));

        // Удаление
        System.out.println("Удалено из waitList: " + waitList.remove());
        System.out.println("Удалено из boundedWaitList: " + boundedWaitList.remove());
        System.out.println("Удалено из unfairWaitList: " + unfairWaitList.remove());

        // Добавление
        unfairWaitList.add('Y');
        unfairWaitList.add('Z');
        unfairWaitList.moveToBack('Y');

        System.out.println("unfairWaitList после добавления 'Y' и 'Z' и передвинута 'Y': " + unfairWaitList);

        // Вывод
        System.out.println("Объем boundedWaitList: " + boundedWaitList.getCapacity());
    }
}

