/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan62.livingthing;

/**
 *
 * @author Iqbal
 *  Iqbal Argiansyah
 * 10118061
 * IF2
 * Livingthing
 */
public class PBOIF210118061Latihan62Livingthing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human n = new Living();
        n.setNama("Iqbal Argiansyah");
        n.walk(n.getNama());
        n.breath(n.getNama());
        n.eat(n.getNama());
    }
    
}
