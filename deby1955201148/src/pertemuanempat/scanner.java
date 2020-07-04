/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanempat;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class scanner {
    public static void main(String[] args) {
        int usia = 0;
        int tinggi = 0;
        int lebar = 0;
        int jauh = 0;
        int banyak = 0;
        
        //membuat scanner
        System.out.println("berapa usia kakek anda?");
        Scanner inputUser = new Scanner(System.in);
        usia = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("barapa tinggi anda?");
        inputUser = new Scanner(System.in);
        tinggi = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa lebar rumah anda?");
        inputUser = new Scanner(System.in);
        lebar = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa jauh kamu berjalan?");
        inputUser = new Scanner(System.in);
        jauh = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa banyak kucing anda?");
        inputUser = new Scanner(System.in);
        banyak = Integer.parseInt(inputUser.nextLine());
        //output
        System.out.println("berapa usia kakek anda " + usia);
        System.out.println("berapa tinggi anda " + tinggi);
        System.out.println("berapa lebar rumah anda" + lebar);
        System.out.println("berapa jauh kamu berjalan " + jauh);
        System.out.println("berapa banyak kucing anda " + banyak);
        
    }
 
}
