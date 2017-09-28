package oasu.opz.com.inventory.ui.start.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import oasu.opz.com.inventory.R;
import oasu.opz.com.inventory.navigation.Navigator;
import oasu.opz.com.inventory.ui.common.view.BaseFragment;

public final class StartFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        return layoutInflater.inflate(R.layout.fragment_start, container, false);
    }
}
