import java.util.Arrays;

/*
 * Problem63
 * Program to calculate the product of  values
 * Alberto Ferreira, albertomelo.business@gmail.com
 * 2022-04-12
*/

public class Problem63 {

    public static int product (int start, int count) {
        System.out.println("Start value: " + start + ", count value: " + count);
        int sumProduct = start;
        start += 1;
        for (int i = 0; i < (count-1); i++){
            sumProduct *= start;
            start += 1;
        }
        return sumProduct;
    }

    public static int product (int[] numbers) {
        System.out.println("Array values: "+ Arrays.toString(numbers));
        int sumProduct = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            sumProduct *= numbers[i];
        }
        return sumProduct;
    }

    public static void main (String[] args) {
        System.out.println("Multiplication result: " + product(5, 6));
        int[] testArray = {3,4,5};
        System.out.println("Array multiplication: " + product(testArray));
    }
    
}
