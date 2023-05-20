public class dataTypes {
    public static void main(String[] args){
        try {
            // (div,multiplication and mod)--> have same precedence,--> so salculation goes left to right
            // for Integer
            short b = 8;// 2 bytes
            int a = 142;// 4 bytes
            long c = 123;// 8 bytes
            byte d = 125;// 1 bytes

            // for decimal
            double r = (double) a/(double) b;// 8 bytes
            float q = 1.5f;// 4 bytes

            // String/Character
            char ch = 'a';// 2 bytes
            String s = "abc";

            // Boolean
            boolean is = true;

            //Premitive DataTypes: int,long,short,byte, char, double,float, boolean
            //Non-Premitive DataTypes: array,string, class,interface,object, Scanner

            System.out.println(q);
            System.out.println(r);


        }catch (Exception e){
            return;
        }
    }
}
