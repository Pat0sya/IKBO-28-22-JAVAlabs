package mirea.javalabs.lab9.Priceable;

class Product implements Priceable{
    private String name;
    private double price;
    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }
    @Override
    public double getPrice(){
        return price;
    }

}
