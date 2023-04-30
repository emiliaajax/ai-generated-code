package Copilot.BinaryToDecimal.T22;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryToDecimalTest {
  private BinaryToDecimal sut;

  @Before
  public void setUp() {
    sut = new BinaryToDecimal();
  }

  @Test
  public void shouldConvertBinary0ToDecimal() {
    int expected = 0;
    int actual = sut.convertToDecimal("0");
    assertEquals(expected, actual);
  }

  @Test
  public void shouldConvertBinary1ToDecimal() {
    int expected = 1;
    int actual = sut.convertToDecimal("1");
    assertEquals(expected, actual);
  }

  @Test
  public void shouldConvertBinary10ToDecimal() {
    int expected = 2;
    int actual = sut.convertToDecimal("10");
    assertEquals(expected, actual);
  }

  @Test
  public void shouldConvertBinary11ToDecimal() {
    int expected = 3;
    int actual = sut.convertToDecimal("11");
    assertEquals(expected, actual);
  }

  @Test
  public void shouldConvertBinary1010ToDecimal() {
    int expected = 10;
    int actual = sut.convertToDecimal("1010");
    assertEquals(expected, actual);
  }

  @Test
  public void shouldConvertBinary1100ToDecimal() {
    int expected = 12;
    int actual = sut.convertToDecimal("1100");
    assertEquals(expected, actual);
  }
}
