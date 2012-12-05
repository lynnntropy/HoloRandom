package com.omegavesko.holorandom;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		EditText fromNumberField = (EditText) findViewById(R.id.fromNumberField);
		EditText toNumberField = (EditText) findViewById(R.id.toNumberField);
		
		fromNumberField.setText("0");
		toNumberField.setText("0");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void incrementFromField(View view)
	{
		EditText fromNumberField = (EditText) findViewById(R.id.fromNumberField);
		
		String counterValueString = fromNumberField.getText().toString();
		int counterValueInt = Integer.parseInt(counterValueString);
		
		counterValueInt++;
		
		counterValueString = String.valueOf(counterValueInt);
		fromNumberField.setText(counterValueString);
	}
	
	public void decrementFromField(View view)
	{
		EditText fromNumberField = (EditText) findViewById(R.id.fromNumberField);
		
		String counterValueString = fromNumberField.getText().toString();
		int counterValueInt = Integer.parseInt(counterValueString);
		
		counterValueInt--;
		
		counterValueString = String.valueOf(counterValueInt);
		fromNumberField.setText(counterValueString);
	}
	
	public void incrementToField(View view)
	{
		EditText toNumberField = (EditText) findViewById(R.id.toNumberField);
		
		String counterValueString = toNumberField.getText().toString();
		int counterValueInt = Integer.parseInt(counterValueString);
		
		counterValueInt++;
		
		counterValueString = String.valueOf(counterValueInt);
		toNumberField.setText(counterValueString);
	}
	
	public void decrementToField(View view)
	{
		EditText toNumberField = (EditText) findViewById(R.id.toNumberField);
		
		String counterValueString = toNumberField.getText().toString();
		int counterValueInt = Integer.parseInt(counterValueString);
		
		counterValueInt--;
		
		counterValueString = String.valueOf(counterValueInt);
		toNumberField.setText(counterValueString);
	}
	
	public void generateNumber(View view)
	{
		TextView numberDisplay = (TextView) findViewById(R.id.numberDisplay);
		
		String counterValueString = numberDisplay.getText().toString();
		int counterValueInt = Integer.parseInt(counterValueString);
		
		Random rand = new Random();
		EditText toNumberField = (EditText) findViewById(R.id.toNumberField);
		EditText fromNumberField = (EditText) findViewById(R.id.fromNumberField);
		
		int min = Integer.parseInt(fromNumberField.getText().toString());
		int max = Integer.parseInt(toNumberField.getText().toString());		
		
		counterValueInt = rand.nextInt(max - min + 1) + min;
		
		counterValueString = String.valueOf(counterValueInt);
		numberDisplay.setText(counterValueString);
	}

}
