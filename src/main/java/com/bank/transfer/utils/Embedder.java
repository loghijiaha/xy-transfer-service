package com.bank.transfer.utils;

import com.bank.transfer.model.Record;
import com.bank.transfer.model.XYPoint;

import java.util.Comparator;

/*
{
    clicks : {
        1 : {
            startingTime: 247584930,
            endingTime: 35477654,
            clicks: [[234,343], [234,566]]
         }

    },
    scrolls: {},
    drags:{}
}
 */
public final class Embedder {
    public static int[][] transformClicksTo2dVector(Record record){
        return record.getCords().stream().
                sorted(Comparator.comparingLong(XYPoint::timestamp).thenComparing(XYPoint::y)).
                map(pair -> new int[]{pair.x(), pair.y()}).
                toList().
                toArray(new int[0][0]);
    }
}
