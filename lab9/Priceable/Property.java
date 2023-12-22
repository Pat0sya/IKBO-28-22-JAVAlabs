package mirea.javalabs.lab9.Priceable;

class Property implements Priceable{
    private String location;
    private double propertyValue;
    public Property(String location, double propertyValue){
        this.location = location;
        this.propertyValue = propertyValue;

    }
    @Override
    public double getPrice(){
        return propertyValue;
    }
}
