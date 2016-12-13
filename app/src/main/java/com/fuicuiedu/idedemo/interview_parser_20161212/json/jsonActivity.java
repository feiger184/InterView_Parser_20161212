package com.fuicuiedu.idedemo.interview_parser_20161212.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.fuicuiedu.idedemo.interview_parser_20161212.R;
import com.fuicuiedu.idedemo.interview_parser_20161212.result.DetailResult;
import com.fuicuiedu.idedemo.interview_parser_20161212.result.SearchResult;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import static android.os.Build.VERSION_CODES.N;

public class JsonActivity extends AppCompatActivity {

//    http://www.juhe.cn/docs/api/id/33/aid/79

    private String json = "{\n" +
            "    \"resultcode\": \"200\",\n" +
            "    \"reason\": \"SUCCESSED!\",\n" +
            "    \"result\": [\n" +
            "        {\n" +
            "            \"a\": \"苏州\",  /*城市*/\n" +
            "            \"PM2.5\": \"73\",  /*PM2.5指数*/\n" +
            "            \"a1\": \"98\",    /*空气质量指数*/\n" +
            "            \"quality\": \"良\", /*空气质量*/\n" +
            "            \"a2\": \"50\",/*PM10*/\n" +
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
                gsonParserJson();
            }
        });
    }

//    private void parserJson() {
//        SearchResult searchResult = new SearchResult();
//        try {
//            JSONObject jsonObject = new JSONObject(json);
//            String resultcode = jsonObject.getString("resultcode");
//            String reason = jsonObject.getString("reason");
//            int error_code = jsonObject.getInt("error_code");
//
//            JSONArray jsonArray = jsonObject.getJSONArray("result");
//            for (int i = 0; i < jsonArray.length(); i++) {
//                JSONObject object = jsonArray.getJSONObject(i);
//                String city = object.getString("city");
//                String PM25 = object.getString("PM2.5");
//                String AQI = object.getString("AQI");
//                String quality = object.getString("quality");
//                String PM10 = object.getString("PM10");
//                String CO = object.getString("CO");
//                String NO2 = object.getString("NO2");
//                String O3 = object.getString("O3");
//                String SO2 = object.getString("SO2");
//                String time = object.getString("time");
//
//                DetailResult result = new DetailResult(city,PM25,AQI,quality,PM10,
//                        CO,NO2,O3,SO2,time);
//
//                Log.e("aaa",result.toString());
//            }
//
//
//            searchResult.setResultcode(resultcode);
//            searchResult.setReason(reason);
//            searchResult.setError_code(error_code);
//
//            Log.e("aaa", searchResult.toString());
//
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }

    private void gsonParserJson(){
        // Gson 解析和生成json数据的类库
        //提供两个方法：formJson,toJson
        //formJson：将一个json字符串，解析为一个你指定的对象（类）
        //toJson:将一个对象（类），生产为一个json字符串

//        SearchResult result = new Gson().fromJson(json,SearchResult.class);
//        List<DetailResult> list = result.getResult();
//        DetailResult result2 = list.get(0);
//        Log.e("aaa",result2.toString());

        SearchResult myResult = new SearchResult("23333","hehehehe",23333);
        String json = new Gson().toJson(myResult);
        Log.e("aaa",json);
    }
}
