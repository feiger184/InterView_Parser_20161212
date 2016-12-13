package com.fuicuiedu.idedemo.interview_parser_20161212.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fuicuiedu.idedemo.interview_parser_20161212.R;

public class jsonActivity extends AppCompatActivity {

//    http://www.juhe.cn/docs/api/id/33/aid/79

    private String json = "{\n" +
            "    \"resultcode\": \"200\",\n" +
            "    \"reason\": \"SUCCESSED!\",\n" +
            "    \"result\": [\n" +
            "        {\n" +
            "            \"city\": \"苏州\",  /*城市*/\n" +
            "            \"PM2.5\": \"73\",  /*PM2.5指数*/\n" +
            "            \"AQI\": \"98\",    /*空气质量指数*/\n" +
            "            \"quality\": \"良\", /*空气质量*/\n" +
            "            \"PM10\": \"50\",/*PM10*/\n" +
            "            \"CO\": \"0.79\",  /*一氧化碳*/\n" +
            "            \"NO2\": \"65\",  /*二氧化氮*/\n" +
            "            \"O3\": \"28\",    /*臭氧*/\n" +
            "            \"SO2\": \"41\",  /*二氧化硫*/\n" +
            "            \"time\": \"2014-12-26 11:48:40\"/*更新时间*/  \n" +
            "        }\n" +
            "    ],\n" +
            "    \"error_code\": 0\n" +
            "}";

    Button jsonBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        jsonBtn = (Button) findViewById(R.id.json_btn);

        jsonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
