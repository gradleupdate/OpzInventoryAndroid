package oasu.opz.com.inventory.ui.main.view;

import android.support.v4.app.Fragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import oasu.opz.com.inventory.di.FragmentScope;
import oasu.opz.com.inventory.ui.common.view.BaseFragmentModule;
import oasu.opz.com.inventory.ui.main.presenter.MainPresenterModule;

@Module(includes = {BaseFragmentModule.class, MainPresenterModule.class})
public abstract class MainFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    abstract Fragment fragment(MainFragment mainFragment);

    @Binds
    @FragmentScope
    abstract MainFragmentView mainFragmentView(MainFragment mainFragment);
}
