package com.ncurilovic.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ncurilovic.dagger2demo.component.DaggerVehicleComponent;
import com.ncurilovic.dagger2demo.component.VehicleComponent;
import com.ncurilovic.dagger2demo.modules.VehicleModule;
import com.ncurilovic.dagger2demo.utilis.MyApplication;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.mainContent, new MainFragment())
                .commit();

        ((MyApplication)this.getApplication()).getComponent2().inject(this);

        vehicle.increaseSpeed(100);
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
