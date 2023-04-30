package Copilot.QuickSort.T26;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
  private QuickSort sut;

  @Before
  public void setUp() {
    sut = new QuickSort();
  }

  @Test
  public void shouldSortArray() {
    int[] input = { 5, 3, 1, 2, 4 };

    int[] expected = { 1, 2, 3, 4, 5 };
    sut.sort(input);

    assertArrayEquals(expected, input);
  }
}
