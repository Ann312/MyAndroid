package com.example.myfirstdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RelativeLayout;
import android.widget.TextView;
/**
 * 如果想看源码:选中想看的对象或者方法  ctrl+鼠标左键
 * @author sxy
 *
 */
public class MainActivity extends Activity {
	
	private  TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
        //根据id找出布局中的控件
        tv  = (TextView) findViewById(R.id.tv);
        
      
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
