package Actividad;

import java.util.Random;

import java.util.Arrays;

public class FisherYates<T extends Comparable<T>>{
    public void fisherYates(T arr[]){

        int n = arr.length-1;
        Random r = new Random();

        for (int i = n; i > 0; i--){
            int j = r.nextInt(i+1);
            T temp = arr[i]; 
            arr[i] = arr[j];
            arr[j] = temp; 
        }
    }
}