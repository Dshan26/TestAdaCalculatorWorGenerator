package org.sandoval.adatest.utilword;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.sandoval.adatest.utilword.WordGenerator.generarPalabras;

class WordGeneratorTest {


  @Test
  public void testGenerarPalabrasReales() {

    char[] cadena = {'w', 'o', 'r', 'd', 'h', 'e', 'l', 'l', 'o', 'j', 'a', 'v', 'a', 's', 't', 'r', 'e', 'a', 'm', 'c', 'o', 'd', 'e'};

    // Generar palabras reales
    List<String> palabras = WordGenerator.generarPalabras(cadena, 10, 5);

    // Verificar que se generan 10 palabras
    assertEquals(10, palabras.size());

    // Verificar que cada palabra tiene una longitud entre 1 y 5
    assertTrue(palabras.stream().allMatch(palabra -> palabra.length() > 0 && palabra.length() <= 5));

    // Verificar que cada palabra contiene solo caracteres del array
    assertTrue(palabras.stream().allMatch(palabra ->
            palabra.chars().allMatch(ch -> new String(cadena).indexOf(ch) >= 0)
    ));
  }

  @Test
  public void testGenerarPalabraAleatoria() {
    // Array de caracteres de prueba
    char[] cadena = {'w', 'o', 'r', 'd'};

    // Generar una palabra aleatoria
    List<String> palabras = WordGenerator.generarPalabras(cadena, 1, 4);

    // Verificar que solo se genera una palabra
    assertEquals(1, palabras.size());


  }

}