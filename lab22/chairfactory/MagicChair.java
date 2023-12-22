package mirea.javalabs.lab22.chairfactory;

class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Сидит на магическом стуле");
    }

    public void doMagic() {
        System.out.println("Делаю магическую магию на магическом стуле");
    }
}