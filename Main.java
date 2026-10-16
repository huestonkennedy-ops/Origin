import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        Clock watch = new Clock(1, 1, 1, 1);
        System.out.println(watch);
        watch.advance();
        watch.advance();
        System.out.println(watch);
        for(int i=1; i<=3661; i++) {
            watch.milAdvance();
        }
        System.out.println(watch);
    }
}