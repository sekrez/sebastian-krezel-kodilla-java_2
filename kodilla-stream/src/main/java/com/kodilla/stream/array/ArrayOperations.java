package com.kodilla.stream.array;

import javax.validation.constraints.AssertTrue;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(a -> System.out.print(numbers[a] + ","));
        System.out.println("\b");

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(a -> numbers[a])
                .average();
        if (average.isPresent()) {
            return average.getAsDouble();
        } else {
            return 0.0;
        }
    }
}
