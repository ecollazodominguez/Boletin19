/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import java.util.Random;

/**
 *
 * @author Mirroriced
 */
public class Notas {
   
    public Alumnos[] creaArray(Alumnos[] array) {
        Random rand = new Random();
        for (int i = 0; i <array.length; i++) {
            Alumnos alum = new Alumnos();
            alum.setNotas(rand.nextInt(11));//generamos numeros al azar entre el 1 y 10
            alum.setNome("Alumno " + (i+1));
            array[i] = alum;
        }
        return array;
    }
    
    public void mostrar(Alumnos[] array){
        for(Alumnos alum: array){
            System.out.println(alum.toString());
        }
    }
    
    public Alumnos[] suspensos(Alumnos []array1, Alumnos []array2) {
        int x = 0;
        for (int i=0;i<array1.length;i++){
            array2[x] = new Alumnos(0,"APROBADO");
            if (array1[i].getNotas() < 5){
                array2[x] = array1[i];
            }
            x++;
        }
        return array2;
    }
    
        public Alumnos[] aprobados(Alumnos []array1, Alumnos []array2) {
        int x = 0;
        for (int i=0;i<array1.length;i++){
            array2[x] = new Alumnos(0,"SUSPENSO");
            if (array1[i].getNotas() > 4){
                array2[x] = array1[i];
            }
            x++;
        }
        return array2;
    }

//    public void calcMedia() {
//        int total = 0;
//        int notasT = 0;
//        for (int ele : notas) {
//            total += ele;
//            notasT++;
//        }
//        System.out.println("La nota media es: " + total / notasT);
//    }
//
//    public void calcNotaMax() {
//        int notaMax = 0;
//        for (int i = 0; i < notas.length; i++) {
//            if (notas[i] > notaMax) {
//                notaMax = notas[i];
//            }
//        }
//        System.out.println("La nota máxima ha sido: " + notaMax);
//    }
}
