package org.example;

import java.util.Arrays;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] vetorA = {2, 2, 4, 8, 10, 6, 7, 8, 9, 10};
        int[] vetorB = {14, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] vetorC = new int[0];
        int[] vetorPar= new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0 && vetorB[i] % 2 == 0) {
                vetorPar[i] = vetorA[i] * vetorB[i];
                if(vetorPar[i] > 0){
                    vetorC = Arrays.copyOf(vetorC, vetorC.length +1);
                    vetorC[vetorC.length - 1] = vetorPar[i];
                }
            }
        }
        System.out.println("Vetor C: " + Arrays.toString(vetorC));


    }

}
