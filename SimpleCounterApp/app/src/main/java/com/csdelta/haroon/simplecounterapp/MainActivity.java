package com.csdelta.haroon.simplecounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button toastBtn, countBtn;
    TextView countTextView;
    static  int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastBtn = (Button) findViewById(R.id.toast_btn);
        countBtn = (Button) findViewById(R.id.count_btn);
        countTextView = (TextView) findViewById(R.id.countTextView);

        toastBtn.setOnClickListener(this);
        countBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.toast_btn){
            showToast();
        }
        else if(id == R.id.count_btn){
            countByOne();
        }
    }

    void showToast(){
        Toast.makeText(this,"Toast Button Clicked",Toast.LENGTH_SHORT).show();
    }

    void countByOne(){
        count++;
       // Toast.makeText(this,"count Button Clicked",Toast.LENGTH_SHORT).show();
        countTextView.setText(Integer.toString(count));
    }
}
