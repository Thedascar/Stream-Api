package org.StreamApis.stream_api;

import java.util.Arrays;
import java.util.List;

public class PredicateExemplo {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("JavaScript","Java","Kotlin","C++","Rust","Go");


        palavras.stream()
                .filter(p -> p.length() >= 5)
                .forEach(System.out::println);
    }
}
