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
public class Ejercicio5c {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
    
    Ejercicio5c objeto12 = new Ejercicio5c();
    
    Object[][] lenguajes = new Object[5][8];
    Object[] primerFila = {"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
    lenguajes[0] = primerFila;
    objeto12.infoLenguajes (lenguajes); 
    }
    
    
    int  infoLenguajes( Object lenguajes[][]) {
          // Realizar una función llamada infoLenguajes que permita llenar la matriz lenguajes con datos por teclado a partir de la segunda fila.
           Scanner sc = new Scanner(System.in);
          for (int i = 1; i<lenguajes.length; i++) { // a partir de la segunda fila
              System.out.println("Ingrese información del lenguaje #" + i + ":");
              for (int j = 0; j< lenguajes.length; j++) {
                  lenguajes[i][j] = sc.nextLine();
                }
            }
           return 0;
    }
  
}
  
