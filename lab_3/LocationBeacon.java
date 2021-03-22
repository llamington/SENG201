public class LocationBeacon {
    int hours;
    int minutes;
    int distance;

    void heartBeat(int startHour, int startMinute, int startDistance, int speed, int duration) {
        hours = startHour;
        minutes = startMinute;
        distance = startDistance;

        for (int elapsedMinutes = 0; elapsedMinutes < duration; elapsedMinutes += 10) {
            distance += speed / 6;
            minutes += 10;
            if (minutes > 60) {
                hours++;
                minutes -= 60;
            }
            if (hours >= 24)
                hours -= 24;
            System.out.printf("[%d:%d] Starman is %dkm away from Earth%n", hours, minutes, distance);
        }
    }

    public static void main(String[] args) {
        LocationBeacon beacon = new LocationBeacon();
        beacon.heartBeat(14, 31, 300000, 60000, 60);
    }
}
