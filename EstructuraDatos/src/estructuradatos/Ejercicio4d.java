/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josegomezchamorro
 */
public class Ejercicio4d {
            public static void main(String[] args) {
                // TODO code application logic here
                Ejercicio4d objeto9 = new Ejercicio4d();

                Scanner leer = new Scanner(System.in);
                int dimension = (int) (Math.random()*10);   
                int[]ventas = new int [dimension];
                int total = 0;
                for(int i=0; i<ventas.length; i++){
                    ventas[i]= (int) (Math.random()*1000);  
                    System.out.println("El valor ingresado fue = " +ventas[i]);
                    total= total+ventas[i];
                }
                System.out.println("La cantidad de ventas fue de:  " +dimension);
                System.out.println("La cantidad total de ventas fue de:  " +total);  
                System.out.println("La cantidad promedio de ventas fue  de:  " +total/dimension);
                objeto9.OrdenVentasAltas (ventas); 
        //      System.out.println("Orden ventas bajas" +Arrays.toString(objeto6.OrdenVentasBajas(ventas);
                System.out.println(Arrays.toString(ventas));
        }

            // Ejercicio pide organizar el Array en Pares e Impares en secciones diferentes
        int  OrdenVentasAltas (int ventas[]){
            for (int i=0; i<ventas.length-1; i++){  
                for (int m=0; m< ventas.length-i- 1; m++){
                    if (ventas[i] % 2 != 0 && ventas[m] % 2 == 0) {
                     // Intercambiar
                       int temporal = ventas[m];
                       ventas[m] = ventas[m+1];
                       ventas[m+1] = temporal;
                    } 
                    
                } 
            }
                return 0;
        }
}
