package mirea.javalabs.lab9.Priceable;

public class PriceableTest {
    public static void main(String[] args){
        Priceable product = new Product("Laptop", 999.99);
        Priceable service = new Service("Plumbing", 50.0);
        Priceable property = new Property("City Apartments", 250000.0);
        System.out.println("Product price: $"+ product.getPrice());
        System.out.println("Service hourly rate: $"+ service.getPrice());
        System.out.println("Property value: $"+ property.getPrice());
    }
}
