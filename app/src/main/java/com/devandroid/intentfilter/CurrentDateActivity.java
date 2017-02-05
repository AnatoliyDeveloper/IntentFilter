package com.devandroid.intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class CurrentDateActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_current_date);

		TextView textDate = (TextView) findViewById(R.id.textDate);
		textDate.setText(Calendar.getInstance().getTime().toString());
	}
}
