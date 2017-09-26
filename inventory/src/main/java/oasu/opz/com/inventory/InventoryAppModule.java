package oasu.opz.com.inventory;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import oasu.opz.com.inventory.di.ActivityScope;
import oasu.opz.com.inventory.ui.start.StartActivity;
import oasu.opz.com.inventory.ui.start.StartActivityModule;

@Module(includes = AndroidSupportInjectionModule.class)
public abstract class InventoryAppModule {

    @Binds
    @Singleton
    abstract Application application(InventoryApp inventoryApp);

    @ActivityScope
    @ContributesAndroidInjector(modules = StartActivityModule.class)
    abstract StartActivity startActivityInjector();
}
