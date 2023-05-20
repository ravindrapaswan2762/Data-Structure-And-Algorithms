package opps.complex;

public class ComplexUse {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 5);
        Complex c2 = new Complex(3, 8);

        c1.addTwoComplex(c2);
        c1.print();

        c1.mulTwoComplex(c2);
        c1.print();
    }
}
