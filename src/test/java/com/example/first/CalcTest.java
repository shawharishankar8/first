package com.example.first;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        int add = Calc.add(1, 3);
        Assertions.assertEquals(4,add);
    }


    @Test
    void sub() {
        int sub = Calc.sub(20, 5);
        Assertions.assertEquals(15,sub);
    }
}