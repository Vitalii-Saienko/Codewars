package Level8;
/*
Write a program that finds the summation of every number from 1 to num.
The number will always be a positive integer greater than 0.
8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */
public class GrassHopper {
    public static void main(String[] args) {
    summation(8);
    }
    public static int summation(int n) {
        int i = 0;
        int sum = i;
        while (i<=n){
            sum = sum + i;
            System.out.println(sum+" + "+i+" = "+sum);
            i++;
        }
        System.out.println(sum);
        return sum;
        // the simplest way is... return  n*(n+1)/2;
    }
}
