public class Sedan extends Car {
 private boolean fourdoors;

 public Sedan (int wheels , String type , String name , int model , String fueltype , String manifacturer, double price , boolean fourdoors) {
    super(wheels, type, name, model, fueltype, manifacturer , price);
    this.fourdoors = fourdoors;
    }

public boolean getFourdoors() {
    return fourdoors;
}

public void setFourdoors(boolean fourdoors) {
    this.fourdoors = fourdoors;
    }


@Override
public String toString() {
    return "Sedan [FourDoors=" + fourdoors + ", " + super.toString() + "]";
}
    

}
