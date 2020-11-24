package pl.adriankurek;

public class CarData {
    private static String[] names = { "Volkswagen", "Nissan", "Opel", "Toyota", "Mitsubishi", "Porsche" };

    public static Car getRandomCar() {
        Car car = new Car();
        
        car.setName(names[(int) (Math.random() * names.length)]);
        car.setSpeed((int) (Math.random() * 100) + 100);

        return car;
    }
}