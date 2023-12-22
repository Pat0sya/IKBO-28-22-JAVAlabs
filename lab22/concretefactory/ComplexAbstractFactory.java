package mirea.javalabs.lab22.concretefactory;

interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int imaginary);
}