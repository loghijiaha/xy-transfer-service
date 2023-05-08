package com.bank.transfer.utils;

import com.bank.transfer.model.XYPoint;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Transformer {
    public static List<Integer> flatMatrix(List<XYPoint> points){
        return points.stream().flatMap(point -> Stream.of(point.x(), point.y())).collect(Collectors.toList());
    }
}
