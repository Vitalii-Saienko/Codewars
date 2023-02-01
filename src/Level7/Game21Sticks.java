package Level7;

import java.util.Scanner;

/*
https://www.codewars.com/kata/5866a58b9cbc02c4f8000cac/train/java
In this game, there are 21 sticks lying in a pile. Players take turns taking 1, 2, or 3 sticks.
The last person to take a stick wins. Create a robot that will always win the game. Your robot will always go first.
The function should take an integer and returns 1,2 or 3. Note: The input will always be valid (a positive integer).
 */
public class Game21Sticks {
    static int sticks = 21;

    public int getSticks() {
        return sticks;
    }

    public static void main(String[] args) {
        Game21Sticks game21Sticks = new Game21Sticks();
        game21Sticks.game();
}
    public static int makeMoveComp(int sticks){
        int sticksToTake = 1;
        if (sticks==19 || sticks == 15 || sticks == 11 || sticks == 7){
            sticksToTake = 3;
        }
        if (sticks==18 || sticks == 14 || sticks == 10 || sticks == 6){
            sticksToTake = 2;
        }
        if (sticks<=3){
            sticksToTake = sticks;
        }
        System.out.println("Comp takes "+sticksToTake+" sticks.");
        return sticksToTake;
    }
    public static int makeMoveUser (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sticks do you take:");
        int sticksToTake = scanner.nextInt();
        while (sticksToTake>3 || sticksToTake<1){
            System.out.println("Number is incorrect, please enter again:");
            sticksToTake = scanner.nextInt();
        }
        System.out.println("User takes "+sticksToTake+" sticks.");
        return sticksToTake;
    }

    public static int reduceStickBalance(int step){
        sticks = sticks-step;
        return sticks;
    }

    public void game(){
        System.out.println("There are "+getSticks()+" sticks. Game starts!");
        while (true){
            reduceStickBalance(makeMoveComp(getSticks()));
            System.out.println(getSticks()+" sticks left.");
            if (getSticks()==0){
                System.out.println("You lose");
                break;
            }
            reduceStickBalance(makeMoveUser());
            System.out.println(getSticks()+" sticks left.");
            if (getSticks()==0){
                System.out.println("You win!!!");
                break;
            }
        }
    }
    }
