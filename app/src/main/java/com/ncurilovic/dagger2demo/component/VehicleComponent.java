package com.ncurilovic.dagger2demo.component;

import com.ncurilovic.dagger2demo.MainActivity;
import com.ncurilovic.dagger2demo.Vehicle;
import com.ncurilovic.dagger2demo.modules.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Nikola on 29.12.2015..
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    void inject(MainActivity mainActivity);
}