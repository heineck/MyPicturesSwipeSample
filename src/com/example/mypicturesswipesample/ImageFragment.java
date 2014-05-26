package com.example.mypicturesswipesample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class ImageFragment extends Fragment {
	
	private final String mTitle;
	private final int mImageResourceId;

	public ImageFragment(String title, int imageResourceId) {
		// TODO Auto-generated constructor stub
		
		mTitle = title;
		mImageResourceId = imageResourceId;
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		View view = inflater.inflate(R.layout.image_layout, container, false);
		ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
		imageView.setImageResource(mImageResourceId);
		
		TextView txtTitle = (TextView)view.findViewById(R.id.txtTitle);
		txtTitle.setText(mTitle);
		
		
		return view;
	}
}
