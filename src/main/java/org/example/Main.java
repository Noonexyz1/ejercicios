package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //invertirPalabra();
        //numeroCapicuo();
        //contadorDeCaracteresRepetidos();
        //mostrarCaracteresRepetidos();
        //numeroMultiploDe2();
        //mostrarAnioBiciesto();
        //desordenarPalabra();
        //mostrarElementosSinRepetir();
        //mostrarSiHayVocales();
        //palabraPalindromo();

        //Practica practica = new Practica();
    }

    private static void palabraPalindromo() {
        //saber si una palabra es palindromo
        String palabra = "Diego";

        String palindromo = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(palindromo)) {
            System.out.println("SI es palindromo");
        } else {
            System.out.println("NO es palindromo");
        }

    }

    private static void mostrarSiHayVocales() {
        String palabra = "DIego";
        boolean matches = palabra.matches(".*[aeiouAEIOU].*");
        System.out.println(matches);
    }

    private static void mostrarElementosSinRepetir() {
        //Mostrar unicamente los elementos no repetidos
        List<Integer> listEnteros = Arrays.asList(1,33,4,2,33, 6,6,7,7,9,0);

        Set<Integer> enterosNoRepetidos = new HashSet<>(listEnteros);
        enterosNoRepetidos.forEach(System.out::println);
    }

    private static void desordenarPalabra() {
        //Desordenar una palabra dada
        String palabra = new Scanner(System.in).next();
        List<String> list = Arrays.asList(palabra.split(""));

        Collections.shuffle(list);

        list.forEach(System.out::println);

    }

    private static void mostrarAnioBiciesto() {
        //Determinar si un anio es biciesto
        int anio = new Scanner(System.in).nextInt();
        boolean leapYear = LocalDate.of(anio, 1, 1).isLeapYear();
        System.out.println(leapYear);
    }

    private static void numeroMultiploDe2() {
        System.out.println("Ingrese numero");
        int numero = new Scanner(System.in).nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este numero SI es multiplo de 2:" + numero);
        } else {
            System.out.println("Este numero NO es multiplo de 2:" + numero);
        }
    }

    private static void mostrarCaracteresRepetidos() {
        //imprimir unicamente los caracteres repetidos
        String palabra = "mitocode";
        String[] arregloPalabra = palabra.split("");
        Set<String> letrasRepetidas = new HashSet<>();

        for (String letra : arregloPalabra) {
            int contador = 0;
            for (String caracter : arregloPalabra) {
                if (letra.equals(caracter)) {
                    contador++;
                }
            }
            if (contador >= 2 && letrasRepetidas.add(letra)) {
                System.out.println("letra repetida " + letra);
            }
            contador = 0;
        }
    }

    private static void invertirPalabra() {
        //Otra forma de hacer toddo esto es
        StringBuilder stringBuilder = new StringBuilder("illimani");
        String illimani = stringBuilder.reverse().toString();
        System.out.println(illimani);
    }

    private static void numeroCapicuo() {
        //Un numero si es capicua o no   121
        System.out.println("Ingrese un numero porfavor");
        int a = new Scanner(System.in).nextInt();

        String numeroString = String.valueOf(a);
        String capicuo = new StringBuilder(numeroString).reverse().toString();

        int numeroCapicuo = Integer.parseInt(capicuo);

        if (numeroCapicuo != a) {
            System.out.println("este numero NO capicuo");
        } else {
            System.out.println("este numero SI es capicuo");
        }
    }

    private static void contadorDeCaracteresRepetidos() {
        //cuantas veces se repite cada una de las letras de una palabra
        String palabraContar = "mamani";

        String[] split1 = palabraContar.split("");

        Set<String> charNoRepetidos = new HashSet<>(List.of(split1));

        charNoRepetidos.forEach(x -> {
            int contador = 0;
            for (String s : split1) {
                if (x.equals(s)) {
                    contador++;
                }
            }
            System.out.println(x + " : " + contador);
            contador = 0;
        });
    }
}