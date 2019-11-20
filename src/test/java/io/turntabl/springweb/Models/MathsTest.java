package io.turntabl.springweb.Models;

import org.graalvm.compiler.core.amd64.AMD64ArithmeticLIRGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    @Test
    void additionTwoPositiveNumbers() {
      int sum= Maths.addition(2,3) ;
      assertEquals(5, sum);
    }

    @Test
    void additionTwoNegativeNumbers() {
        int sum= Maths.addition(-2,-3) ;
        assertEquals(-5, sum);
    }
    @Test
    void additionZeroAndNegativeNumber() {
        int sum= Maths.addition(0,-3) ;
        assertEquals(-3, sum);
    }




    @Test
    void subtractionTwoPositiveNumbers() {
        int result= Maths.subtraction(7,3) ;
        assertEquals(4, result);
    }

    @Test
    void subtractionTwoNegativeNumbers() {
        int result= Maths.subtraction(-2,-3) ;
        assertEquals(1, result);
    }
    @Test
    void subtractionZeroAndNegativeNumber() {
        int result= Maths.addition(0,-3) ;
        assertEquals(-3, result);
    }


}