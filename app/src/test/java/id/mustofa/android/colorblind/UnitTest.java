package id.mustofa.android.colorblind;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest {
  @Test
  public void arrayContains() {
    final List<Integer> boxKeyPositions = Arrays.asList(0, 9, 10, 19, 20, 29, 30, 39, 40, 49);
    boolean contain = boxKeyPositions.contains(10);
    Assert.assertTrue(contain);
  }
}