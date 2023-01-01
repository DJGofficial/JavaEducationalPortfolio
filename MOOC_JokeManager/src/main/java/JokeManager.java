
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {

    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
     while(true){
        if (jokes.isEmpty()) {
            return ("Jokes are in short supply.");

   

        }
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
         System.out.println(jokes.get(index));
         return jokes.get(index);
    }
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
    
}
