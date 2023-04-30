package ChatGPT.BinarySearch.T8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
  private BinarySearch sut;

  @Before
  public void setUp() {
    sut = new BinarySearch();
  }

  @Test
  public void shouldReturnTrueForInputNumberFound() {
    int inputNumber = 1;
    int[] inputArray = { 1, 2, 3, 4, 5 };

    boolean expected = true;
    boolean actual = sut.binarySearch(inputNumber, inputArray);

    assertEquals(expected, actual);
  }

  @Test
  public void shouldReturnFalseForInputNumberNotFound() {
    int inputNumber = 0;
    int[] inputArray = { 1, 2, 3, 4, 5 };

    boolean expected = false;
    boolean actual = sut.binarySearch(inputNumber, inputArray);

    assertEquals(expected, actual);
  }
}
