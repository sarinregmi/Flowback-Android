package com.dumma.flowback.models;

import java.util.Date;

/**
 * Created by sregmi on 6/27/17.
 */

public class FlowbackDataItem {

    private long id;
    private float oil;
    private float gas;
    private float pressure;
    private float waterRate;
    private float gasRate;
    private float oilRate;
    private float choke;
    private Date timestamp;


    public FlowbackDataItem(long id, float oil, float gas, float pressure, float waterRate, float gasRate, float oilRate, float choke, Date timestamp) {
        this.id = id;
        this.oil = oil;
        this.gas = gas;
        this.pressure = pressure;
        this.waterRate = waterRate;
        this.gasRate = gasRate;
        this.oilRate = oilRate;
        this.choke = choke;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public float getOil() {
        return oil;
    }

    public float getGas() {
        return gas;
    }

    public float getPressure() {
        return pressure;
    }

    public float getWaterRate() {
        return waterRate;
    }

    public float getGasRate() {
        return gasRate;
    }

    public float getOilRate() {
        return oilRate;
    }

    public float getChoke() {
        return choke;
    }

    public Date getTimestamp() {
        return timestamp;
    }


}
