package com.amazonaws.services.kinesisanalytics;

import java.sql.Timestamp;

/**
 * Car POJO class
 */
public class Car 
{
    // use this to avoid any serialization deserialization used within Flink
    public static final long serialVersionUID = 42L;
    public Car() {

    }
    public Car(String vehicleId, String model, Timestamp timestamp, Boolean hasMoonRoof, Double speed, int simulateMemoryAllocationSize) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.moonRoof = hasMoonRoof;
        this.timestamp = timestamp;
        this.speed = speed;
        this.simulateMemoryAllocationSize = simulateMemoryAllocationSize;
        this.buffer = new byte[simulateMemoryAllocationSize];
        for(int i=0;i <simulateMemoryAllocationSize; i++ ) {
            this.buffer[i] = (byte)0xde;
        }

    }
    private String vehicleId;
    private String model;
    private Boolean moonRoof;
    private Double speed;
    private Timestamp timestamp;
    private int simulateMemoryAllocationSize;

    private byte buffer[];

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    public Timestamp getTimestamp() {
        return this.timestamp;
    }
    public void setMoonRoof(boolean m) {
        this.moonRoof = m;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleId() {
        return this.vehicleId ;
    }

    public Boolean getMoonRoof() {
        return moonRoof;
    }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model;}

    public Double getSpeed() {
        return speed;
    }

    public String toString() {
        return "VEHICLE: " + vehicleId + " TIMESTAMP: " + timestamp + " MOONROOF: " + moonRoof + " Speed: " + speed + " buffer size: " + buffer.length;
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public void setBuffer(byte [] buffer) {
        this.buffer = buffer;
    }


}