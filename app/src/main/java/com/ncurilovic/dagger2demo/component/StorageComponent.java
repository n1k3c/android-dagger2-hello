package com.ncurilovic.dagger2demo.component;

import com.ncurilovic.dagger2demo.MainFragment;
import com.ncurilovic.dagger2demo.modules.StorageModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Nikola on 29.12.2015..
 */
@Singleton
@Component(modules = StorageModule.class)
public interface StorageComponent {
    void inject(MainFragment mainFragment);
}
