package com.aranzazu.appnoites14;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import com.aranzazu.appnoites14.R;

public class Marzo extends TabActivity {
	
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	       this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	     
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	        TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    			
	    	Resources res =getResources(); 			
	    	String dias[]=res.getStringArray(R.array.marzo);
	    	int[] resIDs = new int[] {
	    			
	    			//CAMBIAR IMAGENES
	    			R.drawable.mar_vie7,
	    			R.drawable.mar_vie14,
	                R.drawable.mar_sab15,
	                R.drawable.mar_vie21,
	                R.drawable.mar_sab22,
	                R.drawable.mar_vie28,
	                R.drawable.mar_sab29
	             
	            };
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, Dia.class);
	    		intent.putExtra("variable_integer", 3);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	

}
}