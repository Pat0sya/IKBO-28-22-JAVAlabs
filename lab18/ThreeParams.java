package mirea.javalabs.lab18;

import mirea.javalabs.lab9.Nameable.Animal;

import java.io.Serializable;

class ThreeParams<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private T t;
    private V v;
    private K k;

    public ThreeParams(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("T is of class: " + t.getClass().getName());
        System.out.println("V is of class: " + v.getClass().getName());
        System.out.println("K is of class: " + k.getClass().getName());
    }
}
