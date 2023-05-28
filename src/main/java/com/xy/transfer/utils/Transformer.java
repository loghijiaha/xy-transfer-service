package com.xy.transfer.utils;

import com.xy.transfer.model.XYPoint;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Transformer {
    public static List<Integer> flatMatrix(List<XYPoint> points){
        return points.stream().flatMap(point -> Stream.of(point.getX(), point.getY())).collect(Collectors.toList());
    }
}
