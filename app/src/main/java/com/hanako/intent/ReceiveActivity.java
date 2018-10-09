package com.hanako.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {
    private TextView tvReceiveMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        tvReceiveMessage = findViewById(R.id.tv_receive_message);
        Intent intent = getIntent();
        String receiveValue = intent.getStringExtra("MyValue").toString();

        Student receiveObject = (Student)intent.getSerializableExtra("MyObject");

        tvReceiveMessage.setText(receiveValue + "\n Name: " + receiveObject.getName() + "\n Age: " + receiveObject.getAge());
    }
}
