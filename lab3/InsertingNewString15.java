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
public class InsertingNewString15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String, new Seq and the index: ");
        String str = sc.nextLine();
        String newStr = sc.next();
        int idx = sc.nextInt();
        System.out.println("Modified String: "+str.substring(0, idx-1)+newStr+str.substring(idx, str.length()));
    }
}
