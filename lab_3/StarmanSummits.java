public class StarmanSummits {
    public static void climbMountain(double height, double dash, double slide) {
        int cumDashes = 1;
        double currentHeight = dash;
        while (currentHeight < height) {
            currentHeight += (dash - slide);
            cumDashes++;
        }
        System.out.printf("Starman needs to dash %d times before he reaches the top of the mountain", cumDashes);
    }

    public static void main(String[] args) {
        StarmanSummits starman = new StarmanSummits();
        starman.climbMountain(21287.4, 16.4, 4.3);
    }
}
