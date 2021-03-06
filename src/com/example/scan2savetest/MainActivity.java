package com.example.scan2savetest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void startVoice(View view) {
		Intent intent = new Intent(this, VoiceActivity.class);
		startActivity(intent);
	}

	public void startPPG(View view) {
		Intent intent = new Intent(this, PricePerGramActivity.class);
		startActivity(intent);
	}
	public void startScanner(View view) {
		Intent intent = new Intent(this, CameraTestActivity.class);
		startActivity(intent);
	}
}
