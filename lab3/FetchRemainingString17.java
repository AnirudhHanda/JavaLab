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
public class FetchRemainingString17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter the sequence: ");
        String seq = sc.next();
        int index = str.indexOf(seq);
        index = index+seq.length();
        System.out.println("Remaining String after the sequence "+seq+": "+str.substring(index, str.length()));
    }
}
