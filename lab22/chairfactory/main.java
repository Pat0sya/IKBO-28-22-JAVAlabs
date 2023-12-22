package mirea.javalabs.lab22.chairfactory;

public class main {
    public static void main(String[] args) {
        AbstractChairFactory chairFactory = new ChairFactory();

        VictorianChair victorianChair = chairFactory.createVictorianChair(5);
        MagicChair magicChair = chairFactory.createMagicanChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();

        Client client = new Client();

        // Присваиваем стул клиенту
        client.setChair(victorianChair);

        // Клиент садится на стул
        client.sit();

        // Присваиваем другой стул клиенту
        client.setChair(magicChair);

        // Клиент садится на другой стул
        client.sit();

        // Присваиваем еще один стул клиенту
        client.setChair(functionalChair);

        // Клиент садится на еще один стул
        client.sit();
    }
}