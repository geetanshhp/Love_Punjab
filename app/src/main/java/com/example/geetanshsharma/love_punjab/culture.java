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

public class culture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);
        CardView food=findViewById(R.id.food);
        CardView festival=findViewById(R.id.festival);
       CardView dance =findViewById(R.id.dance);
       CardView religion=findViewById(R.id.religion);
        CardView clothing=findViewById(R.id.clothing);
       CardView music=findViewById(R.id.music);


        overridePendingTransition(R.anim.transion,R.anim.out);



        clothing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message6(view);
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message5(view);
            }
        });
        religion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message4(view);
            }
        });
        dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message3(view);
            }
        });
        festival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message2(view);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
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
        Intent  intent=new Intent(this,food.class);
        ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation(culture.this,findViewById(R.id.foodid),"foodshared");
        startActivity(intent, optionsCompat.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public  void message2(View view)
    {
        Intent intent=new Intent(this,festival.class);
        ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation(culture.this,findViewById(R.id.festivalid),"festivalshared");
        startActivity(intent, optionsCompat.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message3(View view)
    {
        Intent intent=new Intent(this,dance.class);
        ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation(culture.this,findViewById(R.id.danceid),"danceshared");
        startActivity(intent, optionsCompat.toBundle());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message4(View view)
    {
        Intent intent=new Intent(this,religion.class);
        ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation(culture.this,findViewById(R.id.religionid),"religionshared");
        startActivity(intent, optionsCompat.toBundle());

    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message5(View view)
    {
        Intent intent=new Intent(this,music.class);
        ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation(culture.this,findViewById(R.id.musicid),"musicshared");
        startActivity(intent, optionsCompat.toBundle());
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message6(View view)
    {
        Intent intent=new Intent(this,clothing.class);
        ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation(culture.this,findViewById(R.id.clothid),"clothshared");
        startActivity(intent, optionsCompat.toBundle());
    }
}
