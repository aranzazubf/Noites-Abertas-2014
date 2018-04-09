package com.aranzazu.appnoites14;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import com.aranzazu.appnoites14.R;

public class Colaboradores extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//  this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		 // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
		setContentView(R.layout.colaboradores);
	
	}

}