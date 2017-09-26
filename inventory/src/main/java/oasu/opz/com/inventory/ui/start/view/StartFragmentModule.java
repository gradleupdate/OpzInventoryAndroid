package oasu.opz.com.inventory.ui.start.view;

import android.support.v4.app.Fragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import oasu.opz.com.inventory.ui.common.view.BaseFragmentModule;

@Module(includes = BaseFragmentModule.class)
public abstract class StartFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    abstract Fragment fragment(StartFragment startFragment);
}
