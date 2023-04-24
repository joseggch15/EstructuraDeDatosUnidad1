/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradatos;

/**
 *
 * @author josegomezchamorro
 */
public class Ejercicio2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        String[] dataStructs = new String [] {"Listas","Colas","Pilas","Mapas","Conjuntos"};
        String[] caracteristicas = new String [] {"Azul","Grande","Hermoso","Natural","Radiante"};
     
        for (int i=0; i<dataStructs.length; i++){
        System.out.println("El elemento para dataStructs en posicion "+i+ " es: " +dataStructs[i]);
        System.out.println("El elemento para caracteristicas en posicion "+i+ " es: " +caracteristicas[i]);

        }
    }
}
