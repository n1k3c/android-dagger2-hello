package com.ncurilovic.dagger2demo.modules;

import com.ncurilovic.dagger2demo.Motor;
import com.ncurilovic.dagger2demo.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nikola on 29.12.2015..
 */

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle(){
        return new Vehicle(new Motor());
    }
}
