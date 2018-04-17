package com.myapplicationdev.android.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the btn and set the OnClickListener
        Button btnDone =(Button)findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                //Get the editText that user keys in Name
                EditText etName =(EditText)findViewById(R.id.editTextName);
                //Get the editText that the user keys in age
                EditText etAge =(EditText)findViewById(R.id.editTextAge);
                //Put the name and age into an array
                String[] info ={etName.getText().toString(),etAge.getText().toString()};

                //create an intent to start another activity called
                //DemoActivitites (which we would create later)
                Intent i = new Intent(MainActivity.this,DemoActivities2.class);

                //pass the string array holding the name and age to new activity.
                i.putExtra("info",info);
                startActivity(i);

            }
        });

    }
}
