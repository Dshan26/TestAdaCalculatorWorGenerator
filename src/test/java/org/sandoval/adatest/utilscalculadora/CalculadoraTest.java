package org.sandoval.adatest.utilscalculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

  private final Calculadora calculator = new Calculadora();

  // Test the addition
  @Test
  public void testAdd() {
    assertEquals(5.0, calculator.add(2.0, 3.0));
    assertEquals(-1.0, calculator.add(-2.0, 1.0));
  }

  // Test the subtraction
  @Test
  public void testSubtract() {
    assertEquals(-1.0, calculator.subtract(2.0, 3.0));
    assertEquals(-3.0, calculator.subtract(-2.0, 1.0));
  }

  // Test the multiplication
  @Test
  public void testMultiply() {
    assertEquals(6.0, calculator.multiply(2.0, 3.0));
    assertEquals(-2.0, calculator.multiply(-2.0, 1.0));
  }

  // test the division
  @Test
  public void testDivide() {
    assertEquals(2.0, calculator.divide(6.0, 3.0));
    assertThrows(IllegalArgumentException.class, () -> calculator.divide(6.0, 0.0));
  }

  // test the square root
  @Test
  public void testSqrt() {
    assertEquals(4.0, calculator.sqrt(16.0));
    assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-4.0));
  }

}