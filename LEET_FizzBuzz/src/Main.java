import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        fizzBuzz(16);
    }

    /*
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.

     */
    public static List<String> fizzBuzz(int n) {
        List<String> fB = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            //System.out.print(", ");
            if (i % 3 == 0 && i % 5 == 0&&i>0) {
                fB.add(i-1, "FizzBuzz");

            } else if (i % 3 == 0&&i>0) {
                fB.add(i-1, "Fizz");
            } else if (i % 5 == 0&&i>0) {
                fB.add(i-1, "Buzz");
            } else{
                fB.add(i-1, String.valueOf(i));
                // System.out.println(i);
            }
        }
        for (String run : fB) {
            System.out.println(run);
        }

        return fB;
    }
}

