package com.example.tatunori.firstapp;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("10の階乗");
        TextView firstText = (TextView)findViewById(R.id.firstText);
        Resources res = getResources();
        int color = res.getColor(R.color.colorAccent);

//        long factorial = caluculaterFactorial(20);
        firstText.setTextSize(100);
        firstText.setText(String.valueOf(tenOfFactorial()));
        firstText.setTextColor(color);
    }
    private long caluculaterFactorial(int n){
        long product =1L;
        for (int j = 1; j <=n ; j++) {
            product = product * j;
        }
        return product;
    }
    private int tenOfFactorial(){
        return 10*10;
    }
}
