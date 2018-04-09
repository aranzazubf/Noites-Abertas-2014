package com.aranzazu.appnoites14;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import com.aranzazu.appnoites14.R;

public class Folleto extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 // this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		  
		setContentView(R.layout.folleto);
	
	
		
		//getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
		
Button button = (Button)findViewById(R.id.buttoner);
button.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
	 descarga();	}     
});

	}

	public void descarga(){

		
		  

	            try {

	               // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.noitesabertas.com/sites/default/files/programacion.pdf")));
	            	
	            		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dropbox.com/s/pfm6xm7wsqu70re/DESPLEGABLE_NA_Page_2.jpg")));} 

	            catch (ActivityNotFoundException e) {

	                Toast.makeText(this, 

	                    "No Application Available to View PDF", 

	                   Toast.LENGTH_SHORT).show();}}
	
	}
