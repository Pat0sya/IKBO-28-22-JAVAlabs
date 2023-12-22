package mirea.javalabs.lab19;

public class CustomArray<T> {
    private final T[] array;

    public CustomArray(T[] array) {
        this.array = array;
    }

    public T getElementByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null;
        }
    }
}
