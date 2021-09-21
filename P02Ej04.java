/*
 * Ejercicio 4 de la practica 2 de POO
 */

import java.util.Scanner;

public class P02Ej04
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int limite;
        double resultado = 0;

        System.out.println("Hasta cual numero se calculara la serie?");
        limite = scanner.nextInt();

        System.out.println("\nEl resultado de la serie:");
        
        for(int i = 1; i <= limite; i++)
        {
            if (i == 1)
            {   // El 1 se imprime de forma entera
                System.out.printf("1 ");
            }
            else
            {   // Todos los demas terminos se representan como fraccion
                System.out.printf("+ 1/%d ", i);
            }

            resultado += (double)1/i;
        }

        System.out.printf("\nes: %.2f\n", resultado);
    }
}