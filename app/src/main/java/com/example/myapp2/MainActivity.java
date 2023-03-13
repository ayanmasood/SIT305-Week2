package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;
    TextView mTextView;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mEditText = findViewById(R.id.editTextTextPersonName);
        mTextView= findViewById(R.id.textView3);
        mButton= findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the value of mEditText
                String InputValue = mEditText.getText().toString();
                Toast.makeText(MainActivity.this, "Hi Again" ,Toast.LENGTH_LONG).show();
                Toast.makeText( MainActivity.this, InputValue,Toast.LENGTH_LONG).show();
                //change value at mTextView
                mTextView.setText("This is new text");
                mTextView.setText("Welcome to Sit305" + InputValue);
            }
        });



    }
}