/*
 * Ejercicio 5 de la practica 1 de POO
 */

import java.util.Scanner;

public class ej5
{
    public static void main (String[] args)
    {
        //Definimos el valo de pi como una constante
        final double PI = 3.1416;
        double radio, area, volumen;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el valor del radio: ");
        radio = scanner.nextDouble();

        if (radio >= 0)
        {
            //El valor del area 4Pi por radio al cuadrado
            area = 4*PI*radio*radio;
            //El volumen es 4/3 de pi por radio al cubo
            volumen = (area*radio)/3;

            System.out.printf("El area de la esfera es: %.2f\n", area);
            System.out.printf("El volumen de la esfera es: %.2f\n", volumen);
        }
        else
        {
            System.out.println("El valor del radio no puede ser negativo");
        }
        
    }
}