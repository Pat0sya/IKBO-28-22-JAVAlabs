package mirea.javalabs.lab19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution<T, K, V> {
    private T genericVariable;
    private K keyVariable;
    private V valueVariable;

    public Solution(T genericVariable, K keyVariable, V valueVariable) {
        this.genericVariable = genericVariable;
        this.keyVariable = keyVariable;
        this.valueVariable = valueVariable;
    }

    @SafeVarargs
    public final List<T> newArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    @SafeVarargs
    public final Set<T> newHashSet(T... elements) {
        Set<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    public HashMap<K, V> newHashMap(K[] keys, V[] values) {
        if (keys.length != values.length) {
            throw new IllegalArgumentException("Number of keys and values must be equal");
        }

        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }

    public static void main(String[] args) {
        // Пример использования:
        Solution<String, Integer, Double> solution = new Solution<>("Hello", 42, 3.14);

        List<String> stringList = solution.newArrayList("one", "two", "three");
        System.out.println(stringList);

        Set<String> integerSet = solution.newHashSet("1", "2", "3", "4", "5");
        System.out.println(integerSet);

        Integer[] keys = {1, 2, 3};
        Double[] values = {1.1, 2.2, 3.3};
        HashMap<Integer, Double> hashMap = solution.newHashMap(keys, values);
        System.out.println(hashMap);
    }
}
