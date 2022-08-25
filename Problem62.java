import java.util.Arrays;

/*
 * Problem62
 * Program to print the average of int numbers
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-04-12
*/

public class Problem62 {
    
    public static int sum (int[] values) {
        int totalSum = 0;
        for (int i = 0; i < values.length; i++){
            totalSum += values[i];
        }
        return totalSum;
    }

    public static double avg(int[] values){
        double genomsnitt = (double) sum(values)/values.length;
        return genomsnitt;
    }

    public static void main (String[] args) {
    int[] values = {1, 2, 5, 8, 3};
    double genom = avg(values);
    System.out.println("Values: "+ Arrays.toString(values));
    System.out.println("Sum of values: "+ sum(values));
    System.out.println("Average: "+ genom);
    }
}
