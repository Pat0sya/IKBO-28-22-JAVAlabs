package mirea.javalabs.lab6.Furniture;

public class FurnitureShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Furniture chair1 = new Chair("Стул деревянный", 100.0, 4);
        Furniture table1 = new Table("Обеденный стол", 250.0, "Дуб");

        shop.addFurniture(chair1);
        shop.addFurniture(table1);

        shop.displayInventory();
    }
}