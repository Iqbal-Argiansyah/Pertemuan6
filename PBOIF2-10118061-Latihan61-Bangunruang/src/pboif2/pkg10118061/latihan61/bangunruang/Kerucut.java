/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan61.bangunruang;

/**
 *
 * @author Iqbal
 */
public class Kerucut extends Bangunruang {
   private double jariJari;
   private double tinggi;
   
     public Kerucut(double jariJari,double tinggi){
        this.jariJari=jariJari;
        this.tinggi=tinggi;
     }  
          @Override
    public double volume() {
        return 
                0.33333333*3.14*jariJari*jariJari*tinggi;
    
    }
    
}
