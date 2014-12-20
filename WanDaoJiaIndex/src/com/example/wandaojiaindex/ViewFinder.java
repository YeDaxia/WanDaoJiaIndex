package com.example.wandaojiaindex;

import android.app.Activity;
import android.view.View;

public class ViewFinder {
 
	@SuppressWarnings("unchecked")
	public static <T extends View> T findViewById(View convertView ,int id){
		return (T)convertView.findViewById(id);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends View> T findViewById(Activity activity ,int id){
		return activity==null ? null : (T)activity.findViewById(id);
	}
	
}
