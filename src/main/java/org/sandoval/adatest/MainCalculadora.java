package org.sandoval.adatest;

import org.sandoval.adatest.utilscalculadora.Calculadora;

public class MainCalculadora {
  public static void main(String[] args) {
    Calculadora calculator = new Calculadora();

    // Por favor revisar la parte de los test unitarios con JUnit en el paquete de test
    double sum = calculator.add(5.0, 3.0);
    double difference = calculator.subtract(5.0, 3.0);
    double product = calculator.multiply(5.0, 3.0);
    double quotient = calculator.divide(6.0, 3.0);
    double squareRoot = calculator.sqrt(16.0);

    System.out.println("Suma: " + sum);
    System.out.println("Resta: " + difference);
    System.out.println("Multiplicación: " + product);
    System.out.println("División: " + quotient);
    System.out.println("Raíz Cuadrada: " + squareRoot);


    try {
      calculator.divide(6.0, 0.0);
    } catch (IllegalArgumentException e) {
      System.out.println("Error en división: " + e.getMessage());
    }

    try {
      calculator.sqrt(-4.0);
    } catch (IllegalArgumentException e) {
      System.out.println("Error en raíz cuadrada: " + e.getMessage());
    }
  }
}