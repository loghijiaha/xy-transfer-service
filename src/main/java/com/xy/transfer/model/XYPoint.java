package com.xy.transfer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class XYPoint {
    int x;
    int y;
    @Id
    long timestamp;
    public XYPoint(int x, int y, long timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    public XYPoint() {

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean validXY(){
        return this.x < Integer.MAX_VALUE
                && this.x > Integer.MIN_VALUE
                && this.y < Integer.MAX_VALUE
                && this.y > Integer.MIN_VALUE;
    }
}
