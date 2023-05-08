package com.bank.transfer.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class XYPointTest {

    @Test
    public void shouldReturnTrueValidXYTest() throws Exception{
        XYPoint xy = new XYPoint(200000, 200000, LocalDate.now().toEpochDay());
        assertTrue(xy.validXY());
    }

    @Test
    public void shouldReturnFalseInvalidXYTest(){
        XYPoint xy = new XYPoint(Integer.MAX_VALUE, Integer.MIN_VALUE, LocalTime.now().toNanoOfDay());
        assertFalse(xy.validXY());
    }


}