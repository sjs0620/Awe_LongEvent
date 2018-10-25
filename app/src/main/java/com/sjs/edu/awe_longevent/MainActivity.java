package com.sjs.edu.awe_longevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{

    Button btn1,btn2,btn3,btn4;
    TextView textV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn1.setOnLongClickListener(this);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn2.setOnLongClickListener(this);
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn3.setOnLongClickListener(this);
        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn4.setOnLongClickListener(this);

        textV2 = (TextView)findViewById(R.id.textView2);
    }

    @Override
    public void onClick(View v) {
        String text;
        int id = v.getId();

        switch (id){
            case R.id.btn1:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn2:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn3:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn4:
                text =  ((Button)v).getText().toString(); break;
            default:
                text = "Nothing!!";
        }
        textV2.setText(text);
//        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onLongClick(View v) {
        String text;
        int id = v.getId();

        switch (id){
            case R.id.btn1:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn2:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn3:
                text =  ((Button)v).getText().toString(); break;
            case R.id.btn4:
                text =  ((Button)v).getText().toString(); break;
            default:
                text = "Nothing!!";
        }
        text = text + " Long!!! ";
        textV2.setText(text);

        return false;
    }
}