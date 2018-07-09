package com.example.ysww.cleaninggarden.mvp.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ysww.cleaninggarden.R;
import com.example.ysww.cleaninggarden.app.utils.BDLocationUtils;


public class CG_LoginActivity extends AppCompatActivity {
    private BDLocationUtils bdLocationUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg__login);
        bdLocationUtils = new BDLocationUtils(this);
    }
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        bdLocationUtils.stopLocation();
        super.onStop();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        bdLocationUtils.startLocation();//开启定位
    }
}
