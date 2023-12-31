package com.example.exploringlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        Toast.makeText(this, "In onCreate", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "In onStart", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "In onResume", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this, "In onPause", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "In onStop", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "In onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("info", "In onDestroy");
    }

    public void loadConstrainLayout(View v) {
        setContentView(R.layout.activity_main);
    }

    public void loadTableLayout(View v) {
        setContentView(R.layout.my_table_layout);
    }

    public void loadMenuLayout(View v) {
        setContentView(R.layout.main_menu);
    }
}