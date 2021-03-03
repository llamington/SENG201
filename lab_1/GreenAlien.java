public class GreenAlien {
    public String name;
    public int eyeCount;
    public String favouriteCandy;

    public String getDescription() {
        return "This Alien is called " + name + " and has " + eyeCount + " eyes. Gross. It seems to enjoy eating "
                + favouriteCandy;
    }

    GreenAlien() {
        name = "Kloup";
        eyeCount = 6;
        favouriteCandy = "Lollypops";
    }

    GreenAlien(String tempName, int tempEye, String tempCandy) {
        name = tempName;
        eyeCount = tempEye;
        favouriteCandy = tempCandy;
    }

    public static void main(String[] args) {
        GreenAlien kloup = new GreenAlien();
        GreenAlien gwerp = new GreenAlien("Gwerp", 4, "Marshmellows");
        GreenAlien blarg = new GreenAlien("Blarg", 3, "Pop Rocks");
        GreenAlien hloff = new GreenAlien("Hloff", 5, "Pineapple Lumps");

        System.out.println(kloup.getDescription());
        System.out.println(gwerp.getDescription());
        System.out.println(blarg.getDescription());
        System.out.println(hloff.getDescription());
    }
}
