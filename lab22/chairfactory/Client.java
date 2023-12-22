package mirea.javalabs.lab22.chairfactory;

class Client {
    private Chair chair;

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public void sit() {
        if (chair != null) {
            chair.sit();
            if (chair instanceof VictorianChair) {
                int age = ((VictorianChair) chair).getAge();
                System.out.println("Возраст викторианского стула: " + age);
            } else if (chair instanceof MagicChair) {
                ((MagicChair) chair).doMagic();
            }
        } else {
            System.out.println("Стул не доступен");
        }
    }
}