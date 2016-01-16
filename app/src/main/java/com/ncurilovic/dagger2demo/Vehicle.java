package com.ncurilovic.dagger2demo;

import com.ncurilovic.dagger2demo.Motor;

import javax.inject.Inject;

/**
 * Created by Nikola on 29.12.2015..
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
