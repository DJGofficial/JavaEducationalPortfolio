
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        ArrayList<Recipe> recipe = readFile(file);
        System.out.println("Enter command: ");
        String command = scanner.nextLine();
        while (!command.matches("stop")) {
            if (command.matches("list")) {

                for (Recipe recipe1 : recipe) {
                    System.out.println(recipe1);
                }
                break;
            }
            if (command.matches("find name")) {
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                for (Recipe recipe1 : recipe) {
                    if (recipe1.getName().contains(word)) {
                        System.out.println(recipe1.getName() + ", cooking time: " + recipe1.getTime());
                    }
                }
                break;
            }
            if (command.matches("find cooking time")) {

                System.out.println("Max cooking time: ");
                int max = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe1 : recipe) {
                    if (recipe1.getTime() <= max) {
                        System.out.println(recipe1.getName() + ", cooking time: " + recipe1.getTime());
                    }

                }
                break;
            }
            if (command.matches("find ingredient")) {

                System.out.println("Ingredient: ");
                String ing = scanner.nextLine();
                for (Recipe recipe1 : recipe) {
                   // System.out.println(recipe1.getIngredients());
                    if (recipe1.getIngredients().contains(ing)) {
                        System.out.println(recipe1.getName() + ", cooking time: " + recipe1.getTime());
                    }

                }
                break;
            }
            break;
        }
        //recipes.txt
    }

    public static ArrayList<Recipe> readFile(String file) {
        ArrayList<Recipe> recipe = new ArrayList<>();
        // ArrayList<Recipe> ingredients = new ArrayList<>();
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String name = line;
                int time = Integer.valueOf(fileReader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (fileReader.hasNextLine()) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                recipe.add(new Recipe(name, time, ingredients));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
        return recipe;
    }
}

//String[] parts = line.split("\n");
//     System.out.println("");
// name = parts[0];
//int time = Integer.valueOf(parts[1]);
//String ingredients = parts[2];
                //recipe.add(new Recipe(name, time, ingredients));
