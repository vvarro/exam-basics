import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OddAvgTest {

  OddAvg oddAvg = new OddAvg();
  List<Integer> numbers = new ArrayList<>();

  @Test
  public void testIsThereAnyOdd() {
    numbers.add(2);
    assertEquals ( 0, (int)(oddAvg.oddAverage(numbers)));
  }

  @Test
  public void testIsOneOfItOdd() {
    numbers.add(2);
    numbers.add(3);
    assertEquals(3, (int) (oddAvg.oddAverage(numbers)));
  }

  @Test
  public void testIsItTheRealAverage(){
    numbers.add(2);
    numbers.add(3);
    numbers.add(5);
    assertEquals(4, (int)(oddAvg.oddAverage(numbers)));
  }
}