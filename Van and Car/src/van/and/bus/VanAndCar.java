/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package van.and.bus;

import java.util.Scanner;

/**
 *
 * @author lu-l98
 */
public class VanAndCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int van=7;
    int bus;
        bus = 50;
    System.out.println("Please set the number of passenger");
    int r=scan.nextInt();
    if(r<50){
    System.out.println("The number of bus is 1");
    System.out.println("The number of van is 0");
    }
    if(r>=50){
    int b=r/50;
    int vp=r-(50*b);
    int v=vp/7;
    System.out.print("The number of bus is ");
    System.out.println(b);
    if(vp<=7&&vp!=0){
    System.out.print("The number of van is ");
    System.out.println(v+1);
    }
    else{
        System.out.println("The number of van is 0")
    }
    
    
     
    
    // TODO code application logic here
            }         
    }

