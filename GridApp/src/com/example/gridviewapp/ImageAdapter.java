package com.example.gridviewapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;
	public ImageAdapter(Context context){
		mContext = context;
	}

	@Override
	public int getCount() {
		return mThumIds.length;
		
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if( convertView == null){
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new LayoutParams(150,150));
			imageView.setScaleType((ImageView.ScaleType.CENTER_CROP));
			imageView.setPadding(5, 5, 5, 5);
		}
		else {

			imageView = (ImageView) convertView;
		}
		imageView.setImageResource(mThumIds[position]);

		return imageView;
	}



	public  Integer[]mThumIds = {
			R.drawable.sample_0, R.drawable.sample_0,
			R.drawable.sample_1,R.drawable.sample_1,
			R.drawable.sample_2,R.drawable.sample_2,
			R.drawable.sample_3,R.drawable.sample_3,
			R.drawable.sample_4,R.drawable.sample_4,
			R.drawable.sample_5,R.drawable.sample_5,
			R.drawable.sample_6,R.drawable.sample_6,


	};
	
}
