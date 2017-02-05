package com.devandroid.intentfilter;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void explicitCall(View view){
		Intent intent = new Intent(getApplicationContext(), CurrentDateActivity.class);
		startActivity(intent);
	}

	public void implicitCall(View view){
		Intent intent = new Intent("Developer");
		startActivity(intent);
	}

	public void openContacts(View view){
		Intent intent = new Intent();
		intent.setComponent(new ComponentName("com.android.contacts", "com.android.contacts.DialtactsContactsEntryActivity"));
		startActivity(intent);
	}
}
