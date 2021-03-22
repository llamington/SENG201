/**
 * @author Bailey Lissington
 * 
 */

public class SpaceStrings {
    /**
     * 
     * @param str The input string  
     * @return The length of the string
     */
    public static int getStringLength(String str) {
        return str.length();
    }

    public static int getLetterPosition(String str, char letter) {
        return str.indexOf(letter);
    }

    public static String makeAllCaps(String str) {
        return str.toUpperCase();
    }

    public static String makeAllLower(String str) {
        return str.toLowerCase();
    }

    public static String makeHugeString(String str1, String str2) {
        return str1.concat(str2);
    }

    public static void main(String[] args) {
        SpaceStrings space = new SpaceStrings();

        String starman = "Starman Sez";
        String rocketship = "Red Tesla";

        System.out.println(space.getStringLength(starman));
        System.out.println(space.getLetterPosition(starman, 'r'));
        System.out.println(space.makeAllCaps(starman));
        System.out.println(space.makeAllLower(starman));
        System.out.println(space.makeHugeString(starman, rocketship));
    }
}
