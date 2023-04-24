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
public class Ejercicio5b {

      public static void main(String[] args) {
                // TODO code application logic here
   
    Scanner leer = new Scanner(System.in);
    Object[][] lenguajes = new Object[5][8];
    Object[] primerFila = {"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
    lenguajes[0] = primerFila;
    for (int i = 0; i < 5; i++) {
    System.out.print(lenguajes[0][i] + " ");
    }
   }
}