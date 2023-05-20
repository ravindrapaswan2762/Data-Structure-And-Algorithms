package CP;

public class LCM {
    public static int lcm(long a, long b){
        int lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (int) ((a > b) ? a : b);

        // Always true
        while(true) {
            if( lcm % a == 0 && lcm % b == 0 ) {
                break;
            }
            ++lcm;
        }
        return lcm;
    }
    public static void main(String[] args){
        int x = lcm(4, 12);
        System.out.println(x);
    }
}
