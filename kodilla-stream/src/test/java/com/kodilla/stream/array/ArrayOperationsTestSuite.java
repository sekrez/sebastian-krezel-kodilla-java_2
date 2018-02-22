package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] a = {10, 14, 12, 1, 5, 7, 9, 11, 33, 2, 5, 29, 6, 14, 17, 43, 21, 8, 19, 32};

        //When
        double z = ArrayOperations.getAverage(a);

        //Then
        Assert.assertEquals(14.9, z, 0);
    }
}