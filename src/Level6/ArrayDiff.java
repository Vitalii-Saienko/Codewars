package Level6;

import java.util.Arrays;


/*
https://www.codewars.com/kata/523f5d21c841566fde000009/train/java
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.
Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}

 */
public class ArrayDiff {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arr2 = {1,5};
        System.out.println(Arrays.toString(arrayDiff(arr, arr2)));

    }
    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(num -> Arrays.stream(b).noneMatch(bNum -> bNum == num))
                .toArray();
    }
}
