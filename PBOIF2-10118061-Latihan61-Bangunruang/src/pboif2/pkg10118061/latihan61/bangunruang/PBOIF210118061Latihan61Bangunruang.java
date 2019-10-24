/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan61.bangunruang;

/**
 *
 * @author Iqbal
 *  Iqbal Argiansyah
 * 10118061
 * IF2
 * Volume
 */
public class PBOIF210118061Latihan61Bangunruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bangunruang l = new Lingkaran(7);
        Bangunruang t = new Tabung(10,21);
        Bangunruang k = new Kerucut(14,9);
            
         System.out.println("Volume:"+l.volume());
         System.out.println("Volume Tabung:"+t.volume());
         System.out.println("Volume Kerucut:"+k.volume());
        }
    }
    
