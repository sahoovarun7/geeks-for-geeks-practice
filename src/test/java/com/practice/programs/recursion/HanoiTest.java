package com.practice.programs.recursion;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class HanoiTest {

    Hanoi hanoi = new Hanoi();
    @Test
    void toh() {
       long totalCount =  hanoi.toh(3,1,3,2);
       assertEquals(7,totalCount);
    }
}