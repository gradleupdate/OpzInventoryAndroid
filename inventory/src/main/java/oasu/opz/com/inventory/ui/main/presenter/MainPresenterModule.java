package oasu.opz.com.inventory.ui.main.presenter;

import dagger.Binds;
import dagger.Module;
import oasu.opz.com.inventory.di.FragmentScope;

@Module
public abstract class MainPresenterModule {

    @Binds
    @FragmentScope
    abstract MainPresenter mainPresenter(MainPresenterImpl mainPresenterImpl);
}
