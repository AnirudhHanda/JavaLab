/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;
import java.util.*;
/**
 *
 * @author aniru
 */
public class CountingVowels20 {
    public static void main(String args[]){
        int vowelCount = 0;
        int eachCount[] = new int[5];
        String vowels = "aeiou";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++){
            if(vowels.indexOf(str.charAt(i))!=-1){
                vowelCount++;
                switch(str.charAt(i)){
                    case 'a': eachCount[0]++;
                            break;
                    case 'e': eachCount[1]++;
                                break;
                    case 'i': eachCount[2]++;
                                break;
                    case 'o': eachCount[3]++;
                                break;
                    case 'u': eachCount[4]++;
                               break;
                }
            }
        }
        System.out.println("Total no. of vowels: "+vowelCount);
        System.out.println("Count of each vowel: ");
        System.out.println("a: "+eachCount[0]);
        System.out.println("e: "+eachCount[1]);
        System.out.println("i: "+eachCount[2]);
        System.out.println("o: "+eachCount[3]);
        System.out.println("u: "+eachCount[4]);
    }
}
