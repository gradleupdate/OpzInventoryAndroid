package oasu.opz.com.inventory;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = InventoryAppModule.class)
public interface InventoryAppComponent extends AndroidInjector<InventoryApp> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<InventoryApp> {}
}
