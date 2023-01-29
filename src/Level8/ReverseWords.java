package Level8;
import java.util.Arrays;
public class ReverseWords {
    /*
    Complete the solution so that it reverses all of the words within the string passed in.
    Words are separated by exactly one space and there are no leading or trailing spaces.
    "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
     */
    public static void main(String[] args) {
        System.out.println(reverseWords("The greatest victory is that which requires no battle"));
    }
    public static String reverseWords(String str){
        String [] answerInArray = str.split(" ");
        String answer = "";
        for (int i = answerInArray.length-1; i >= 0; i--) {
            answer = answer + answerInArray[i]+" ";
        }
        return answer.trim();
    }
}
