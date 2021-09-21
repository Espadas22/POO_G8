/*
 * Ejercicio 2 de la practica 2 de POO
 */

import java.util.Scanner;

public class P02Ej02
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double real_1, real_2, real_3;

        System.out.println("Introduce el primer numero:");
        real_1 = scanner.nextDouble();

        System.out.println("Introduce el segundo numero:");
        real_2 = scanner.nextDouble();

        System.out.println("Introduce el tercer numero:");
        real_3 = scanner.nextDouble();

        if (real_1 == real_2 && real_1 == real_3)
        {   //Detectamos si son iguales
            System.out.println("Los 3 numeros son iguales");
        }   //Hacemos los analisis para cada numero
        else if (real_1 >= real_2 && real_1 >= real_3)
        {
            System.out.printf("El mayor es %f\n", real_1);
        }
        else if (real_2 >= real_1 && real_2 >= real_3)
        {
            System.out.printf("El mayor es %f\n", real_2);
        }
        else if (real_3 >= real_2 && real_3 >= real_1)
        {
            System.out.printf("El mayor es %f\n", real_3);
        }
    }
}