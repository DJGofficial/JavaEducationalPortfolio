
import java.util.Scanner;


public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
       // Scanner scanner = new Scanner(System.in);
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.contains("stop")) {
                break;
            }
            if (command.contains("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            }
            if (command.contains("list")) {
                list.print();
            }
            if (command.contains("remove")) {
                System.out.println("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                list.remove(remove);
            }
        }
    }
}
