package mirea.javalabs.lab22.concretefactory;

// Конкретная реализация ComplexFactory
class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new ConcreteComplex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        return new ConcreteComplex(real, imaginary);
    }
}
