package com.example.geetanshsharma.love_punjab;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class celebratity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebratity);
        CardView ManmohanSingh=findViewById(R.id.ManmohanSingh);
        CardView yuvraj=findViewById(R.id.yuvraj);
        CardView wadali=findViewById(R.id.wadli);
        CardView AmrishPuri=findViewById(R.id.AmrishPuri);
        CardView gurdas=findViewById(R.id.gurdas);
        CardView harman=findViewById(R.id.harmanpreet);
        CardView satnam=findViewById(R.id.satnam);
        CardView MilkhaSingh=findViewById(R.id.MilkhaSingh);
        CardView PremChopra=findViewById(R.id.PremChopra);
        CardView Dharmrndra=findViewById(R.id.Dharmrndra);
        CardView AkshayKumar=findViewById(R.id.AkshayKumar);
        CardView JuhiChawla=findViewById(R.id.JuhiChawla);
        CardView KapilSharma=findViewById(R.id.KapilSharma);
        CardView DevAnand=findViewById(R.id.DevAnand);
        CardView Darasingh=findViewById(R.id.Darasingh);



        overridePendingTransition(R.anim.transion,R.anim.out);
        DevAnand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message11(view);
            }
        });
        Darasingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message12(view);
            }
        });
        PremChopra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message13(view);
            }
        });
        Dharmrndra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message14(view);
            }
        });

        MilkhaSingh.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                message9(view);
            }


        });
        JuhiChawla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message10(view);
            }
        });


        KapilSharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message8(view);
            }
        });

        satnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message7(view);
            }
        });

        AkshayKumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message5(view);
            }
        });
        gurdas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message4(view);
            }
        });

        harman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                messaage6(view);
            }
        });

        AmrishPuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesage3(view);
            }
        });

       wadali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message2(view);
            }
        });


        ManmohanSingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message(view);
            }
        });




        yuvraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message1(view);
            }
        });




    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(R.anim.transion,R.anim.out);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message(View view)
    {
        Intent intent=new Intent(this,Manmohan.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.manmohanid),"manmohanshared");
        startActivity(intent, optionsCompat.toBundle());
    }




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message1(View view)
    {
        Intent intent=new Intent(this,yuvraj.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.yuviid),"yuvishared");
        startActivity(intent, optionsCompat.toBundle());
    }



    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message2(View view)
    {
        Intent intent=new Intent(this,ranjit1.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.wadaliid),"wadalishared");
        startActivity(intent, optionsCompat.toBundle());
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void mesage3(View view)
    {
        Intent intent=new Intent(this,amrish.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.amrishid),"amrishshared");
        startActivity(intent, optionsCompat.toBundle());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message4(View view)
    {
        Intent intent=new Intent(this,gurdas.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.gurdasid),"gurdasshared");
        startActivity(intent, optionsCompat.toBundle());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void message5(View view)
    {
            Intent intent=new Intent(this,akshay.class);
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.akshayid),"akshayshared");
        startActivity(intent, optionsCompat.toBundle());

        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void messaage6(View view)
        {
            Intent intent=new Intent(this,harman.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.harmanid),"harmanshared");
            startActivity(intent, optionsCompat.toBundle());
        }

        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message7(View view)
        {
            Intent intent=new Intent(this,satnam.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.satnamid),"satnamshared");
            startActivity(intent, optionsCompat.toBundle());
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message8(View view)
        {
            Intent intent=new Intent(this,kapil.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.kapilid),"kapilshared");
            startActivity(intent, optionsCompat.toBundle());
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message9(View view)
        {
                Intent intent=new Intent(this,milkha.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.milkhid),"milkhashared");
            startActivity(intent, optionsCompat.toBundle());
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message10(View view)
        {
           Intent intent=new Intent(this,juhi.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.juhiid),"juhishared");
            startActivity(intent, optionsCompat.toBundle());
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message11(View view)
        {
            Intent intent=new Intent(this,dev.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.devid),"devshared");
            startActivity(intent, optionsCompat.toBundle());
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message12(View view)
        {
            Intent intent=new Intent(this,dara.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.daraid),"darashared");
            startActivity(intent, optionsCompat.toBundle());
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message13(View view)
        {
            Intent intent=new Intent(this,prem.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.premid),"premshared");
            startActivity(intent, optionsCompat.toBundle());
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void message14(View view)
        {
            Intent intent=new Intent(this,dharmendra.class);
            ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(celebratity.this,findViewById(R.id.dharamid),"dharamshared");
            startActivity(intent, optionsCompat.toBundle());
        }


    }


