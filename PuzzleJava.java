import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

  public ArrayList<Integer> getTenRolls() {
    ArrayList<Integer> random10 = new ArrayList<>();
    Random rand = new Random();
    int i;
    for (i = 1; i <= 10; i++) {
      random10.add(rand.nextInt(20) + 1);
    }
    return random10;
  }

  public String getRandomLetter() {
    Random rand = new Random();
    String alphabetString = "abcdefghijklmnopqrstuvwxyz";
    String[] alphabet = new String[26];
    int i;
    for (i = 0; i < 26; i++) {
      alphabet[i] = String.valueOf(alphabetString.charAt(i));
    }
    return alphabet[rand.nextInt(26)];
  }

  public String generatePassword() {
    String password = "";
    int i;
    for (i = 0; i < 8; i++) {
      password = password + getRandomLetter();
    }
    return password;
  }

  public ArrayList<String> getNewPasswordSet(int length) {
    ArrayList<String> passwordSet = new ArrayList<String>();
    int i;
    for (i = 0; i < length; i++) {
      passwordSet.add(generatePassword());
    }
    return passwordSet;
  }
}
