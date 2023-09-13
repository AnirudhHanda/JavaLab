/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1;
import java.util.*;
/**
 *
 * @author aniru
 */
public class NextLineDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.print("\nEntered numbr: "+n);
        System.out.print("Enter any string with spaces: ");
        sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Entered String: "+str);
    }
}
