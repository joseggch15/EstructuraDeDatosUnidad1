package estructuradatos;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author josegomezchamorro
 */
public class Ejercicio2c {

    /**
     * @param args the command line arguments
     */
    
    // se realiza ejercicio cde
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension = (int) (Math.random()*10);   
        int[]ventas = new int [dimension];
        int total;
        total =0;
        for (int i=0; i<ventas.length; i++){
        ventas[i]= (int) (Math.random()*1000);  
        System.out.println("El valor ingresado fue = " +ventas[i]);
        total= total+ventas[i];
        }
        System.out.println("La cantidad de ventas fue de:  " +dimension);
        System.out.println("La cantidad total de ventas fue de:  " +total);  
        System.out.println("La cantidad promedio de ventas fue  de:  " +total/dimension); 
        
    } 
}
