package com.xy.transfer.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
    public void shouldReturnEqualInAttribute(){
        Record rec = new Record(UUID.randomUUID(), RecordType.CLICK, mockList);
        Record rec2 = new Record(UUID.randomUUID(), RecordType.CLICK, mockList);

        assertEquals(rec, rec2);
    }
}