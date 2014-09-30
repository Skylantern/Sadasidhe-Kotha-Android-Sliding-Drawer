package com.bablabd.sadasidhekotha;

import android.support.v4.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeFragment extends Fragment {
	
	TextView tv;
	ImageView iv;
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
       View rootView = inflater.inflate(R.layout.fragment_home, container, false);
       tv=(TextView) rootView.findViewById(R.id.txtLabel);
       Typeface tf= Typeface.createFromAsset(this.getActivity().getAssets(),"AdorshoLipi.ttf");
        
        tv.setText("বাংলা ভাষা ও সাহিত্যে যে কজন লেখকের অবদান অনস্বীকার্য তাদের মধ্যে মুহাম্মদ জাফর ইকবাল অন্যতম। ঢাকা বিশ্ববিদ্যালয় থেকে পদার্থবিজ্ঞানে স্নাতক ও স্নাতকোত্তর ডিগ্রী নেবার পর যুক্তরাষ্ট্রের ওয়াশিংটন বিশ্ববিদ্যালয় থেকে পিএইচডি ডিগ্রী নেন। ১৯৯৪ সাল পর্যন্ত যুক্তরাষ্ট্রের বিখ্যাত বেল ল্যাবরেটরীতে কাজ করেন। তবে দেশের প্রতি দায়িত্ববোধ থেকেই দেশে ফিরে শাহজালাল বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়ের কম্পিউটার বিজ্ঞান ও প্রকৌশল বিভাগের বিভাগীয় প্রধান হিসেবে যোগ দেন। বৈজ্ঞানিক কল্পকাহিনী, শিশুসাহিত্য ছাড়াও ছোটদের জন্য গণিত ও বিজ্ঞানের বিভিন্ন বই লিখেছেন। তাঁর লেখা একাধিক কিশোর উপন্যাসকে চলচ্চিত্রে রূপ দেয়া হয়েছে। এসব ছাড়াও তিনি একাধিক পত্রিকায় বিভিন্ন প্রসঙ্গে লেখেন। বিজ্ঞান ,গণিত, শিক্ষাব্যবস্থা ছাড়াও দেশ, দেশের বিভিন্ন আলোচিত প্রসঙ্গে কলাম লেখেন তিনি।  বিভিন্ন পত্র পত্রিকায়  তিনি ‘সাদাসিধে কথা’ শিরোনামে লেখেন।  আর এই অ্যাপে সেই সাদাসিধে কথা গুলোই সংকলিত হয়েছে ।");
       tv.setTypeface(tf);
        
         
        return rootView;
    }
}
