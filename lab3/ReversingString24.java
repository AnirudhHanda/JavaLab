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
public class ReversingString24 {
    public static void main(String args[]){
        // using StringBuilder
        StringBuilder sb = new StringBuilder("Anirudh Handa");
        sb.reverse();
        System.out.println("Reversed String: "+sb);
        
        // using StringBuffer
        StringBuffer sf = new StringBuffer("Anirudh Handa");
        sf.reverse();
        System.out.println("Reversed String: "+sf);
    }
}
