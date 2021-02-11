package com.practice.praktika.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.practice.praktika.model.Cells;

@JsonAutoDetect
public class Weather {

    @JsonProperty("Number")
    private Long number;

    @JsonProperty("Cells")
    private Cells cells;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Cells getCells() {
        return cells;
    }

    public void setCells(Cells cells) {
        this.cells = cells;
    }

}
