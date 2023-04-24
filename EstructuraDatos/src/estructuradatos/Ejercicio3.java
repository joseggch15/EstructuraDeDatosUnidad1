/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos;
import java.util.Scanner;
public class Ejercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejercicio3 objeto = new Ejercicio3();
        
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
        objeto.ventasAltas (ventas); 
        System.out.println("El valor de ventas altas fue "+objeto.ventasAltas (ventas));
    }
    int  ventasAltas (int ventas[]){
        int valoralto = 0;
        for (int i=0; i<ventas.length; i++){    
            if (valoralto < ventas[i]){
                valoralto = ventas[i]; 
            }
          
        }
        return valoralto;
//        System.out.println("Valor mas alto de ventas " +valoralto);  
//        return valoralto;
    } 
}  

