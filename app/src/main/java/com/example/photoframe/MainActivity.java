package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button prev,next;
    ImageView pic;
    TextView text;
    int currimag=0;
    public void prev(View view){
     String idx="pic"+currimag;
     int x=this.getResources().getIdentifier(idx,"id",getPackageName());
     pic=findViewById(x);
     pic.setAlpha(0f);

     currimag=(currimag+4-1)%4;
        String idy="pic"+currimag;
        int y=this.getResources().getIdentifier(idy,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);

    }
    public void next(View view){
        String idx="pic"+currimag;
        int x=this.getResources().getIdentifier(idx,"id",getPackageName());
        pic=findViewById(x);
        pic.setAlpha(0f);

        currimag=(currimag+4+1)%4;
        String idy="pic"+currimag;
        int y=this.getResources().getIdentifier(idy,"id",getPackageName());
        pic=findViewById(y);
        pic.setAlpha(1f);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}