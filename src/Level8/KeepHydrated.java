package Level8;
/*
Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
time = 11.8--> litres = 5
 */
public class KeepHydrated {
    public static void main(String[] args) {
        System.out.println(Liters(11.8));
    }
    public static int Liters(double time)  {
        return (int) (time*0.5);
    }
}
