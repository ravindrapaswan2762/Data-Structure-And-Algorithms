import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderFile {
    public static void main(String[] args) {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());

            while (t-->0){

                String[] ar = br.readLine().trim().split(" ");

                int a = Integer.parseInt(ar[0]);
                int b = Integer.parseInt(ar[1]);
                int c = Integer.parseInt(ar[2]);
                int d = Integer.parseInt(ar[3]);
                int K = Integer.parseInt(ar[4]);

                int sd = Math.abs(a-c) + Math.abs(b-d);

//              K%2 == sd%2 --> it means that parity of both shell is equal.
//              like it should be even-even or odd-odd parity.

                if (K >= sd && K%2 == sd%2){

                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

            }
        }catch (Exception e){
            return;
        }
    }
}
