import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddAvgTest {
  ArrayList<Integer> list = new ArrayList<>();

  @Test
  void TestForListOfNumbers() {
    list.addAll(Arrays.asList(1, 3, 2, 5));
    assertEquals(OddAvg.oddAverage(list), 3.0);
  }

  @Test
  void TestForEvenNumbers() {
    list.addAll(Arrays.asList(2, 4, 6, 16));
    assertEquals(OddAvg.oddAverage(list), 0);
  }

  @Test
  void TestForEmptyList() {
    list.clear();
    assertEquals(OddAvg.oddAverage(list), 0);
  }
}
