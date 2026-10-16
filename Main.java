import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       String strings = "";
     Scanner scanner = new Scanner(System.in);
     System.out.print("What file would you like to read?");
     String file = scanner.nextLine();
     try(Scanner scanFile = new Scanner(Paths.get(file))){
        while(scanFile.hasNextLine()) {
            strings += scanFile.nextLine();
        }
     } catch(Exception e) {
        System.out.println("Nope");
     }
     while (true){
        String name = scanner.nextLine();
        if(strings.contains(name)) {
            System.out.println("yup");
        }
     }
    }
}