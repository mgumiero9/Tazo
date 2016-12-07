package com.firebase.uidemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.uidemo.auth.AuthUiActivity;

/**
 * Created by mgumiero9 on 04/12/16.
 * This is the splash screen activity. It also controls if the user has already used the app before.
 * If never launched, at first launch, it launched the tutorial first, or else launches without the
 * tutorial.
 */
public class SplashActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String myCounter = "";
        SharedPreferences myPreferences = getPreferences(0);
        int launchCounter = myPreferences.getInt(myCounter,0);

        Intent intent;
        if (launchCounter != 0) {
            intent = new Intent(this, AuthUiActivity.class);
        } else {
            intent = new Intent(this, TutorialActivity.class);
        }

        launchCounter++;
        SharedPreferences.Editor editor = myPreferences.edit();
        editor.putInt(myCounter, launchCounter)
                .apply();

        startActivity(intent);
        finish();
    }
}
