/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

/**
 *
 * @author Mirroriced
 */
public class Boletin19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Alumnos[] dam1 = new Alumnos[30];
    Alumnos[] suspensos = new Alumnos[30];
    Alumnos[] aprobados = new Alumnos[30];
    Notas dam = new Notas();
    dam.creaArray(dam1);
     System.out.println("****");
    dam.mostrar(dam1);
    System.out.println("****");
    dam.suspensos(dam1,suspensos);
    dam.mostrar(suspensos);
    System.out.println("****");
    dam.aprobados(dam1, aprobados);
    dam.mostrar(aprobados);
    }
    
}
