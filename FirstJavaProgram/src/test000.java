
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

class Pair {
    long energyLevel;
    long totalAnimals;

    Pair() {}

    Pair(long energyLevel, long totalAnimals) {
        this.energyLevel = energyLevel;
        this.totalAnimals = totalAnimals;
    }
}


public class test000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long x = sc.nextInt();

        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);

        Stack<Pair> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                Pair pr = new Pair(arr[i], arr.length - i);
                st.push(pr);
            }
        }

        long p = -1;
        while (!st.isEmpty()) {
            Pair ans = st.pop();
            if (ans.totalAnimals == x) {
                p = ans.energyLevel;
                break;
            }
        }
        System.out.println(p);
    }
}





