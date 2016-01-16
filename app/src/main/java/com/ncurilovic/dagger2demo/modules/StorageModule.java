package com.ncurilovic.dagger2demo.modules;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.ncurilovic.dagger2demo.utilis.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nikola on 29.12.2015..
 */
@Module
public class StorageModule {

    private final MyApplication application;

    public StorageModule(MyApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    SharedPreferences provideSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

}
