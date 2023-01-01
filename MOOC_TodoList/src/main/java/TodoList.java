
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {

        this.list = new ArrayList<>();
    }

    public void add(String list) {
        this.list.add(list);
    }

    public void print() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ": " + this.list.get(i));
        }

    }

    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= this.list.size()) {
            return;
        }
        this.list.remove(index);
    }
}
