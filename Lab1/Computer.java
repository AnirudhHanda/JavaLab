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
public class Computer {
    private String name;
    private String desc;
    
    void inputComputerDetails(){
        System.out.print("Enter Computer's name: ");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.print("Enter Computer's desc: ");
        this.desc = sc.nextLine();
    }
    
    void displayComputerDetails(){
        System.out.println("Computer Details: "+this.name+", "+this.desc);
    }
}
