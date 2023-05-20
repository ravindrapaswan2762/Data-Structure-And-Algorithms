package datastructureAndALGORITHM.Strings;

public class charWithDistanceOfChar {
    public static String charWithDis(String s){

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int i=1; i<s.length(); i++){
            char curr = s.charAt(i);
            char pre = s.charAt(i-1);
            int dis = curr - pre;
            sb.append(dis);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = new String("abdgca");
        String res = charWithDis(s);
        System.out.println(res);
    }
}
