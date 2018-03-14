package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static jdk.nashorn.internal.objects.Global.Infinity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
       Calculator calculator = context.getBean(Calculator.class);
        //When
        calculator.add(3,3);
        calculator.div(6,3);
        calculator.mul(3,4);
        calculator.div(3,0);
        //Then
        Assert.assertEquals(6,calculator.add(3,3),0.0);
        Assert.assertEquals(2,calculator.div(6,3),0.0);
        Assert.assertEquals(12,calculator.mul(3,4),0.0);
        Assert.assertEquals(Infinity,calculator.div(3,0),0.0);

    }
}
