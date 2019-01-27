/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

/**
 *
 * @author Mirroriced
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Notas dam1 = new Notas();
    dam1.creaArray();
     System.out.println("****");
    dam1.AprobSuspen();
     System.out.println("****");
    dam1.calcMedia();
        System.out.println("****");
    dam1.calcNotaMax();
    }
    
}
