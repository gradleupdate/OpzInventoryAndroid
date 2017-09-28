package oasu.opz.com.inventory.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import oasu.opz.com.inventory.R;
import oasu.opz.com.inventory.ui.common.BaseActivity;
import oasu.opz.com.inventory.ui.main.view.MainFragment;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            addFragment(R.id.main_fragment_container, new MainFragment());
        }
    }
}
