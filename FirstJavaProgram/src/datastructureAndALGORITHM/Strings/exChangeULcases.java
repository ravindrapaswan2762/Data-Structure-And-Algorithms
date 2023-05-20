package datastructureAndALGORITHM.Strings;

public class exChangeULcases {
    public static void main(String[] args) {
        // make (aBcD --> AbCd)
        // deriving formula: ex.- (sky differences) ch-a  = CH-A (sky differences)
        //     So formula is: (1)(small case) ch = a + CH-A,       (2) CH = A + ch-a

        StringBuilder sb = new StringBuilder("pepCODIND");
        for (int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if (ch>='a' && ch<='z'){ // small case checking
                char UC =  (char) ('A'+ch-'a');
                sb.setCharAt(i, UC);
            }else if (ch>='A' && ch<='Z'){
                char sc = (char)('a'+ch-'A');
                sb.setCharAt(i, sc);
            }
        }
        System.out.println(sb);
    }
}
