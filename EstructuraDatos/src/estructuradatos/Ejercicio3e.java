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
public class Ejercicio3e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio3e objeto5 = new Ejercicio3e();
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
        objeto5.ventasPromedioProx (ventas); 
        System.out.println("El valor mas cercano a la media es: " +objeto5.ventasPromedioProx (ventas));
    }
    int  ventasPromedioProx (int ventas[]){
        int valortotal = 0;
        int promedio;
        int cercano = 0;
        int diferencia = Integer.MAX_VALUE; //inicializado valor máximo de variable de tipo int
       for (int i = 0; i < ventas.length; i++) {
             valortotal= valortotal+ventas[i];
            promedio = valortotal/ventas.length;
            if (ventas[i] == promedio) {
                return ventas[i];
            } else {
                if(Math.abs(ventas[i]-promedio)<diferencia){
                    cercano=ventas[i];
                    diferencia = Math.abs(ventas[i]-promedio);
                }
            }
        }
        return cercano;
    }   
}
      

    

