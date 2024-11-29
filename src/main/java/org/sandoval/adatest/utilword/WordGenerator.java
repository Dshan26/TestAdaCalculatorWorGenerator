package org.sandoval.adatest.utilword;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGenerator {

  public static List<String> generarPalabras(char[] cadena, int numPalabras, int longitudMax) {
    Random random = new Random();
    List<String> palabras = new ArrayList<>();

    for (int i = 0; i < numPalabras; i++) {
      // Longitud aleatoria de la palabra (entre 1 y longitudMax)
      int longitudPalabra = random.nextInt(longitudMax) + 1;

      StringBuilder palabra = new StringBuilder();

      for (int j = 0; j < longitudPalabra; j++) {
        // Seleccionar un caracter aleatorio del array
        int index = random.nextInt(cadena.length);
        palabra.append(cadena[index]);
      }

      palabras.add(palabra.toString());
    }

    return palabras;
  }
}
