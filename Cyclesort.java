package Actividad;

import java.util.*;
import java.lang.*;

public class Cyclesort<T extends Comparable<T>>{

	public void cycleSort(T array[]){

		int writes = 0;

		//T[] array = new T[50]; 
		
        int n = array.length - 1;

		for (int o = 0; o <= n - 2; o++) {
		
			T item = array[o]; 

			int pos = o;
			for (int i = o + 1; i < n; i++){
				if (array[i].compareTo(item) < 0){
					pos++;
				}
			}
			if (pos == o){
				continue;
			}
			
			while (item.equals(array[pos])==true){
				pos += 1;
			}
				
			if (pos != o) {
				T temp = item;
				item = array[pos]; 
				array[pos] = temp; 
				writes++;
			}

			while(pos != o){
				pos = o;

				for (int i = o + 1; i < n; i++){
					if (array[i].compareTo(item)<0){
						pos += 1;
					}
				}
					
				while (item.equals(array[pos]) == true){
					pos += 1;
				}

				if (item.equals(array[pos]) != true) {
					T temp = item;
					item = array[pos]; 
					array[pos] = temp; 
					writes++;
				}
			}
		}
	}
}
