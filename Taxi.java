public class Taxi implements Transport{

    private final double ratePerkm = 1.5;
    private final double speed = 60;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerkm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance) * (1 + 0.1 * (passengers - 1));
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTrasnsportinfo() {
        return "Taxi Speed: " + speed + " perkm Rate: " + ratePerkm ;
    }


}
