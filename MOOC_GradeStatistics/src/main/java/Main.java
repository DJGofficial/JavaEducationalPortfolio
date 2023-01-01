
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] points = new String[6];
        points[0] = "";
        points[1] = "";
        points[2] = "";
        points[3] = "";
        points[4] = "";
        points[5] = "";
        double helper = 0;
        int divisor = 0;
        double passing = 0;
        int divisorSecond = 0;
        double passed = 0.0;
        double failes = 0.0;

        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            String eingabe = scanner.nextLine();
            int number = Integer.valueOf(eingabe);
            if (number == -1) {
                break;

            }
            if (number != -1 && number >= 0&&number<=100) {
                helper = helper + number;
                divisor++;

            }
            if (number < 50&&number>=0) {
                failes++;

            }
            if (number >= 50&&number<=100) {
                passing = passing + number;
                divisorSecond++;
                passed++;
            }
                if (number < 50 && number > 0) {
                    points[0] += "*";
                }
             else if (number < 60 && number >= 50) {
                points[1] += "*";
            } else if (number < 70 && number >= 60) {
                points[2] += "*";
            } else if (number < 80 && number >= 70) {
                points[3] += "*";
            } else if (number < 90 && number >= 80) {
                points[4] += "*";
            } else if (number >= 90 && number <= 100) {
                points[5] += "*";

            }

        }
        System.out.println("Point average (all): " + helper / divisor);

        System.out.println("Point average (passing): " + (passing / divisorSecond));

        System.out.println("Pass percentage: " + ((100 * passed)) / (passed + failes));

        System.out.println("Grade distribution:\n5:" + points[5] + "\n4:" + points[4] + "\n3:" + points[3] + "\n2:" + points[2] + "\n1:" + points[1] + "\n0:" + points[0]);

    }
}
