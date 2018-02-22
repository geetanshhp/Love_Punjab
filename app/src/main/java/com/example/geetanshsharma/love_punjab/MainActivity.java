package com.example.geetanshsharma.love_punjab;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView punjab = findViewById(R.id.about);
        CardView culture = findViewById(R.id.culture);
        CardView sports = findViewById(R.id.sports);
        CardView politics = findViewById(R.id.politics);
        CardView celebratity = findViewById(R.id.celebrities);
        CardView tourism = findViewById(R.id.tourism);
        CardView geo = findViewById(R.id.geographical);
        CardView flora = findViewById(R.id.flora);
        final MenuItem feedback = findViewById(R.id.feebback);
        CardView fauna = findViewById(R.id.fauna);

        overridePendingTransition(R.anim.transion, R.anim.out);
        final CardView eduction = findViewById(R.id.education);
        overridePendingTransition(R.anim.transion, R.anim.out);

        eduction.setOnClickListener(    new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                education(view);
            }
        });


        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                geo(view);
            }
        });

        flora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flora(view);
            }
        });
        fauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fauna(view);
            }
        });


        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sports(view);
            }
        });


        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tourism(view);
            }
        });


        politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                politics(view);
            }
        });


        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                culture(view);
            }
        });


        celebratity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                celebratity(view);
            }
        });


        punjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                move(view);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.feebback)
        {
            Toast.makeText(this, "FEEDBACK FOR US... ", Toast.LENGTH_SHORT).show();
            String url = "https://accounts.google.com/Login";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);

        }
        else if (item.getItemId() == R.id.about_app)
        {
            Toast.makeText(this, "ABOUT APPLICATION...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, feedback.class);
            startActivity(intent);
        }
        else if (item.getItemId() == R.id.about_us)
        {
            Toast.makeText(this, "BEHIND THE CODE....", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, aboutus.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public void onBackPressed()
    {
        overridePendingTransition(R.anim.transion,R.anim.out);
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("CONFIRM EXIT");
        alert.setTitle("ARE YOU SURE TO EXIT");
        alert.setIcon(R.drawable.cross);
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

        }
    });
        alert.show();

    }

    public void culture(View view)
    {
        Intent intent=new Intent(this,culture.class);
        startActivity(intent);
    }





    public void celebratity(View view)
    {
        Intent intent=new Intent(this,celebratity.class);
        startActivity(intent);
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void geo(View view)
    {
        Intent intent=new Intent(this,geo.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,findViewById(R.id.geoid),"geoshared");

        startActivity(intent,optionsCompat.toBundle());
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void sports(View view)
    {

        Intent intent=new Intent(this,sports.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,findViewById(R.id.sportsid),"sportshared");

        startActivity(intent,optionsCompat.toBundle());

    }



    public void tourism(View view)
    {
        Intent intent=new Intent(this,tourism.class);
        startActivity(intent);
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void move(View view)
    {
        Intent intent = new Intent(this, aboutpunjab.class);


        startActivity(intent);
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void politics(View view)
    {
        Intent intent = new Intent(this, politics.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,findViewById(R.id.polid),"polshared");

        startActivity(intent,optionsCompat.toBundle());
    }

    public void education(View view)
    {
        Intent intent = new Intent(this, education.class);
        startActivity(intent);
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void flora(View view)
    {
        Intent intent=new Intent(this,flora.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,findViewById(R.id.floraid),"florashared");

        startActivity(intent, optionsCompat.toBundle());

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void fauna(View view)
    {

        Intent intent=new Intent(this,fauna.class);

        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,findViewById(R.id.fuanaid),"fuanashared");

        startActivity(intent,optionsCompat.toBundle());

    }
}

