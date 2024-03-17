public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("BMW", 4),
                new Car("LADA", 4),
        };

        Truck[] truck = {
                new Truck("КАМАЗ", 6),
                new Truck("MAN", 8),
        };

        Bicycle[] bicycle = {
                new Bicycle("Harley", 2),
                new Bicycle("Yamaha", 2),
        };

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);
    }
}