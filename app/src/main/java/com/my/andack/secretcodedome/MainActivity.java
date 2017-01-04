package com.my.andack.secretcodedome;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText sender;
    private EditText content;
    private Button setBtn;
    private SharedPreferenceTools tools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        tools=new SharedPreferenceTools(MainActivity.this);

        setBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tools.isSharePreference())
                {

                }else
                    setInfo();
            }
        });

    }

    private void setInfo() {
        String senderT=sender.getText().toString();
        String contentT=content.getText().toString();
        if (!senderT.equals("")&&!contentT.equals(""))
        {
            //在这里写入数据
            SharedPreferences.Editor editor=getSharedPreferences("user",MODE_PRIVATE).edit();
            editor.putString("name",senderT);
            editor.putString("content",contentT);

        }else
        {
            Toast.makeText(this,R.string.note,Toast.LENGTH_SHORT).show();
        }
    }

    private void initView() {
        sender= (EditText) findViewById(R.id.theSender);
        content= (EditText) findViewById(R.id.theContent);
        setBtn= (Button) findViewById(R.id.setBtn);
    }
}
