package com.example.mypicturesswipesample;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class PicturesActivity extends FragmentActivity {
	
	private MyAdapter mAdapter;
	private ViewPager mPager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_pictures);
		
		mPager = (ViewPager) findViewById(R.id.pager);
		
		mAdapter = new MyAdapter(getSupportFragmentManager());
		
		mPager.setAdapter(mAdapter);
		
	}
	
	public static class MyAdapter extends FragmentPagerAdapter {
		
		ArrayList<String> mImgTitles = null;
		ArrayList<Integer> mImgResourceId = null;
		
		public MyAdapter(FragmentManager fm) {
			super(fm);
			
			mImgTitles = new ArrayList<String>();
			mImgTitles.add("Avião 1");
			mImgTitles.add("Avião 2");
			mImgTitles.add("Avião 3");
			
			mImgResourceId = new ArrayList<Integer>();
			mImgResourceId.add(R.drawable.img1);
			mImgResourceId.add(R.drawable.img2);
			mImgResourceId.add(R.drawable.img3);
			
		}

		@Override
		public int getCount() {
			return mImgTitles.size();
		}

		@Override
		public Fragment getItem(int position) {
			
			
			return new ImageFragment(mImgTitles.get(position), mImgResourceId.get(position).intValue());
			
			
			/*switch (position) {
			case 0:
				return new ImageFragment();
			case 1:
				return new ImageFragment(R.drawable.human);
			case 2:
				return new ImageFragment(R.drawable.logo);

			default:
				return null;
			}*/
		}
	}
}
