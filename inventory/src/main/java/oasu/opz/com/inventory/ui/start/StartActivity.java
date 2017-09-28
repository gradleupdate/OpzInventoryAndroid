package oasu.opz.com.inventory.ui.start;

import android.os.Bundle;
import android.support.annotation.Nullable;

import javax.inject.Inject;

import oasu.opz.com.inventory.R;
import oasu.opz.com.inventory.navigation.Navigator;
import oasu.opz.com.inventory.ui.common.BaseActivity;
import oasu.opz.com.inventory.ui.start.view.StartFragment;

public class StartActivity extends BaseActivity {

    @Inject
    Navigator navigator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        if (savedInstanceState == null) {
            addFragment(R.id.start_fragment_container, new StartFragment());
        }

        navigator.startMainActivity(this);
    }
}
