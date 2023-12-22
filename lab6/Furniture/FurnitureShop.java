package mirea.javalabs.lab6.Furniture;

import java.util.ArrayList;
import java.util.List;
class FurnitureShop {
    private List<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<>();
    }

    // Добавить мебель в ассортимент магазина
    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    // Вывести информацию о всем мебели в магазине
    public void displayInventory() {
        System.out.println("Ассортимент магазина:");
        for (Furniture item : inventory) {
            item.displayInfo();
        }
    }
}