/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanempat;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class contohJOptionsPane {
    public static void main(String[] args) {
        
      String kota = JOptionPane.showInputDialog("dimana kota anda?");
        System.out.println("kota anda di :" + kota);
    
      String usia = JOptionPane.showInputDialog("berapa usia anda?");
        System.out.println("usia anda berapa :" + usia);
        
      String tanggal =JOptionPane.showInputDialog("tanggal jadian anda?");
        System.out.println("tanggal jadian :" + tanggal);
        
      String nama = JOptionPane.showInputDialog("nama walikota anda?");
        System.out.println("nama walikota :" + nama);
         
      String sekolah = JOptionPane.showInputDialog("asal sekolah?");
        System.out.println("asal sekolah :" + sekolah);
    
    }
}
        
    
    
