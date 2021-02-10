package com.practice.praktika.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Cells {

    @JsonProperty("ForecastDate")
    private String forecastDate;

    @JsonProperty("MinimumTemperature")
    private String minimumTemperature;

    @JsonProperty("MaximumTemperature")
    private String maximumTemperature;

    @JsonProperty("Notes")
    private String notes;

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public String getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(String minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public String getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(String maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
