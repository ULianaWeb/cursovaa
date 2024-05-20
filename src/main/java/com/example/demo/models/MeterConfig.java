package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MeterConfig {
    private int valueMin;
    private int valueMax;
    private int valueStep;
    private String valueUnit;
    private int angleMin;
    private int angleMax;
    private String labelUnit;
    public MeterConfig(int valueMin, int valueMax, int valueStep, String valueUnit, int angleMin, int angleMax, String labelUnit) {
        this.valueMin = valueMin;
        this.valueMax = valueMax;
        this.valueStep = valueStep;
        this.valueUnit = valueUnit;
        this.angleMin = angleMin;
        this.angleMax = angleMax;
        this.labelUnit = labelUnit;
    }
}