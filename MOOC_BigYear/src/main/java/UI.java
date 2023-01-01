
import java.util.Scanner;
import java.util.ArrayList;

public class UI {

    private Scanner scanner;
    ArrayList<Bird> birds = new ArrayList<>();

    public UI(Scanner scanner) {

        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("? ");
            String answer = scanner.nextLine();
            if (answer.contains("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scanner.nextLine();
                birds.add(new Bird(name, latin, 0));
            }

            if (answer.contains("Observation")) {
                int i = 0;
                System.out.println("Bird? ");
                String check = scanner.nextLine();
                for (Bird bir : birds) {
                    if (bir.getName().contains(check)) {
                        bir.setOb(i++);
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }
            if (answer.contains("All")) {

                for (Bird bird : birds) {
                    //     birds.toString();
                    System.out.println(bird + ": " + bird.getOb());

                }
            }
            if (answer.contains("One")) {
                int i = 0;
                System.out.println("Bird?");
                String one = scanner.nextLine();
                for (Bird bir : birds) {
                    if (bir.nameContains(one)) {
                        System.out.println(bir + ": " + bir.getOb() + " observations");
                    }

                }

            }
            if (answer.contains("Quit")) {
                break;
            }

        }

    }
}
