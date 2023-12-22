package mirea.javalabs.lab22.chairfactory;

interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}