public class ServiceStation {
    public void check(Car[] car) {
        for (int i = 0; i < car.length; i++) {
            if (car[i] != null) {
                System.out.println("Обслуживаем " + car[i].getModelName());
                for (int j = 0; j < car[i].getWheelsCount(); j++) {
                    car[i].updateType();
                }
                car[i].checkEngine();
            }
        }
    }
    public void check(Bicycle[] bicycle) {
        for (int i = 0; i < bicycle.length; i++) {
            if (bicycle[i] != null) {
                System.out.println("Обслуживаем " + bicycle[i].getModelName());
                for (int j = 0; j < bicycle[i].getWheelsCount(); j++) {
                    bicycle[i].updateType();
                }
            }
        }
    }

    public void check(Truck[] truck) {
        for (int i = 0; i < truck.length; i++) {
            if (truck[i] != null) {
                System.out.println("Обслуживаем " + truck[i].getModelName());
                for (int j = 0; j < truck[i].getWheelsCount(); j++) {
                    truck[i].updateType();
                }
            }
            truck[i].checkEngine();
            truck[i].checkTrailer();
        }
    }
}
