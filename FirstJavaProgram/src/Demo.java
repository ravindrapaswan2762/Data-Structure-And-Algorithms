
import java.util.*;

public class Demo {
    public static int count = 1;
    public static int max = 0;

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            long t = sc.nextLong();
            while (t-->0){

                long n = sc.nextLong();

                HashMap<Long, Long> arr = new HashMap<>();
                for (long i=0; i<n; i++){
                    long x = sc.nextLong();
                    arr.put(x, i);
                }

                long k = 0;

                for (int i=0; i<n; i++){
                    if (arr.containsKey(arr.get(i)) ) {
                        if (arr.get(i)>k){
                            arr.put(k, (long) i);
                            k++;
                        }
                    }
                }


                List<Map.Entry<Long, Long> > list =
                        new LinkedList<Map.Entry<Long, Long> >(arr.entrySet());

                // Sort the list
                Collections.sort(list, new Comparator<Map.Entry<Long, Long> >() {
                    public int compare(Map.Entry<Long, Long> o1,
                                       Map.Entry<Long, Long> o2)
                    {
                        return (o1.getValue()).compareTo(o2.getValue());
                    }
                });

                // put data from sorted list to hashmap
                HashMap<Long, Long> temp = new LinkedHashMap<>();
                for (Map.Entry<Long, Long> aa : list) {
                    temp.put(aa.getKey(), aa.getValue());
                }

                for (int i=0; i<n; i++){
                    System.out.print(temp.get(i)+" ");
                }
                System.out.println();



            }
        }catch (Exception e){
            return;
        }

    }
}
