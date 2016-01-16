package com.ncurilovic.dagger2demo.utilis;

import android.app.Application;

import com.ncurilovic.dagger2demo.Vehicle;
import com.ncurilovic.dagger2demo.component.DaggerStorageComponent;
import com.ncurilovic.dagger2demo.component.DaggerVehicleComponent;
import com.ncurilovic.dagger2demo.component.StorageComponent;
import com.ncurilovic.dagger2demo.component.VehicleComponent;
import com.ncurilovic.dagger2demo.modules.StorageModule;
import com.ncurilovic.dagger2demo.modules.VehicleModule;


/**
 * Created by Nikola on 29.12.2015..
 */
public class MyApplication extends Application {

    StorageComponent component;
    VehicleComponent component2;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerStorageComponent
                .builder()
                .storageModule(new StorageModule(this))
                .build();

        component2 = DaggerVehicleComponent
                .builder()
                .vehicleModule(new VehicleModule())
                .build();
        
    }

    public StorageComponent getComponent() {
        return component;
    }

    public VehicleComponent getComponent2() {
        return component2;
    }


}