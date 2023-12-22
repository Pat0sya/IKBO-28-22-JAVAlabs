package mirea.javalabs.lab24;

import java.util.*;

interface Item {
    double getPrice();
    String getName();
    String getDescription();
}

class Dish implements Item {
    private double price;
    private String name;
    private String description;

    public Dish(String name, String description, double price) throws IllegalArgumentException {
        if (price < 0 || name == null || name.isEmpty() || description == null || description.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class Drink implements Item {
    private double price;
    private String name;
    private String description;

    public Drink(String name, String description, double price) throws IllegalArgumentException {
        if (price < 0 || name == null || name.isEmpty() || description == null || description.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

interface Order {
    boolean addItem(Item item);
    boolean removeItemByName(String name);
    int removeAllItemsByName(String name);
    int getTotalItems();
    Item[] getItems();
    double getTotalCost();
    int getItemCountByName(String name);
    String[] getDistinctItemsNames();
    Item[] getItemsSortedByCostDesc();
    Integer getTableNumber();
    String getAddress();
}

class RestaurantOrder implements Order {
    private List<Item> items = new ArrayList<>();
    private Integer tableNumber;  // New field

    public boolean addItem(Item item) {
        return items.add(item);
    }
    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }
    public boolean removeItemByName(String name) {
        return items.removeIf(item -> item.getName().equals(name));
    }

    public int removeAllItemsByName(String name) {
        int initialSize = items.size();
        items.removeIf(item -> item.getName().equals(name));
        return initialSize - items.size();
    }

    public int getTotalItems() {
        return items.size();
    }

    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    public double getTotalCost() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public int getItemCountByName(String name) {
        return (int) items.stream().filter(item -> item.getName().equals(name)).count();
    }

    public String[] getDistinctItemsNames() {
        return items.stream().map(Item::getName).distinct().toArray(String[]::new);
    }

    public Item[] getItemsSortedByCostDesc() {
        return items.stream().sorted(Comparator.comparing(Item::getPrice).reversed()).toArray(Item[]::new);
    }

    @Override
    public Integer getTableNumber() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }
}

class InternetOrder implements Order {
    private List<Item> items = new ArrayList<>();
    private String address;
    public boolean addItem(Item item) {
        return items.add(item);
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean removeItemByName(String name) {
        return items.removeIf(item -> item.getName().equals(name));
    }

    public int removeAllItemsByName(String name) {
        int initialSize = items.size();
        items.removeIf(item -> item.getName().equals(name));
        return initialSize - items.size();
    }

    public int getTotalItems() {
        return items.size();
    }

    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    public double getTotalCost() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public int getItemCountByName(String name) {
        return (int) items.stream().filter(item -> item.getName().equals(name)).count();
    }

    public String[] getDistinctItemsNames() {
        return items.stream().map(Item::getName).distinct().toArray(String[]::new);
    }

    public Item[] getItemsSortedByCostDesc() {
        return items.stream().sorted(Comparator.comparing(Item::getPrice).reversed()).toArray(Item[]::new);
    }

    @Override
    public Integer getTableNumber() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }
}

class OrderManager {
    private Map<Integer, Order> tableOrders = new HashMap<>();
    private Map<String, Order> internetOrders = new HashMap<>();

    public boolean addOrder(int tableNumber, Order order) throws OrderAlreadyAddedException {
        if (tableOrders.containsKey(tableNumber)) {
            throw new OrderAlreadyAddedException();
        }
        tableOrders.put(tableNumber, order);
        return true;
    }

    public boolean addOrder(String address, Order order) throws OrderAlreadyAddedException {
        if (internetOrders.containsKey(address)) {
            throw new OrderAlreadyAddedException();
        }
        internetOrders.put(address, order);
        return true;
    }

    public Order getOrder(int tableNumber) throws IllegalTableNumber {
        if (!tableOrders.containsKey(tableNumber)) {
            throw new IllegalTableNumber();
        }
        return tableOrders.get(tableNumber);
    }

    public Order getOrder(String address) {
        return internetOrders.get(address);
    }

    public boolean removeOrder(int tableNumber) throws IllegalTableNumber {
        if (!tableOrders.containsKey(tableNumber)) {
            throw new IllegalTableNumber();
        }
        tableOrders.remove(tableNumber);
        return true;
    }

    public boolean removeOrder(String address) {
        internetOrders.remove(address);
        return true;
    }

    public boolean addItemToOrder(int tableNumber, Item item) throws IllegalTableNumber {
        if (!tableOrders.containsKey(tableNumber)) {
            throw new IllegalTableNumber();
        }
        return tableOrders.get(tableNumber).addItem(item);
    }

    public boolean addItemToOrder(String address, Item item) {
        return internetOrders.get(address).addItem(item);
    }

    public Order[] getInternetOrders() {
        return internetOrders.values().toArray(new Order[0]);
    }

    public double getTotalInternetOrdersCost() {
        return internetOrders.values().stream().mapToDouble(Order::getTotalCost).sum();
    }

    public int getTotalItemCountForInternetOrders(String itemName) {
        return internetOrders.values().stream().mapToInt(order -> order.getItemCountByName(itemName)).sum();
    }
}

class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("Order already added");
    }
}

class IllegalTableNumber extends RuntimeException {
    public IllegalTableNumber() {
        super("Illegal table number");
    }
}





public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();
        List<Item> menu = new ArrayList<>();

        // Adding some initial items to the menu
        menu.add(new Dish("Pizza", "Delicious pizza", 10.99));
        menu.add(new Dish("Burger", "Tasty burger", 8.99));
        menu.add(new Drink("Cola", "Refreshing cola", 2.99));
        menu.add(new Drink("Lemonade", "Homemade lemonade", 3.49));

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Restaurant Order");
            System.out.println("2. Add Internet Order");
            System.out.println("3. Add Item to Menu");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Restaurant Order
                    System.out.print("Enter table number: ");
                    int tableNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Display menu
                    displayMenu(menu);

                    System.out.print("Enter item number: ");
                    int restaurantItemNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (restaurantItemNumber < 1 || restaurantItemNumber > menu.size()) {
                        System.out.println("Invalid item number. Returning to the main menu.");
                        continue;
                    }

                    Item restaurantItem = menu.get(restaurantItemNumber - 1);

                    try {
                        // Add the order to the table
                        orderManager.addOrder(tableNumber, new RestaurantOrder());
                        orderManager.addItemToOrder(tableNumber, restaurantItem);
                        System.out.println("Order added to the table successfully!");
                    } catch (OrderAlreadyAddedException | IllegalTableNumber e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    // Add Internet Order
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter delivery address: ");
                    String deliveryAddress = scanner.nextLine();

                    // Display menu
                    displayMenu(menu);

                    System.out.print("Enter item number: ");
                    int internetItemNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (internetItemNumber < 1 || internetItemNumber > menu.size()) {
                        System.out.println("Invalid item number. Returning to the main menu.");
                        continue;
                    }

                    Item internetItem = menu.get(internetItemNumber - 1);

                    try {
                        // Add the order to the internet
                        orderManager.addOrder(deliveryAddress, new InternetOrder());
                        orderManager.addItemToOrder(deliveryAddress, internetItem);
                        System.out.println("Order added for delivery successfully!");
                    } catch (OrderAlreadyAddedException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    // Add Item to Menu
                    addItemToMenu(scanner, menu);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program. Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private static void displayMenu(List<Item> menu) {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i).getName() + " - $" + menu.get(i).getPrice());
        }
    }

    private static void addItemToMenu(Scanner scanner, List<Item> menu) {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter item description: ");
        String itemDescription = scanner.nextLine();
        System.out.print("Enter item price: ");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.println("Select item type:");
        System.out.println("1. Dish");
        System.out.println("2. Drink");
        System.out.print("Enter item type number: ");
        int itemType = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Item newItem;
        switch (itemType) {
            case 1:
                newItem = new Dish(itemName, itemDescription, itemPrice);
                break;
            case 2:
                newItem = new Drink(itemName, itemDescription, itemPrice);
                break;
            default:
                System.out.println("Invalid item type. Item not added to the menu.");
                return;
        }

        menu.add(newItem);
        System.out.println("Item added to the menu successfully!");
    }
}
