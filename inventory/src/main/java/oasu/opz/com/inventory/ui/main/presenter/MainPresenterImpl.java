package oasu.opz.com.inventory.ui.main.presenter;

import android.os.Handler;

import javax.inject.Inject;

import oasu.opz.com.inventory.service.DbSvc;
import oasu.opz.com.inventory.service.WbSvc;
import oasu.opz.com.inventory.ui.common.presenter.BasePresenter;
import oasu.opz.com.inventory.ui.main.view.MainFragmentView;

public final class MainPresenterImpl extends BasePresenter<MainFragmentView> implements MainPresenter {

    private final DbSvc dbSvc;
    private final WbSvc wbSvc;

    @Inject
    public MainPresenterImpl(MainFragmentView view, DbSvc dbSvc, WbSvc wbSvc) {
        super(view);
        this.dbSvc = dbSvc;
        this.wbSvc = wbSvc;
    }

    @Override
    public void onActivityStart() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

            }
        }, 1000);
    }
}
