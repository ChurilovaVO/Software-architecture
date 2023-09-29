public class Vehicle {
    private int maxSpeed;
    protected double permisSpCoef; //коэффициент допустимой скорости
    private String type;

    public Vehicle(int maxSpeed, double permisSpCoef, String type) {
        this.maxSpeed = maxSpeed;
        this.permisSpCoef = permisSpCoef;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }

    public double getPermisSpCoef() {
        return permisSpCoef;
    }
}
