import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        Date myDate = new Date(2012,5,26);
     Person Kanye = new Person("Connor", 13, 150, 90, myDate);
     Person Josh = new Person("Joshua");
     Kanye.twins(myDate);
    }
}