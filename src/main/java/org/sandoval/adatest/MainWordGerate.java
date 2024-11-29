package org.sandoval.adatest;

import java.util.List;

import static org.sandoval.adatest.utilword.WordGenerator.generarPalabras;

public class MainWordGerate {

  public static void main(String[] args) {
    // Entrada: Array de caracteres
    char[] cadena = {
            'w', 'e', 'r', 'f', 'b', 'h', 'j', 'i', 'u', 'y', 't', 'r', 'e', 'd', 'f', 'g', 'u', 't', 'r', 'e',
            's', 'd', 'f', 'g', 'y', 'u', 'i', 'o', 'l', 'k', 'm', 'n', 'b', 'v', 'f', 'r', 'e', 'w', 's', 'x',
            'f', 'g', 'y', 'u', 'i', 'k', 'm', 'n', 'b', 'v', 'f', 'r', 'e', 'w', 'w', 'r', 't', 'y', 'u', 'i',
            'o', 'k', 'm', 'n', 'b', 'v', 'd', 'w', 's', 'x', 'c', 'f', 'g', 'h', 'u', 'i', 'o', 'p', 'l', 'k',
            'n', 'b', 'v', 'f', 'd', 'e', 'w', 'a', 'z', 'x', 'c', 'g', 'h', 'u', 'i', 'o', 'p', 'u', 'y', 't',
            'r', 'e', 'w', 'q', 's', 'd', 'f', 'g', 'k', 'j', 'b', 'v', 'c', 'x'
    };


    List<String> palabras = generarPalabras(cadena, 5, 10);

    // Imprimir las palabras generadas
    System.out.println("Palabras generadas:");
    for (String palabra : palabras) {
      System.out.println(palabra);
    }
  }
}
