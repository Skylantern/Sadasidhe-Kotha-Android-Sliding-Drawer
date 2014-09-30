package com.bablabd.sadasidhekotha;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Splash extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash);
		TextView sada=(TextView)findViewById(R.id.sada); 
		TextView zi=(TextView)findViewById(R.id.zi);
		Typeface tf = Typeface.createFromAsset(Splash.this.getAssets(),
				"AdorshoLipi.ttf");
		sada.setText("সাদাসিধে কথা");
		sada.setTypeface(tf);
		sada.setTextSize(44);
		
		
		zi.setText("মুহম্মদ জাফর ইকবাল");
		zi.setTypeface(tf);
		zi.setTextSize(24);
		
		
		
		
		
		 /****** Create Thread that will sleep for 5 seconds *************/        
        Thread background = new Thread() {
            public void run() {
                 
                try {
                    // Thread will sleep for 5 seconds
                    sleep(3*1000);
                     
                    // After 3 seconds redirect to another intent
                    Intent it=new Intent(Splash.this,MainActivity.class);
                    startActivity(it);
                     
                    //Remove activity
                    finish();
                     
                } catch (Exception e) {
                 
                }
            }
        };
         
        // start thread
        background.start();
	}

}
