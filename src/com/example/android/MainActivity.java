package com.example.android;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

@SuppressLint("ResourceAsColor")
public class MainActivity extends Activity {


	
	// Create an anonymous implementation of OnClickListener
	private OnClickListener provaToasttbn1 = new OnClickListener() {
	    public void onClick(View v) {
	    	Toast toast = Toast.makeText(MainActivity.this, "Has apretat el boto Red", Toast.LENGTH_SHORT);
	        toast.show();
	        
			((Button) v).setTextColor(Color.BLUE);

	        
	    }
	};
	
	private OnClickListener provaToasttbn2 = new OnClickListener() {
	    public void onClick(View v) {
	    	Toast toast = Toast.makeText(MainActivity.this, "Has apretat el boto Green", Toast.LENGTH_SHORT);
	        toast.show(); 	    
	    
	        ((Button) v).setTextColor(Color.YELLOW);
	    }
	};
	

	
	
	private LinearLayout root;
	@Override
	
	
	
	public void onCreate(Bundle state) {
		super.onCreate(state);

		
		LinearLayout.LayoutParams containerParams = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 0.0F);
		LinearLayout.LayoutParams widgetParams = new LinearLayout.LayoutParams(
				ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1.0F);
		
		root = new LinearLayout(this);
		root.setOrientation(LinearLayout.VERTICAL);
		root.setBackgroundColor(Color.LTGRAY);
		root.setLayoutParams(containerParams);
			LinearLayout ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.HORIZONTAL);
		ll.setBackgroundColor(Color.GRAY);
		ll.setLayoutParams(containerParams);
		root.addView(ll);
		
			LinearLayout ll2 = new LinearLayout(this);
		ll2.setOrientation(LinearLayout.HORIZONTAL);
		ll2.setBackgroundColor(Color.BLACK);
		ll2.setLayoutParams(containerParams);
		root.addView(ll2);
		
		EditText tbesquerra = new EditText(this);
		tbesquerra.setText(R.string.defaultLeftText);
		tbesquerra.setFocusable(true);
		tbesquerra.setLayoutParams(widgetParams);
		ll.addView(tbesquerra);
		
		EditText tbdreta = new EditText(this);
		tbdreta.setText(R.string.defaultRightText);
		tbdreta.setFocusable(true);
		tbdreta.setLayoutParams(widgetParams);
		ll.addView(tbdreta);
		
		Button btn1 = new Button(this);
		btn1.setText(R.string.botoRed);
		btn1.setTextColor(Color.RED);
		btn1.setLayoutParams(widgetParams);
		btn1.setOnClickListener(provaToasttbn1);
		ll2.addView(btn1);
		
		Button btn2 = new Button(this);
		btn2.setText(R.string.botoGreen);
		btn2.setTextColor(Color.GREEN);
		btn2.setLayoutParams(widgetParams);
		btn2.setOnClickListener(provaToasttbn2);
		ll2.addView(btn2);
		
		
		
		setContentView(root);
		
			
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
