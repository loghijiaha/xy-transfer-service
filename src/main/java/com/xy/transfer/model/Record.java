package com.xy.transfer.model;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Record {
    @Id
    @GeneratedValue
    private UUID uuid;
    @NotNull(message = "First Name cannot be null")
    private RecordType type;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<XYPoint> cords;

    @NotNull(message = "UserId cannot be null")
    private String userId;

    public Record(UUID uuid, RecordType type, List<XYPoint> cords) {
        this.uuid = uuid;
        this.type = type;
        this.cords = new ArrayList<>(cords);
    }

    public Record(UUID uuid, RecordType type, List<XYPoint> cords, String userId) {
        this.uuid = uuid;
        this.type = type;
        this.cords = cords;
        this.userId = userId;
    }

    public Record() {

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

    public String getUserId() {
        return userId;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        else if(!(obj instanceof Record)) return false;
        else return Objects.equals(this.type, ((Record) obj).type) && Objects.equals(((Record) obj).cords, this.cords);
    }
}
