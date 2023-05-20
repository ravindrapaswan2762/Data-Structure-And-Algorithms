package talentBattle100days;

import java.util.ArrayList;

public class IntegerToRoman {
    public static void main(String[] args) {
        int n = 58;

        String[] notation = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        ArrayList<Integer> value = new ArrayList<>();
        value.add(1000);
        value.add(900);
        value.add(500);
        value.add(400);
        value.add(100);
        value.add(90);
        value.add(50);
        value.add(40);
        value.add(10);
        value.add(9);
        value.add(5);
        value.add(4);
        value.add(1);

        StringBuilder sb = new StringBuilder();

        for (int pos = 0; pos<notation.length; pos++){
            while(n >= value.get(pos)){
                sb.append(notation[pos]);
                n -= value.get(pos);
            }
        }
        System.out.println(sb.toString());
    }
}
