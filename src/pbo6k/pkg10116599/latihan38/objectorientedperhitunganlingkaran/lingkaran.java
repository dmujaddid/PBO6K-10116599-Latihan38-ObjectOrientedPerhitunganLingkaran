/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author eka
 */
public class lingkaran {
    double luas;
    double diameter;
    double jariJari;
    double keliling;
    
    //void isiDiameter(double diameter) {
        
    //}
    
    void isiDiameter(double x) {
        diameter = x;
    }
    
    public double luas() {
        return 3.14*jariJari*jariJari;
    }
    
    public double jariJari() {
        return diameter/2;
    }
    
    public double keliling() {
        return diameter*3.14;
    }
}
