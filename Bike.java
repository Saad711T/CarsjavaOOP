public class Bike extends Vehicle {
    String bname;
    int seats;

    public Bike (int wheels , String type , String bname , int seats) {
       super(wheels, type);
       this.bname = bname;
       this.seats=seats;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

@Override
public String toString() {
    return "Bike [Name=" + bname + ", Seats=" + seats + ", " + super.toString() + "]";
}

}
