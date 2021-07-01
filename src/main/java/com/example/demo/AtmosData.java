package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Data_Table", schema = "ATPSchema")
public class AtmosData {
    @Column(name = "Id")
    private @Id @GeneratedValue Long id;
    @Column(name = "Timestamp")
    private Date timestamp;
    @Column(name = "Altitude")
    private double altitude;
    @Column(name = "Temperature")
    private double temperature;
    @Column(name = "Pressure")
    private double pressure;


    public AtmosData(Date timestamp, double temperature, double pressure, double altitude) {
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.pressure = pressure;
        this.altitude = altitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "AtmosData{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                ", altitude=" + altitude +
                '}';
    }
}
