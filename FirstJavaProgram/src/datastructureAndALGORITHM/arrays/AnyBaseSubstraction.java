package datastructureAndALGORITHM.arrays;

public class AnyBaseSubstraction {
    public static void main(String[] args) {
        int x = getDifferent(8,1212, 256);
        System.out.println(x);
    }
    public static int getDifferent(int base, int n1, int n2){
        int res = 0;
        int c = 0;
        int p = 1;
        while (n1>0){
            int dig1 = n1%10;
            n1 = n1/10;
            int dig2 = n2%10;
            n2 = n2/10;
            //-------------------------- main code
            int dig = 0;
            dig1 = dig1 + c;

            if (dig1>=dig2){
                c = 0;
                dig = dig1 - dig2;
            }else {
                c = -1;
                dig = (dig1 + base) - dig2;
            }
            //-----------------------------

            res = res + (dig*p);
            p = p*10;
        }
        return res;
    }
}
