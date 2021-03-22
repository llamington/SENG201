public class SpaceStation {
    void dock() {
        System.out.println("Starman floats toward the space station and enters through the airlock");
    }

    void dock(String vehicle) {
        System.out.printf("Starman enters the large airlock, piloting %s%n", vehicle);
    }

    void dock(String vehicle, String songName) {
        dock(vehicle);
        System.out.printf("... and the station cranks up %s on the entertainment system%n", songName);
    }

    public static void main(String[] args) {
        SpaceStation station = new SpaceStation();
        station.dock();
        station.dock("Red Tesla Roadster");
        station.dock("Red Tesla Roadster", "Space Oddity");
    }
}
