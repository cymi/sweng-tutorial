package com.sweng.sweng_tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
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
    	
    	
    	Toast.makeText(this, "You clicked Display!", Toast.LENGTH_SHORT).show();
    	Intent displayActivityIntent = new Intent(this,ShowMessageActivity.class);
    	
    	EditText editText = (EditText) findViewById(R.id.edit_text);
    	String message = editText.getText().toString();
    	
    	displayActivityIntent.putExtra(this.getClass().getName(), message);
    	startActivity(displayActivityIntent);
    }
}
