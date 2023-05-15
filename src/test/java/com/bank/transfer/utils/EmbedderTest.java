package com.bank.transfer.utils;

import com.bank.transfer.model.Record;
import com.bank.transfer.model.RecordType;
import com.bank.transfer.model.XYPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmbedderTest {

    List<XYPoint> xyPoints = new ArrayList<>();
    Random random = new Random(900);
    @BeforeAll
    void setup(){
        for(int i =0; i< 10 ; i++){
            xyPoints.add(new XYPoint(random.nextInt(999),random.nextInt(999), random.nextLong(Long.MAX_VALUE-1)));
        }

    }

    @Test
    void shouldReturn2DVectorForClickData(){
        //given
        Record record = new Record(RecordType.CLICK, xyPoints);
        int[][] expected = record.getCords().stream().
                sorted(Comparator.comparingLong(XYPoint::timestamp).thenComparing(XYPoint::y)).
                map(pair -> new int[]{pair.x(), pair.y()}).
                toList().
                toArray(new int[0][0]);

        //when
        int[][] resultVector = Embedder.transformClicksTo2dVector(record);

        //assert
        Assertions.assertNotNull(resultVector);
        Assertions.assertArrayEquals(expected, resultVector);
    }
}
