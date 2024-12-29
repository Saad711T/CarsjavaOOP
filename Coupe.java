public class Coupe extends Car {
    private boolean twodoors;
    public Coupe (int wheels , String type , String name , int model , String fueltype , String manifacturer , double price ,boolean twodoors) {
        super(wheels, type, name, model, fueltype, manifacturer , price);
        this.twodoors = twodoors;
        }
    public boolean getTwodoors() {
        return twodoors;
    }
    public void setTwodoors(boolean twodoors) {
        this.twodoors = twodoors;
    }
    

@Override
public String toString() {
    return "Coupe [TwoDoors=" + twodoors + ", " + super.toString() + "]";
}



}
