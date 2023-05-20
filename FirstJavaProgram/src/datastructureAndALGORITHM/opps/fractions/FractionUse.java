package opps.fractions;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        Fraction f2 = new Fraction(4, 8);

        f1.divTwoFraction(f2);
        f1.print();

    }
}
