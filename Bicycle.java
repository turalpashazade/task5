public class Bicycle implements  Transport{

    private final double ratePerKm = 0.1;
    private final double speed = 15;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        // velosiped 1 nəfərlikdir
        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTrasnsportinfo() {
        return "Bicycle Speed: " + speed + " perkm Rate: " + ratePerKm;
    }

}
