package Actividad;

import java.util.Random;

public class Main{
    
    public static void main(String[] args) {
        Integer num;
        int n;
        String ltr;
        
        Carta[] cartas = new Carta[40];

        for (int i = 0; i < cartas.length; i++){
            ltr = rLetra();
            num = rNumero();
            //cartas.add(new Carta(num, ltr));
            cartas[i] = new Carta(num,ltr);
        }
        System.out.println("Cartas sin barajear");
        imprimir(cartas);
        //Fisher-Yates
        System.out.println("\nCartas Barajeadas");
        FisherYates<Carta> fy = new FisherYates<>();
        fy.fisherYates(cartas);
        imprimir(cartas);

        //System.out.println("\nCartas de jugadores");
        Carta[] player1 = new Carta[10];
        Carta[] player2 = new Carta[10];
        Carta[] player3 = new Carta[10];
        Carta[] player4 = new Carta[10];
        for (int i = 0; i < cartas.length; i++) {
            if (i<10) {
                player1[i] = cartas[i];
            }
            if (i>9 && i<=19) {
                player2[i-10] = cartas[i];
            }
            if (i>19 && i<=29) {
                player3[i-20] = cartas[i];
            }
            if (i>29 && i<=39) {
                player4[i-30] = cartas[i];
            }
        }
        System.out.println("\nCartas Jugadores sin ordenamiento");
        System.out.println("Jugador 1: ");
        imprimir(player1);
        System.out.println("Jugador 2: ");
        imprimir(player2);
        System.out.println("Jugador 3: ");
        imprimir(player3);
        System.out.println("Jugador 4: ");
        imprimir(player4);
        //CrcleSort
        System.out.println("\nOrdenacion con Cycle-Sort a 2 jugadores");
        Cyclesort<Carta> cs = new Cyclesort<>();
        cs.cycleSort(player1);
        System.out.println("cartas jugador 1:");
        imprimir(player1);
        cs.cycleSort(player2);
        System.out.println("cartas jugador 2:");
        imprimir(player2);

        //Mergesort
        System.out.println("\nOrdenacion con Merge-Sort a 2 jugadores");
        Mergesort<Carta> ms = new Mergesort<>();
        ms.ordenar(player3);
        System.out.println("cartas jugador 3:");
        imprimir(player3);
        ms.ordenar(player4);
        System.out.println("cartas jugador 4:");
        imprimir(player4);
    }

    //letras random
    public static String rLetra(){
        Random random = new Random();
        char letra = (char) (random.nextInt(4) + 'A');
        String rLtr = String.valueOf(letra);
        return rLtr;
    }

    //numeros random
    public static Integer rNumero(){
        //int min = 1;
		//int max = 10;
		//Random random = new Random();
		//Integer value = random.nextInt(9 + 2);
        int value = (int)(Math.random()*(10-1+1)+1);
        return value;
    }

    public static void imprimir(Carta cartas[]){
        for (int i = 0; i < cartas.length; i++) {
            System.out.print(cartas[i]);
            if (i<cartas.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
