package com.hydro.websocket.websockets.domain;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;

public class CurrentSystemSettings {
    @JsonAlias("Id")
    private int id;

    @JsonAlias("Tier")
    private int tier;

    @JsonAlias("PlantName")
    private int plantName;

    @JsonAlias("GrowStartDate")
    private Date growStartDate;

    @JsonAlias("NumPlants")
    private int numPlants;

    @JsonAlias("MinPH")
    private double minPH;

    @JsonAlias("MaxPH")
    private double maxPH;

    @JsonAlias("MinTDS")
    private int minTDS;

    @JsonAlias("MaxTDS")
    private int maxTDS;

    @JsonAlias("MinWaterTemp")
    private int minWaterTemp;

    @JsonAlias("MaxWaterTemp")
    private int maxWaterTemp;

    @JsonAlias("MinHumidity")
    private int minHumidity;

    @JsonAlias("MaxHumidity")
    private int maxHumidity;

    @JsonAlias("PlantTemp")
    private int plantTemp;

    @JsonAlias("LightOnTime")
    private Date lightOnTime;

    @JsonAlias("LightOffTime")
    private Date lightOffTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getPlantName() {
        return plantName;
    }

    public void setPlantName(int plantName) {
        this.plantName = plantName;
    }

    public Date getGrowStartDate() {
        return growStartDate;
    }

    public void setGrowStartDate(Date growStartDate) {
        this.growStartDate = growStartDate;
    }

    public int getNumPlants() {
        return numPlants;
    }

    public void setNumPlants(int numPlants) {
        this.numPlants = numPlants;
    }

    public double getMinPH() {
        return minPH;
    }

    public void setMinPH(double minPH) {
        this.minPH = minPH;
    }

    public double getMaxPH() {
        return maxPH;
    }

    public void setMaxPH(double maxPH) {
        this.maxPH = maxPH;
    }

    public int getMinTDS() {
        return minTDS;
    }

    public void setMinTDS(int minTDS) {
        this.minTDS = minTDS;
    }

    public int getMaxTDS() {
        return maxTDS;
    }

    public void setMaxTDS(int maxTDS) {
        this.maxTDS = maxTDS;
    }

    public int getMinWaterTemp() {
        return minWaterTemp;
    }

    public void setMinWaterTemp(int minWaterTemp) {
        this.minWaterTemp = minWaterTemp;
    }

    public int getMaxWaterTemp() {
        return maxWaterTemp;
    }

    public void setMaxWaterTemp(int maxWaterTemp) {
        this.maxWaterTemp = maxWaterTemp;
    }

    public int getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(int minHumidity) {
        this.minHumidity = minHumidity;
    }

    public int getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(int maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public void setPlantTemp(int plantTemp) {
        this.plantTemp = plantTemp;
    }

    public int getPlantTemp() {
        return plantTemp;
    }

    public Date getLightOnTime() {
        return lightOnTime;
    }

    public void setLightOnTime(Date lightOnTime) {
        this.lightOnTime = lightOnTime;
    }

    public Date getLightOffTime() {
        return lightOffTime;
    }

    public void setLightOffTime(Date lightOffTime) {
        this.lightOffTime = lightOffTime;
    }

    @Override
    public String toString()
    {
        return this.getId() + ","
        +this.getMinPH() + ","
        +this.getMaxPH() + ","
        +this.getMinTDS() + ","
        +this.getMaxTDS() + ","
        +this.getMinWaterTemp() + ","
        +this.getMaxWaterTemp() + ","
        +this.getMinHumidity() + ","
        +this.getMaxHumidity() + ","
        +this.getPlantTemp() + ","
        +this.AlecDate(this.getLightOnTime()) + ","
        +this.AlecDate(this.getLightOffTime()) + ","
        +String.format("%2d", LocalDateTime.now().getMonth()).replace(' ', '0') + "."
        +String.format("%2d", LocalDateTime.now().getDayOfMonth()).replace(' ', '0') + "."
        +LocalDateTime.now().getYear() + "."
        +LocalDateTime.now().getHour() + "."
        +LocalDateTime.now().getMinute() + "."
        +LocalDateTime.now().getSecond();
    }

    private String AlecDate(Date myDate)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String dateString = simpleDateFormat.format(myDate != null ? myDate: new Date());
        return dateString;
    }
}