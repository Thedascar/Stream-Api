package org.StreamApis.stream_api;

import java.util.Arrays;
import java.util.List;

public class CosumerExemplo {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }});
        }
    }

