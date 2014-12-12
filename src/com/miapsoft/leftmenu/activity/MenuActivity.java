package com.miapsoft.leftmenu.activity;

import com.example.leftmenu.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class MenuActivity extends Activity implements OnClickListener{
    
	
	
	LinearLayout linear_first;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shaixuan_dialog);
		linear_first=(LinearLayout) findViewById(R.id.linear_first);
		linear_first.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				finish();
				overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
				return false;
			}
		});
	}

	@Override
	public void onClick(View arg0) {
		
	}
	
    @Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
    	finish();
		overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
		return super.onKeyDown(keyCode, event);
	};

}
