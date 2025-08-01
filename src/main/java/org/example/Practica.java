package org.example;

import java.time.LocalDate;
import java.util.*;

public class Practica {

    public boolean esPalidromo(String palabra) {
        String palabraCompare = new StringBuilder(palabra).reverse().toString();
        return palabraCompare.equals(palabra);
    }

    public boolean hayVocales(String palabra){
        return palabra.matches(".*[aeiouAEIOU]");
    }

    public Set<Integer> elementosSinRepetir(List<Integer> elementos) {
        return new HashSet<>(elementos);
    }

    public String desordenarPalabra(String palabraOrdenada) {
        String[] split = palabraOrdenada.split("");
        List<String> list = Arrays.asList(split);
        Collections.shuffle(list);
        return String.join("", list); // Unimos los elementos sin separador
    }

    public boolean esAnioBiciesto(Integer anio) {
        return LocalDate.of(anio, 1, 1)
                .isLeapYear();
    }

    public boolean esMultipoDe2(Integer numero) {
        return numero % 2 == 0;
    }

    public String invertirPalabra(String palabra) {
        return new StringBuilder(palabra).reverse().toString();
    }

    public boolean esNumeroCapicuo(Integer numero) {
        String capicuoPalabra = String.valueOf(numero);
        String capicuoToCompare = new StringBuilder(capicuoPalabra)
                .reverse().toString();
        return capicuoPalabra.equals(capicuoToCompare);
    }

    public int contadorCaracteresRepetidos(String palabra) {
        return 0;
    }

    public void mostrarCaracteresRepetidos(String palabra) {

    }
}
