package mirea.javalabs.lab22.chairfactory;

class FunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидит на функциональном стуле");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}