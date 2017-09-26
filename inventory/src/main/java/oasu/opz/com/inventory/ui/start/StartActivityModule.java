package oasu.opz.com.inventory.ui.start;

import android.support.v7.app.AppCompatActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import oasu.opz.com.inventory.di.ActivityScope;
import oasu.opz.com.inventory.di.FragmentScope;
import oasu.opz.com.inventory.ui.common.BaseActivityModule;
import oasu.opz.com.inventory.ui.start.view.StartFragment;
import oasu.opz.com.inventory.ui.start.view.StartFragmentModule;

@Module(includes = BaseActivityModule.class)
public abstract class StartActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = StartFragmentModule.class)
    abstract StartFragment startFragmentInjector();

    @Binds
    @ActivityScope
    abstract AppCompatActivity appCompatActivity(StartActivity startActivity);

}
