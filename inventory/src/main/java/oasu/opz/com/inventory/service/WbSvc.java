package oasu.opz.com.inventory.service;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public final class WbSvc {

    private final Application application;

    @Inject
    public WbSvc(Application application) {
        this.application = application;
    }
}
