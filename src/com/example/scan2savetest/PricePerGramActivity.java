package com.example.scan2savetest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PricePerGramActivity extends Activity {
	Button calculateButton;
	EditText priceEdit;
	EditText weightEdit;
	TextView ppg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_price_per_gram);

		calculateButton = (Button)findViewById(R.id.calculateButton);
		priceEdit   = (EditText)findViewById(R.id.priceEditText);
		weightEdit   = (EditText)findViewById(R.id.weightEditText);
		ppg = (TextView)findViewById(R.id.textView3);

		 calculateButton.setOnClickListener(
			        new View.OnClickListener()
			        {
			            public void onClick(View view)
			            {
			                calculatePricePerGram(view);
			            }
			        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.price_per_gram, menu);
		return true;
	}

	public void calculatePricePerGram(View view){
		double price = Double.parseDouble(priceEdit.getText().toString());
		double weight = Double.parseDouble(weightEdit.getText().toString());
		String pricePer100G = String.valueOf((weight/price)*100);
		ppg.setText(pricePer100G);
	}

}
