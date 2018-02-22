package com.example.geetanshsharma.love_punjab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class tourism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism);
        CardView button=findViewById(R.id.historical);
        CardView button1=findViewById(R.id.nhistorical);
        overridePendingTransition(R.anim.transion,R.anim.out);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                historical(view);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                nhistorical(view);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.transion,R.anim.out);
    }

    public void historical(View view)
    {
        Intent  intent=new Intent(this,historical.class);
        startActivity(intent);

        }
        public void nhistorical(View view)
        {
            Intent intent=new Intent(this,nhistorical.class);
            startActivity(intent);
        }

    }

