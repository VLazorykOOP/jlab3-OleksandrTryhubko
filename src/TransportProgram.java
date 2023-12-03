
class Transport {
    String type;
    String brand;

    public Transport(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public void show() {
        System.out.println("Тип: " + type);
        System.out.println("Бренд: " + brand);
    }
}


class Car extends Transport {
    int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super("Автомобіль", brand);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Кількість дверей: " + numberOfDoors);
    }
}

class Train extends Transport {
    int numberOfCars;

    public Train(String brand, int numberOfCars) {
        super("Поїзд", brand);
        this.numberOfCars = numberOfCars;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Кількість вагонів: " + numberOfCars);
    }
}

class Express extends Train {
    boolean highSpeed;

    public Express(String brand, int numberOfCars, boolean highSpeed) {
        super(brand, numberOfCars);
        this.highSpeed = highSpeed;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Висока швидкість: " + highSpeed);
    }
}

public class TransportProgram {
    public static void main(String[] args) {

        Transport transport1 = new Transport("Транспортний засіб", "SomeBrand");
        Car car1 = new Car("Toyota", 4);
        Train train1 = new Train("InterCity", 10);
        Express express1 = new Express("Shinkansen", 12, true);


        Transport[] transports = {transport1, car1, train1, express1};


        for (Transport transport : transports) {
            transport.show();
            System.out.println("--------------");
        }
    }
}
