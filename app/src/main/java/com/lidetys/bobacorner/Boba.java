package com.lidetys.bobacorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Color;

public class Boba extends AppCompatActivity{

    //initialise Variable
    //[Type] [varName];
    ImageView imgBoba;
    Button btn25;
    Button btn50;
    Button btn75;
    Button btn100;
    TextView txtMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boba_layout);

        //Assign Value to Variables:
        //[varName] = [value];
        imgBoba = findViewById(R.id.img_boba);
        btn25 = findViewById(R.id.btn_25);
        btn50 = findViewById(R.id.btn_50);
        btn75 = findViewById(R.id.btn_75);
        btn100=findViewById(R.id.btn_100);
        txtMsg = findViewById(R.id.txt_message);

        //setcolor
        btn25.setBackgroundColor(Color.GRAY);
        btn50.setBackgroundColor(Color.GRAY);
        btn75.setBackgroundColor(Color.GRAY);
        btn100.setBackgroundColor(Color.GRAY);


    } //end of onCreate


    public void clickBtn0(View view)
    {
        txtMsg.setText("0%");
        btn25.setBackgroundColor(Color.GRAY);
        btn50.setBackgroundColor(Color.GRAY);
        btn75.setBackgroundColor(Color.GRAY);
        btn100.setBackgroundColor(Color.GRAY);

    }

    public void clickBtn25(View view)
    {
        txtMsg.setText("25%");
        btn25.setBackgroundColor(Color.parseColor("#00FF00"));
        btn50.setBackgroundColor(Color.GRAY);
        btn75.setBackgroundColor(Color.GRAY);
        btn100.setBackgroundColor(Color.GRAY);

    }
    public void clickBtn50(View view)
    {
        txtMsg.setText("50%");
        btn25.setBackgroundColor(Color.parseColor("#00FF00"));
        btn50.setBackgroundColor(Color.parseColor("#00FF00"));
        btn75.setBackgroundColor(Color.GRAY);
        btn100.setBackgroundColor(Color.GRAY);

    }

    public void clickBtn75(View view)
    {
        txtMsg.setText("75%");
        btn25.setBackgroundColor(Color.parseColor("#00FF00"));
        btn50.setBackgroundColor(Color.parseColor("#00FF00"));
        btn75.setBackgroundColor(Color.parseColor("#00FF00"));
        btn100.setBackgroundColor(Color.GRAY);

    }

    public void clickBtn100(View view)
    {
        txtMsg.setText("100%");
        btn25.setBackgroundColor(Color.parseColor("#00FF00"));
        btn50.setBackgroundColor(Color.parseColor("#00FF00"));
        btn75.setBackgroundColor(Color.parseColor("#00FF00"));
        btn100.setBackgroundColor(Color.parseColor("#00FF00"));

    }

}
