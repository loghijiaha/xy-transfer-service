package com.bank.transfer.model;

public enum RecordType {
    CLICK(0, "Clicking at a specific point"),
    SCROLL(1, "Scrolling the page"),
    DRAG(2, "Press and drag the pointer");


    private final int id;
    private final String description;
    RecordType(int id, String description){
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
