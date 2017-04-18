import java.util.ArrayList;
import java.util.List;

public class OddAvg {
  // Create a function called `oddAverage` that takes a list of numbers as parameter
  // and returns the average value of the odd numbers in the list
  // Create basic unit tests for it with at least 3 different test cases

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i < 11; i++) {
      numbers.add(i);
    }

    System.out.println(numbers);
    System.out.println(oddAverage(numbers));
  }

  public static double oddAverage(List<Integer> numbers) {
    double average = 0;
    int addOdd = 0;
    int oddCounter = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 == 1) {
        addOdd += numbers.get(i);
        oddCounter++;
      }
      average = addOdd / oddCounter;
    }
    return average;
  }
}
