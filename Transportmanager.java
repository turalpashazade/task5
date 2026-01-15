public class Transportmanager {

    public static Transport getTransport(TransportType type) {

        if (type == null) {
            return null;
        }

        switch (type) {
            case BUS: return new Bus();
            case TAXI: return new Taxi();
            case BICYCLE: return new Bicycle();
            case SCOOTER: return new Scooter();
        }

        return null;
    }


}
