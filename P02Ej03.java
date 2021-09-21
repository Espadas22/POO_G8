/*
 * Ejercicio 3 de la practica 2 de POO
 */

import java.util.Scanner;

public class P02Ej03
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Variable para guardar valores durante la conversion
        double medida;
        double factordeDeConversion = 1;

        //Variable control para saber que conversion haremos
        int seleccion;

        //Variables de apoyo para la impresion
        String medidaOriginal = "";
        String medidaConvertida = "";

        //Capturamos la eleccion del usuario
        System.out.println("Que conversion quieres realizas?");
        System.out.println("(1) Pulgadas a milimetros");
        System.out.println("(2) Yardas a metros");
        System.out.println("(3) Millas a kilometros\n");
        seleccion = scanner.nextInt();

        //Asignamos valor a las variables segun la operacion a realizar
        switch(seleccion)
        {
            case 1: 
                medidaOriginal = "pulgadas";
                medidaConvertida = "milimetros";
                factordeDeConversion = 25.40;
                break;
            case 2:
                medidaOriginal = "yardas";
                medidaConvertida = "metros";
                factordeDeConversion = 0.9144;
                break;
            case 3:
                medidaOriginal = "millas";
                medidaConvertida = "kilometros";
                factordeDeConversion = 1.6093;
                break;
            default:
                //Se le coloca este valor de control para mas adelante
                seleccion = 0;
        }

        if (seleccion == 0)
        {   //Si la seleccion no fue valida, la operacion no se realiza
            System.out.println("El valor introducido no es valido");
        }
        else
        {
            //Capturamos el valor a convertir
            System.out.printf("\nIntroduce el valor en %s: ", medidaOriginal);
            medida = scanner.nextDouble();
            //Multiplicamos la medida por el factor correspiente
            medida *= factordeDeConversion;
            //Mostramos el resultado
            System.out.printf("El valor en %s es: %.2f\n", medidaConvertida, medida);
        }
    }
}