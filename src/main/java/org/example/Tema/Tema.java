package org.example.Tema;


import java.lang.reflect.Array;
import java.util.Scanner;

import java.util.Scanner;

public class Tema {
    public static void exercitiul1() {
        Scanner numere = new Scanner(System.in);
        System.out.println("Introduceti numar:");
        int number = numere.nextInt();
        numere.close();
        int numarRandom = (int) (Math.random() * 101);
        System.out.println("Numarul introdus este: " + number);
        System.out.println("Numarul generat aleatoriu este " + numarRandom);

        if (number < numarRandom) {
            System.out.println("Numarul introdus" + number + "este mai mic decat " + numarRandom);
        } else {
            System.out.println("Numarul este mai mare.");
        }

    }

    public static void exercitiul2() {
    }
}

public class Tema {
    public static void main(String[] args) {
        public static void exercitiul2 (); {
            Scanner scanner = new Scanner(System.in);
            char operatie;
            double numar1, numar2;

            // Citeste un caracter si doua numere de la tastatura
            System.out.print("Introdu un caracter ('a', 's', 'i', 'p', 'm'): ");
            operatie = scanner.next().charAt(0);

            System.out.print("Introdu primul numar: ");
            numar1 = scanner.nextDouble();

            System.out.print("Introdu al doilea numar: ");
            numar2 = scanner.nextDouble();

            // Realizeaza operatia corespunzatoare
            switch (operatie) {
                case 'a':
                    System.out.println("Rezultatul adunarii: " + (numar1 + numar2));
                    break;
                case 's':
                    System.out.println("Rezultatul scaderii: " + (numar1 - numar2));
                    break;
                case 'i':
                    System.out.println("Rezultatul inmultirii: " + (numar1 * numar2));
                    break;
                case 'p':
                    // Verificare pentru impartire la zero
                    if (numar2 != 0) {
                        System.out.println("Rezultatul impartirii: " + (numar1 / numar2));
                    } else {
                        System.out.println("Eroare: Impartire la zero!");
                    }
                    break;
                case 'm':
                    // Verificare pentru numar2 diferit de zero
                    if (numar2 != 0) {
                        System.out.println("Rezultatul modulului: " + ((int) numar1 % (int) numar2));
                    } else {
                        System.out.println("Eroare: Impartire la zero pentru calculul modulului!");
                    }
                    break;
                default:
                    System.out.println("Eroare: Caracter invalid!");
            }
        }
    }


}

public class Tema {
    public static void main(String[] args) {
        public static void main (String[]args){
            Array myArray = new java.sql.Array();
            int[][] arrayBidimensional = {
                    {1, 2, 3},
                    {4, 5, 6, 7, 8}
            };

            // Afisarea primelor si ultimelor elemente din fiecare dimensiune
            System.out.println("Primele elemente:");
            System.out.println("Primul element din prima dimensiune: " + arrayBidimensional[0][0]);
            System.out.println("Primul element din a doua dimensiune: " + arrayBidimensional[1][0]);

            System.out.println("\nUltimele elemente:");
            System.out.println("Ultimul element din prima dimensiune: " + arrayBidimensional[0][arrayBidimensional[0].length - 1]);
            System.out.println("Ultimul element din a doua dimensiune: " + arrayBidimensional[1][arrayBidimensional[1].length - 1]);
        }
    }

}
    }




























