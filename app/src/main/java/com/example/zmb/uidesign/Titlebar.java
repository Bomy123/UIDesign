package com.example.zmb.uidesign;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Sky000 on 2016/9/3.
 */
public class Titlebar extends LinearLayout{
    public Titlebar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.titlebar,this);
        Button rebtn = (Button) findViewById(R.id.rebtn);
        Button yesbtn = (Button) findViewById(R.id.yesbtn);
        rebtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        yesbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"you click yes button!",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
