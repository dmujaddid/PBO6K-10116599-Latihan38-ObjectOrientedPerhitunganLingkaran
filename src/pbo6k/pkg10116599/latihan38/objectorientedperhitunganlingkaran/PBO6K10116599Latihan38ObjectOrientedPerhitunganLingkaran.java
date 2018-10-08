/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan38.objectorientedperhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author eka
 */
public class PBO6K10116599Latihan38ObjectOrientedPerhitunganLingkaran {

    private static double x;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variabel
        double luas, diameter, jariJari, keliling;
        
        
        System.out.println("=======Perhitungan Lingkaran=======");
        Scanner scan = new Scanner(System.in);
        
        
        // Input diameter oleh user
        do {
        System.out.print("Masukkan nilai diameter lingkaran : ");
        //diameter=scan.nextDouble();
        //double x = scan.nextDouble();
        while (!scan.hasNextDouble()) {
        
            lingkaran angka = new lingkaran();
        angka.isiDiameter(x);
            
            System.out.println("Nilai Diameter tidak sesuai");
            System.out.println();
            System.out.print("Masukkan nilai diameter lingkaran : ");
        scan.next(); // this is important!
        }
        diameter = scan.nextDouble();
        } while (diameter <= 0);
       
              
       
        
        
        // Menampilkan Perhitungan
        System.out.println();
        System.out.println("=======Hasil Perhitungan Lingkaran=======");
        //System.out.println("Jari-jari lingkaran\t: " +lingkaran+ " cm");
        //System.out.println("Luas lingkaran\t\t: " +luas+  " cm");
        //System.out.println("Keliling lingkaran\t: " +keliling+  " cm");
        
    }
        
        
    }
    

