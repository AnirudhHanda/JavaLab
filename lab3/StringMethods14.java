/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author aniru
 */
public class StringMethods14 {
    public static void main(String[] args){
        String str = "Dr. Homi Jhangir Bhabha";
        String str1 = new String("Dr. Vikram Sarabhai");
        String str2 = "Dr. Homi Jhangir Bhabha";
        String str3 = new String("Dr. Vikram Sarabhai");
        String str4 = new String("Dr. Homi Jhangir Bhabha");

        // Strings are Immutable
        // Strings are internally shared for efficience reasons
        
        // Demonstrating == and .equals() method for strings
        System.out.println(str == str2);
        System.out.println(str1 == str3);
        System.out.println(str.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str==str4);
        System.out.println(str.equals(str4));
        
        // Demonstrating equalsIgnoreCase() method
        String str5 = "Hello";
        String str6 = "HELLO";
        System.out.println(str5==str6);
        System.out.println(str5.equals(str6));
        System.out.println(str5.equalsIgnoreCase(str6));
        
        // Demonstrting the use of hashCode() method
        String str7 = "hello";
        System.out.println(str7.hashCode());
        String str8 = "hello";
        System.out.println(str7.hashCode() == str8.hashCode());
        String str9 = new String("hello");
        System.out.println(str7.hashCode()==str9.hashCode());
        
        // Demonstrating the use of .spit() method in Strings
        String[] arr = str.split(" ");
        // Using Enhanced For loop
        for(String i : arr){
            System.out.println(i);
        }
        // Using split method to split the string with CamelCasing by passing a suitabel Regular Expression as a parameter
        String camelCase = new String("HomiJhangirBhabha");
        String[] arr2 = camelCase.split("(?=[A-Z])");
        for(String i : arr2){
            System.out.println(i);
        }
        
        // Demonstring the use of .substring() method in Stirngs
        System.out.println(str.substring(4, str.length()));
        
        // Demonstrating the use of replace method in Strigs
        System.out.println(str.replace("Homi Jhangir Bhabha", camelCase));
        
        // Demonstrating the use of indexOf() method in Strings
        System.out.println(str.indexOf("Homi"));
        
        // Demonstrating the use of toUpperCase() and toLowerCase() methods in Strings
        String str10 = "HELLO";
        System.out.println(str10.toLowerCase());
        String str11 = "hello";
        System.out.println(str11.toUpperCase());
        
        // Demonstrating the use of .concat() method in Strings
        String str12 = "Welcome to SMVDU";
        String str13 = str12.concat("Students");
        System.out.println(str13);
        System.out.println(str12);
        str12 = str12.concat("students");
        System.out.println(str12);
    }
}
