package org.StreamApis.stream_api;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {



        List<String> listaDeSaudacaoes = Stream.generate(() -> "Hello dentro do stream")
                .limit(5)
                .toList();


        listaDeSaudacaoes.forEach(System.out::println);
    }

}
