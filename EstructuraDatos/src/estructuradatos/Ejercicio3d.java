/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos;

import java.util.Scanner;

/**
 *
 * @author josegomezchamorro
 */
public class Ejercicio3d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio3d objeto4 = new Ejercicio3d();
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
//        System.out.println("La cantidad promedio de ventas fue  de:  " +total/dimension);
        objeto4.ventasPromedio (ventas); 
        System.out.println("El valor promedio de ventas fue: " +objeto4.ventasPromedio(ventas));
    }
     int  ventasPromedio (int ventas[]){
        int valortotal = 0;
        int promedio =0 ;
        for (int i=0; i<ventas.length; i++){    
            valortotal= valortotal+ventas[i];
            promedio = valortotal/ventas.length;
        }
        return promedio;
//        System.out.println("Valor mas alto de ventas " +valoralto);  
//        return valoralto;
    }
    
}
