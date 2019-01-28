/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

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
    
    public void amosarAlumno(Alumnos[] array, String id){
        for (Alumnos alum : array) {
            if (alum.getNome().equals(id)) {
                System.out.println(alum);
                break;
            }
        }
    }
    
    public void amosarAlumno(Alumnos[] array){
        String id =JOptionPane.showInputDialog("Escriba o nome do alumno");
        for (Alumnos alum : array) {
            if (alum.getNome().equals(id)) {
                System.out.println(alum);
                break;
            }
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

    public void calcMedia(Alumnos []array) {
        int total = 0;
        for (Alumnos ele : array) {
            total += ele.getNotas();
        }
        System.out.println("La nota media es: " + total / array.length);
    }

    public void calcNotaMax(Alumnos []array) {
        int notaMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNotas() > notaMax) {
                notaMax = array[i].getNotas();
            }
        }
        System.out.println("La nota máxima ha sido: " + notaMax);
    }
    
    public void sortNotas(Alumnos []array){
            Alumnos alum = new Alumnos();
            for(int i=0;i<array.length-1;i++)
                for(int j=i+1;j<array.length;j++)
                    if (array[i].getNotas() > array[j].getNotas()){
                        alum=array[i];
                        array[i]=array[j];
                        array[j]=alum;
                    };
    }
}
