import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(4, "Sedan", "Camry", 2005, "Gasoline", "Toyota", 25000));
        cars.add(new Car(4, "Sedan", "Accord", 2022, "Hybrid", "Honda", 30000));
        cars.add(new Car(4, "Coupe", "Mustang", 2024, "Gasoline", "Ford", 40000));
        cars.add(new Car(4, "Sedan", "Altima", 2012, "Gasoline", "Nissan", 24000));
        cars.add(new Car(4, "Coupe", "Challenger", 2020, "Gasoline", "Dodge", 45000));
        cars.add(new Car(4, "Sedan", "Civic", 2022, "Gasoline", "Honda", 22000));
        cars.add(new Car(4, "Coupe", "Corvette", 2007, "Gasoline", "Chevrolet", 60000));
        cars.add(new Car(4, "Sedan", "Sonata", 2017, "Hybrid", "Hyundai", 27000));
        cars.add(new Car(4, "Coupe", "Model 3", 2023, "Electric", "Tesla", 45000));
        cars.add(new Car(4, "Coupe", "Supra", 1994, "Gasoline", "Toyota", 55000));
        cars.add(new Car(4, "Sedan", "Elantra", 2019, "Gasoline", "Hyundai", 21000));
        cars.add(new Car(4, "Sedan", "Passat", 2023, "Gasoline", "Volkswagen", 26000));
        cars.add(new Car(4, "Sedan", "Impreza", 2023, "Gasoline", "Subaru", 25000));
        cars.add(new Car(4, "Sedan", "S-Class", 2023, "Hybrid", "Mercedes-Benz", 110000));
        cars.add(new Car(4, "Coupe", "A5", 2023, "Gasoline", "Audi", 50000));
        cars.add(new Car(4, "Sedan", "A4", 2023, "Hybrid", "Audi", 45000));
        cars.add(new Car(4, "Coupe", "GT-R", 2009, "Gasoline", "Nissan", 113000));
        cars.add(new Car(4, "Sedan", "K5", 2023, "Gasoline", "Kia", 25000));
        cars.add(new Car(4, "Coupe", "911", 2021, "Gasoline", "Porsche", 100000));
        cars.add(new Car(4, "Sedan", "Panamera", 2023, "Hybrid", "Porsche", 150000));
        cars.add(new Car(4, "Sedan", "Lucid Air", 2023, "Electric", "Lucid Motors", 95000));
        cars.add(new Car(4, "Coupe", "RX-7", 1995, "Gasoline", "Mazda", 35000));
        cars.add(new Car(4, "Sedan", "Genesis G80", 2022, "Gasoline", "Genesis", 55000));
        cars.add(new Car(4, "Sedan", "Mazda6", 2022, "Gasoline", "Mazda", 24000));
        cars.add(new Car(4, "Coupe", "370Z", 2023, "Gasoline", "Nissan", 35000));


        List<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike(2, "Motorbike", "Yamaha YZF-R1", 2));
        bikes.add(new Bike(2, "Motorbike", "Ducati Panigale V4", 2));
        bikes.add(new Bike(2, "Motorbike", "Kawasaki Ninja ZX-10R", 2));
        bikes.add(new Bike(2, "Motorbike", "Suzuki Hayabusa", 2));
        bikes.add(new Bike(2, "Motorbike", "Honda CBR1000RR-R", 2));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the vehicle to search:");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (Car car : cars) {
            if (car.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Car found: " + car);
                found = true;
                break;
            }
        }

        if (!found) {
            for (Bike bike : bikes) {
                if (bike.getBname().equalsIgnoreCase(searchName)) {
                    System.out.println("Bike found: " + bike);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Vehicle not found.");
        }

        scanner.close();
    }
}
