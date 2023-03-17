public class useCar {
        public static void main(String[] args) {
            Wheel wheel1 = new Wheel(16);
            Wheel wheel2 = new Wheel(16);
            Wheel wheel3 = new Wheel(16);
            Wheel wheel4 = new Wheel(16);

            Engine engine = new Engine(150);

            Car car = new Car("Toyota", engine, new Wheel[]{wheel1, wheel2, wheel3, wheel4});

            car.drive();
            car.refuel();
            System.out.println(car);
            Wheel stepney1 = new Wheel(17);
            Wheel stepney2 = new Wheel(17);
            car.changeWheel(2, stepney1);
            car.changeWheel(3, stepney2);


            System.out.println(car.getBrand());
            System.out.println(car);
        }
}
