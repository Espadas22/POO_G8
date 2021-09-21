/*
 * Ejercicio 5 de la practica 2 de POO
 */

public class P02Ej05
{
    public static void main (String[] args)
    {
        for (int i = 1; i <= 12; i++)
        {   
            // Iniciamos el verso
            System.out.printf("\nIn the ");
            
            // Imprimimos el numero del dia
            switch(i)
            {
                case 1:
                    System.out.printf("first ");
                    break;
                case 2:
                    System.out.printf("second ");
                    break;
                case 3:
                    System.out.printf("third ");
                    break;
                case 4:
                    System.out.printf("fourth ");
                    break;
                case 5:
                    System.out.printf("fifth ");
                    break;
                case 6:
                    System.out.printf("sixth ");
                    break;
                case 7:
                    System.out.printf("seventh ");
                    break;
                case 8:
                    System.out.printf("eighth ");
                    break;
                case 9:
                    System.out.printf("ninth ");
                    break;
                case 10:
                    System.out.printf("tenth ");
                    break;
                case 11:
                    System.out.printf("eleventh ");
                    break;
                case 12:
                    System.out.printf("twelfth ");
                    break;
            }
            
            // terminamos la frase del dia
            System.out.printf("day of Christmas my true love sent to me:");

            // Imprimimos los versos del regalo
            switch(i)
            {
                case 12:
                    System.out.printf("\nTwelve drummers drumming");
                case 11:
                    System.out.printf("\nEleven pipers piping");
                case 10:
                    System.out.printf("\nTen lords a-leaping");
                case 9:
                    System.out.printf("\nNine ladies dancing");
                case 8:
                    System.out.printf("\nEight maids a-milking");
                case 7:
                    System.out.printf("\nSeven swans a-swimming");
                case 6:
                    System.out.printf("\nSix geese a-laying");
                case 5:
                    System.out.printf("\nFive golden rings");
                case 4:
                    System.out.printf("\nFour calling birds");
                case 3:
                    System.out.printf("\nThree french hens");
                case 2:
                    System.out.printf("\nTwo turtle doves");
                case 1:
                    System.out.printf("\n");
                    
                    //Desde la segunda repeticion este versio termina asi
                    if (i > 1)
                    {
                        System.out.printf("And ");
                    }
                    
                    System.out.printf("a partridge in a pear tree\n");
            }
        }
    }
}