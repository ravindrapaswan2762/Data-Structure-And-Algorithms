package datastructureAndALGORITHM.Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        System.out.println(sb);

        // get
        char ch = sb.charAt(0);
        System.out.println("ch "+ch);

        // update
        sb.setCharAt(1, 'z');
        System.out.println("update "+sb);

        // insert
        sb.insert(2, 'y');
        System.out.println("insert "+sb);

        // delete
        sb.deleteCharAt(3);
        System.out.println("delete "+sb);

        // append
        sb.append('Q');
        System.out.println("apend "+sb);

        // reverse
        sb.reverse();

    }
}
