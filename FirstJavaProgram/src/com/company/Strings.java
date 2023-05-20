package com.company;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
//      [pool- reuse] and [heep- make new one] are two memory location for strings
//      immutable - who cant change with another, only make anothe one

        String my_str1 = "ravindra";
        String my_str2 = "ravindra";
        String my_str3 = new String("ravindra");

        System.out.println(my_str1 == my_str2);
        System.out.println(my_str1 == my_str3);
//  --------------------------------------------------------------

        String name = "my name is ravindra paswan";
        System.out.println(name.substring(5));
        System.out.println(name.substring(5, 12));

//      check any word in strings
        System.out.println("check_word-->"+name.contains("ravindra"));

//      check two string_var is equals or not
        System.out.println("is_equals-->"+my_str1.equals(my_str2));

//      check string_var empty or not
        String name2 = " ";
        System.out.println("is_empty-->"+name2.isEmpty());

//      add more strings in old strings
        System.out.println("adding new word-->"+name.concat(", MR[]ROBOT"));

//      replacing character
        System.out.println("replacing character 'r-c'-->"+name.replace('r', 'c'));

//      spliting in strings
        String cars = "Hyundai, Mariti, Swift, Wagonr, Ferrari, Lamborghini";
        String allcars[] = cars.split("spliting-->"+",");
        for (String items: allcars){
            System.out.print(items);
        }
        System.out.println();
//      finding index position
        System.out.println("index0f-->"+cars.indexOf("M"));

//      lower case
        System.out.println("in lower_case-->"+cars.toLowerCase(Locale.ROOT));

//      uper case
        System.out.println("in uper_case case-->"+cars.toUpperCase(Locale.ROOT));

//      triming(trim)
        String str = "   Hello world   ";
        System.out.println(str.trim());





    }
}
