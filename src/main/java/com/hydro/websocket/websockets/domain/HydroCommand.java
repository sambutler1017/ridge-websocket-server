package com.hydro.websocket.websockets.domain;

public enum HydroCommand 
{
    PUMP_ON("pumpon"),
    PUMP_OFF("pumpof"),
    PURGE_PUMPS("purgep"),
    SENSOR_NOISE("snoise"),
    BALENCE_DATA("bdsend"),
    STATUS("status"),
    CAL_PH("calbph"),
    LIGHT_ON("liteon"),
    LIGHT_OFF("liteof"),
    // Require arguments.
    SET_PARAM("setpar"),
    SUSPEND_BAL("suspen"),
    RESUME_BAL("resume"),
    PLANT_FAN_ON("plafon"),
    PLANT_FAN_OFF("plafoff"),
    PLANT_FAN_SPEED("plfsped"),
    HEATER_FAN_SPEED("hfsped"),
    UPDATE_UC_TIME("uptime");

    private String cmd;
    
    HydroCommand(String cmd)
    {
        this.cmd = cmd;
    }

    @Override
    public String toString()
    {
        return this.cmd;
    }
}
