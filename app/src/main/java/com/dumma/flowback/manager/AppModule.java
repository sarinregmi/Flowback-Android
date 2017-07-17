package com.dumma.flowback.manager;

import android.app.Application;


import com.dumma.flowback.database.DatabaseHelper;
import com.dumma.flowback.database.DatabaseResource;
import com.dumma.flowback.database.DatabaseResourceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sregmi on 6/29/17.
 */

@Module
public class AppModule {

    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return application;
    }

    @Provides
    @Singleton
    DatabaseHelper providesDatabase() {
        return new DatabaseHelper(application);
    }

    @Provides
    @Singleton
    DatabaseResource providesDatabaseResource() {
        return new DatabaseResourceManager();
    }
}