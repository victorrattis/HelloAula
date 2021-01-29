package com.study.platform.helloaula;

import android.app.Activity;

import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	TelephonyManager telephonyManager = new TelephonyManager(this);
	String result = telephonyManager.getImei(0);

	((TextView) findViewById(R.id.text)).setText(result);

    }
}
