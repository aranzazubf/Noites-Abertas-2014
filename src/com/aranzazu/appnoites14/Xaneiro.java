package com.aranzazu.appnoites14;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import com.aranzazu.appnoites14.R;
public class Xaneiro extends TabActivity{
	 @Override public void onCreate(Bundle savedInstanceState) {

	        super.onCreate(savedInstanceState);
	        this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
	       
	        setContentView(R.layout.meses);
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
	        TabHost tabhost = getTabHost();
	    	TabHost.TabSpec spec;
	    	Intent intent;
	    	Resources res =getResources();
	    	//String con el/los días que hay actividades en enero
	    	String dias[]=res.getStringArray(R.array.xaneiro);
		    
	    	//Pestañas para cada día de las actividades de enero
	    	int[] resIDs = new int[] {
	    			
	    			//IMAGENES
	    			R.drawable.xan_vie31,
	    	};
	    	
	    	//Para cada día hay una lista con las actividades que implementamos en Dia.class
	    	for(int i=1;i<=dias.length;i++){
	    		intent=new Intent().setClass(this, Dia.class);
	    		intent.putExtra("variable_integer", 1);//?¿??¿ indica en que mes estamos 
	    		intent.putExtra("variable_integer1", i);
		    	spec =tabhost.newTabSpec("dia"+i).setIndicator("",res.getDrawable(resIDs[i-1])).setContent(intent);
		    	tabhost.addTab(spec);
	    		
	    		
	    	}
	    	
	 }
}	
