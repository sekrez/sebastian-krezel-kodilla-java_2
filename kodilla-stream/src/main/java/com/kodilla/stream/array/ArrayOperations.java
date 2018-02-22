package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(a -> System.out.print(numbers[a] + ","));
        System.out.println("\b");

        OptionalDouble average = IntStream.range(0, numbers.length)
                .mapToDouble(a -> numbers[a])
                .average();

        System.out.println(average.getAsDouble());
        return average.getAsDouble();
    }
}