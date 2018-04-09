package com.aranzazu.appnoites14;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Localizaciones extends android.support.v4.app.FragmentActivity {
	 /*  public GeoPoint points[]=new GeoPoint[]{
			   //OJO CAMBIAR DIRECCIONES
			   new GeoPoint((int)(42.437595*1E6),(int)(-8.634949*1E6)),
			   new GeoPoint((int)(42.433921*1E6),(int)(-8.64637*1E6)),
			   new GeoPoint((int)(42.432263*1E6),(int)(-8.649319*1E6)),
			   new GeoPoint((int)(42.419458*1E6),(int)(-8.636593*1E6)),
			   new GeoPoint((int)(42.444504*1E6),(int)(-8.646608 *1E6)),
			   new GeoPoint((int)(42.43821*1E6),(int)(-8.637638*1E6)),
			   new GeoPoint((int)(42.4367*1E6),(int)(-8.641754*1E6)),
			   new GeoPoint((int)(42.431982*1E6),(int)(-8.64508*1E6)),
			   new GeoPoint((int)(42.430984*1E6),(int)(-8.643967*1E6)),
			   new GeoPoint((int)(42.430799*1E6),(int)(-8.643688*1E6)),
			   new GeoPoint((int)(42.43273*1E6),(int)(-8.647455*1E6)),
			   new GeoPoint((int)(42.432612*1E6),(int)(-8.646265*1E6)),
			   new GeoPoint((int)(42.419458*1E6),(int)(-8.636593*1E6))
			
	   };    
	   //revisar localizaciones que no son las mismas
	   public String[] adress=new String[]{"","r/ Sor Lucía, 2","r/ Xeneral Martitegui, 3","(ao lado da estación de tren)","parque á entrada da Xunqueira de Alba","","","","","","","",""};
	     */
	GoogleMap mapa;
	  int vista =0;
	      @Override
		public void onCreate(Bundle savedInstanceState) {

	    	
	    	try{
	            super.onCreate(savedInstanceState);
	          
	            setContentView(R.layout.localizaciones);
	            Resources res=this.getResources();
	          
	             mapa = ((SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map)).getMap();
	             // alternarVista();
	      
	             CameraUpdate center=
	            	        CameraUpdateFactory.newLatLng(new LatLng(42.437595,
	            	        		-8.634949));
	            	    CameraUpdate zoom=CameraUpdateFactory.zoomTo(15);

	            	    mapa.moveCamera(center);
	            	    mapa.animateCamera(zoom);
	             String[] lug=res.getStringArray(R.array.Lugares);
	       	  
	            int[] draw=new int[]{
	   	    		R.drawable.pink,
	   	    		 R.drawable.purple,
	   	    		  R.drawable.green,
	   	    		R.drawable.yellow,
	   	    		R.drawable.blue,
	   	    		R.drawable.pink,
	   	    		R.drawable.purple,
	   	    		 R.drawable.red,
	   	    		R.drawable.green,
	   	    		R.drawable.blue,
	   	    		R.drawable.purple,
	   	    		R.drawable.green,
	   	    		R.drawable.pink
	   	    	};
	            double[] points={
	     			   //OJO CAMBIAR DIRECCIONES
	     			  42.437595,
	     			  42.433921,
	     			42.432263,
	     			   42.419458,
	     			42.444504,
	     			 42.43821,
	     			 42.4367,
	     			   42.431982,
	     			 42.430984,
	     			 42.430799,
	     			   42.43273,
	     			  42.432612,
	     			  42.419458,
	     	   };    
	            double[] points2={
		     			   //OJO CAMBIAR DIRECCIONES
		     			 -8.634949,
		     			  -8.64637,
		     			-8.649319,
		     			 -8.636593,
		     			-8.646608,
		     			-8.637638,
		     			 -8.641754,
		     			  -8.64508,
		     			-8.643967,
		     			-8.643688,
		     			 -8.647455,
		     			-8.646265,
		     			 -8.636593
		     			
		     	   };    
	     	   //revisar localizaciones que no son las mismas
	     	   String[] adress=new String[]{"","r/ Sor Lucía, 2","r/ Xeneral Martitegui, 3","(ao lado da estación de tren)","parque á entrada da Xunqueira de Alba","","","","","","","",""};
	     	
	            for(int i=0;i<13;i++){
	            
	            	  
	            mostrarMarcador(points[i],points2[i],lug[i],adress[i],draw[i]);
	            	
	            	
	            }
	            
	    	}catch(Exception e){
	    		throw new RuntimeException(e);
	    		
	    		
	    	}
	    	
	    	
	        /*    Uri uri = Uri.parse("https://mapsengine.google.com/map/edit?mid=zaZLJHtS2bK8.kH34b9ep1Tmk");
		    	  Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		    	  startActivity(intent);
	          */  
	            
	          
	            
	            
	         /*   String[] lug=res.getStringArray(R.array.Lugares);
	  
	      
	    BitmapDescriptore[] draw={
	    		  res.getDrawable(R.drawable.pink),
	    		  res.getDrawable(R.drawable.purple),
	    		  res.getDrawable(R.drawable.green),
	    		  res.getDrawable(R.drawable.yellow),
	    		  res.getDrawable(R.drawable.blue),
	    		  res.getDrawable(R.drawable.pink),
	    		  res.getDrawable(R.drawable.purple),
	    		  res.getDrawable(R.drawable.red),
	    		  res.getDrawable(R.drawable.green),
	    		  res.getDrawable(R.drawable.blue),
	    		  res.getDrawable(R.drawable.purple),
	    		  res.getDrawable(R.drawable.green),
	    		  res.getDrawable(R.drawable.pink)
	    	};
	    		  
	    		  
	    		  
	    		  
	    		  
	      
	      
	         MapView map=(MapView)findViewById(R.id.mapview);
	         
	         
	         
	         
	         map.setSatellite(true);
	         
	       MapController mapC= map.getController();
	       mapC.setZoom(17);
	          mapC.setCenter(points[0]);
	           map.setBuiltInZoomControls(true);
	           List<Overlay>mapOverlays= map.getOverlays();
	           HustsItemizedOverlay itemizedoverlay=  new HustsItemizedOverlay(draw[0],this);

        	   OverlayItem over= new OverlayItem(points[0],lug[0],"Calleblaba");
	           for(int i=0;i<lug.length;i++){
	        	   itemizedoverlay= new HustsItemizedOverlay(draw[i],this);
	        	 over= new OverlayItem(points[i],lug[i],adress[i]);
	        	 itemizedoverlay.addOverlay(over);
	        	    mapOverlays.add(itemizedoverlay);
	           }
	       
	         
	      
	           
	          
	      }

		@Override
		protected boolean isRouteDisplayed() {
			// TODO Auto-generated method stub
			return false;
		}

		public void mapa(View view) {
		     Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.google.es/maps/ms?msa=0&msid=209360466359965039230.0004d5273849e5e4dca1b&ie=UTF8&t=m&ll=42.429539,-8.64212&spn=0.063352,0.068665&z=13&source=embed")); 
		  startActivity(i);
		
			
	  */
		}
	   
	/*	private void alternarVista()
	    	{
	    	vista = (vista + 1) % 4;
	    	 
	    	    switch(vista)
	    	    {
	    	        case 0:
	    	            mapa.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	    	            break;
	    	        case 1:
	    	            mapa.setMapType(GoogleMap.MAP_TYPE_HYBRID);
	    	            break;
	    	        case 2:
	    	            mapa.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
	    	            break;
	    	        case 3:
	    	            mapa.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
	    	            break;
	    	    }
	    	}*/
		private void mostrarMarcador(double lat, double lng,String lug,String dir, int draw)
		{
			
		    mapa.addMarker(new MarkerOptions()
		        .position(new LatLng(lat, lng))
		        .title(lug).icon(BitmapDescriptorFactory.fromResource(draw)).snippet(dir));
		}
}

