package oasu.opz.com.inventory.ui.main.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import oasu.opz.com.inventory.R;
import oasu.opz.com.inventory.ui.common.view.BaseViewFragment;
import oasu.opz.com.inventory.ui.main.presenter.MainPresenter;

public class MainFragment extends BaseViewFragment<MainPresenter> implements MainFragmentView {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        return layoutInflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void showData() {

    }
}
