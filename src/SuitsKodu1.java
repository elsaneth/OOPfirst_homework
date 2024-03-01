import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuitsKodu1 {
    public static void main(String[] args) {

        System.out.println("FIRST EXERCISE: ");
        String word = "abcde";
        String result1 = firstExercise(word);
        System.out.println("Result: ");
        System.out.println(result1);

        System.out.println("SECOND EXERCISE: ");
        String word2 = "aaabaaa";
        Boolean result2 = secondExercise(word2);
        System.out.println("Result: ");
        System.out.println(result2);

        System.out.println("THIRD EXERCISE: ");
        int number = 2;
        int[] numbers = {2, 4, 5, 28, 4, 2, 2};
        int result3 = thirdExercise(number, numbers);
        System.out.println("Result: ");
        System.out.println(result3);

        System.out.println("FOURTH EXERCISE: ");
        String[] strings = {"1", "2", "3", "4"};
        System.out.println(fourthExercise(strings));
    }

    public static String firstExercise(String word){
        String result = word;
        int wordSize = word.length();
        if (wordSize > 1) {
            if (wordSize % 2 == 0) {
                result = word.substring(wordSize / 2 - 1, wordSize / 2 + 1);
            } else {
                result = word.substring(wordSize / 2 - 1, wordSize / 2 + 2);
            }
        } else {
            System.out.println("Word have to be at least two characters long.");
        }
        return result;
    }

    public static boolean secondExercise(String word) {
        boolean result = false;
        if (word.length() >= 5) {
            String secondPositionString = word.substring(2,5);
//            System.out.println("String on 2. position: " + secondPositionString);
            if (secondPositionString.equals("aaa")) {
                result = true;
            } else if (word.length() >= 7) {
                String fourthPositionString = word.substring(4,7);
//                System.out.println("String on 4. position: " + fourthPositionString);
                if (fourthPositionString.equals("aaa")) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static int thirdExercise(int number, int[] numbers) {
        int result = 0;
        for (int j : numbers) {
            if (j == number) {
                result++;
            }
        }
        return result;
    }

    public static String fourthExercise(String [] strings) {
        int arrayLength = strings.length;
        String result = "String array must include at least 3 elements.";
        if (arrayLength >= 3) {
            String thirdElement = strings[arrayLength - 3];
            String lastElement = strings[arrayLength - 1];
            strings[arrayLength - 3] = lastElement;
            strings[arrayLength - 1] = thirdElement;
            result = Arrays.toString(strings);
        }
        return result;
    }


}