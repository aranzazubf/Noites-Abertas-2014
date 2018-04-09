package com.aranzazu.appnoites14;
import java.util.ArrayList;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ExpandableListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import com.aranzazu.appnoites14.R;

public class Dia extends ExpandableListActivity {
	
	
	  
	   
	
	  
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
    	super.onCreate(savedInstanceState);
    	 //this.requestWindowFeature(Window.);
    	// getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
    	   
    	Resources res=getResources();
    	ExpandableListView elist=this.getExpandableListView();
    	
    	//est· deprecado ver alternativa
    
    	elist.setCacheColorHint(Color.TRANSPARENT);
	      
    	  Bundle datos = this.getIntent().getExtras();
    	  int mes = datos.getInt("variable_integer");
    	  int dia= datos.getInt("variable_integer1");
    	 ArrayList<group> groupData = new ArrayList<group>();
	     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
    	 Exelistadapter2 exampleAdapter=new Exelistadapter2(this,groupData,childData);
    	 
    	

    		switch(mes){
    		
    		case 1:
    			exampleAdapter=rellenaxaneiro(dia);
    			break;
    			case 2:
    				exampleAdapter=rellenafebreiro(dia);
    			break;
    			case 3:
    				exampleAdapter=rellenamarzo(dia);
    			break;
    			case 4:
    				exampleAdapter=rellenaabril(dia);
    			break;
    			
    			case 5:
    				exampleAdapter=rellenamaio(dia);
    			break;
    		}
    			
   
    	 
    	
 
    			 this.setListAdapter(exampleAdapter);
        
        }

   
 
/**********************************************XANEIRO*********************************************************/



Exelistadapter2 rellenaxaneiro(int dia){
	ArrayList<group> groupData = new ArrayList<group>();
    ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
	Resources res =getResources();
	
	String[] luxan1=res.getStringArray(R.array.lugxan31);
	ArrayList<String[]> Af1= new ArrayList<String[]>();
	ArrayList<String[]> Hf1= new ArrayList<String[]>();
	
	
  String[] luxan1a=res.getStringArray(R.array.actxan31lug1);
  String[] luxan1b=res.getStringArray(R.array.actxan31lug2);
  String[] luxan1c=res.getStringArray(R.array.actxan31lug3);
  String[] luxan1d=res.getStringArray(R.array.actxan31lug4);
  Af1.add(luxan1a);
  Af1.add(luxan1b);
  Af1.add(luxan1c);
  Af1.add(luxan1d);
  
  String[] luxan1ha=res.getStringArray(R.array.horxan31lug1);
  String[] luxan1hb=res.getStringArray(R.array.horxan31lug2);
  String[] luxan1hc=res.getStringArray(R.array.horxan31lug3);
  String[] luxan1hd=res.getStringArray(R.array.horxan31lug4);
Hf1.add(luxan1ha);
Hf1.add(luxan1hb);	
Hf1.add(luxan1hc);	
Hf1.add(luxan1hd);	




int[] resIDs = new int[] {
	R.drawable.cero,
	R.drawable.uno,
   R.drawable.dos,
   R.drawable.tres,
   R.drawable.cuatro,
   R.drawable.cinco,
   R.drawable.seis,
   R.drawable.siete,
  R.drawable.ocho,
  0
};
  
  
		
		 for (int i = 0; i < luxan1.length; i++) {
	         //ningunaactividad con dosavisos°°°)
	         groupData.add(new group(luxan1[i]));
	         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

	         for (int j = 0; j < Af1.get(i).length; j++) {
	        	 int imagen1=EligeImagenX(dia,i,j); 
	            	int imagen2=9;
	            
	           children.add(new ChildDia((Hf1.get(i)[j]),(Af1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
	         }
	         childData.add(children);
	     }
		
	 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
		return exampleAdapter;
	
}
public int EligeImagenX(int dia,int a,int b){
	int day=dia;
	int i=a;
	int j=b;
	int image=9;
	switch(day){
	
	case 1: switch(i){
			case 0: if(j==0)image=1; else image=9;
			break;
			case 1: if(j==0)image=1;
					if(j==2)image=3;
					if(j==3)image=2;
					
			break;
			case 2: if(j==1)image=6;
			break;
			case 3: if(j==0)image=1;
			break;
			default: image=9;
			break;
			}
	break;	
	
	
} 
	return image;
}




/****************************************************FEBRERO*******************************************************/
	Exelistadapter2 rellenafebreiro(int dia){
			 
		     ArrayList<group> groupData = new ArrayList<group>();
		     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
		 	Resources res =getResources();
			
		 	String[] febrerolug1=res.getStringArray(R.array.lugfeb01);
		 	ArrayList<String[]> Af1= new ArrayList<String[]>();
			ArrayList<String[]> Hf1= new ArrayList<String[]>();
		   String[] febrero1a=res.getStringArray(R.array.actividadesfebrero01froebel);
		   String[] febrero1b=res.getStringArray(R.array.actividadesfebrero01casaazul);
		   String[] febrero1c=res.getStringArray(R.array.actividadesfebrero01localmusica);
		   String[] febrero1d=res.getStringArray(R.array.actividadesfebrero01pavdeportes);
		   String[] febrero1e=res.getStringArray(R.array.actividadesfebrero01campos);
		   Af1.add(febrero1a);
		   Af1.add(febrero1b);
		   Af1.add(febrero1c);
		   Af1.add(febrero1d);
		   Af1.add(febrero1e);
		   
		   String[] febrero1ha=res.getStringArray(R.array.horasfebrero01froebel);
		   String[] febrero1hb=res.getStringArray(R.array.horasfebrero01casaaazul);
		   String[] febrero1hc=res.getStringArray(R.array.horasfebrero01localmusica);
		   String[] febrero1hd=res.getStringArray(R.array.horasfebrero01pavdeportes);
		   String[] febrero1he=res.getStringArray(R.array.horasfebrero01campos);
		Hf1.add(febrero1ha);
		Hf1.add(febrero1hb);	
		Hf1.add(febrero1hc);	
		Hf1.add(febrero1hd);
		Hf1.add(febrero1he);	
		
		
		
	 	String[] febrerolug2=res.getStringArray(R.array.lugfeb07);
	 	ArrayList<String[]> Af2= new ArrayList<String[]>();
		ArrayList<String[]> Hf2= new ArrayList<String[]>();
	   String[] febrero2a=res.getStringArray(R.array.actividadesfebrero07froebel);;
	   String[] febrero2b=res.getStringArray(R.array.actividadesfebrero07casaazul);
	   String[] febrero2c=res.getStringArray(R.array.actividadesfebrero07lmusica);
	   String[] febrero2d=res.getStringArray(R.array.actividadesfebrero07pourense);
	   Af2.add(febrero2a);
	   Af2.add(febrero2b);
	   Af2.add(febrero2c);
	   Af2.add(febrero2d);
	   
	   String[] febrero2ha=res.getStringArray(R.array.horasfebrero07froebel);
	   String[] febrero2hb=res.getStringArray(R.array.horasfebrero07casaazul);
	   String[] febrero2hc=res.getStringArray(R.array.horasfebrero07lmusica);
	   String[] febrero2hd=res.getStringArray(R.array.horasfebrero07pourense);
	
	Hf2.add(febrero2ha);
	Hf2.add(febrero2hb);	
	Hf2.add(febrero2hc);	
	Hf2.add(febrero2hd);	
 	String[] febrerolug3=res.getStringArray(R.array.lugfeb08);
 	ArrayList<String[]> Af3= new ArrayList<String[]>();
	ArrayList<String[]> Hf3= new ArrayList<String[]>();
   String[] febrero3a=res.getStringArray(R.array.actividadesfebrero08froebel);;
   String[] febrero3b=res.getStringArray(R.array.actividadesfebrero08casaazul);
   String[] febrero3c=res.getStringArray(R.array.actividadesfebrero08lmusica);
   String[] febrero3d=res.getStringArray(R.array.actividadesfebrero08multiusos);
   Af3.add(febrero3a);
   Af3.add(febrero3b);
   Af3.add(febrero3c);
   Af3.add(febrero3d);
   
   String[] febrero3ha=res.getStringArray(R.array.horasfebrero08froebel);
   String[] febrero3hb=res.getStringArray(R.array.horasfebrero08casaazul);
   String[] febrero3hc=res.getStringArray(R.array.horasfebrero08lmusica);
   String[] febrero3hd=res.getStringArray(R.array.horasfebrero08lmultiusos);
Hf3.add(febrero3ha);
Hf3.add(febrero3hb);	
Hf3.add(febrero3hc);	
Hf3.add(febrero3hd);
	String[] febrerolug4=res.getStringArray(R.array.lugfeb14);
 	ArrayList<String[]> Af4= new ArrayList<String[]>();
	ArrayList<String[]> Hf4= new ArrayList<String[]>();
   String[] febrero4a=res.getStringArray(R.array.actividadesfebrero14froebel);;
   String[] febrero4b=res.getStringArray(R.array.actividadesfebrero14casaazul);
   String[] febrero4c=res.getStringArray(R.array.actividadesfebrero14lmusica);
 
   Af4.add(febrero4a);
   Af4.add(febrero4b);
   Af4.add(febrero4c);
  
   
   String[] febrero4ha=res.getStringArray(R.array.horasfebrero14froebel);
   String[] febrero4hb=res.getStringArray(R.array.horasfebrero14casaazul);
   String[] febrero4hc=res.getStringArray(R.array.horasfebrero14lmusica);
 
Hf4.add(febrero4ha);
Hf4.add(febrero4hb);	
Hf4.add(febrero4hc);	

	String[] febrerolug5=res.getStringArray(R.array.lugfeb15);
 	ArrayList<String[]> Af5= new ArrayList<String[]>();
	ArrayList<String[]> Hf5= new ArrayList<String[]>();
   String[] febrero5a=res.getStringArray(R.array.actividadesfebrero15froebel);;
   String[] febrero5b=res.getStringArray(R.array.actividadesfebrero15casaazul);
   String[] febrero5c=res.getStringArray(R.array.actividadesfebrero15lmusica);
   String[] febrero5d=res.getStringArray(R.array.actividadesfebrero15pmultiusos);
   String[] febrero5e=res.getStringArray(R.array.actividadesfebrero15cherva);
   
  
   Af5.add(febrero5a);
   Af5.add(febrero5b);
   Af5.add(febrero5c);
   Af5.add(febrero5d);
   Af5.add(febrero5e);
   
   
   String[] febrero5ha=res.getStringArray(R.array.horasfebrero15froebel);
   String[] febrero5hb=res.getStringArray(R.array.horasfebrero15casaazul);
   String[] febrero5hc=res.getStringArray(R.array.horasfebrero15lmusica);
   String[] febrero5hd=res.getStringArray(R.array.horasfebrero15pmultiusos);
   String[] febrero5he=res.getStringArray(R.array.horasfebrero15cherva);
Hf5.add(febrero5ha);
Hf5.add(febrero5hb);	
Hf5.add(febrero5hc);
Hf5.add(febrero5hd);
Hf5.add(febrero5he);

String[] febrerolug6=res.getStringArray(R.array.lugfeb21);
	ArrayList<String[]> Af6= new ArrayList<String[]>();
ArrayList<String[]> Hf6= new ArrayList<String[]>();
String[] febrero6a=res.getStringArray(R.array.actividadesfebrero21froebel);;
String[] febrero6b=res.getStringArray(R.array.actividadesfebrero21casaazul);
String[] febrero6c=res.getStringArray(R.array.actividadesfebrero21lmusica);

Af6.add(febrero6a);
Af6.add(febrero6b);
Af6.add(febrero6c);


String[] febrero6ha=res.getStringArray(R.array.horasfebrero21froebel);
String[] febrero6hb=res.getStringArray(R.array.horasfebrero21casaazul);
String[] febrero6hc=res.getStringArray(R.array.horasfebrero21lmusica);

Hf6.add(febrero6ha);
Hf6.add(febrero6hb);	
Hf6.add(febrero6hc);	
	
String[] febrerolug7=res.getStringArray(R.array.lugfeb22);
	ArrayList<String[]> Af7= new ArrayList<String[]>();
ArrayList<String[]> Hf7= new ArrayList<String[]>();
String[] febrero7a=res.getStringArray(R.array.actividadesfebrero22froebel);;
String[] febrero7b=res.getStringArray(R.array.actividadesfebrero22casaazul);
String[] febrero7c=res.getStringArray(R.array.actividadesfebrero22pmultiusos);

Af7.add(febrero7a);
Af7.add(febrero7b);
Af7.add(febrero7c);


String[] febrero7ha=res.getStringArray(R.array.horasfebrero22froebel);
String[] febrero7hb=res.getStringArray(R.array.horasfebrero22casaazul);
String[] febrero7hc=res.getStringArray(R.array.horasfebrero22pmultiusos);

Hf7.add(febrero7ha);
Hf7.add(febrero7hb);	
Hf7.add(febrero7hc);	


 	String[] febrerolug8=res.getStringArray(R.array.lugfeb28);
	ArrayList<String[]> Af8= new ArrayList<String[]>();
ArrayList<String[]> Hf8= new ArrayList<String[]>();
String[] febrero8a=res.getStringArray(R.array.actividadesfebrero28froebel);;
String[] febrero8b=res.getStringArray(R.array.actividadesfebrero28casaazul);
String[] febrero8c=res.getStringArray(R.array.actividadesfebrero28lmusica);

Af8.add(febrero8a);
Af8.add(febrero8b);
Af8.add(febrero8c);


String[] febrero8ha=res.getStringArray(R.array.horasfebrero28froebel);
String[] febrero8hb=res.getStringArray(R.array.horasfebrero28casaazul);
String[] febrero8hc=res.getStringArray(R.array.horasfebrero28lmusica);

Hf8.add(febrero8ha);
Hf8.add(febrero8hb);	
Hf8.add(febrero8hc);	

	int[] resIDs = new int[] {
			
			//CAMBIAR EL DRAWABLE7 POR 8
			R.drawable.cero,
			R.drawable.uno,
            R.drawable.dos,
            R.drawable.tres,
            R.drawable.cuatro,
            R.drawable.cinco,
            R.drawable.seis,
            R.drawable.siete,
            R.drawable.ocho,
           0
        };
		   
		   
					switch(dia){
			case 1:
				 for (int i = 0; i < febrerolug1.length; i++) {
			         
			         groupData.add(new group(febrerolug1[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af1.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			            	int imagen2=9;
			            
			           children.add(new ChildDia((Hf1.get(i)[j]),(Af1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
			case 2:
				for (int i = 0; i < febrerolug2.length; i++) {
					
	            	
			         groupData.add(new group(febrerolug2[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af2.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			        	 int imagen2=9;
			           children.add(new ChildDia((Hf2.get(i)[j]),(Af2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
			case 3:
				for (int i = 0; i < febrerolug3.length; i++) {
					
	            	
			         groupData.add(new group(febrerolug3[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af3.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			        	 int imagen2=9;
			           children.add(new ChildDia((Hf3.get(i)[j]),(Af3.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
			case 4:
				for (int i = 0; i < febrerolug4.length; i++) {
					
	            	
			         groupData.add(new group(febrerolug4[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af4.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			        	 int imagen2=9;
			           children.add(new ChildDia((Hf4.get(i)[j]),(Af4.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
			case 5:
				for (int i = 0; i < febrerolug5.length; i++) {
					
	            	
			         groupData.add(new group(febrerolug5[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af5.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			        	 int imagen2=9;
			           children.add(new ChildDia((Hf5.get(i)[j]),(Af5.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
			case 6:
				for (int i = 0; i < febrerolug6.length; i++) {
					
	            	
			         groupData.add(new group(febrerolug6[i]));
			         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

			         for (int j = 0; j < Af6.get(i).length; j++) {
			        	 int imagen1=EligeImagenF(dia,i,j); 
			        	 int imagen2=9;
			           children.add(new ChildDia((Hf6.get(i)[j]),(Af6.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
			         }
			         childData.add(children);
			     }
				break;
				case 7:
					for (int i = 0; i < febrerolug7.length; i++) {
						
		            	
				         groupData.add(new group(febrerolug7[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Af7.get(i).length; j++) {
				        	 int imagen1=EligeImagenF(dia,i,j); 
				        	 int imagen2=9;
				           children.add(new ChildDia((Hf7.get(i)[j]),(Af7.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 8:
					for (int i = 0; i < febrerolug8.length; i++) {
						
		            	
				         groupData.add(new group(febrerolug8[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Af8.get(i).length; j++) {
				        	 int imagen1=EligeImagenF(dia,i,j); 
				        	 int imagen2=9;
				           children.add(new ChildDia((Hf8.get(i)[j]),(Af8.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
			}
			
			 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
				return exampleAdapter;
			
		}
	
	public int EligeImagenF(int dia,int a,int b){
		int day=dia;
		int i=a;
		int j=b;
		int image=9;
		switch(day){
		
		case 1: switch(i){
				case 0: if(j==0)image=1;
						if(j==4)image=6;
				break;
				case 1: if(j==0)image=1;
						if (j==2)image=1;
				break;
				case 2: image=9;
				break;
				case 3: if(j==1)image=1;
				break;
				default: image=9;
				break;
				}
		break;	
		case 2: switch(i){
				case 0: if(j==0)image=1;
				break;
				case 1: image=9;
				break;
				case 2: if(j==1)image=6;
				break;
				default:image=9;
				break;
				
		}
		break;
		case 3: switch(i){
				case 0:if(j==0)image=1;
					   if(j==3)image=6;
					
				break;
				case 1:if(j==0)image=1;
						if(j==2)image=1;
				break;
				default:image=9;
				break;
		}
		break;
		case 4: switch(i){
				case 0:if(j==0)image=1;
				break;
				case 1: if(j==3)image=3;
						if(j==4)image=2;
				break;
				case 2: if(j==2)image=6;
				break;
				default:image=9;
				break;
		
		}
		break;
		case 5: switch(i){
				case 0:if(j==0)image=1;
						if(j==5)image=6;
				break;
				case 1: if(j==0)image=1; 
						if(j==2)image=1;
				break;
				case 3: if(j==0)image=1;
				break;
				default:image=9;
				break;
		
		}
		break;
		case 6: switch(i){
				case 0:if(j==0)image=1;
				break;
				case 1: if(j==1)image=3;
						if(j==2)image=2;
						
				break;
				case 2: if(j==2)image=6;
				default:image=9;
				break;
		
		}
		break;
		case 7: switch(i){
				case 0:if(j==0)image=1;
						if(j==6)image=6;
				break;
				case 1: if(j==1)image=1; 
				break;
				default:image=9;
				break;
		
		}
		break;
		case 8: switch(i){
				case 0:if(j==0)image=1;
				break;
				case 1: if(j==0)image=1;
						if(j==3)image=3;
				break;
				default:image=9;
				break;
		
		}
		break;
	} 
		return image;
	}

	/*****************************************************MARZO*************************************************/
		Exelistadapter2 rellenamarzo(int dia){
			
			

		     ArrayList<group> groupData = new ArrayList<group>();
		     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
		     Resources res =getResources();
				
		     String[] lugmarzo1=res.getStringArray(R.array.lugmar7);
		     String[] lugmarzo2=res.getStringArray(R.array.lugmar14);
		     String[] lugmarzo3=res.getStringArray(R.array.lugmar15);
		     String[] lugmarzo4=res.getStringArray(R.array.lugmar21);
		     String[] lugmarzo5=res.getStringArray(R.array.lugmar22);
		     String[] lugmarzo6=res.getStringArray(R.array.lugmar28);
		     String[] lugmarzo7=res.getStringArray(R.array.lugmar29);
		    
		     ArrayList<String[]> Am1=new ArrayList<String[]>();
		     ArrayList<String[]> Am2=new ArrayList<String[]>();
		     ArrayList<String[]> Am3=new ArrayList<String[]>();
		     ArrayList<String[]> Am4=new ArrayList<String[]>();
		     ArrayList<String[]> Am5=new ArrayList<String[]>();
		     ArrayList<String[]> Am6=new ArrayList<String[]>();
		     ArrayList<String[]> Am7=new ArrayList<String[]>();
		  
		     ArrayList<String[]> Hm1=new ArrayList<String[]>();
		     ArrayList<String[]> Hm2=new ArrayList<String[]>();
		     ArrayList<String[]> Hm3=new ArrayList<String[]>();
		     ArrayList<String[]> Hm4=new ArrayList<String[]>();
		     ArrayList<String[]> Hm5=new ArrayList<String[]>();
		     ArrayList<String[]> Hm6=new ArrayList<String[]>();
		     ArrayList<String[]> Hm7=new ArrayList<String[]>();
		     
		     String[] marzo1a=res.getStringArray(R.array.actividadesmarzo7froebel);
		     String[] marzo1b=res.getStringArray(R.array.actividadesmarzo7casaazul);
		     String[] marzo1c=res.getStringArray(R.array.actividadesmarzo7lmusica);
		     String[] marzo1d=res.getStringArray(R.array.actividadesmarzo7pavmunicipal);
		    
		     Am1.add(marzo1a);
		     Am1.add(marzo1b);
		     Am1.add(marzo1c);
		     Am1.add(marzo1d);
		     
		     String[] marzo1ha=res.getStringArray(R.array.horasmarzo7froebel);
		     String[] marzo1hb=res.getStringArray(R.array.horasmarzo7casaazul);
		     String[] marzo1hc=res.getStringArray(R.array.horasmarzo7lmusica);
		     String[] marzo1hd=res.getStringArray(R.array.horasmarzo7pavmunicipal);
		    
		     Hm1.add(marzo1ha);
		     Hm1.add(marzo1hb);
		     Hm1.add(marzo1hc);
		     Hm1.add(marzo1hd);
		    
		     String[] marzo2a=res.getStringArray(R.array.actividadesmarzo14froebel);
		     String[] marzo2b=res.getStringArray(R.array.actividadesmarzo14casaazul);
		     String[] marzo2c=res.getStringArray(R.array.actividadesmarzo14localmusica);
		     String[] marzo2d=res.getStringArray(R.array.actividadesmarzo14pavmunicipal);
		     Am2.add(marzo2a);
		     Am2.add(marzo2b);
		     Am2.add(marzo2c);
		     Am2.add(marzo2d);
		     
		     String[] marzo2ah=res.getStringArray(R.array.horasmarzo14froebel);
		     String[] marzo2bh=res.getStringArray(R.array.horasmarzo14casaazul);
		     String[] marzo2ch=res.getStringArray(R.array.horasmarzo14localmusica);
		     String[] marzo2dh=res.getStringArray(R.array.horasmarzo14pavmunicipal);
		     Hm2.add(marzo2ah);
		     Hm2.add(marzo2bh);
		     Hm2.add(marzo2ch);
		     Hm2.add(marzo2dh);
		     
		     String[] marzo3a=res.getStringArray(R.array.actividadesmarzo15froebel);
		     String[] marzo3b=res.getStringArray(R.array.actividadesmarzo15casaazul);
		  
		     String[] marzo3c=res.getStringArray(R.array.actividadesmarzo15localmusica);
		     String[] marzo3d=res.getStringArray(R.array.actividadesmarzo15pavmultiusos);
		     String[] marzo3e=res.getStringArray(R.array.actividadesmarzo15cherva);
		     
		     Am3.add(marzo3a);
		     Am3.add(marzo3b);
		     Am3.add(marzo3c);
		     Am3.add(marzo3d);
		     Am3.add(marzo3e);
		     
		     String[] marzo3ah=res.getStringArray(R.array.horasmarzo15froebel);
		     String[] marzo3bh=res.getStringArray(R.array.horasmarzo15casaazul);
		  
		   
			  
		     String[] marzo3ch=res.getStringArray(R.array.horasmarzo15localmusica);
		     String[] marzo3dh=res.getStringArray(R.array.horasmarzo15pavmultiusos);
		     String[] marzo3eh=res.getStringArray(R.array.horasmarzo15cherva);
		     Hm3.add(marzo3ah);
		     Hm3.add(marzo3bh);
		     Hm3.add(marzo3ch);
		     Hm3.add(marzo3dh);
		     Hm3.add(marzo3eh);
		   
		     
		     String[] marzo4a=res.getStringArray(R.array.actividadesmarzo21froebel);
		     String[] marzo4b=res.getStringArray(R.array.actividadesmarzo21casaazul);
		     String[] marzo4c=res.getStringArray(R.array.actividadesmarzo21lmusica);
		     String[] marzo4d=res.getStringArray(R.array.actividadesmarzo21pavmunicipal);
		   
		     Am4.add(marzo4a);
		     Am4.add(marzo4b);
		     Am4.add(marzo4c);
		     Am4.add(marzo4d);
		     String[] marzo4ah=res.getStringArray(R.array.horasmarzo21froebel);
		     String[] marzo4bh=res.getStringArray(R.array.horasmarzo21casaazul);
		  
		     String[] marzo4ch=res.getStringArray(R.array.horasmarzo21lmusica);
		     String[] marzo4dh=res.getStringArray(R.array.horasmarzo21pavmunicipal);
		     Hm4.add(marzo4ah);
		     Hm4.add(marzo4bh);
		     Hm4.add(marzo4ch);
		     Hm4.add(marzo4dh);
		    
		     
		     String[] marzo5a=res.getStringArray(R.array.actividadesmarzo22froebel);
		     String[] marzo5b=res.getStringArray(R.array.actividadesmarzo22casaazul);
		     String[] marzo5c=res.getStringArray(R.array.actividadesmarzo22localmusica);
		     String[] marzo5d=res.getStringArray(R.array.actividadesmarzo22pavmultiusos);
		     String[] marzo5e=res.getStringArray(R.array.actividadesmarzo22cherva);
		     Am5.add(marzo5a);
		     Am5.add(marzo5b);
		     Am5.add(marzo5c);
		     Am5.add(marzo5d);
		     Am5.add(marzo5e);
		     String[] marzo5ah=res.getStringArray(R.array.horasmarzo22froebel);
		     String[] marzo5bh=res.getStringArray(R.array.horasmarzo22casaazul);
		    
		     String[] marzo5ch=res.getStringArray(R.array.horasmarzo22localmusica);
		     String[] marzo5dh=res.getStringArray(R.array.horasmarzo22pavmultiusos);
		     String[] marzo5eh=res.getStringArray(R.array.horasmarzo22cherva);
		     Hm5.add(marzo5ah);
		     Hm5.add(marzo5bh);
		     Hm5.add(marzo5ch);
		     Hm5.add(marzo5dh);
		     Hm5.add(marzo5eh);
		     String[] marzo6a=res.getStringArray(R.array.actividadesmarzo28froebel);
		     String[] marzo6b=res.getStringArray(R.array.actividadesmarzo28casaazul);
		     String[] marzo6c=res.getStringArray(R.array.actividadesmarzo28lmusica);
		     String[] marzo6d=res.getStringArray(R.array.actividadesmarzo28pavmunicipal);
		     String[] marzo6e=res.getStringArray(R.array.actividadesmarzo28pistas);
		     Am6.add(marzo6a);
		     Am6.add(marzo6b);
		     Am6.add(marzo6c);
		     Am6.add(marzo6d);
		     Am6.add(marzo6e);
		     
		     String[] marzo6ah=res.getStringArray(R.array.horasmarzo28froebel);
		     String[] marzo6bh=res.getStringArray(R.array.horasmarzo28casaazul);
		     String[] marzo6ch=res.getStringArray(R.array.horasmarzo28lmusica);
		     String[] marzo6dh=res.getStringArray(R.array.horasmarzo28pavmunicipal);
		     String[] marzo6eh=res.getStringArray(R.array.horasmarzo28pistas);
		     Hm6.add(marzo6ah);
		     Hm6.add(marzo6bh);
		     Hm6.add(marzo6ch);
		     Hm6.add(marzo6dh);
		     Hm6.add(marzo6eh);
		   
		     String[] marzo7a=res.getStringArray(R.array.actividadesmarzo29froebel);
		     String[] marzo7b=res.getStringArray(R.array.actividadesmarzo29psmaria);
		     String[] marzo7c=res.getStringArray(R.array.actividadesmarzo29casaazul);
		     String[] marzo7d=res.getStringArray(R.array.actividadesmarzo29lmusica);
		     String[] marzo7e=res.getStringArray(R.array.actividadesmarzo29pavmultiusos);
		     
		     
		     Am7.add(marzo7a);
		     Am7.add(marzo7b);
		     Am7.add(marzo7c);
		     Am7.add(marzo7d);
		     Am7.add(marzo7e);
		  
		    
		   
		     String[] marzo7ah=res.getStringArray(R.array.horasmarzo29froebel);
		     String[] marzo7bh=res.getStringArray(R.array.horasmarzo29psmaria);
		     String[] marzo7ch=res.getStringArray(R.array.horasmarzo29casaazul);
		     String[] marzo7dh=res.getStringArray(R.array.horasmarzo29lmusica);
		     String[] marzo7eh=res.getStringArray(R.array.horasmarzo29pavmultiusos);
		     Hm7.add(marzo7ah);
		     Hm7.add(marzo7bh);
		     Hm7.add(marzo7ch);
		     Hm7.add(marzo7dh);
		     Hm7.add(marzo7eh);
		     
		     //cambiar el dibujo para tener 8
		     int[] resIDs = new int[] {
		 			R.drawable.cero,
		 			R.drawable.uno,
		             R.drawable.dos,
		             R.drawable.tres,
		             R.drawable.cuatro,
		             R.drawable.cinco,
		             R.drawable.seis,
		             R.drawable.siete,
		             R.drawable.ocho,
		            0
		         };
		 		  
		     
	
		     
		     
		     
		     
		     
		     
		     switch(dia){
				case 1:
					 for (int i = 0; i <lugmarzo1.length ; i++) {
				         
				         groupData.add(new group(lugmarzo1[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();
///CAMBIAR PARA PONER ICONO y DESCRIPCIONES°°°
				         for (int j = 0; j < Am1.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=9;
				            	
								
				           children.add(new ChildDia((Hm1.get(i)[j]),(Am1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 2:
					for (int i = 0; i <lugmarzo2.length ; i++) {
				         
				         groupData.add(new group(lugmarzo2[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();
 
				         for (int j = 0; j < Am2.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=9;
				           children.add(new ChildDia((Hm2.get(i)[j]),(Am2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 3:
					for (int i = 0; i <lugmarzo3.length ; i++) {
				         
				         groupData.add(new group(lugmarzo3[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am3.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=9;
				           children.add(new ChildDia((Hm3.get(i)[j]),(Am3.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
					
				case 4:
					for (int i = 0; i <lugmarzo4.length ; i++) {
				         
				         groupData.add(new group(lugmarzo4[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am4.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=9;
				           children.add(new ChildDia((Hm4.get(i)[j]),(Am4.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 5:
					for (int i = 0; i <lugmarzo5.length ; i++) {
				         
				         groupData.add(new group(lugmarzo5[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am5.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=9;
				           children.add(new ChildDia((Hm5.get(i)[j]),(Am5.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 6:
					for (int i = 0; i <lugmarzo6.length ; i++) {
				         
				         groupData.add(new group(lugmarzo6[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am6.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=9;
				           children.add(new ChildDia((Hm6.get(i)[j]),(Am6.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				case 7:
					for (int i = 0; i <lugmarzo7.length ; i++) {
				         
				         groupData.add(new group(lugmarzo7[i]));
				         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

				         for (int j = 0; j < Am7.get(i).length; j++) {
				        	 int imagen1=EligeImagenM(dia,i,j); 
				            	int imagen2=9;
				           children.add(new ChildDia((Hm7.get(i)[j]),(Am7.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
				         }
				         childData.add(children);
				     }
					break;
				
					
				}
		     
		     
		     
		     
		     
			 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
				return exampleAdapter;
			
			
			
		}
		public int EligeImagenM(int dia,int a,int b){
			int day=dia;
			int i=a;
			int j=b;
			int image=9;
			switch(day){
			
			case 1: switch(i){
					case 0:if(j==0)image=3;
							
					break;
					
					case 3:if(j==0)image=1;
					break;
					default: image=9;
					break;
					}
			break;	
			case 2: switch(i){
					case 0:if(j==0)image=3; 
					break;
					case 1: if(j==2)image=2;
					break;
					case 3:if(j==0)image=1;
					break;
					default: image=9;
					break;
			}
			break;
			case 3: switch(i){
					
					case 1: if(j==2)image=1; 
					break;
					case 3:if(j==1)image=1;
					break;
					default: image=9;
					break;
			}
			break;
			case 4: switch(i){
					case 0:if(j==0) image=3;else image=9;
					break;
					case 3: if(j==0)image=1;  else image=9;
					break;
					default: image=9;
					break;
			}
			break;
			case 5: switch(i){
					case 0:if(j==0)image=3;
							if(j==4)image=9;
					break;
					case 1:if(j==2) image=1;
					break;
					case 3:if(j==3)image=1;
					break;
					case 4:if(j==0)image=1;
					default:image=9;
					break;
			
			}
			break;
			case 6: switch(i){
					case 0: if(j==0)image=3; else image=9;
					break;
					case 3: if(j==0)image=1;
					break;
					default:image=9;
					break;
								
			}
			break;
			case 7: switch(i){
					case 0: if(j==1)image=3; 
							if(j==3)image=8;
					break;
					case 1: if (j==0)image=3; 
					break;
					default:image=9;
					break;
										
			}
			break;
			
			}
			return image;
		}

/***************************************************ABRIL**********************************************/
	Exelistadapter2 rellenaabril(int dia){
			
			   ArrayList<group> groupData = new ArrayList<group>();
			     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
			     Resources res =getResources();
			    
			     String[] lugabril1=res.getStringArray(R.array.lugabril4);
			     String[] lugabril2=res.getStringArray(R.array.lugabril5);
			     String[] lugabril3=res.getStringArray(R.array.lugabril11);
			     String[] lugabril4=res.getStringArray(R.array.lugabril12);
			     String[] lugabril5=res.getStringArray(R.array.lugabril18);
			     String[] lugabril6=res.getStringArray(R.array.lugabril19);
			     String[] lugabril7=res.getStringArray(R.array.lugabril25);
			     String[] lugabril8=res.getStringArray(R.array.lugabril26);
			     
			   
			     
			     ArrayList<String[]> Aa1=new ArrayList<String[]>();
			     ArrayList<String[]> Aa2=new ArrayList<String[]>();
			     ArrayList<String[]> Aa3=new ArrayList<String[]>();
			     ArrayList<String[]> Aa4=new ArrayList<String[]>();
			     ArrayList<String[]> Aa5=new ArrayList<String[]>();
			     ArrayList<String[]> Aa6=new ArrayList<String[]>();
			     ArrayList<String[]> Aa7=new ArrayList<String[]>();
			     ArrayList<String[]> Aa8=new ArrayList<String[]>();
			   
			     ArrayList<String[]> Ha1=new ArrayList<String[]>();
			     ArrayList<String[]> Ha2=new ArrayList<String[]>();
			     ArrayList<String[]> Ha3=new ArrayList<String[]>();
			     ArrayList<String[]> Ha4=new ArrayList<String[]>();
			     ArrayList<String[]> Ha5=new ArrayList<String[]>();
			     ArrayList<String[]> Ha6=new ArrayList<String[]>();
			     ArrayList<String[]> Ha7=new ArrayList<String[]>();
			     ArrayList<String[]> Ha8=new ArrayList<String[]>();
			   
			    
			   
			     String[] abril1a=res.getStringArray(R.array.actividadesabril4parquecans);
			     String[] abril1b=res.getStringArray(R.array.actividadesabril4froebel);
			     String[] abril1c=res.getStringArray(R.array.actividadesabril4casaazul);
			     String[] abril1d=res.getStringArray(R.array.actividadesabril4localmusica);
			     String[] abril1e=res.getStringArray(R.array.actividadesabril4saida);
			     Aa1.add(abril1a);
			     Aa1.add(abril1b);
			     Aa1.add(abril1c);
			     Aa1.add(abril1d);
			     Aa1.add(abril1e);
			     
			     String[] abril1ah=res.getStringArray(R.array.horasabril4parquecans);
			     String[] abril1bh=res.getStringArray(R.array.horasabril4froebel);
			     String[] abril1ch=res.getStringArray(R.array.horasabril4casaazul);
			     String[] abril1dh=res.getStringArray(R.array.horasabril4localmuscica);
			     String[] abril1eh=res.getStringArray(R.array.horasabril4saida);
			     Ha1.add(abril1ah);
			     Ha1.add(abril1bh);
			     Ha1.add(abril1ch);
			     Ha1.add(abril1dh);
			     Ha1.add(abril1eh);
			     
			     String[] abril2a=res.getStringArray(R.array.actividadesabril5froebel);
			     String[] abril2b=res.getStringArray(R.array.actividadesabril5pmaria);
			     String[] abril2c=res.getStringArray(R.array.actividadesabril5casaazul);
			     String[] abril2d=res.getStringArray(R.array.actividadesabril5localmusica);
			     String[] abril2e=res.getStringArray(R.array.actividadesabril5pabmultiusos);
			     String[] abril2f=res.getStringArray(R.array.actividadesabril5cherva);
			     Aa2.add(abril2a);
			     Aa2.add(abril2b);
			     Aa2.add(abril2c);
			     Aa2.add(abril2d);
			     Aa2.add(abril2e);
			     Aa2.add(abril2f);
			     String[] abril2ah=res.getStringArray(R.array.horasabril5froebel);
			     String[] abril2bh=res.getStringArray(R.array.horasabril5pmaria);
			     String[] abril2ch=res.getStringArray(R.array.horasabril5casaazul);
			     String[] abril2dh=res.getStringArray(R.array.horasabril5localmuscica);
			     String[] abril2eh=res.getStringArray(R.array.horasabril5pabmultiusos);
			     String[] abril2fh=res.getStringArray(R.array.horasabril5cherva);
			     
			     Ha2.add(abril2ah);
			     Ha2.add(abril2bh);
			     Ha2.add(abril2ch);
			     Ha2.add(abril2dh);
			     Ha2.add(abril2eh);
			     Ha2.add(abril2fh);
			     
			     String[] abril3a=res.getStringArray(R.array.actividadesabril11pcans);
			     String[] abril3b=res.getStringArray(R.array.actividadesabril11teatro);
			     String[] abril3c=res.getStringArray(R.array.actividadesabril11froebel);
			     String[] abril3d=res.getStringArray(R.array.actividadesabril11casaazul);
			     String[] abril3e=res.getStringArray(R.array.actividadesabril11localmusica);
			     Aa3.add(abril3a);
			     Aa3.add(abril3b);
			     Aa3.add(abril3c);
			     Aa3.add(abril3d);
			     Aa3.add(abril3e);
			     String[] abril3ah=res.getStringArray(R.array.horasabril11pcans);
			     String[] abril3bh=res.getStringArray(R.array.horasabril11teatro);
			     String[] abril3ch=res.getStringArray(R.array.horasabril11froebel);
			     String[] abril3dh=res.getStringArray(R.array.horasabril11casaazul);
			     String[] abril3eh=res.getStringArray(R.array.horasabril11localmusica);
			     Ha3.add(abril3ah);
			     Ha3.add(abril3bh);
			     Ha3.add(abril3ch);
			     Ha3.add(abril3dh);
			     Ha3.add(abril3eh);
			     String[] abril4a=res.getStringArray(R.array.actividadesabril12froebel);
			     String[] abril4b=res.getStringArray(R.array.actividadesabril12pmaria);
			     String[] abril4c=res.getStringArray(R.array.actividadesabril12casaazul);
			     String[] abril4d=res.getStringArray(R.array.actividadesabril12pabmultiusos);
			     String[] abril4e=res.getStringArray(R.array.actividadesabril12cherva);
			     Aa4.add(abril4a);
			     Aa4.add(abril4b);
			     Aa4.add(abril4c);
			     Aa4.add(abril4d);
			     Aa4.add(abril4e);
			     String[] abril4ah=res.getStringArray(R.array.horasabril12froebel);
			     String[] abril4bh=res.getStringArray(R.array.horasabril12pmaria);
			     String[] abril4ch=res.getStringArray(R.array.horasabril12casaazul);
			     String[] abril4dh=res.getStringArray(R.array.horasabril12pabmultiusos);
			     String[] abril4eh=res.getStringArray(R.array.horasabril12cherva);
			     Ha4.add(abril4ah);
			     Ha4.add(abril4bh);
			     Ha4.add(abril4ch);
			     Ha4.add(abril4dh);
			     Ha4.add(abril4eh);
			     String[] abril5a=res.getStringArray(R.array.actividadesabril18pcans);
				 String[] abril5b=res.getStringArray(R.array.actividadesabril18froebel);
			     String[] abril5c=res.getStringArray(R.array.actividadesabril18casaazul);
			     String[] abril5d=res.getStringArray(R.array.actividadesabril18pmaria);
				 String[] abril5e=res.getStringArray(R.array.actividadesabril18localmusica);
			     Aa5.add(abril5a);
			     Aa5.add(abril5b);
			     Aa5.add(abril5c);
			     Aa5.add(abril5d);
			     Aa5.add(abril5e);
			     String[] abril5ah=res.getStringArray(R.array.horasabril18pcans);
			     String[] abril5bh=res.getStringArray(R.array.horasabril18froebel);
			     String[] abril5ch=res.getStringArray(R.array.horasabril18casaazul);
			     String[] abril5dh=res.getStringArray(R.array.horasabril18pmaria);
			     String[] abril5eh=res.getStringArray(R.array.horasabril18localmusica);
			     Ha5.add(abril5ah);
			     Ha5.add(abril5bh);
			     Ha5.add(abril5ch);
			     Ha5.add(abril5dh);
			     Ha5.add(abril5eh);
			  
			     String[] abril6a=res.getStringArray(R.array.actividadesabril19froebel);
			     String[] abril6b=res.getStringArray(R.array.actividadesabril19pmaria);
			     String[] abril6c=res.getStringArray(R.array.actividadesabril19casaazul);
			     String[] abril6d=res.getStringArray(R.array.actividadesabril19pmultiusos);
			    
			     Aa6.add(abril6a);
			     Aa6.add(abril6b);
			     Aa6.add(abril6c);
			     Aa6.add(abril6d);
			    
			     String[] abril6ah=res.getStringArray(R.array.horasabril19froebel);
			     String[] abril6bh=res.getStringArray(R.array.horasabril19pmaria);
			     String[] abril6ch=res.getStringArray(R.array.horasabril19casaazul);
			     String[] abril6dh=res.getStringArray(R.array.horasabril19pmultiusos);
			   
			     Ha6.add(abril6ah);
			     Ha6.add(abril6bh);
			     Ha6.add(abril6ch);
			     Ha6.add(abril6dh);
			     
			     String[] abril7a=res.getStringArray(R.array.actividadesabril25pcans);
			     String[] abril7b=res.getStringArray(R.array.actividadesabril25froebel);
			     String[] abril7c=res.getStringArray(R.array.actividadesabril25casaazul);
			     String[] abril7d=res.getStringArray(R.array.actividadesabril25pmaria);
			     String[] abril7e=res.getStringArray(R.array.actividadesabril25localmusica);
			 
			     Aa7.add(abril7a);
			     Aa7.add(abril7b);
			     Aa7.add(abril7c);
			     Aa7.add(abril7d);
			     Aa7.add(abril7e);
			     
			     String[] abril7ah=res.getStringArray(R.array.horasabril25pcans);
			     String[] abril7bh=res.getStringArray(R.array.horasabril25froebel);
			     String[] abril7ch=res.getStringArray(R.array.horasabril25casaazul);
			     String[] abril7dh=res.getStringArray(R.array.horasabril25pmaria);
			     String[] abril7eh=res.getStringArray(R.array.horasabril25localmusica);
			   
			     Ha7.add(abril7ah);
			     Ha7.add(abril7bh);
			     Ha7.add(abril7ch);
			     Ha7.add(abril7dh);
			     Ha7.add(abril7eh);
			     
			     String[] abril8a=res.getStringArray(R.array.actividadesabril26sa√≠da);
			     String[] abril8b=res.getStringArray(R.array.actividadesabril26rio);
			     String[] abril8c=res.getStringArray(R.array.actividadesabril26froebel);
			     String[] abril8d=res.getStringArray(R.array.actividadesabril26casaazul);
			     String[] abril8e=res.getStringArray(R.array.actividadesabril26pmultiusos);
			    
			     Aa8.add(abril8a);
			     Aa8.add(abril8b);
			     Aa8.add(abril8c);
			     Aa8.add(abril8d);
			     Aa8.add(abril8e);
			     
			     String[] abril8ah=res.getStringArray(R.array.horasabril26sa√≠da);
			     String[] abril8bh=res.getStringArray(R.array.horasabril26rio);
			     String[] abril8ch=res.getStringArray(R.array.horasabril26froebel);
			     String[] abril8dh=res.getStringArray(R.array.horasabril26casaazul);
			     String[] abril8eh=res.getStringArray(R.array.horasabril26pmultiusos);
			     Ha8.add(abril8ah);
			     Ha8.add(abril8bh);
			     Ha8.add(abril8ch);
			     Ha8.add(abril8dh);
			     Ha8.add(abril8eh);

			     int[] resIDs = new int[] {
				 			R.drawable.cero,
				 			R.drawable.uno,
				             R.drawable.dos,
				             R.drawable.tres,
				             R.drawable.cuatro,
				             R.drawable.cinco,
				             R.drawable.seis,
				             R.drawable.siete,
				             R.drawable.ocho,
				            0
				         };
			     switch(dia){
					case 1:
						 for (int i = 0; i <lugabril1.length ; i++) {
					         
					         groupData.add(new group(lugabril1[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa1.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha1.get(i)[j]),(Aa1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 2:
						for (int i = 0; i <lugabril2.length ; i++) {
					         
					         groupData.add(new group(lugabril2[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa2.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha2.get(i)[j]),(Aa2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 3:
						for (int i = 0; i <lugabril3.length ; i++) {
					         
					         groupData.add(new group(lugabril3[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa3.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha3.get(i)[j]),(Aa3.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
						
					case 4:
						for (int i = 0; i <lugabril4.length ; i++) {
					         
					         groupData.add(new group(lugabril4[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa4.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha4.get(i)[j]),(Aa4.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 5:
						for (int i = 0; i <lugabril5.length ; i++) {
					         
					         groupData.add(new group(lugabril5[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa5.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha5.get(i)[j]),(Aa5.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 6:
						for (int i = 0; i <lugabril6.length ; i++) {
					         
					         groupData.add(new group(lugabril6[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa6.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha6.get(i)[j]),(Aa6.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 7:
						for (int i = 0; i <lugabril7.length ; i++) {
					         
					         groupData.add(new group(lugabril7[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa7.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha7.get(i)[j]),(Aa7.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
						
					case 8:
						for (int i = 0; i <lugabril8.length ; i++) {
					         
					         groupData.add(new group(lugabril8[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Aa8.get(i).length; j++) {
					        	 int imagen1=EligeImagenA(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Ha8.get(i)[j]),(Aa8.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
				
					}
			     
			     
			     
			     
			     
				 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
					return exampleAdapter;
				
			
		}
		public int EligeImagenA(int dia,int a,int b){
			int day=dia;
			int i=a;
			int j=b;
			int image=9;
			switch(day){
			
			case 1: switch(i){
					case 0:if(j==0)image=4;else image=9;
					break;
					case 2:if(j==2)image=1;
					break;
					case 4:if(j==0)image=7;
					break;
					default: image=9;
					break;
					}
			break;	
			case 2: switch(i){
					case 0:if(j==0)image=3; else image=9;
					break;
					case 1:if(j==0)image=3;
					break;
					case 4: if(j==0)image=1;
					break;
					default: image=9;
					break;
			}
			break;
			case 3: switch(i){
				case 0:if(j==0)image=4;else image=9;
					break;
					case 1:if(j==0)image=0;
					break;
					case 2:if(j==0)image=5;
					break;
					case 3:if(j==2)image=1;
					break;
					default: image=9;
					break;
			}
			break;
			case 4: switch(i){
					case 0: if(j==0)image=3;else image=9;
					break;
					case 1: if(j==0)image=3;
					break;
					default: image=9;
					break;
			}
			break;
			case 5: switch(i){
					case 0:if(j==0)image=4;else image=9;
					break;
					case 1:if(j==0)image=5;
					break;
					case 2:if(j==0) image=1;
					break;
					case 3:if(j==0)image=3;else image=9;
					break;
					default:image=9;
					break;
			
			}
			break;
			case 6: switch(i){
					case 1:if(j==0)image=3;
					break;
					case 3:if(j==1)image=1;
					break;
					default:image=9;
					break;
			}
			break;
			case 7: switch(i){
					case 0: if(j==0)image=4;
					break;
					case 1: if(j==0)image=0;
					break;
					case 2: if(j==0) image=1;
					break;
					case 3: if(j==0)image=3;
					break;
					default:image=9;
					break;
										
			}
			break;
			case 8: switch(i){
					case 0:  if(j==0)image=0;
					break;
					case 1: if(j==0)image=7;
							if(j==1)image=7;
					break;
					case 4:if(j==2)image=1;
					default:image=9;
					break;
			}
			
			break;
			default: image=9;
			break;
		
			
			}
			return image;
		}

/********************************************MAIO**************************************************/

		Exelistadapter2 rellenamaio(int dia){
			
			
			   ArrayList<group> groupData = new ArrayList<group>();
			     ArrayList<ArrayList<ChildDia>> childData= new ArrayList<ArrayList<ChildDia>>();
			     Resources res =getResources();
			
			  String[] lugmaio1=res.getStringArray(R.array.lugmaio2);
			     String[] lugmaio2=res.getStringArray(R.array.lugmaio3);
			    
			  
			   
			   
			     
			     ArrayList<String[]> Ama1=new ArrayList<String[]>();
			     ArrayList<String[]> Ama2=new ArrayList<String[]>();
			   
			  
			   
			     ArrayList<String[]> Hma1=new ArrayList<String[]>();
			     ArrayList<String[]> Hma2=new ArrayList<String[]>();
	
		
			     String[] maio1a=res.getStringArray(R.array.actividadesmaio2froebel);
			     String[] maio1b=res.getStringArray(R.array.actividadesmaio2casaazul);
			     String[] maio1c=res.getStringArray(R.array.actividadesmaio2prazastamaria);
			     
			     Ama1.add(maio1a);
			     Ama1.add(maio1b);
			     Ama1.add(maio1c);
			 
			     String[] maio1ah=res.getStringArray(R.array.horasmaio2froebel);
			     String[] maio1bh=res.getStringArray(R.array.horasmaio2casaazul);
			     String[] maio1ch=res.getStringArray(R.array.horasmaio2prazastamaria);
			    
			     Hma1.add(maio1ah);
			     Hma1.add(maio1bh);
			     Hma1.add(maio1ch);
			    
			     String[] maio2a=res.getStringArray(R.array.actividadesmaio3);
			     Ama2.add(maio2a);
			  
			     
			     String[] maio2ah=res.getStringArray(R.array.horasmaio3);
			   
			    
			     Hma2.add(maio2ah);
			   
			 
			     
			 Exelistadapter2 exampleAdapter= new Exelistadapter2(this,groupData,childData);
			 int[] resIDs = new int[] {
			 			R.drawable.cero,
			 			R.drawable.uno,
			             R.drawable.dos,
			             R.drawable.tres,
			             R.drawable.cuatro,
			             R.drawable.cinco,
			             R.drawable.seis,
			             R.drawable.siete,
			             R.drawable.ocho,
			            0
			         };
				
				
				  switch(dia){
					case 1:
						 for (int i = 0; i <lugmaio1.length ; i++) {
					         
					         groupData.add(new group(lugmaio1[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama1.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=9;
					            	
					           children.add(new ChildDia((Hma1.get(i)[j]),(Ama1.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
					case 2:
						for (int i = 0; i <lugmaio2.length ; i++) {
					         
					         groupData.add(new group(lugmaio2[i]));
					         ArrayList<ChildDia> children = new ArrayList<ChildDia>();

					         for (int j = 0; j < Ama2.get(i).length; j++) {
					        	 int imagen1=EligeImagenMy(dia,i,j); 
					            	int imagen2=9;
					           children.add(new ChildDia((Hma2.get(i)[j]),(Ama2.get(i)[j]),resIDs[imagen1],resIDs[imagen2]));
					         }
					         childData.add(children);
					     }
						break;
				  }
			     
				  return exampleAdapter;	
			
		}
		
		public int EligeImagenMy(int dia,int a,int b){
			int day=dia;
			int i=a;
			int j=b;
			int image=9;
			switch(day){
			
			case 1: switch(i){
					
				
					case 2:if(j==0)image=3;else image=9;
					break;
					
					default: image=9;
					break;
					}
			break;	
			
			
			
			default: image=9;
			break;
			
			
			}
			return image;
		}
		

	    @Override
		public boolean onChildClick(ExpandableListView parent,View v,int groupPosition,int childPosition,long id) 
	    {
	    	  Bundle datos = this.getIntent().getExtras();
	    	  int mes = datos.getInt("variable_integer");
	    	  int dia= datos.getInt("variable_integer1");
	    	  String[] mensaje={""};
	    	  
	    	  switch(mes){
  			case 1:
  				mensaje= creamensaje1(groupPosition,childPosition,dia);
  			break;
  			case 2:
  				mensaje= creamensaje2(groupPosition,childPosition,dia);
  			break;
  			case 3:
  				mensaje= creamensaje3(groupPosition,childPosition,dia);
  			break;
  			
  			case 4:
  				 mensaje= creamensaje4(groupPosition,childPosition,dia);
  			break;
  			case 5:
 				 mensaje= creamensaje5(groupPosition,childPosition,dia);
 			break;
  		}
  			
	    
	    	
	    	Dialog d=crearDialogoAlerta(groupPosition,childPosition,mensaje);
	    	d.show();
	    	
	         return false;
	    }

	    private String[] creamensaje1(int posg, int posc, int dia)
		{
	    	
	    	 String[] mensaje = {"","",""};
	    	try{
	    	Resources res =getResources();
	 	  
		  
		   
		  
		
			
		    String[] desc=res.getStringArray(R.array.descripciones);	
			
		   ArrayList<String[]> Af1= new ArrayList<String[]>();
		   ArrayList<String[]> df1= new ArrayList<String[]>();

		   
		   
		   switch(dia){
			   case 1:
				   String[]des1={desc[43],desc[7],desc[57],desc[92],desc[13]};
				   String[]des2={desc[107],desc[51],desc[74],desc[72]};
				   String[]des3={desc[20],desc[60]};
				   String[]des4={desc[102]};
				   String[] x1a=res.getStringArray(R.array.actxan31lug1);
				     String[] x1b=res.getStringArray(R.array.actxan31lug2);
				     String[] x1c=res.getStringArray(R.array.actxan31lug3);
				     String[] x1d=res.getStringArray(R.array.actxan31lug4);
				   Af1.add(x1a);
				   Af1.add(x1b);
				   Af1.add(x1c);
				   Af1.add(x1d);
				   df1.add(des1);
				   df1.add(des2);
				   df1.add(des3);
				   df1.add(des4);
				   mensaje[0]=Af1.get(posg)[posc];
				   mensaje[1]=df1.get(posg)[posc];
		   break;
		  
		
			default: mensaje[0]="";
			   mensaje[1]="";}
		  
		   }catch(Exception e){
			   Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT);
			   
		   }
	    	 return mensaje; 
		   }
		 
		
		
	  

		   
		
		
			
			
			
			
		
	    
private String[] creamensaje2(int posg, int posc, int dia)
	{
	
	   String[] mensaje = {"","",""};
	   
	  
	  Resources res =getResources();
	 	  
		  
		   
		  
		
			
		    String[] desc=res.getStringArray(R.array.descripciones);	
			
		   ArrayList<String[]> Af1= new ArrayList<String[]>();
		   ArrayList<String[]> df1= new ArrayList<String[]>();

	    
	     
	 
	    
	     
	   
	    
	     
	  
	 try{
	
	   
	   
	   switch(dia){
		   case 1:
			   String[]des10={desc[12],desc[108],desc[8],desc[58],desc[86],desc[24]};
			   String[]des20={desc[107],desc[95],desc[35]};
			   String[]des30={desc[64]};
			   String[]des40={desc[17],desc[110]};
			   String[]des50={desc[52]};
			   
			   String[] feb10a=res.getStringArray(R.array.actividadesfebrero01froebel);
			     String[] feb10b=res.getStringArray(R.array.actividadesfebrero01casaazul);
			     String[] feb10c=res.getStringArray(R.array.actividadesfebrero01localmusica);
			     String[] feb10d=res.getStringArray(R.array.actividadesfebrero01pavdeportes);
			     String[] feb10e=res.getStringArray(R.array.actividadesfebrero01campos);
			  
			   Af1.add(feb10a);
			   Af1.add(feb10b);
			   Af1.add(feb10c);
			   Af1.add(feb10d);
			   Af1.add(feb10e);
			   
			   df1.add(des10);
			   df1.add(des20);
			   df1.add(des30);
			   df1.add(des40);
			   df1.add(des50);
			   
			   mensaje[0]=Af1.get(posg)[posc];
			   mensaje[1]=df1.get(posg)[posc];
	 
	   break;
	  
	case 2:
	  
		 String[] feb2a=res.getStringArray(R.array.actividadesfebrero07froebel);
	     String[] feb2b=res.getStringArray(R.array.actividadesfebrero07casaazul);
	     String[] feb2c=res.getStringArray(R.array.actividadesfebrero07lmusica);
	     String[] feb2d=res.getStringArray(R.array.actividadesfebrero07pourense);
	    
	     String[]des11={desc[43],desc[25],desc[108],desc[57],desc[73],desc[13]};
		   String[]des21={desc[63],desc[99],desc[109],desc[79],desc[101]};
		   String[]des31={desc[20],desc[60]};
		   String[]des41={desc[47]};
		  
		   Af1.add(feb2a);
		   Af1.add(feb2b);
		   Af1.add(feb2c);
		   Af1.add(feb2d);
		  
		  
		   df1.add(des11);
		   df1.add(des21);
		   df1.add(des31);
		   df1.add(des41);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 3:

		 String[] feb3a=res.getStringArray(R.array.actividadesfebrero08froebel);
	     String[] feb3b=res.getStringArray(R.array.actividadesfebrero08casaazul);
	     String[] feb3c=res.getStringArray(R.array.actividadesfebrero08lmusica);
	     String[] feb3d=res.getStringArray(R.array.actividadesfebrero08multiusos);
	    
	     String[]des13={desc[12],desc[108],desc[58],desc[86],desc[88],desc[24]};
		   String[]des23={desc[107],desc[95],desc[35]};
		   String[]des33={desc[64]};
		   String[]des43={desc[54]};
		  
		   Af1.add(feb3a);
		   Af1.add(feb3b);
		   Af1.add(feb3c);
		   Af1.add(feb3d);
		  
		  
		   df1.add(des13);
		   df1.add(des23);
		   df1.add(des33);
		   df1.add(des43);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 4:
		 String[] feb4a=res.getStringArray(R.array.actividadesfebrero14froebel);
	     String[] feb4b=res.getStringArray(R.array.actividadesfebrero14casaazul);
	     String[] feb4c=res.getStringArray(R.array.actividadesfebrero14lmusica);
	     
	    
	     String[]des14={desc[43],desc[69],desc[75],desc[23],desc[108],desc[73],desc[82],desc[13]};
		   String[]des24={desc[63],desc[6],desc[109],desc[74],desc[72]};
		   String[]des34={desc[15],desc[20],desc[60],desc[11]};
		 
		  
		   Af1.add(feb4a);
		   Af1.add(feb4b);
		   Af1.add(feb4c);
		  
		  
		  
		   df1.add(des14);
		   df1.add(des24);
		   df1.add(des34);
		 
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 5:
		   String[]des15={desc[12],desc[5],desc[108],desc[58],desc[24],desc[86]};
		   String[]des25={desc[107],desc[98],desc[35]};
		   String[]des35={desc[64]};
		   String[]des45={desc[102]};
		   String[]des55={desc[52]};
		   String[] feb5a=res.getStringArray(R.array.actividadesfebrero15froebel);
		     String[] feb5b=res.getStringArray(R.array.actividadesfebrero15casaazul);
		     String[] feb5c=res.getStringArray(R.array.actividadesfebrero15lmusica);
		     String[] feb5d=res.getStringArray(R.array.actividadesfebrero15pmultiusos);
		     String[] feb5e=res.getStringArray(R.array.actividadesfebrero15cherva);
		   Af1.add(feb5a);
		   Af1.add(feb5b);
		   Af1.add(feb5c);
		   Af1.add(feb5d);
		   Af1.add(feb5e);
		   df1.add(des15);
		   df1.add(des25);
		   df1.add(des35);
		   df1.add(des45);
		   df1.add(des55);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
break;

	case 6:
		 String[] feb6a=res.getStringArray(R.array.actividadesfebrero21froebel);
	     String[] feb6b=res.getStringArray(R.array.actividadesfebrero21casaazul);
	     String[] feb6c=res.getStringArray(R.array.actividadesfebrero21lmusica);
	    
	    
	     String[]des16={desc[43],desc[113],desc[106],desc[10],desc[75],desc[108],desc[73],desc[13]};
		   String[]des26={desc[78],desc[74],desc[72]};
		   String[]des36={desc[15],desc[20],desc[60],desc[91]};
		  
		  
		   Af1.add(feb6a);
		   Af1.add(feb6b);
		   Af1.add(feb6c);
		  
		  
		  
		   df1.add(des16);
		   df1.add(des26);
		   df1.add(des36);
		  
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 7:
		 String[] feb7a=res.getStringArray(R.array.actividadesfebrero22froebel);
	     String[] feb7b=res.getStringArray(R.array.actividadesfebrero22casaazul);
	     String[] feb7c=res.getStringArray(R.array.actividadesfebrero22pmultiusos);
	    
	    
	     String[]des17={desc[12],desc[108],desc[115],desc[105],desc[112],desc[112],desc[86]};
		   String[]des27={desc[31],desc[35]};
		   String[]des37={desc[54]};
		  
		  
		   Af1.add(feb7a);
		   Af1.add(feb7b);
		   Af1.add(feb7c);
		  
		  
		  
		   df1.add(des17);
		   df1.add(des27);
		   df1.add(des37);
		  
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 8:
		 String[] feb8a=res.getStringArray(R.array.actividadesfebrero28froebel);
	     String[] feb8b=res.getStringArray(R.array.actividadesfebrero28casaazul);
	     String[] feb8c=res.getStringArray(R.array.actividadesfebrero28lmusica);
	    
	    
	     String[]des18={desc[43],desc[108],desc[73],desc[92],desc[116],desc[113]};
		   String[]des28={desc[107],desc[78],desc[109],desc[74],desc[96]};
		   String[]des38={desc[15],desc[14],desc[30]};
		  
		  
		   Af1.add(feb8a);
		   Af1.add(feb8b);
		   Af1.add(feb8c);
		  
		  
		  
		   df1.add(des18);
		   df1.add(des28);
		   df1.add(des38);
		  
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
		default: mensaje[0]="";
		   mensaje[1]="";
			
	   }
	 
	  } catch(Exception e){
		   Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		   
		  
		  
	  }
	   
	   
	
  

	   
	
	
		
		
		
		return mensaje; 
	}

	    
	private String[] creamensaje3(int posg, int posc, int dia)
	{
		
		 String[] mensaje = {"","",""};
	    	try{
	    	Resources res =getResources();
	 	  
		  
		   
		  
		
			
		    String[] desc=res.getStringArray(R.array.descripciones);	
			
		   ArrayList<String[]> Af1= new ArrayList<String[]>();
		   ArrayList<String[]> df1= new ArrayList<String[]>();

		   
		   
		  switch(dia){
		   case 1:
			   String[]des10={desc[87],desc[108],desc[115],desc[89],desc[92],desc[21]};
			   String[]des20={desc[78],desc[59],desc[109],desc[96]};
			   String[]des30={desc[14],desc[30]};
			   String[]des40={desc[38]};
			  
			   String[] mar1a=res.getStringArray(R.array.actividadesmarzo7froebel);
			     String[] mar1b=res.getStringArray(R.array.actividadesmarzo7casaazul);
			     String[] mar1c=res.getStringArray(R.array.actividadesmarzo7lmusica);
			     String[] mar1d=res.getStringArray(R.array.actividadesmarzo7pavmunicipal);
			     
			  
			   Af1.add(mar1a);
			   Af1.add(mar1b);
			   Af1.add(mar1c);
			   Af1.add(mar1d);
			
			   
			   df1.add(des10);
			   df1.add(des20);
			   df1.add(des30);
			   df1.add(des40);
			  
			   mensaje[0]=Af1.get(posg)[posc];
			   mensaje[1]=df1.get(posg)[posc];
	 
	   break;
	  
	case 2:
	  
		   String[] mar2a=res.getStringArray(R.array.actividadesmarzo14froebel);
		     String[] mar2b=res.getStringArray(R.array.actividadesmarzo14casaazul);
		     String[] mar2c=res.getStringArray(R.array.actividadesmarzo14localmusica);
		     String[] mar2d=res.getStringArray(R.array.actividadesmarzo14pavmunicipal);
	    
	     String[]des11={desc[87],desc[106],desc[29],desc[108],desc[56],desc[89],desc[13]};
		   String[]des21={desc[3],desc[19],desc[72]};
		   String[]des31={desc[14],desc[30]};
		   String[]des41={desc[38]};
		  
		   Af1.add(mar2a);
		   Af1.add(mar2b);
		   Af1.add(mar2c);
		   Af1.add(mar2d);
		  
		  
		   df1.add(des11);
		   df1.add(des21);
		   df1.add(des31);
		   df1.add(des41);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 3:

		  String[] mar3a=res.getStringArray(R.array.actividadesmarzo15froebel);
		     String[] mar3b=res.getStringArray(R.array.actividadesmarzo15casaazul);
		     String[] mar3c=res.getStringArray(R.array.actividadesmarzo15localmusica);
		     String[] mar3d=res.getStringArray(R.array.actividadesmarzo15pavmultiusos);
		     String[] mar3e=res.getStringArray(R.array.actividadesmarzo15cherva);
			    
	    
	     String[]des12={desc[62],desc[71],desc[108],desc[90]};
		   String[]des22={desc[59],desc[109],desc[35]};
		   String[]des32={desc[55],desc[66]};
		   String[]des42={desc[17],desc[110]};
		   String[]des52={desc[52]};
		  
		   Af1.add(mar3a);
		   Af1.add(mar3b);
		   Af1.add(mar3c);
		   Af1.add(mar3d);
		   Af1.add(mar3e);
		  
		  
		   df1.add(des12);
		   df1.add(des22);
		   df1.add(des32);
		   df1.add(des42);
		   df1.add(des52);
		  
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
		break;
	case 4:
		 String[] mar4a=res.getStringArray(R.array.actividadesmarzo21froebel);
	     String[] mar4b=res.getStringArray(R.array.actividadesmarzo21casaazul);
	     String[] mar4c=res.getStringArray(R.array.actividadesmarzo21lmusica);
	     String[] mar4d=res.getStringArray(R.array.actividadesmarzo21pavmunicipal);
	    
		    
    
     String[]des13={desc[87],desc[29],desc[106],desc[108],desc[33],desc[27],desc[89],desc[13]};
	   String[]des23={desc[3],desc[19],desc[50]};
	   String[]des33={desc[14],desc[30]};
	   String[]des43={desc[38]};
	  
	  
	   Af1.add(mar4a);
	   Af1.add(mar4b);
	   Af1.add(mar4c);
	   Af1.add(mar4d);
	   
	  
	  
	   df1.add(des13);
	   df1.add(des23);
	   df1.add(des33);
	   df1.add(des43);
	   
	  
	   mensaje[0]=Af1.get(posg)[posc];
	   mensaje[1]=df1.get(posg)[posc];
	break;
	case 5:
		 String[] mar5a=res.getStringArray(R.array.actividadesmarzo22froebel);
	     String[] mar5b=res.getStringArray(R.array.actividadesmarzo22casaazul);
	     String[] mar5c=res.getStringArray(R.array.actividadesmarzo22localmusica);
	     String[] mar5d=res.getStringArray(R.array.actividadesmarzo22pavmultiusos);
	     String[] mar5e=res.getStringArray(R.array.actividadesmarzo22cherva);
		    
    
     String[]des14={desc[62],desc[71],desc[5],desc[108],desc[34]};
	   String[]des24={desc[61],desc[59],desc[35]};
	   String[]des34={desc[55],desc[66]};
	   String[]des44={desc[102]};
	   String[]des54={desc[52]};
	  
	   Af1.add(mar5a);
	   Af1.add(mar5b);
	   Af1.add(mar5c);
	   Af1.add(mar5d);
	   Af1.add(mar5e);
	  
	  
	   df1.add(des14);
	   df1.add(des24);
	   df1.add(des34);
	   df1.add(des44);
	   df1.add(des54);
	   
	  
	   mensaje[0]=Af1.get(posg)[posc];
	   mensaje[1]=df1.get(posg)[posc];
	break;


	case 6:
		 String[] mar6a=res.getStringArray(R.array.actividadesmarzo28froebel);
	     String[] mar6b=res.getStringArray(R.array.actividadesmarzo28casaazul);
	     String[] mar6c=res.getStringArray(R.array.actividadesmarzo28lmusica);
	     String[] mar6d=res.getStringArray(R.array.actividadesmarzo28pavmunicipal);
	     String[] mar6e=res.getStringArray(R.array.actividadesmarzo28pistas);
		    
    
     String[]des15={desc[87],desc[7],desc[108],desc[26],desc[27],desc[70]};
	   String[]des25={desc[2]};
	   String[]des35={desc[14],desc[30]};
	   String[]des45={desc[38]};
	   String[]des55={desc[59]};
	  
	   Af1.add(mar6a);
	   Af1.add(mar6b);
	   Af1.add(mar6c);
	   Af1.add(mar6d);
	   Af1.add(mar6e);
	  
	  
	   df1.add(des15);
	   df1.add(des25);
	   df1.add(des35);
	   df1.add(des45);
	   df1.add(des55);
	   
	  
	   mensaje[0]=Af1.get(posg)[posc];
	   mensaje[1]=df1.get(posg)[posc];
	break;
	case 7:
		 String[] mar7a=res.getStringArray(R.array.actividadesmarzo29froebel);
	     String[] mar7b=res.getStringArray(R.array.actividadesmarzo29psmaria);
	     String[] mar7c=res.getStringArray(R.array.actividadesmarzo29casaazul);
	     String[] mar7d=res.getStringArray(R.array.actividadesmarzo29lmusica);
	     String[] mar7e=res.getStringArray(R.array.actividadesmarzo29pavmultiusos);
		    
    
     String[]des16={desc[0],desc[62],desc[108],desc[34],desc[28],desc[76],desc[109]};
	   String[]des26={desc[67]};
	   String[]des36={desc[2]};
	   String[]des46={desc[55]};
	   String[]des56={desc[54]};
	  
	   Af1.add(mar7a);
	   Af1.add(mar7b);
	   Af1.add(mar7c);
	   Af1.add(mar7d);
	   Af1.add(mar7e);
	  
	  
	   df1.add(des16);
	   df1.add(des26);
	   df1.add(des36);
	   df1.add(des46);
	   df1.add(des56);
	   
	  
	   mensaje[0]=Af1.get(posg)[posc];
	   mensaje[1]=df1.get(posg)[posc];
	break;
	
		default: mensaje[0]="";
		   mensaje[1]="";
			
	   }
	 
	  } catch(Exception e){
		   Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		   
		  
		  
	  }
		
		
		return mensaje; 
	}

	    
	private String[] creamensaje4(int posg, int posc, int dia)
	{

		 String[] mensaje = {"","",""};
	    	try{
	    	Resources res =getResources();
	 	  
		  
		   
		  
		
			
		    String[] desc=res.getStringArray(R.array.descripciones);	
			
		   ArrayList<String[]> Af1= new ArrayList<String[]>();
		   ArrayList<String[]> df1= new ArrayList<String[]>();

		   
		   
		  switch(dia){
		   case 1:
			   String[]des10={desc[4]};
			   String[]des20={desc[45],desc[108],desc[27],desc[26],desc[70]};
			   String[]des30={"",desc[19],desc[41]};
			   String[]des40={desc[42]};
			   String[]des50={desc[83]};
			  
			   String[] abr1a=res.getStringArray(R.array.actividadesabril4parquecans);
			     String[] abr1b=res.getStringArray(R.array.actividadesabril4froebel);
			     String[] abr1c=res.getStringArray(R.array.actividadesabril4casaazul);
			     String[] abr1d=res.getStringArray(R.array.actividadesabril4localmusica);
			     String[] abr1e=res.getStringArray(R.array.actividadesabril4saida);
			     
			  
			   Af1.add(abr1a);
			   Af1.add(abr1b);
			   Af1.add(abr1c);
			   Af1.add(abr1d);
			   Af1.add(abr1e);
				
			   
			   df1.add(des10);
			   df1.add(des20);
			   df1.add(des30);
			   df1.add(des40);
			   df1.add(des50);
			  
			   mensaje[0]=Af1.get(posg)[posc];
			   mensaje[1]=df1.get(posg)[posc];
	 
	   break;
	  
	case 2:
	  
	  
		   String[]des11={desc[62],desc[108],desc[85]};
		   String[]des21={desc[67]};
		   String[]des31={desc[61],desc[36]};
		   String[]des41={desc[55]};
		   String[]des51={desc[102]};
		   String[]des61={desc[53]};
		   
		   
		   
		   String[] abr2a=res.getStringArray(R.array.actividadesabril5froebel);
		     String[] abr2b=res.getStringArray(R.array.actividadesabril5pmaria);
		     String[] abr2c=res.getStringArray(R.array.actividadesabril5casaazul);
		     String[] abr2d=res.getStringArray(R.array.actividadesabril5localmusica);
		     String[] abr2e=res.getStringArray(R.array.actividadesabril5pabmultiusos);
		     String[] abr2f=res.getStringArray(R.array.actividadesabril5cherva);
		     
		  
		   Af1.add(abr2a);
		   Af1.add(abr2b);
		   Af1.add(abr2c);
		   Af1.add(abr2d);
		   Af1.add(abr2e);
		   Af1.add(abr2f);
		   
		   df1.add(des11);
		   df1.add(des21);
		   df1.add(des31);
		   df1.add(des41);
		   df1.add(des51);
		   df1.add(des61);
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];

  break;
 
	case 3:
		 
		  
		   String[]des12={desc[4]};
		   String[]des22={desc[39],desc[97],desc[97]};
		   String[]des32={desc[103],desc[108],desc[26],desc[27],desc[70],desc[109]};
		   String[]des42={" ",desc[19],desc[41]};
		   String[]des52={desc[42]};
		  
		   
		   
		   String[] abr3a=res.getStringArray(R.array.actividadesabril11pcans);
		     String[] abr3b=res.getStringArray(R.array.actividadesabril11teatro);
		     String[] abr3c=res.getStringArray(R.array.actividadesabril11froebel);
		     String[] abr3d=res.getStringArray(R.array.actividadesabril11casaazul);
		     String[] abr3e=res.getStringArray(R.array.actividadesabril11localmusica);
		     
		     
		  
		   Af1.add(abr3a);
		   Af1.add(abr3b);
		   Af1.add(abr3c);
		   Af1.add(abr3d);
		   Af1.add(abr3e);
		   
		   
		   df1.add(des12);
		   df1.add(des22);
		   df1.add(des32);
		   df1.add(des42);
		   df1.add(des52);
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];

break;
	case 4:
		 
		  
		   String[]des13={desc[62],desc[108],desc[21],desc[65],desc[32]};
		   String[]des23={desc[67]};
		   String[]des33={desc[61],desc[68],desc[36]};
		   String[]des43={desc[54]};
		   String[]des53={desc[53]};
		  
		   
		   
		   String[] abr4a=res.getStringArray(R.array.actividadesabril12froebel);
		     String[] abr4b=res.getStringArray(R.array.actividadesabril12pmaria);
		     String[] abr4c=res.getStringArray(R.array.actividadesabril12casaazul);
		     String[] abr4d=res.getStringArray(R.array.actividadesabril12pabmultiusos);
		     String[] abr4e=res.getStringArray(R.array.actividadesabril12cherva);
		     
		     
		  
		   Af1.add(abr4a);
		   Af1.add(abr4b);
		   Af1.add(abr4c);
		   Af1.add(abr4d);
		   Af1.add(abr4e);
		   
		   
		   df1.add(des13);
		   df1.add(des23);
		   df1.add(des33);
		   df1.add(des43);
		   df1.add(des53);
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];

break;
	case 5:
		  
		   String[]des14={desc[4]};
		   String[]des24={desc[103],desc[77],desc[108],desc[22],desc[27]};
		   String[]des34={desc[41]};
		   String[]des44={desc[16]};
		   String[]des54={desc[42]};
		  
		   
		   
		   String[] abr5a=res.getStringArray(R.array.actividadesabril18pcans);
		     String[] abr5b=res.getStringArray(R.array.actividadesabril18froebel);
		     String[] abr5c=res.getStringArray(R.array.actividadesabril18casaazul);
		     String[] abr5d=res.getStringArray(R.array.actividadesabril18pmaria);
		     String[] abr5e=res.getStringArray(R.array.actividadesabril18localmusica);
		     
		     
		  
		   Af1.add(abr5a);
		   Af1.add(abr5b);
		   Af1.add(abr5c);
		   Af1.add(abr5d);
		   Af1.add(abr5e);
		   
		   
		   df1.add(des14);
		   df1.add(des24);
		   df1.add(des34);
		   df1.add(des44);
		   df1.add(des54);
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];

break;


	case 6:
		   String[]des15={desc[26],desc[114],desc[108],desc[84]};
		   String[]des25={desc[67]};
		   String[]des35={desc[36]};
		   String[]des45={desc[17],desc[110]};
		 
		  
		   
		   
		   String[] abr6a=res.getStringArray(R.array.actividadesabril19froebel);
		     String[] abr6b=res.getStringArray(R.array.actividadesabril19pmaria);
		     String[] abr6c=res.getStringArray(R.array.actividadesabril19casaazul);
		     String[] abr6d=res.getStringArray(R.array.actividadesabril19pmultiusos);
		     
		     
		     
		  
		   Af1.add(abr6a);
		   Af1.add(abr6b);
		   Af1.add(abr6c);
		   Af1.add(abr6d);
		   
		   
		   df1.add(des15);
		   df1.add(des25);
		   df1.add(des35);
		   df1.add(des45);
		  
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];

break;

	
	case 7:
		   String[]des16={desc[4]};
		   String[]des26={desc[1],desc[108],desc[109],desc[80],desc[49],desc[27]};
		   String[]des36={desc[41]};
		   String[]des46={desc[16]};
		   String[]des56={desc[42]};
		  
		   
		   
		   String[] abr7a=res.getStringArray(R.array.actividadesabril25pcans);
		     String[] abr7b=res.getStringArray(R.array.actividadesabril25froebel);
		     String[] abr7c=res.getStringArray(R.array.actividadesabril25casaazul);
		     String[] abr7d=res.getStringArray(R.array.actividadesabril25pmaria);
		     String[] abr7e=res.getStringArray(R.array.actividadesabril25localmusica);
		     
		     
		  
		   Af1.add(abr7a);
		   Af1.add(abr7b);
		   Af1.add(abr7c);
		   Af1.add(abr7d);
		   Af1.add(abr7e);
		   
		   
		   df1.add(des16);
		   df1.add(des26);
		   df1.add(des36);
		   df1.add(des46);
		   df1.add(des56);
		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];

break;
	case 8:		
		
		String[]des17={desc[46]};
	   String[]des27={desc[9],desc[81]};
	   String[]des37={desc[21],desc[108],desc[18],desc[105],desc[93]};
	   String[]des47={" ",desc[61],desc[38]};
	   String[]des57={desc[111]};
	  
	   
	   
	   String[] abr8a=res.getStringArray(R.array.actividadesabril26sa√≠da);
	     String[] abr8b=res.getStringArray(R.array.actividadesabril26rio);
	     String[] abr8c=res.getStringArray(R.array.actividadesabril26froebel);
	     String[] abr8d=res.getStringArray(R.array.actividadesabril26casaazul);
	     String[] abr8e=res.getStringArray(R.array.actividadesabril26pmultiusos);
	     
	     
	  
	   Af1.add(abr8a);
	   Af1.add(abr8b);
	   Af1.add(abr8c);
	   Af1.add(abr8d);
	   Af1.add(abr8e);
	   
	   
	   df1.add(des17);
	   df1.add(des27);
	   df1.add(des37);
	   df1.add(des47);
	   df1.add(des57);
	   
	   mensaje[0]=Af1.get(posg)[posc];
	   mensaje[1]=df1.get(posg)[posc];

break;


		default: mensaje[0]="";
		   mensaje[1]="";
			
	   }
	 
	  } catch(Exception e){
		   Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		   
		  
		  
	  }
		
		
		return mensaje; 
	}

	
		


	    
	private String[] creamensaje5(int posg, int posc, int dia)
	{ String[] mensaje = {"","",""};
	   
	  
	  Resources res =getResources();
	 	  
		  
		   
		  
		
			
		    String[] desc=res.getStringArray(R.array.descripciones);	
			
		   ArrayList<String[]> Af1= new ArrayList<String[]>();
		   ArrayList<String[]> df1= new ArrayList<String[]>();

	    
	     
	 
	    
	     
	   
	    
	     
	  
	 try{
	   
	   switch(dia){
		   	case 1:		
		
		String[]des10={desc[7],desc[108],desc[21],desc[115]};
	   String[]des20={desc[40],desc[101]};
	   String[]des30={desc[16]};
	   	 
	   
	   
	   String[] mai1a=res.getStringArray(R.array.actividadesmaio2froebel);
	     String[] mai1b=res.getStringArray(R.array.actividadesmaio2casaazul);
	     String[] mai1c=res.getStringArray(R.array.actividadesmaio2prazastamaria);
	    
	  
	  
	   Af1.add(mai1a);
	   Af1.add(mai1b);
	   Af1.add(mai1c);
	
	
	   
	   
	   df1.add(des10);
	   df1.add(des20);
	   df1.add(des30);

	   
	   mensaje[0]=Af1.get(posg)[posc];
	   mensaje[1]=df1.get(posg)[posc];

break;
	case 2:
		String[]des11={"Festa final de Noites Abertas, onde daremos remate a esta gran xornada chea de actividades interesantes,˙tiles y divertidas, onde adem·is de aprender cousasnovas pasamos moi bos momentos. Grazas a todos e ata ao ano que ven"};
		   
		   	 
		   
		   
		   String[] mai2a=res.getStringArray(R.array.actividadesmaio3);
		   
		  
		  
		   Af1.add(mai2a);
		 
		
		
		   
		   
		   df1.add(des11);
		 

		   
		   mensaje[0]=Af1.get(posg)[posc];
		   mensaje[1]=df1.get(posg)[posc];
break;
		default: mensaje[0]="";
		   mensaje[1]="";
			
	   }} catch(Exception e){
		   Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		   
		  
		  
	  }
	
  

	   
	
	
		
		
		
		return mensaje; 
	}

		private Dialog crearDialogoAlerta(int posg,int posc, String[] mensaje)
		{
			Context mContext = getApplicationContext();
			

			String[] msj=mensaje;
			
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);
			View layout = inflater.inflate(R.layout.dialog,
			                               (ViewGroup) findViewById(R.id.dialog));

			TextView text = (TextView) layout.findViewById(R.id.text_d1);
			text.setText(msj[0]);
			TextView text2 = (TextView) layout.findViewById(R.id.text_d2);
			text2.setText(msj[1]);
			
			    builder.setView(layout)
			   
			           .setPositiveButton("OK", new DialogInterface.OnClickListener() {
			               @Override
			               public void onClick(DialogInterface dialog, int id) {
			            	   dialog.cancel();
			               }});
			               
			           
			    return builder.create();
			
		}
	
	
	
	
	
	}	


