package io.turntabl.springweb.Models;

import org.graalvm.compiler.core.amd64.AMD64ArithmeticLIRGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathsTest {

    @Test
    void addition() {
      int sum= Maths.addition(2,3) ;
      assertEquals(5, sum);
    }




    @Test
    void subtraction() {
        int sum= Maths.subtraction(2,3) ;
        assertEquals(-1, sum);
    }



}