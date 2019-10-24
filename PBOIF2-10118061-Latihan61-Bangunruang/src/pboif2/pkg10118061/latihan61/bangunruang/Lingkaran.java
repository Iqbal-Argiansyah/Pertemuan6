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
public class Lingkaran extends Bangunruang {
    
    private double jariJari;
    public Lingkaran(double jariJari){
          this.jariJari = jariJari;
        
    }
    @Override
    public double volume() {
        System.out.println("Volume bola :"+ jariJari*jariJari*jariJari*3/4*3.14);
        return 0.75*3.14*jariJari*jariJari*jariJari;
    }
    
  
    
}
