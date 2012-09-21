package com.sweng.sweng_tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class HelloWorldActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hello_world, menu);
        return true;
    }
    
    public void displayMessage(View view) {
    	Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
    }
}
