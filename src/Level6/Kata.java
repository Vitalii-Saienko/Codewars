package Level6;

import java.io.BufferedReader;
import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    /*
    https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
    Write a function that accepts an array of 10 integers (between 0 and 9),
     that returns a string of those numbers in the form of a phone number.
     Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
     */
    public static String createPhoneNumber(int[] numbers) {
        String initialNumber = "(";
        for (int i = 0; i < numbers.length; i++) {
            initialNumber = initialNumber + numbers[i];
        }
        String phoneNumber = initialNumber.substring(0,4)+") "+initialNumber.substring(4,7)+"-"+initialNumber.substring(7,11);
        return phoneNumber;
    }
}
/*
Alternative solutions:
1)
return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],
numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
2)
return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
3)
for (int i : numbers) {
      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
    }

 */
