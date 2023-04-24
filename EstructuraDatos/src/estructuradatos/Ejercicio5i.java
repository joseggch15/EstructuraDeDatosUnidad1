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
public class Ejercicio5i {

       public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
    
    Ejercicio5i objeto12 = new Ejercicio5i();  
    Ejercicio5i objeto13 = new Ejercicio5i();
    Ejercicio5i objeto14 = new Ejercicio5i();
   
   
    
    Object[][] lenguajes = new Object[5][8];
    Object[] primerFila = {"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
    lenguajes[0] = primerFila;
    objeto12.infoLenguajes (lenguajes);
    objeto13.buscarLenguaje (lenguajes); 
    objeto14.buscarPosicion(lenguajes); 
    System.out.println("La busqueda fue de : " +objeto13.buscarLenguaje(lenguajes));
    System.out.println("La busqueda fue de : " +Arrays.toString(objeto14.buscarPosicion(lenguajes)));
    
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
    boolean buscarLenguaje(Object lenguajes[][]) {
        Scanner sc = new Scanner(System.in);
        String nombreLenguaje;
        System.out.println("Ingrese información del lenguaje a buscar ");
        nombreLenguaje = sc.nextLine();
        for (int i = 1; i < 5; i++) {
            if (lenguajes[i][0].equals(nombreLenguaje)) {
                return true;
            }
        }
        return false;
    }
    int[]  buscarPosicion(Object lenguajes[][]) {
        Scanner sc = new Scanner(System.in);
        String nombreLenguaje;
        System.out.println("Ingrese información del lenguaje a buscar ");
        nombreLenguaje = sc.nextLine();
          for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (lenguajes[i][j].equals(nombreLenguaje)) {
                 int[] coordenadas = {i, j};
                 return coordenadas;
                }
            }
        }
        return null;
    }
    
}
