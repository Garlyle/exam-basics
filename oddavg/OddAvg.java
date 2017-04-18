import java.util.ArrayList;
import java.util.Arrays;

public class OddAvg {
  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases
    ArrayList<Integer> list = new ArrayList<>();
    list.addAll(Arrays.asList(1,3,2,5));
    System.out.println(oddAverage(list));
  }

  public static double oddAverage(ArrayList<Integer> list) {
    int sum = 0;
    int count = 0;

    for(Integer i : list) {
      if (i % 2 != 0) {
        sum += i;
        count++;
      }
    }

    if (count == 0) {
      return 0;
    } else {
      return (double)sum / count;
    }
  }
}