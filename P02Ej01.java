/*
 * Ejercicio 1 de la practica 2 de POO
 */

import java.util.Scanner;

public class P02Ej01
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double salario;

        System.out.println("Ingresa el salario del profesor:");
        salario = scanner.nextDouble();

        if (salario < 18000)
        {
            System.out.println("\nIncremento del 12%\n");
            salario = salario*1.12;
        }
        else if (salario <= 30000)
        {
            System.out.println("\nIncremento del 8%\n");
            salario = salario*1.08;
        }
        else if (salario <= 50000)
        {
            System.out.println("\nIncremento del 7%\n");
            salario = salario*1.07;
        } 
        else
        {
            System.out.println("\nIncremento del 6%\n");
            salario = salario*1.06;
        }

        System.out.printf("El nuevo salario es: %.2f\n", salario);
    }
}