package estructuradatos;

import java.util.Arrays;

public class Ejercicio3ee {

    static int [] randomArray (){
        int dimension = (int) (Math.random()*10);   
        int[]array = new int [dimension];
        
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random()*1000);
        }

        return array;
    }

    static int promedio(int [] array){
        int total = 0, promedio = 0;

        for (int i : array) {
            total+= i;
        }

        promedio = total/array.length;
        return promedio;
    }

    static int mediana(int [] array){
        int dimensionPositivos = 0;
        int [] diferencia = new int[array.length];
        int promedio = promedio(array);

        for (int i = 0; i < array.length; i++) {
            diferencia[i] = promedio - array[i];
            if(promedio - array[i] > 0)
                dimensionPositivos++;
        }

        int[] positivos = new int[dimensionPositivos];

        for (int i = 0, j = 0; i < array.length; i++) {
            if(promedio - array[i] > 0){
                positivos[j] = array[i];
                j++;
            }
        }

        Arrays.sort(positivos);
        
        return positivos[positivos.length-1];
    }


    public static void main(String[] args) {
        
        int [] ventas = randomArray();
        
        System.out.println("VENTAS\n"
                          +"***********");
        for (int i : ventas) {
            System.out.println(i);
        }
        System.out.println("El promedio es "+ promedio(ventas));
        System.out.println("MAS CERCANO ES-> "+mediana(ventas));
        
    }
}