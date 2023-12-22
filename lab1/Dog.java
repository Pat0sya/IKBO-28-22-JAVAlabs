package mirea.javalabs.lab1;
import mirea.javalabs.lab9.Nameable.Animal;

import java.io.Serializable;
import java.lang.*;
public class Dog extends Animal implements Serializable {
    private String name;
    private int age;

    public Dog(String n, int a) {
        super(n); // Вызываем конструктор Animal с именем
        name = n;
        age = a;
    }
    public Dog(String n){
        super(n);
        name = n;
        age = 0;
    }
    public Dog() {
        super("Pup"); // Вызываем конструктор Animal с именем "Pup"
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}

