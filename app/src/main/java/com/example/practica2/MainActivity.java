package com.example.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener{

    Button button01;
    EditText User, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01= (Button) findViewById(R.id.button01);


        User = (EditText)findViewById(R.id.user);
         Password = (EditText)findViewById(R.id.pw);

        button01.setOnClickListener(this);
        button01.setOnLongClickListener(this);



    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(getApplicationContext(),Password.getText(), Toast.LENGTH_LONG).show();
        return false;
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(getApplicationContext(),User.getText() ,Toast.LENGTH_LONG).show();
    }
}
