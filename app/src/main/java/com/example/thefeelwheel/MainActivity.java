package com.example.thefeelwheel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
TextView tvfeel,tvstress,tvgrief,tvanxiety,tvanger,tvfear,tvdepres;
int count=0;

TextView tvtype1,tvsolutions1,tvcontact1,tvtype2,tvsolutions2,tvcontact2,tvtype3,tvsolutions3,tvcontact3,tvtype4,tvsolutions4,tvcontact4,tvtype5,tvsolutions5,tvcontact5,tvtype6,tvsolutions6,tvcontact6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvfeel=(TextView)findViewById(R.id.tvfeel);
        tvstress=(TextView)findViewById(R.id.tvstress);
        tvgrief=(TextView)findViewById(R.id.tvgrief);
        tvanxiety=(TextView)findViewById(R.id.tvanxiety);
        tvanger=(TextView)findViewById(R.id.tvanger);
        tvfear=(TextView)findViewById(R.id.tvfear);
        tvdepres=(TextView)findViewById(R.id.tvdepres);
        tvtype1=(TextView)findViewById(R.id.tvtype1);
        tvsolutions1=(TextView)findViewById(R.id.tvsolutions1);
        tvcontact1=(TextView)findViewById(R.id.tvcontact1);
        tvtype2=(TextView)findViewById(R.id.tvtype2);
        tvsolutions2=(TextView)findViewById(R.id.tvsolutions2);
        tvcontact2=(TextView)findViewById(R.id.tvcontact2);
        tvtype3=(TextView)findViewById(R.id.tvtype3);
        tvsolutions3=(TextView)findViewById(R.id.tvsolutions3);
        tvcontact3=(TextView)findViewById(R.id.tvcontact3);
        tvtype4=(TextView)findViewById(R.id.tvtype4);
        tvsolutions4=(TextView)findViewById(R.id.tvsolutions4);
        tvcontact4=(TextView)findViewById(R.id.tvcontact4);
        tvtype5=(TextView)findViewById(R.id.tvtype5);
        tvsolutions5=(TextView)findViewById(R.id.tvsolutions5);
        tvcontact5=(TextView)findViewById(R.id.tvcontact5);
        tvtype6=(TextView)findViewById(R.id.tvtype6);
        tvsolutions6=(TextView)findViewById(R.id.tvsolutions6);
        tvcontact6=(TextView)findViewById(R.id.tvcontact6);
        tvfeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvstress.setVisibility(View.VISIBLE);
                tvgrief.setVisibility(View.VISIBLE);
                tvanger.setVisibility(View.VISIBLE);
                tvanxiety.setVisibility(View.VISIBLE);
                tvfear.setVisibility(View.VISIBLE);
                tvdepres.setVisibility(View.VISIBLE);
                tvtype1.setVisibility(View.GONE);
                tvsolutions1.setVisibility(View.GONE);
                tvcontact1.setVisibility(View.GONE);
                tvtype2.setVisibility(View.GONE);
                tvsolutions2.setVisibility(View.GONE);
                tvcontact2.setVisibility(View.GONE);
                tvtype3.setVisibility(View.GONE);
                tvsolutions3.setVisibility(View.GONE);
                tvcontact3.setVisibility(View.GONE);
                tvtype4.setVisibility(View.GONE);
                tvsolutions4.setVisibility(View.GONE);
                tvcontact4.setVisibility(View.GONE);
                tvtype5.setVisibility(View.GONE);
                tvsolutions5.setVisibility(View.GONE);
                tvcontact5.setVisibility(View.GONE);
                tvtype6.setVisibility(View.GONE);
                tvsolutions6.setVisibility(View.GONE);
                tvcontact6.setVisibility(View.GONE);
                tvstress.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in));
                tvanger.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in));
                tvdepres.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in));
                tvfear.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in));
                tvanxiety.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in));
                tvgrief.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,android.R.anim.fade_in));
            }
        });
        tvstress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvtype1.setVisibility(View.VISIBLE);
                tvcontact1.setVisibility(View.VISIBLE);
                tvsolutions1.setVisibility(View.VISIBLE);
            }
        });
        tvtype1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,Stress.class);
                startActivity(i);
            }
        });
    }
}