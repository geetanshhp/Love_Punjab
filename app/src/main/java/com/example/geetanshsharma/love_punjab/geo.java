package com.example.geetanshsharma.love_punjab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class geo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
        overridePendingTransition(R.anim.transion,R.anim.out);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.transion,R.anim.out);
    }
}
