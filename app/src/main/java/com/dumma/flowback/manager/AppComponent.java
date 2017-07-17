package com.dumma.flowback.manager;

import com.dumma.flowback.FlowbackApplication;
import com.dumma.flowback.activity.BaseActivity;
import com.dumma.flowback.fragments.BaseFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by sregmi on 6/29/17.
 */

@Singleton
@Component( modules = {AppModule.class})
public interface AppComponent {
    void inject(FlowbackApplication flowbackApplication);
    void inject(BaseActivity activity);
    void inject(BaseFragment fragment);
    // void inject(MyService service);
}
