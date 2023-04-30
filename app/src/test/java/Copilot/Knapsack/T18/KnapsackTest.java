package Copilot.Knapsack.T18;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KnapsackTest {  
  @Test
  public void shouldGetMaximumValue() {
    Knapsack sut = new Knapsack();
    int[] weights = {10, 20, 30};
    int[] values = {60, 100, 120};
    int capacity = 50;
    int expected = 220;
    int actual = sut.bottomUp(capacity, weights, values);
    assertEquals(expected, actual);
  }
}
