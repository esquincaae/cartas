package Actividad;

public class Mergesort<T extends Comparable<T>>{

	private void mezclar(Carta array[], Carta izquierda[], Carta derecha[]) {
		int ii=0, id=0, ia = 0;
		while (ii < izquierda.length && id < derecha.length){
			if (izquierda[ii].compareTo(derecha[id])<0) { 
				array[ia] = izquierda[ii]; 
				ii+=1;
			}
			else{ 
				array[ia] = derecha[id]; 
				id+=1;
			}
			ia+=1;
		}
		
		// verifica si aun hay elementos en alguna de las mitades
		while (ii < izquierda.length ) {
			array[ia] = izquierda[ii]; 
			ii+=1;
			ia+=1;
		}
		
		while (id < derecha.length) { 
			array[ia] = derecha[id]; 
			id+=1;
			ia+=1;
		}
	}
	
	public void ordenar(Carta array[]) {
		if (array.length > 1) {
			int mitad = array.length/2;
			int n1 = mitad;
			int n2 = array.length - mitad;

			// Crea arreglos temporales para las dos mitades
			Carta[] izquierda = new Carta[n1];
			Carta[] derecha = new Carta[n2];

			// Copia los elementos que corresponden en cada mitad
			for (int ii = 0; ii < n1; ++ii){
				izquierda[ii] = array[ii]; 
			}
				
			for (int id = 0; id < n2; ++id){
				derecha[id] = array[mitad+id];	
			}
				
			ordenar(izquierda); // Ordena la primera mitad 
			ordenar(derecha); // Ordena la segunda mitad
			mezclar(array, izquierda, derecha); // Mezcla las dos mitades
		}
	}
}

