package com.practice.praktika.entity;


import javax.persistence.*;

@Entity
@Table(name = "prognoz")
public class WeatherEntity {

    @Id
    @Column(name = "number")
    private Long number;

    @Column
    private String forecastDate;

    @Column
    private String minimumTemperature;

    @Column
    private String maximumTemperature;

    @Column
    private String notes;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

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
