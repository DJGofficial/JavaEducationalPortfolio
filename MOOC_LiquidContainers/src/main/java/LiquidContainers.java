
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            } else if (!input.equals("quit")) {
                String[] parts = input.split(" ");
                String command = parts[0];
                int amount = Integer.parseInt(parts[1]);

                if (command.equals("add")) {
                    if (amount > 0) {
                        if (first + amount <= 100) {
                            first = amount + first;
                        } else if (first + amount > 100) {
                            first = 100;
                        }
                    }

                }
                if (command.equals("move")) {
                    if (amount > 0) {
                        if (first >= amount) {
                            first = first - amount;
                            if (amount + second < 100) {
                                second = amount + second;
                            } else {
                                second = 100;
                            }
                        } else if (second + amount > 100) {
                            second = 100;
                        } else if (amount >= first && first > 0) {
                            second = first;
                            first = 0;

                        }
                    }

                }
                if (command.equals("remove")) {
                    if (amount > second) {
                        second = 0;

                    }
                    if (amount > 0 && second > 0) {
                        second = second-amount;

                    }
                }

            }
        }
    }
}
