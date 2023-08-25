package org.StreamApis.stream_api;

import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

       int res =  numeros.stream()
                .reduce((a,b) -> a + b)
               .get();


        System.out.println(res);
        System.out.println(res + 1);

    }
}
