//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seçin transport növünü: BUS, TAXI, BICYCLE, SCOOTER");
        String input = scanner.nextLine();

        TransportType userChoice = null;
        for (TransportType t : TransportType.values()) {
            if (t.name().equalsIgnoreCase(input)) {
                userChoice = t;
                break;
            }
        }

        Transport transport = Transportmanager.getTransport(userChoice);

        double distance = 10;
        int passengers = 2;



        if (transport != null) {
            System.out.println("Transport Info: " + transport.getTrasnsportinfo());
            System.out.println("Fare: " + transport.calculateFare(distance, passengers));
            System.out.println("Time: " + transport.calculateTime(distance) + " hours");
        } else {
            System.out.println("Yanlış transport seçildi");
        }
    }
}