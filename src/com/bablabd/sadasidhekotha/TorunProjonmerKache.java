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

public class TorunProjonmerKache  extends Fragment {
	TextView tv;
	int x=16;


	public TorunProjonmerKache(){
		return;
	}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.ganimuktirbangladesh, container, false);
       ZoomControls zoom = (ZoomControls) rootView.findViewById(R.id.zoomc);
        tv = (TextView) rootView.findViewById(R.id.bbltext);
        tv.setTextSize(x);
        zoom.setOnZoomInClickListener(new OnClickListener() {
			
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			x=x+1;
    			tv.setTextSize(x);
    		}
    	});
        zoom.setOnZoomOutClickListener(new View.OnClickListener() {
			
    		@Override
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			
    			x=x-1;
    			tv.setTextSize(x);
    		}
    	});
       TextView titleTv=(TextView)rootView.findViewById(R.id.title);
       titleTv.setText("তরুন প্রজন্মের কাছে প্রার্থনা");
       
        Typeface tf= Typeface.createFromAsset(this.getActivity().getAssets(),"AdorshoLipi.ttf");
        tv.setText("খুব সহজে আমার মন খারাপ হয় না কিন্তু গত কয়েকদিন থেকে আমার খুব মন খারাপ। যারা এক নজর পত্রিকার দিকে তাকাবে কিংবা টেলিভিশনে খবর শুনবে তাদেরও মন খারাপ হয়ে যাবে। শুধু মাত্র হিন্দু ধর্মাবলম্বী বলে এই দেশে মানুষের ঘর বাড়ী পুড়িয়ে দেয়া হচ্ছে। ভয়ে আতংকে জীবন বাঁচাবার জন্যে এই মানুষগুলো নিজেদের বাড়ীঘর ছেড়ে নিরাপদ আশ্রয়ের খোঁজে ছুটছে। বাড়ীর মেয়েদের বাড়ী থেকে সরিয়ে দিচ্ছে। ১৯৭১ সালে হিন্দু মুসলমান সবাই আক্রান্ত হয়েছিল। মুসলমান হলে কখনো কখনো হয়তো মানুষ বেঁচে গিয়েছে কিন্তু হিন্দু হলে পাকিস্তান সেনাবাহিনীর হাত থেকে কেউ কখনো প্রানে বেঁচে ফিরে আসেনি। ১৯৭১ সালে আমরা গ্রামে লুকিয়ে আছি তখন দেখেছি একজন হিন্দু মা তার শিশু সন্তানকে বুকে চেপে ধরে স্বামীর পিছু পিছু ছুটে যাচ্ছে, তাদের চোখ মুখের সেই উদভ্রান্ত অসহায় দৃষ্টি আমি কখনো ভুলতে পারব না। তেতাল্লিশ বছর পর এই বাংলাদেশে এখনো একজন অসহায় হিন্দু মা তার সন্তানকে বুকে চেপে প্রাণ বাঁচানোর জন্যে ছুটে যাচ্ছে। তার মানে যে দেশকে নিয়ে আমরা এতো গর্ব করি সেই দেশটি আসলে তেতাল্লিশ বছরে এক ইঞ্চিও সামনে অগ্রসর হয়নি। এর চাইতে বড় দুঃখ লজ্জা আর অপমান কী হতে পারে?\nআমি মাঝে মাঝে কল্পনা করি আমি যদি এই দেশে একজন হিন্দু ধর্মাবলম্বী হতাম তাহলে আমার কেমন লাগতো। আমি জানি তাহলে গভীর হতাশায় আমার বুক ভেঙ্গে যেতো, আমি কোন দোষ করিনি কিন্তু শুধুমাত্র একটি হিন্দু পরিবারে জন্ম নিয়েছি বলে আমার উপর যে নৃশংস অত্যাচার করা হচ্ছে তার জন্য আমার বুকে যেটুকু ক্ষোভ জন্ম নিতো তার চাইতে শতগুন বেশী অভিমান হতো আমার চারপাশের নির্লিপ্ত মানুষজনকে দেখে। কেউ কোনো কথা বলছে না, নীরবে এক ধরণের করুনা নিয়ে আমাকে দেখছে। সম্ভবত সবচেয়ে বেশী ক্ষোভ হতো রাজনৈতিক দল গুলোর উপর, প্রতিবার নির্বাচনের পর, যুদ্ধাপরাধীদের বিচারের রায় হবার পর, রায় কার্যকর হবার পর আমাদের উপর হামলা করা হবে। বিএনপি জামাত হামলা করবে, আওয়ামীলীগ বা বামদলগুলো সেটা ঘটতে দেবে। খুব বেশী হলে নিরাপদ দুরত্ব থেকে প্রতিবাদ করবে কিন্তু বুক আগলে কেউ রক্ষা করতে এগিয়ে আসবে না। এই দেশে আমি যদি হিন্দু ধর্মাবলম্বী হতাম তাহলে নিশ্চয়ই আমার বার বার মনে হতো আমি এই দেশের মানুষ কিন্তু এই দেশটি আমাকে রক্ষা করছে না। আমি নিশ্চয়ই সৃষ্টিকর্তার কাছে অভিযোগ করে বলতাম তুমি কেন আমাকে এমন একটি দেশে জন্ম দিয়েছ যেই দেশ আমাকে রক্ষা করার দায়িত্ব নেয় না? সেই দেশে আমাকে প্রতি মূহুর্তে আতংকে থাকতে হয়? কিন্তু আমি হিন্দু ধর্মাবলম্বী নই, তাই প্রকৃতপক্ষে তাদের বুকের ভেতর যে গভীর দুঃখ ক্ষোভ হতাশা আর অভিমান পুঞ্জীভূত হয়ে আছে আমি সেটা কোনোদিন অনুভব করতে পারব না।\nআমাদের প্রিয় দেশটি নিয়ে আমাদের কত কল্পনা , কত স্বপ্ন। আমরা আশা করে আছি আমাদের দেশের ছেলেমেয়েরা লেখাপড়া করবে, জ্ঞান বিজ্ঞানে এগিয়ে যাবে একদিন দেশটা মাথা তুলে দাঁড়াবে। আমরা এর মাঝে সেগুলো এই দেশে শুরু হতে দেখেছি। কিন্তু এই মূহুর্তে আমার কাছে সবকিছু অর্থহীন বলে মনে হচ্ছে। যদি আমরা একজন মানুষকে শুধুমাত্র ভিন্ন ধর্মাবলম্বী হওয়ার জন্যে এই দেশে তাকে নিরাপত্তা দিতে না পারি তাহলে এই দেশটি কাদের জন্যে? আমার মনে হয় এই দেশ নিয়ে আমাদের যত কল্পনা, যত স্বপ্ন, যত পরিকল্পনা সবকিছুকে পিছনে সরিয়ে সবার আগে আমাদের এখন একটি মাত্র লক্ষ্যকে টেনে নিয়ে আসতে হবে। সেই লক্ষ্যটি হচ্ছে এই দেশে একটি হিন্দু শিশু যেন নিশ্চিন্ত নিরাপত্তায় তার মায়ের বুকে মাথা রেখে ঘুমাতে পারে। গভীর রাতে ধর্মান্ধ মানুষের উন্মত্ত চিৎকারে তাদের যেন জেগে উঠতে না হয়, আগুনের লেলিহান শিখায় আপনজনের আতংকিত মুখ দেখতে না হয়। একজন হিন্দু কিশোরীকে যেন তার বাবার রক্তশূন্য মুখের দিকে তাকিয়ে থরথর করে কাঁপতে কাঁপতে যেন বলতে না হয়,''এখন কী হবে বাবা?''\nআমরা পদ্মা সেতু চাই না, নিরবিচ্ছিন্ন বিদ্যুৎ চাই না, যানজটমুক্ত বাংলাদেশ চাই না, শতকরা একশভাগ নিরক্ষর চাই না, ক্ষুধামুক্ত বাংলাদেশ চাই না শুধুমাত্র হিন্দু এবং অন্য সব ধর্মের মানুষের নিরাপত্তা চাই যেন তারাও ঠিক আমাদের মত এই দেশটিকে তাদের নিজেদের ভালোবাসার দেশ বলে ভাবতে পারে। তীব্র অভিমানে তাদের বুক ভেঙ্গে যেন আর কোনোদিন খান খান হয়ে না যায়।\nআমি কার কাছে এটি চাইব জানি না, তাই তরুন প্রজন্মের কাছে চাইছি। তোমরা আমাদেরকে একটি নূতন বাংলাদেশ উপহার দাও। যে বাংলাদেশ থেকে সাম্প্রদায়িকতার বিষ বাষ্প চিরদিনের জন্যে মুছে দেয়া হবে। আমি জানি তোমরা পারবে।\n১১-০১-২০১৪\n\n\n\n");
        titleTv.setTypeface(tf);
        tv.setTypeface(tf);
        return rootView;
    }
}

