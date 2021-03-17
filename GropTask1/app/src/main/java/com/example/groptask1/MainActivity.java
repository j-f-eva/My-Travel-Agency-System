package com.example.groptask1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView ;

public class MainActivity extends AppCompatActivity {

    Button buttonDhaka, buttonRajshahi,buttonKhulna,buttonSylhet,buttonBarishal,buttonRangpur,buttonMymensingh,buttonChattagram;
    TextView mainActivityTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityTextView  = (TextView) findViewById(R.id.marquee_scrolling_text);
        mainActivityTextView.setSelected(true);

        buttonDhaka = (Button) findViewById(R.id.btn_Dhaka);
        buttonDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DhakaDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Dhaka Clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonRajshahi = (Button) findViewById(R.id.btn_Rajshahi);
        buttonRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RajshahiDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Rajshahi Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        buttonKhulna = (Button) findViewById(R.id.btn_Khulna);
        buttonKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, KhulnaDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Khulna Clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonSylhet = (Button) findViewById(R.id.btn_Sylhet);
        buttonSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SylhetDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Sylhet Clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonRangpur = (Button) findViewById(R.id.btn_Rangpur);
        buttonRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RangpurDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Rangpur Clicked", Toast.LENGTH_SHORT).show();

            }
        });

        buttonMymensingh = (Button) findViewById(R.id.btn_Mymensingh);
        buttonMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MymensinghDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Mymensingh Clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonBarishal = (Button) findViewById(R.id.btn_Barishal);
        buttonBarishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, BarishalDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Barishal Clicked", Toast.LENGTH_SHORT).show();

            }
        });


        buttonChattagram = (Button) findViewById(R.id.btn_Chattagram);
        buttonChattagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChattagramDivision.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"Chattagram Clicked", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
