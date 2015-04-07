package com.example.hotelsaqp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class Buscar_hotel extends ActionBarActivity {
	//String hoteles[]= getResources().getStringArray(R.array.hoteles);
	String hoteles[]={"hotel1","hotel2","hotel3","hotel4","hotel5","hotel6","hotel7"};
	Button buscar;
	String palabra;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar_hotel);
		
		//buscar = (Button) findViewById(R.id.button1);
				
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,hoteles);
		
		AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		
		textView.setThreshold(3);
		textView.setAdapter(adapter);
		palabra=String.valueOf(textView.getText());
	}
	
	public void Enlaza(View v) {
		// TODO Auto-generated method stub
		if(palabra=="hotel1"){	
			Intent sig= new Intent(this,MainActivity.class);
			startActivity(sig);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.buscar_hotel, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
