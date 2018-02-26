package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] a = {3,4,2,76,3,4,7,44,77,2,9,66,3,65,24,67,43,76,32,4};

        //When
        double z = ArrayOperations.getAverage(a);

        //Then
        Assert.assertEquals(30.55, z, 0);
    }
}