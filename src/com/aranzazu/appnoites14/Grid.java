package com.aranzazu.appnoites14;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.aranzazu.appnoites14.R;

public class Grid extends Activity{

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
   this.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
   
    setContentView(R.layout.grid);
    getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title);
    Intent returnIntent = new Intent();
    returnIntent.putExtra("result",1);
    setResult(RESULT_OK,returnIntent);     
    
}
}