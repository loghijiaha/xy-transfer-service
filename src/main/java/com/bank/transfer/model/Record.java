package com.bank.transfer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Record {
    private final RecordType type;
    private final List<XYPoint> cords;

    public Record(RecordType type, List<XYPoint> cords) {
        this.type = type;
        this.cords = new ArrayList<>(cords);
    }

    public RecordType getType() {
        return type;
    }

    public ArrayList<XYPoint> getCords() {
        return new ArrayList<>(cords);
    }

    public int hashCode(){
        return Objects.hash(this.type, this.cords);
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(!(obj instanceof Record)) return false;
        else return Objects.equals(this.type, ((Record) obj).type) && Objects.equals(((Record) obj).cords, this.cords);
    }
}
