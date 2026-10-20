import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
        Simple collection  = new Simple();
     try(Scanner scanner = new Scanner(Paths.get("Strings.txt"))) {
        while(scanner.hasNextLine()) {
            collection.addItem(scanner.nextLine());
        }
        System.out.println(collection.longest());
     } catch(Exception e) {
        System.out.println("nope");
     }
    }
}