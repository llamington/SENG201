public class StarmanFixes {
    private double oneTurn;
    private double tightenAmount;

    void setOneTurn(double amount) {
        oneTurn = amount;
    }

    double getTightenAmount() {
        return tightenAmount;
    }

    void tightenQuarter() {
        tightenAmount += 0.25 * oneTurn;
        System.out.println("Starman tightens the nut one quarter of a turn");
    }

    void tightenHalf() {
        tightenQuarter();
        tightenQuarter();
        System.out.println("The nut has been tightened half a turn");

    }

    void tightenFull() {
        tightenHalf();
        tightenHalf();
        System.out.println("The nut has been tightened a full turn");
    }

    public static void main(String[] args) {

        StarmanFixes wheelnut = new StarmanFixes();
        wheelnut.setOneTurn(3.5);
        wheelnut.tightenHalf();
        wheelnut.tightenFull();
        wheelnut.tightenFull();
        System.out.println(wheelnut.getTightenAmount());
    }
}
