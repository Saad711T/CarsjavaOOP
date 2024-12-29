public class Car extends Vehicle {
    private String name;
    private int model;
    private String fueltype;
    private String manifacturer;
    private double price;

    public Car (int wheels , String type , String name , int model , String fueltype , String manifacturer , double price) {
        super(wheels, type);
        this.name = name;
        this.model = model;
        this.fueltype = fueltype;
        this.manifacturer = manifacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getModel() {
        return model;
    }

    public String getFueltype() {
        return fueltype;
    }

    public String getManifacturer() {
        return manifacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public void setManifacturer(String manifacturer) {
        this.manifacturer = manifacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  
@Override
public String toString() {
    return "Car [Name=" + name + ", Model=" + model + ", FuelType=" + fueltype + ", Manufacturer=" + manifacturer + ", Price=" + price + ", " + super.toString() + "]";
}

}
