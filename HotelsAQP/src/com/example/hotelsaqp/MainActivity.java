package com.example.hotelsaqp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button ver;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		}
	public void Onclickhoteles(View v) {
		// TODO Auto-generated method stub
		
		Intent hoteles= new Intent(this,Busqueda.class);
		startActivity(hoteles);
	}
	
	public void Onclickbuscar(View v) {
		// TODO Auto-generated method stub
		
		Intent buscar= new Intent(this,Buscar_hotel.class);
		startActivity(buscar);
	}
	
	public void Onclick(View v) {
		// TODO Auto-generated method stub
		
		Intent ajustes= new Intent(this,Busqueda.class);
		startActivity(ajustes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
