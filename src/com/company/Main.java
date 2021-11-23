package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, Long> resultMap = new BufferedReader(new InputStreamReader(System.in)).lines().
                map(String::toLowerCase).flatMap(words -> Arrays.stream(words.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(resultMap);
    }
}
