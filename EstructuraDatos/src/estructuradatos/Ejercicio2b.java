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
public class Ejercicio2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension;
        System.out.println("Por favor digitar la dimension del array");
        dimension=leer.nextInt();
        
        int[]ventas = new int [dimension];
        for (int i=0; i<ventas.length; i++){
        System.out.println("Ingrese el valor de venta para la posicion "+ i );
        ventas[i]=leer.nextInt();  
        System.out.println("El valor en posicion " + i +  " fue = " +ventas[i]);
        }
    } 
}
