package oasu.opz.com.inventory.ui.start;

import android.os.Bundle;
import android.support.annotation.Nullable;

import oasu.opz.com.inventory.R;
import oasu.opz.com.inventory.ui.common.BaseActivity;
import oasu.opz.com.inventory.ui.start.view.StartFragment;

public class StartActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, new StartFragment());
        }
    }
}
