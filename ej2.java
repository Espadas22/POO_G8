/*
 *   Ejericio 2 de la practica 1 de POO
 */

import java.util.Scanner;

public class ej2
{
    public static void main (String [] arg)
    {
        int numero_1;
        int numero_2;
        int suma, resta, multiplicacion; 
        double division;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingresa el primer numero:");
        numero_1 = scanner.nextInt();
        
        System.out.println("Ingresa el segundo numero:");
        numero_2 = scanner.nextInt(); 

        suma = numero_1 + numero_2;
        resta = numero_1 - numero_2;
        multiplicacion = numero_1 * numero_2;
        division = (double) numero_1 / numero_2;

        System.out.printf("La suma es %d\n", suma);
        System.out.printf("La resta es %d\n", resta);
        System.out.printf("La multiplicacion es %d\n", multiplicacion);
        System.out.printf("La division es %.2f\n", division);
    }
}