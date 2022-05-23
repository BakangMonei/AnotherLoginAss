package com.mad.logginass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button register, getin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register= (Button) findViewById(R.id.register_btn);
        register.setOnClickListener(this);

        getin= (Button) findViewById(R.id.signin_btn);
        getin.setOnClickListener(this);






    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register_btn:
                startActivity(new Intent(this, RegisterUser.class));
                break;

            case R.id.signin_btn:
                startActivity(new Intent(this, HomePage.class));

        }
    }
}
