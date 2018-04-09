package com.aranzazu.appnoites14;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import com.aranzazu.appnoites14.R;

public class Febrero extends TabActivity {
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	        this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	      
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	        TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    	Resources res =getResources();
	    	 
	    	String dias[]=res.getStringArray(R.array.febreiro);
	    	int[] resIDs = new int[] {
	    			//IMAGENES
	    			R.drawable.feb_sab1,
	    			R.drawable.feb_vie7,
	    			R.drawable.feb_sab8,
	    			R.drawable.feb_vie14,
	    			R.drawable.feb_sab15,
	    			R.drawable.feb_vie21,
	    			R.drawable.feb_sab22,
	    			R.drawable.feb_vie28,
	    		
	              
	            };
	    
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, Dia.class);
	    		intent.putExtra("variable_integer", 2);
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	
		    	
	    	
	    
	    	
	        
	        
	        

	    }
}
