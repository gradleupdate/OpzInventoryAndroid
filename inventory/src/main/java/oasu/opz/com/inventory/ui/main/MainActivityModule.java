package oasu.opz.com.inventory.ui.main;

import android.support.v7.app.AppCompatActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import oasu.opz.com.inventory.di.ActivityScope;
import oasu.opz.com.inventory.di.FragmentScope;
import oasu.opz.com.inventory.ui.common.BaseActivityModule;
import oasu.opz.com.inventory.ui.main.view.MainFragment;
import oasu.opz.com.inventory.ui.main.view.MainFragmentModule;

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment mainFragmentInjector();

    @Binds
    @ActivityScope
    abstract AppCompatActivity appCompatActivity(MainActivity mainActivity);
}
