public class SpaceCalculations {
    public static float addition(float f1, float f2) {
        return f1 + f2;
    }

    public static float subtraction(float f1, float f2) {
        return f1 - f2;
    }

    public static float multiplication(float f1, float f2) {
        return f1 * f2;

    }

    public static int intDivision(int i1, int i2) {
        return i1 / i2;
    }

    public static float floatDivision(float f1, float f2) {
        return f1 / f2;
    }

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double toAU(double metres) {
        return metres / 149597870700.0;
    }

    public static void main(String[] args) {
        SpaceCalculations space = new SpaceCalculations();

        System.out.println(space.addition(10, 4));
        System.out.println(space.subtraction(32, 20));
        System.out.println(space.multiplication(7, 6));
        System.out.println(space.intDivision(9, 4));
        System.out.println(space.floatDivision(9, 4));
        System.out.println(space.circumference(8.75));
        System.out.println(space.toAU(1337133713371337.0));
    }
}
