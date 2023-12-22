package mirea.javalabs.lab19;

import java.util.ArrayList;
import java.util.List;

public class ArrayConverter {
    public static <T> List<T> convertToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
