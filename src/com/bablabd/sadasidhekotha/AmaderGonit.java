package com.bablabd.sadasidhekotha;

import android.support.v4.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.ZoomControls;

public class AmaderGonit extends Fragment {
	TextView tv;
	int x = 16;

	public AmaderGonit() {
		return;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater
				.inflate(R.layout.ganimuktirbangladesh, container, false);
		ZoomControls zoom = (ZoomControls) rootView.findViewById(R.id.zoomc);
		tv = (TextView) rootView.findViewById(R.id.bbltext);
		tv.setTextSize(x);
		zoom.setOnZoomInClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				x = x + 1;
				tv.setTextSize(x);
			}
		});
		zoom.setOnZoomOutClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				x = x - 1;
				tv.setTextSize(x);
			}
		});
		TextView titleTv = (TextView) rootView.findViewById(R.id.title);
		titleTv.setText("আমাদের গণিত অলিম্পিয়াড");

		Typeface tf = Typeface.createFromAsset(this.getActivity().getAssets(),
				"AdorshoLipi.ttf");
		tv.setText("ছোট থাকতে আমাদের শেখানো হয়েছিল, ‘রোগই সংক্রামক স্বাস্থ্য নহে’। যার অর্থ খারাপ বিষয়গুলোই একজন থেকে অন্যরা শেখে, ভালোগুলো শেখে না। বড় হয়ে আবিষ্কার করেছি, আসলে কথাটা সত্যি না—ভালো বিষয়গুলোই একে অন্যের কাছ থেকে শেখে। যার সবচেয়ে বড় উদাহরণ হচ্ছে আমাদের গণিত অলিম্পিয়াড! প্রথম যখন শুরু করা হয়েছিল তখন সবার ভেতরেই একটা দুশ্চিন্তা ছিল, এখন সেই দুশ্চিন্তা নেই। এর ভালো বিষয়গুলো সবাই শিখে গেছে, একজনকে দেখে অন্যজন শিখছে। শুধু তা-ই নয়, গণিতের সঙ্গে সঙ্গে দেশে এখন বিজ্ঞান অলিম্পিয়াড, ইনফরমেটিকস অলিম্পিয়াড, পদার্থবিজ্ঞান অলিম্পিয়াড, রসায়ন অলিম্পিয়াড, প্রাণরসায়ন অলিম্পিয়াড, ভাষা অলিম্পিয়াড, জ্যোতির্বিজ্ঞান অলিম্পিয়াড এমনকি দাবা অলিম্পিয়াড পর্যন্ত আছে। দেখা যাচ্ছে, স্বাস্থ্যই সংক্রামক রোগ নহে! মজার ব্যাপার হচ্ছে, নামে অলিম্পিয়াড হলেও আসলে এগুলো হচ্ছে উৎসব। এই উৎসবে ছোট ছোট ছেলেমেয়ের আনন্দে ছোটাছুটি দেখে মনে হয়, আহা রে! ছোট থাকতে আমাদের জন্য যদি কেউ এগুলো করত, কী মজাই না হতো!\n\nগণিত অলিম্পিয়াড প্রথম যখন শুরু করেছিলাম তখন এর নাম কী হবে, সেটা নিয়ে আমাদের একটু মাথা ঘামাতে হয়েছিল। সেই ছোটবেলা থেকে আমরা বিষয়টাকে ‘অঙ্ক’ বলে আসছি—অঙ্ক বই, অঙ্ক ক্লাস, অঙ্ক স্যার, অঙ্ক পরীক্ষা—গণিত তো কখনো বলিনি। কিন্তু শুদ্ধ করে বললে তো এটাকে গণিত বলতে হবে—অঙ্ক বললে তো হবে না। তাই যা থাকে কপালে বলে আমরা ‘গণিত’ শব্দটাই বেছে নিয়েছিলাম। এত দিন পর দেখা যাচ্ছে, গণিত শব্দটা কী সুন্দর আমাদের মনে গেঁথে গেছে! বরং অঙ্ক বললেই জানি কেমন কেমন লাগে।\n\nযখন এটা লিখছি, তখন শাহবাগে তরুণ প্রজন্ম যুদ্ধাপরাধীদের বিচারের জন্য বিস্ময়কর একটা আন্দোলন শুরু করেছে। দিনরাত ২৪ ঘণ্টা সেই চত্বর স্লোগানে স্লোগানে উত্তাল। কী বিচিত্র মনোমুগ্ধকর প্রাণবন্ত আর তেজি সেই সব স্লোগান। সেটা দেখে আমার মাথায় নতুন একটা আইডিয়া এসেছে, এ দেশে গণিত অলিম্পিয়াডের মতো ‘স্লোগান অলিম্পিয়াড’ শুরু করে দিলে কেমন হয়!\n\nসহসভাপতি: বাংলাদেশ গণিত অলিম্পিয়াড কমিটি\n\n\n\n");
		titleTv.setTypeface(tf);
		tv.setTypeface(tf);
		return rootView;
	}
}
