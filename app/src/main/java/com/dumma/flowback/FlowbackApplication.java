package com.dumma.flowback;

import android.app.Application;

import com.dumma.flowback.manager.AppComponent;
import com.dumma.flowback.manager.AppModule;
import com.dumma.flowback.manager.DaggerAppComponent;

/**
 * Created by sregmi on 6/21/17.
 */

public class FlowbackApplication extends Application {

    private static FlowbackApplication app;
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component.inject(this);
    }

    public static FlowbackApplication getApp() {
        return app;
    }

    public AppComponent geComponent() {
        return component;
    }
}
