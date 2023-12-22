package mirea.javalabs.lab14;

import java.util.Collection;

public interface IWaitList<E> {
    /**
     * Добавляет элемент в ожидающую структуру данных.
     *
     * @param element Элемент для добавления.
     */
    void add(E element);

    /**
     * Удаляет и возвращает элемент из ожидающей структуры данных.
     *
     * @return Удаленный элемент.
     */
    E remove();

    /**
     * Проверяет, содержит ли ожидающая структура данных указанный элемент.
     *
     * @param element Элемент для проверки.
     * @return true, если элемент найден, иначе false.
     */
    boolean contains(E element);

    /**
     * Проверяет, содержит ли ожидающая структура данных все элементы из указанной коллекции.
     *
     * @param c Коллекция элементов для проверки.
     * @return true, если все элементы найдены, иначе false.
     */
    boolean containsAll(Collection<E> c);

    /**
     * Проверяет, пуста ли ожидающая структура данных.
     *
     * @return true, если структура данных пуста, иначе false.
     */
    boolean isEmpty();
}
