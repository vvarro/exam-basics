import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OddAvgTest {
  OddAvg oddAvg = new OddAvg();
  List<Integer> numbers = new ArrayList<>();

  @Test
  public void testIsThereAnyOdd() throws Exception {
    numbers.add(2);
    assertEquals ( 0.0, oddAvg.oddAverage(numbers));
  }

  @Test
  public void testIsOneOfItOdd() throws Exception {
    numbers.add(2);
    numbers.add(3);
    assertEquals(3.0, oddAvg.oddAverage(numbers));
  }

}