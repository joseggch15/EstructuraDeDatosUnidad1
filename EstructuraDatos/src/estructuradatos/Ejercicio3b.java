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
public class Ejercicio3b {
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio3b objeto2 = new Ejercicio3b();
        
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
        objeto2.ventasBajas (ventas); 
        System.out.println("El valor mas bajo de la venta fue de " +objeto2.ventasBajas(ventas));
    }
    int  ventasBajas (int ventas[]){
        int valorbajo = 1000000000;
        for (int i=0; i<ventas.length; i++){    
            if (valorbajo > ventas[i]){
                valorbajo = ventas[i]; 
            }
        }
        return valorbajo;
//        System.out.println("Valor mas alto de ventas " +valoralto);  
//        return valoralto;
    } 
}
