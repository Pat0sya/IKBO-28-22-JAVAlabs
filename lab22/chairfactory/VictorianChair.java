package mirea.javalabs.lab22.chairfactory;

class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Сидит на Викторанском стуле");
    }
}