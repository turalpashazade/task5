public class Bus  implements  Transport{

    private final double ratePerkm = 0.5;
    private final double speed = 40;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerkm;
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
        return "Bus speed:" + speed + "perKm rate:" +ratePerkm;
    }
}
