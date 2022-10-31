import java.util.Random;
import java.util.Scanner;

public class Main {

  private static  Random random = new Random();
  private static Scanner scanner = new Scanner(System.in);
  public static int flipCoin() {
    int upperBound = 2;
    int intRandom = random.nextInt(upperBound);
    if (intRandom == 0) { // 0 for Heads
      System.out.println("Flipped side: Heads");
    }
    if (intRandom == 1) { // 1 for Tails
      System.out.println("Flipped side: Tails");
    }
    return intRandom; //0 heads, 1 tails
  }
  public static boolean playOneFlip (int choice) {
    if (flipCoin() == choice) {
      System.out.println("You guessed correctly!!!!!!");
      return true;
    } else {
      System.out.println("You guessed wrong! Try again!");
      return false;
    }
  }

  public static boolean validateSelection (int choice) {
   return choice == 0 || choice == 1;
  }

  public static void printIntroMessage() {
    System.out.println("----------------------------------");
    System.out.println("Choose heads or tails. Press 0 for Heads or 1 for Tails. Press 2 to exit");
  }

  public static void main(String[] args) {
    while (true) {
      printIntroMessage();
      int choice = scanner.nextInt();
      if (choice == 2) {
        break;
      }
      if(validateSelection(choice)) {
        playOneFlip(choice);
      } else {
        System.out.println("Incorrect input, select 0 or 1 to play or 2 to stop");
      }
    }


  }
}