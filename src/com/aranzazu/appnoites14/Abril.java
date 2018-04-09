package com.aranzazu.appnoites14;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import com.aranzazu.appnoites14.R;

public class Abril extends TabActivity {
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	       this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	       
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	       TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    	Resources res =getResources();
	    	
	    	String dias[]=res.getStringArray(R.array.abril);
		    
	    	int[] resIDs = new int[] {
	    			R.drawable.abr_vie4,
	    			R.drawable.abr_sab5,
	                R.drawable.abr_vie11,
	                R.drawable.abr_sab12,
	                R.drawable.abr_vie18,
	                R.drawable.abr_sab19,
	                R.drawable.abr_vie25,
	               R.drawable.abr_sab26,
	             
	            };
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, Dia.class);
	    		intent.putExtra("variable_integer", 4);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	
}
}