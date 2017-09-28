package oasu.opz.com.inventory.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import javax.inject.Inject;
import javax.inject.Singleton;

import oasu.opz.com.inventory.ui.main.MainActivity;

@Singleton
public class Navigator {

    @Inject
    Navigator() {

    }

    public void startMainActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

}
