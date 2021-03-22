import java.util.ArrayList;

public class GreenAlienTransporter {
    private String transporterName;
    private ArrayList<GreenAlien> passengers = new ArrayList<GreenAlien>();
    int batteryCells[] = { 100, 100, 100, 100 };
    int currentBatteryI = 0;

    GreenAlienTransporter(String name) {
        transporterName = name;
    }

    public boolean replaceCell(int cellNum) {
        if (cellNum >= 1 && cellNum <= 4) {
            batteryCells[cellNum - 1] = 100;
            return true;
        }
        return false;
    }

    boolean travel(int lightYears) {
        // if enough battery is left for the journey:
        if ((batteryCells[currentBatteryI] + (3 - currentBatteryI) * 100) >= lightYears * 10) {

            for (int distance = 0; distance < lightYears; distance++) {
                if (getCharge(currentBatteryI + 1) <= 0)
                    currentBatteryI++;
                batteryCells[currentBatteryI] -= 10;
            }
            return true;
        }
        return false;
    }

    int getCharge(int cellNum) {
        if (cellNum >= 1 && cellNum <= 4)
            return batteryCells[cellNum - 1];
        return -1;
    }

    public boolean addPassenger(GreenAlien alien) {
        if (!passengers.contains(alien)) {
            passengers.add(alien);
            return true;
        }
        return false;
    }

    public boolean removePassenger(GreenAlien alien) {
        if (passengers.contains(alien)) {
            passengers.remove(alien);
            return true;
        }
        return false;
    }

    public String getPassengerNames() {
        String names = "";
        for (GreenAlien currentAlien : passengers) {
            names += currentAlien.name + ", ";
        }
        return names.substring(0, names.length() - 2);
    }

    public int countEyes() {
        int cumSum = 0;
        for (GreenAlien currentAlien : passengers) {
            cumSum += currentAlien.eyeCount;
        }
        return cumSum;
    }

    public ArrayList<String> shoppingList() {
        ArrayList<String> shopList = new ArrayList<>();
        for (GreenAlien currentAlien : passengers) {
            shopList.add(currentAlien.favouriteCandy);
        }
        return shopList;
    }

    public String toString() {
        return String.format("The passengers on %s are:%n%s%nThe number of eyes on this transporter is: %d",
                transporterName, getPassengerNames(), countEyes());
    }

    public static void main(String[] args) {
        GreenAlienTransporter transporter = new GreenAlienTransporter("Fun Club");

        GreenAlien kloup = new GreenAlien("Yyest", 2, "Biscuits");
        GreenAlien gwerp = new GreenAlien("Lmona", 99, "Marshmellows");
        GreenAlien blarg = new GreenAlien("Troll", 5, "Pop Rocks");
        GreenAlien lesap = new GreenAlien("Nemoa", 3, "Marshmellows");
        GreenAlien hugso = new GreenAlien("Hugso", 8, "Pop Rocks");

        transporter.addPassenger(kloup);
        System.out.println(transporter.addPassenger(kloup));
        transporter.removePassenger(kloup);
        System.out.println(transporter.addPassenger(kloup));
        transporter.addPassenger(gwerp);
        transporter.addPassenger(blarg);
        transporter.addPassenger(lesap);
        transporter.addPassenger(hugso);

        System.out.println(transporter);
    }
}
