package homework.guessgame;
import java.util.Scanner;
public class Player {
    int number;

    public void guess() {
        number = (int) (Math.random() * 10);
    }
}
