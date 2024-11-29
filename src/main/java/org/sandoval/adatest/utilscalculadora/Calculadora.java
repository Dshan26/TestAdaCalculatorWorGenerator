package org.sandoval.adatest.utilscalculadora;

public class Calculadora {
  // Suma
  public double add(double num1, double num2) {
    return num1 + num2;
  }


  public double subtract(double num1, double num2) {
    return num1 - num2;
  }

  public double multiply(double num1, double num2) {
    return num1 * num2;
  }


  public double divide(double num1, double num2) {
    if (num2 == 0) {
      throw new IllegalArgumentException("Division by zero is not allowed.");
    }
    return num1 / num2;
  }

  public double sqrt(double num) {
    if (num < 0) {
      throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
    }
    return Math.sqrt(num);
  }

}
