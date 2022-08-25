/*
 * Problem61 
 * Program to print the string array
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-04-12
*/

public class Problem61
{
    public static void printStringArray (String[] values) {
        for (int i = 0; i < values.length; i++){
            System.out.println((i+1)+": "+values[i]);
        }
    }
    public static void main (String[] args) {
    String[] values = {"ett", "tva", "tre"};
    printStringArray(values);
    }
}