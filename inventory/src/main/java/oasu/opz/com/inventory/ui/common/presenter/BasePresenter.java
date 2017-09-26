package oasu.opz.com.inventory.ui.common.presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;

import oasu.opz.com.inventory.ui.common.view.MvpView;

public abstract class BasePresenter<T extends MvpView> implements Presenter {

    protected final T view;

    protected BasePresenter(T view) {
        this.view = view;
    }

    @Override
    public void onStart(@Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
    }

    @Override
    public void onEnd() {
    }
}
