package com.example.geetanshsharma.love_punjab;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        CardView about=findViewById(R.id.about);
        CardView collages=findViewById(R.id.collages);
        CardView university=findViewById(R.id.univerties);
        overridePendingTransition(R.anim.transion,R.anim.out);
        university.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message2(view);
            }
        });
        collages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message1(view);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message(view);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.transion,R.anim.out);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message(View view)
    {
        Intent intent=new Intent(this,abouteducation.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(education.this,findViewById(R.id.aboutedid),"aboutedshared");
        startActivity(intent, optionsCompat.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message1(View view)
    {
        Intent intent=new Intent(this,collages.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(education.this,findViewById(R.id.schoolid),"schoolshared");
        startActivity(intent, optionsCompat.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message2(View view)
    {
        Intent intent=new Intent(this,universities.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(education.this,findViewById(R.id.univerid),"univershared");
        startActivity(intent, optionsCompat.toBundle());

    }
}
