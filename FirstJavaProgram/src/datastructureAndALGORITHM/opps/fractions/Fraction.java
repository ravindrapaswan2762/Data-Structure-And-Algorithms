package opps.fractions;

public class Fraction {
    int numinator;
    int denuminator;

    Fraction(int numinator, int denuminator){
        this.numinator = numinator;
        this.denuminator = denuminator;
        simplyfy();
    }

//    public void setNuminator(int num){
//        numinator = num;
//        simplyfy();
//    }
//    public void setDenuminator(int num) {
//        if (denuminator<=0){
//            return;
//        }
//        this.denuminator = num;
//        simplyfy();
//    }
//    public int getDenuminator() {
//        return denuminator;
//    }
//    public int getNuminator() {
//        return numinator;
//    }

    public void addTwoFraction(Fraction f2){
        //first fraction is the fraction on which function is called.
        //second fraction is passes as argument.
        this.numinator = this.numinator*f2.denuminator + this.denuminator* f2.numinator;// a/b + c/d <-- cross multiply
        this.denuminator = this.denuminator* f2.denuminator;
        simplyfy();
    }
    public void subTwoFraction(Fraction f2){
        //first fraction is the fraction on which function is called.
        //second fraction is passes as argument.
        this.numinator = this.numinator*f2.denuminator - this.denuminator* f2.numinator;// a/b + c/d <-- cross multiply
        this.denuminator = this.denuminator* f2.denuminator;
        simplyfy();
    }
    public void mulTwoFraction(Fraction f2){
        //first fraction is the fraction on which function is called.
        //second fraction is passes as argument.
        this.numinator = this.numinator*f2.numinator;
        this.denuminator = this.denuminator* f2.denuminator;
        simplyfy();
    }
    public void divTwoFraction(Fraction f2){
        //first fraction is the fraction on which function is called.
        //second fraction is passes as argument.
        this.numinator = this.numinator*f2.denuminator;
        this.denuminator = this.denuminator* f2.numinator;
        simplyfy();
    }

    private void simplyfy(){
        int small = Math.min(numinator, denuminator);
        int gcd = 1;
        for (int i=2; i<=small; i++){
            if (numinator%i==0 && denuminator%i==0){
                gcd = i;
            }
        }
        numinator = numinator/gcd;
        denuminator = denuminator/gcd;
    }
    public  void print(){
        System.out.println(numinator+"/"+denuminator);
    }
    public  void increament(){ // (x/y) + 1
        numinator = numinator +denuminator;
        simplyfy();
    }
}
