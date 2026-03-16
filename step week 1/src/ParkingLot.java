class ParkingLot {

    String[] spots = new String[10];

    int hash(String plate) {
        return Math.abs(plate.hashCode()) % spots.length;
    }

    public void parkVehicle(String plate) {

        int index = hash(plate);
        int probes = 0;

        while (spots[index] != null) {
            index = (index + 1) % spots.length;
            probes++;
        }

        spots[index] = plate;

        System.out.println("Vehicle " + plate + " parked at spot " + index +
                " (Probes: " + probes + ")");
    }

    public void exitVehicle(String plate) {

        for (int i = 0; i < spots.length; i++) {

            if (plate.equals(spots[i])) {
                spots[i] = null;
                System.out.println("Vehicle " + plate + " exited from spot " + i);
                return;
            }
        }

        System.out.println("Vehicle not found");
    }

    public void displaySpots() {

        System.out.println("Parking Lot Status:");

        for (int i = 0; i < spots.length; i++) {

            if (spots[i] == null)
                System.out.println("Spot " + i + " : EMPTY");
            else
                System.out.println("Spot " + i + " : " + spots[i]);
        }
    }

    public static void main(String[] args) {

        ParkingLot p = new ParkingLot();

        p.parkVehicle("ABC1234");
        p.parkVehicle("ABC1235");
        p.parkVehicle("XYZ9999");

        p.displaySpots();

        p.exitVehicle("ABC1234");

        p.displaySpots();
    }
}
