package mirea.javalabs.lab18;

import mirea.javalabs.lab1.Dog;

public class Main {
    public static void main(String[] args) {
        ThreeParams<Integer, Dog, String> myClass = new ThreeParams<>(10, new Dog("Rex", 5), "Hello");
        myClass.printClassNames();


        Integer[] intArray = {3, 5, 1, 9, 2};
        MinMax<Integer> minMax = new MinMax<>(intArray);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        Double[] doubleArray1 = {2.0, 3.0, 4.0};
        Double[] doubleArray2 = {1.0, 2.0, 3.0};
        Matrix<Double> matrix1 = new Matrix<>(new Double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        Matrix<Double> matrix2 = new Matrix<>(new Double[][]{{2.0, 1.0}, {3.0, 2.0}, {4.0, 3.0}});
        Matrix<Double> result = matrix1.multiply(matrix2);
        result.printMatrix();
    }
}
