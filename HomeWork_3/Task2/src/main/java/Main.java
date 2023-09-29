public class Main {
    public static void main(String[] args) {
       Vehicle car = new Vehicle(250, 0.8, "Car");
       SpeedCalculation speedCar = new SpeedCalculation(car);
       System.out.println("Допустимая скорость машины:" + speedCar.calculateAllowedSpeed(car));

       Bus bus = new Bus(180);
       SpeedCalculation speedBus = new SpeedCalculation(bus);
       System.out.println("Допустимая скорость авобуса:" + speedBus.calculateAllowedSpeed(bus));

    }
}