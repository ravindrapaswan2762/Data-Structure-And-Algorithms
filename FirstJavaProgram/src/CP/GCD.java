package CP;

public class GCD {
    public static int gcd(long a, long b) {
        // Everything divides 0
        if (a == 0)
            return (int) b;
        if (b == 0)
            return (int) a;

        // base case
        if (a == b)
            return (int) a;

        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    public static void main(String[] args){
        int x = gcd(4, 12);
        System.out.println(x);
    }
}
