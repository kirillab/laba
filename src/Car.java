import java.util.Arrays;
import java.util.Objects;
public class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String brand, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void drive() {
        System.out.println("Машина едет!");
    }

    public void refuel() {
        System.out.println("Машина заправляется!");
    }

    public void changeWheel(int wheelNumber, Wheel newWheel) {
        wheels[wheelNumber] = newWheel;
        System.out.println("Колесо номер " + wheelNumber + " было изменено на колесо с диаметром: " + newWheel.getDiameter());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return brand.equals(car.brand) && engine.equals(car.engine) && Arrays.equals(wheels, car.wheels);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(brand, engine);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    @Override
    public String toString() {
        return "Характеристики авто: \n" +
                "Марка: " + brand + "\n" +
                "Двигатель: " + engine + "\n" +
                "Колеса: " + Arrays.toString(wheels);
    }
}