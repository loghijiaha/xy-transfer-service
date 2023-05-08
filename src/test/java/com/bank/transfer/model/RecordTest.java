package com.bank.transfer.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    private static final List<XYPoint> mockList = new ArrayList<>();

    @BeforeAll
    static void setup(){
        IntStream.generate(() -> (int)(100 * Math.random())).limit(101).forEach(i->
                mockList.add(new XYPoint(i, (int)(i*Math.random()*12), LocalTime.now().toNanoOfDay()))
        );
    }

    @Test
    public void shouldReturnImmutableList(){
        Record record = new Record(RecordType.CLICK, mockList);

        assertEquals(record.getCords().get(0), mockList.get(0));
        assertEquals(record.getCords().get(100), mockList.get(100));

        int expectedX = mockList.get(0).x();
        int expectedY = mockList.get(0).y();
        long expectedTimeStamp = mockList.get(0).timestamp();


        mockList.set(0, new XYPoint(0,0,0));

        assertEquals(new XYPoint(expectedX, expectedY, expectedTimeStamp), new XYPoint(expectedX, expectedY, expectedTimeStamp));
    }

    @Test
    public void shouldReturnEqualInAttribute(){
        Record rec = new Record(RecordType.CLICK, mockList);
        Record rec2 = new Record(RecordType.CLICK, mockList);

        assertEquals(rec, rec2);
    }
}