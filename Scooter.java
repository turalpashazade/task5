public class Scooter implements Transport{

    private final double ratePerkm = 0.3;
    private final double speed = 25;

    @Override
    public double calculateFare(double distance) {
        return distance*ratePerkm;
    }

    @Override
    public double calculateFare(double distance, int passernder) {
        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {
        return distance/speed;
    }

    @Override
    public String getTrasnsportinfo() {
        return "Scooter Speed:" + speed + " km/h Rate:" + ratePerkm ;
    }
}
