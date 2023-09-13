/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author aniru
 */
import java.util.Scanner;

public class Demo18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the word/sequence to count: ");
        String seq = sc.next();

        int count = 0;
        int index = 0;
        
        index = str.indexOf(seq, index);
        while(index != -1){
            count++;
            index = index + seq.length();
            index = str.indexOf(seq, index);
        }

        System.out.println("Number of occurrences of \"" + seq + "\" in the given string: " + count);
    }
}
