package com.hanako.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnSend;
    private EditText edtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button) findViewById(R.id.btn_send);
        edtMessage = (EditText) findViewById(R.id.edt_message);
    }
    public void sendMessage(View v){
        Intent intent = new Intent(this, ReceiveActivity.class);
        intent.putExtra("MyValue", edtMessage.getText().toString());

        Student student1 = new Student();
        student1.setName("Hanako");
        student1.setAge(21);
        intent.putExtra("MyObject", student1);

        startActivity(intent);
    }

}
