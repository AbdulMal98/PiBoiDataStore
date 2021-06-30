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
    private int altitude;
    @Column(name = "Temperature")
    private int temperature;
    @Column(name = "Pressure")
    private int pressure;


    public AtmosData(Date timestamp, int temperature, int pressure, int altitude) {
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
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
