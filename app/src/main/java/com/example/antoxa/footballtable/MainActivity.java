package com.example.antoxa.footballtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  String TAG;
    private Integer loko = 0;
    private Integer cska = 0;

    public void onClickButtonLoko(View view){
        loko++;
        TextView textView = findViewById(R.id.loko);
        textView.setText(loko.toString());
    }

    public void onClickButtonCska(View view){
        cska++;
        TextView textView = findViewById(R.id.cska);
        textView.setText(cska.toString());
    }

    public void onClickButtonReset(View view){
        loko = 0;
        cska = 0;
        TextView textView = findViewById(R.id.loko);
        textView.setText(loko.toString());
        TextView textView1 = findViewById(R.id.cska);
        textView1.setText(cska.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView textView = findViewById(R.id.loko);
        textView.setText(loko.toString());

        TextView textView1 = findViewById(R.id.cska);
        textView1.setText(cska.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("loko", loko);
        Log.d(TAG, "onSaveInstanceState");
        outState.putInt("cska", cska);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("loko")) {
            loko = savedInstanceState.getInt("loko");
        }

        if (savedInstanceState != null &&
                savedInstanceState.containsKey("cska")) {
            cska = savedInstanceState.getInt("cska");
        }

        Log.d(TAG, "onRestoreInstanceState");
    }

}
