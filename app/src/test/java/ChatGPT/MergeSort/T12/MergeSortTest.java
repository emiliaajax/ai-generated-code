package ChatGPT.MergeSort.T12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
  private MergeSort sut;

  @Before
  public void setUp() {
    sut = new MergeSort();
  }

  @Test
  public void shouldSortArray() {
    int[] input = { 5, 3, 1, 2, 4 };

    int[] expected = { 1, 2, 3, 4, 5 };
    sut.mergeSort(input);

    assertArrayEquals(expected, input);
  }
}
