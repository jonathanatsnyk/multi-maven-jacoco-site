package org.example.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CalculatorTest {

    @Test
    public void testAdd()
    {
        Assertions.assertEquals( 7.0, Calculator.add( 5.5, 1.5 ) );
    }
}