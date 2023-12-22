package mirea.javalabs.lab18;

public class Matrix<T> {
    private T[][] data;

    public Matrix(T[][] data) {
        this.data = data;
    }

    public T get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, T value) {
        data[row][col] = value;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Матрицы имеют разные размеры и не могут быть сложены.");
        }

        int rows = data.length;
        int cols = data[0].length;

        Matrix<T> result = (Matrix<T>) new Matrix<>(new Object[rows][cols]);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T sum = (T) new Integer(0);
                if (data[i][j] instanceof Number && other.data[i][j] instanceof Number) {
                    sum = (T) Double.valueOf(((Number) data[i][j]).doubleValue() + ((Number) other.data[i][j]).doubleValue());
                }
                result.set(i, j, sum);
            }
        }

        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        int rowsA = data.length;
        int colsA = data[0].length;
        int rowsB = other.data.length;
        int colsB = other.data[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы для умножения.");
        }

        Matrix<T> result = (Matrix<T>) new Matrix<>(new Object[rowsA][colsB]);

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                T sum = (T) new Integer(0);
                for (int k = 0; k < colsA; k++) {
                    if (data[i][k] instanceof Number && other.data[k][j] instanceof Number) {
                        sum = (T) Double.valueOf(((Number) sum).doubleValue() + ((Number) data[i][k]).doubleValue() * ((Number) other.data[k][j]).doubleValue());
                    }
                }
                result.set(i, j, sum);
            }
        }

        return result;
    }


    public void printMatrix() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

}
