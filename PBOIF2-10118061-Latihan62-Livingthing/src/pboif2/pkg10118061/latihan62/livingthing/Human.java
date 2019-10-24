/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan62.livingthing;

/**
 *
 * @author Iqbal
 */
public abstract class Human {
    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
 public abstract void walk(String nama);
 
public void breath(String nama){
    System.out.println(this.nama+ " bernafas");
    
    
}

public void eat(String nama){
    System.out.println(this.nama+ " makan");
}

}