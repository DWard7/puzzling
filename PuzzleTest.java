import java.util.ArrayList;
import java.util.Random;

public class PuzzleTest {

  public static void main(String[] args) {
    PuzzleJava generator = new PuzzleJava();
    ArrayList<Integer> randomRolls = generator.getTenRolls();
    System.out.println(randomRolls);
    System.out.println(generator.getRandomLetter());
    System.out.println(generator.generatePassword());
    System.out.println(generator.getNewPasswordSet(7));
  }
}
