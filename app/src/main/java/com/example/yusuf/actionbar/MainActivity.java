package com.example.yusuf.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();
//        actionBar.setBackgroundDrawable(ContextCompat.getDrawable(getApplicationContext(),R.mipmap.client));
//        actionBar.setSubtitle("actionbar  subtitle");
        actionBar.setTitle("actionbar  title");
        actionBar.setLogo(ContextCompat.getDrawable(getApplicationContext(), R.mipmap.classification_selected));
        actionBar.setIcon(ContextCompat.getDrawable(getApplicationContext(), R.mipmap.classification_selected));
        TextView textView = new TextView(getApplicationContext());
        textView.setText("textview by customview");
        actionBar.setCustomView(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
