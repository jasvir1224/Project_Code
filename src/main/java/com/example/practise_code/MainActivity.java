package com.example.practise_code;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = (TextView) findViewById(R.id.text1);
        TextView textView2 = (TextView) findViewById(R.id.text2);
        TextView textView3 = (TextView) findViewById(R.id.text3);
        TextView textView4 = (TextView) findViewById(R.id.text4);

        String X =
                "copyandpastecopyandpastecopyandpastecopyandpastecopyandpastecopyandpastecommitandpushcommitandpushcommitandpushcommitandpushpushcccccommmitttsss";

        // Total Characters
        String y = String.valueOf(X.length());
        System.out.println(X.length());

        textView1.setText(y);

        // Last 15 Charcaters

        String z = X.substring(X.length()- 15);
        textView2.setText(z);

        // Total P's

        int count1 = 0 ;
        char totalp = 'p';
        // int total1 = 0;
        for (int i = 0; i < X.length(); i++)
            if( X.charAt(i) == totalp) {
                count1++;
            }

        System.out.println(count1);


        String u = String.valueOf(count1);
        textView3.setText(u);





        // Total C's

        int count = 0 ;
        char totalc = 'c';
        //int total = 0;
        for (int i = 0; i < X.length(); i++)
            if( X.charAt(i) == totalc) {
                count++;
            }

        System.out.println(count);


        String v = String.valueOf(count);
        textView4.setText(v);



    }
}