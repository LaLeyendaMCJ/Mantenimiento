package org.ej1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci f;

    @BeforeEach
    public void startup(){
        f = new Fibonacci();
    }

    @Test
    public void ShouldReturn1(){
        int expectedValue = 1;
        int ObtainedValue = f.fibonacci(1);
        assertEquals(expectedValue, ObtainedValue);
    }

    @Test
    public void ShouldReturn5(){
        int expectedValue = 5;
        int ObtainedValue = f.fibonacci(5);
        assertEquals(expectedValue, ObtainedValue);
    }

    @Test
    public void ShouldReturn0(){
        int expectedValue = 0;
        int ObtainedValue = f.fibonacci(0);
        assertEquals(expectedValue, ObtainedValue);
    }

    @Test
    public void ShouldReturnminus1(){
        int expectedValue = -1;
        int ObtainedValue = f.fibonacci(-1);
        assertEquals(expectedValue, ObtainedValue);
    }
}