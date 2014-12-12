package com.miapsoft.leftmenu.activity;

import com.example.leftmenu.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * 
 * @author liyakun
 * 创建时间：2014年12月12日
 */
public class MainActivity extends Activity implements OnClickListener{
    
	Button but;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initobj();
	}
	
	public void initobj(){
		but=(Button) findViewById(R.id.but_main);
		but.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
       switch (arg0.getId()) {
	case R.id.but_main:
		Intent i = new Intent(this,MenuActivity.class);
		startActivity(i);
		overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
		break;

	default:
		break;
	}		
	}
	
	

}
