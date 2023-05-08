package com.bank.transfer.model;

public record XYPoint(int x, int y, long timestamp) {
    public boolean validXY(){
        return this.x < Integer.MAX_VALUE
                && this.x > Integer.MIN_VALUE
                && this.y < Integer.MAX_VALUE
                && this.y > Integer.MIN_VALUE;
    }
}
