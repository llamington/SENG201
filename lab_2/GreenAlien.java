public class GreenAlien {
    public String name;
    public int eyeCount;
    public String favouriteCandy;

    public String toString() {
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

    public boolean equals(GreenAlien other) {
        if (name == other.name && eyeCount == other.eyeCount && favouriteCandy == other.favouriteCandy)
            return true;
        return false;
    }

    public static void main(String[] args) {
        GreenAlien kloup = new GreenAlien();
        GreenAlien lesap = new GreenAlien();
        GreenAlien gwerp = new GreenAlien("Gwerp", 4, "Marshmellows");
        GreenAlien blarg = new GreenAlien("Kloup", 3, "Pop Rocks");

        System.out.println(kloup == lesap);
        System.out.println(gwerp == lesap);
        System.out.println(kloup == blarg);
    }
}
