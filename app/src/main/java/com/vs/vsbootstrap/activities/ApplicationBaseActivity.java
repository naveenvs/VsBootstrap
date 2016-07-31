package com.vs.vsbootstrap.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.kaopiz.kprogresshud.KProgressHUD;
import com.vs.vsbootstrap.R;

/**
 * Created by Naveen on 30-07-2016.
 */
public abstract class ApplicationBaseActivity  extends AppCompatActivity{
    protected KProgressHUD progressHUD;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

    }
    public void showProgressDialog() {
        progressHUD = KProgressHUD.create(this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE).setLabel(getString(R.string.loading))
                .setDimAmount(0.5f).setCancellable(false).show();
    }

    public void dismissProgressDialog() {
        if (progressHUD != null && progressHUD.isShowing())
            progressHUD.dismiss();
    }
}
