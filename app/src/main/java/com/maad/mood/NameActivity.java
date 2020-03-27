package com.maad.mood;

import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    TextView tv;
    FrameLayout fl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        tv = findViewById(R.id.tv_name);
        String name = getIntent().getStringExtra("Meow");
        tv.setText(name);
        fl = findViewById(R.id.container);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.item_android:
                Typeface type = ResourcesCompat.getFont(this, R.font.android);
                tv.setTypeface(type);
                fl.setBackgroundResource(R.drawable.android);
                tv.setTextColor(getResources().getColor(R.color.green));
                return true;

            case R.id.item_egypt:
                Typeface type2 = ResourcesCompat.getFont(this, R.font.egypt);
                tv.setTypeface(type2);
                fl.setBackgroundResource(R.drawable.egypt);
                tv.setTextColor(getResources().getColor(R.color.egypt));
                return true;

            case R.id.item_fire:
                Typeface type3 = ResourcesCompat.getFont(this, R.font.fire);
                tv.setTypeface(type3);
                fl.setBackgroundResource(R.drawable.fire);
                tv.setTextColor(getResources().getColor(R.color.orange));
                return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
