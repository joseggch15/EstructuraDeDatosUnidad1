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
public class Ejercicio5f {

    public static void main(String[] args) {
     
    
    Ejercicio5f objeto12 = new Ejercicio5f();  
    Ejercicio5f objeto13 = new Ejercicio5f();
    Ejercicio5f objeto14 = new Ejercicio5f();
    Ejercicio5f objeto15 = new Ejercicio5f();
   
    
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
    
    public static String[] obtenerRegistroPorFila(int fila, Object lenguajes [][]) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la fila a evaluar y buscar valores ");
        fila = leer.nextInt();
    try {
        return (String[]) lenguajes[fila];
    } catch (IndexOutOfBoundsException e) {
        throw new Exception("La fila no existe en la matriz de lenguajes");
    }
}
//    public static String obtenerRegistroPorFila(Object lenguajes[][]) {
//        Scanner sc = new Scanner(System.in);
//        String fila;
//        System.out.println("Ingrese el valor de la fila a evaluar");
//        fila = sc.nextLine();
//        try {
//            StringBuilder registro = new StringBuilder();
//            for (int i = 0; i < 5; i++) {
//                registro.append(lenguajes[fila][i]).append(" ");
//            }
//            return registro.toString();
//        } catch (IndexOutOfBoundsException e) {
//            throw new IndexOutOfBoundsException("La fila " + fila + " no existe en la matriz lenguajes.");
//        }
//    }
    
}
