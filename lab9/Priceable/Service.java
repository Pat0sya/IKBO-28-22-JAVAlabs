package mirea.javalabs.lab9.Priceable;

class Service implements Priceable{
    private String serviceName;
    private double hourlyRate;
    public Service(String serviceName, double hourlyRate){
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;

    }
    @Override
    public double getPrice(){
        return hourlyRate;
    }
}

