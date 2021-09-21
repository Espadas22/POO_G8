/*
 *   Ejecricio 4 de la practica 1 de POO
 */

import java.util.Scanner;

public class ej4
{
    public static void main (String [] arg)
    {
        int entero_1;
        int entero_2;
        int entero_3;
        int suma, producto; 
        double promedio;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingresa el primer entero: ");
        entero_1 = scanner.nextInt();
        
        System.out.println("Ingresa el segundo entero: ");
        entero_2 = scanner.nextInt();
        
        System.out.println("Ingresa el tercer entero: ");
        entero_3 = scanner.nextInt();

        suma = entero_1 + entero_2 + entero_3;
        producto = entero_1 * entero_2 * entero_3;
        promedio = (double) suma / 3;

        System.out.printf("Su suma es %d\n", suma);
        System.out.printf("Su producto es %d\n", producto);
        System.out.printf("Su promedio es %.2f\n", promedio);

        if (entero_1 == entero_2 && entero_1 == entero_3)
        {   //Detectamos si son iguales
            System.out.println("Los 3 enteros son iguales");
        }   //Hacemos los analisis para cada entero
        else if (entero_1 >= entero_2 && entero_1 >= entero_3)
        {
            System.out.printf("El mayor es %d\n", entero_1);

            System.out.printf("El menor es ");
            
            if (entero_2 >= entero_3)
            {
                System.out.printf("%d\n", entero_3);
            }
            else
            {
                System.out.printf("%d\n", entero_2);
            }
        }
        else if (entero_2 >= entero_1 && entero_2 >= entero_3)
        {
            System.out.printf("El mayor es %d\n", entero_2);

            System.out.printf("El menor es ");
            
            if (entero_1 >= entero_3)
            {
                System.out.printf("%d\n", entero_3);
            }
            else
            {
                System.out.printf("%d\n", entero_1);
            }
        }
        else if (entero_3 >= entero_2 && entero_3 >= entero_1)
        {
            System.out.printf("El mayor es %d\n", entero_3);

            System.out.printf("El menor es ");

            if (entero_2 >= entero_1)
            {
                System.out.printf("%d\n", entero_1);
            }
            else
            {
                System.out.printf("%d\n", entero_2);
            }
        }
    }
}