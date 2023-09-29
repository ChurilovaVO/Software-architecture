public class SpeedCalculation {
    public Vehicle vehicle;

    public SpeedCalculation(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getPermisSpCoef();
    }
}


