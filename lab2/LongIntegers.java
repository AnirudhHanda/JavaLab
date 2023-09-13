/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;
import java.math.BigInteger;
/**
 *
 * @author aniru
 */
public class LongIntegers {
    public static void main(String args[]){
        String s = "111111111111111111";
        BigInteger b1 = new BigInteger(s);
        BigInteger b2 = new BigInteger("2222222222");
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
    }
}
