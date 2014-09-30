package com.bablabd.sadasidhekotha;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class AboutUs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.aboutus);
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setClickable(true);
		tv.setMovementMethod(LinkMovementMethod.getInstance());
		String text = "<a href='http://www.bablabd.com'>Anisuzzaman Babla</a>";
		tv.setText(Html.fromHtml(text));

		TextView textview4 = (TextView) findViewById(R.id.textView4);
		textview4.setClickable(true);
		textview4.setMovementMethod(LinkMovementMethod.getInstance());
		String text1 = "<a href='http://fb.com/anisuzzamanbabla'>fb.com/anisuzzamanbabla</a>";
		textview4.setText(Html.fromHtml(text1));
	}
}
