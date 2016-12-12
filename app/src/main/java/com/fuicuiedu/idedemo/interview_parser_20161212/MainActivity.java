package com.fuicuiedu.idedemo.interview_parser_20161212;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fuicuiedu.idedemo.interview_parser_20161212.xml.XmlActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button xmlBtn,jsonBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xmlBtn = (Button) findViewById(R.id.main_xml);
        jsonBtn = (Button) findViewById(R.id.main_json);

        xmlBtn.setOnClickListener(this);
        jsonBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_xml:
                Intent intent = new Intent(getApplicationContext(), XmlActivity.class);
                startActivity(intent);
                break;
            case R.id.main_json:
                Toast.makeText(this, "json解析待实现", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
