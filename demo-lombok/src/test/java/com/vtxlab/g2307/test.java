package com.vtxlab.g2307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test {

  public static void main(String[] args) {
    Stream<String> empty = Stream.empty();

    Stream<Integer> singleElemeent = Stream.of(1);

    Stream<Integer> multipleElements = Stream.of(1, 2, 3);

    List<String> list = Arrays.asList("a", "b", "c");

    Stream<String> fromList = list.stream();

    Stream<Double> randoms = Stream.generate(Math::random);

    Stream<Integer> oddnumbers = Stream.iterate(1, n -> n + 2).limit(10);
    Stream<Double> randoms2 = Stream.generate(Math::random).limit(10);
    oddnumbers.forEach(System.out::println);
    //
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // numbers.stream()//
    // .filter(e -> e % 2 == 0)//
    // .mapToLong(e -> e * e)//
    // .forEach(System.out::println);//
  }
}