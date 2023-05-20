package opps.complex;

public class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void addTwoComplex(Complex c1){
        this.real = this.real + c1.real;
        this.imaginary = this.imaginary + c1.imaginary;
    }
    void mulTwoComplex(Complex c1){
        this.real = (this.real*c1.real) - (this.imaginary*c1.imaginary);
        this.imaginary = (this.real*c1.imaginary) + (this.imaginary*c1.real);
    }
    void print(){
        System.out.println(this.real+" + i"+this.imaginary);
    }
}
