package com.maad.mood;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view) {
        TextInputEditText editText = findViewById(R.id.et);
        String writtenName = editText.getText().toString();
        Intent i = new Intent(this, NameActivity.class);
        i.putExtra("Meow", writtenName);
        startActivity(i);
    }
}
