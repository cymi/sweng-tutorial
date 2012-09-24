package com.sweng.sweng_tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class ShowMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_message);
        
        Intent startingIntent = getIntent();
        
        String message = startingIntent.getStringExtra(HelloWorldActivity.class.getName());
        TextView textView = (TextView) findViewById(R.id.displayed_text);
        textView.setText(message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.show_message, menu);
        return true;
    }
}
