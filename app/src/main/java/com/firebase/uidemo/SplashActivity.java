package com.firebase.uidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.uidemo.auth.AuthUiActivity;

/**
 * Created by mgumiero9 on 04/12/16.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, Tutorial.class);
        startActivity(intent);
        finish();
    }
}
