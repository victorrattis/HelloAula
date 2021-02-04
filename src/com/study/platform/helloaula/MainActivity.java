package com.study.platform.helloaula;

import android.app.Activity;

import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.os.SystemProperties;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	//TelephonyManager telephonyManager = new TelephonyManager(this);
	// String result = telephonyManager.getImei(0);

	((Button) findViewById(R.id.btn_get_property)).setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
             	getSystemProperty();
	     }
         });
    }

    private void getSystemProperty() {
	String name = ((EditText) findViewById(R.id.edit_property_name)).getText().toString();
    	String result = SystemProperties.get(name);
    	((TextView) findViewById(R.id.text)).setText(result);
    }
}
