/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan63.gradient;

/**
 *
 * @author Iqbal
 */
public class koordinat implements garislurus {
    private int x1,y1,x2,y2;
    
    
    public koordinat(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
               
            
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
    @Override
    public int hitunggradian(){
        return(y1-y2)/(x1-x2);
    }

}

