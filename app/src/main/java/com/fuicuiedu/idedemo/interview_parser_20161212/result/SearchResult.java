package com.fuicuiedu.idedemo.interview_parser_20161212.result;

//{
//        "resultcode": "200",
//        "reason": "SUCCESSED!",
//        "result": [
//        {
//        "city": "苏州",  /*城市*/
//        "PM2.5": "73",  /*PM2.5指数*/
//        "AQI": "98",    /*空气质量指数*/
//        "quality": "良", /*空气质量*/
//        "PM10": "50",/*PM10*/
//        "CO": "0.79",  /*一氧化碳*/
//        "NO2": "65",  /*二氧化氮*/
//        "O3": "28",    /*臭氧*/
//        "SO2": "41",  /*二氧化硫*/
//        "time": "2014-12-26 11:48:40"/*更新时间*/
//        }
//        ],
//        "error_code": 0
//        }

import java.util.List;

public class SearchResult {

    private String resultcode;
    private String reason;
    private List<DetailResult> result;
    private int error_code;

    public SearchResult(String resultcode, String reason, int error_code) {
        this.resultcode = resultcode;
        this.reason = reason;
        this.error_code = error_code;
    }

    //生成get，set方法。。。。alt + insert

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<DetailResult> getResult() {
        return result;
    }

    public void setResult(List<DetailResult> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", error_code=" + error_code +
                '}';
    }
}
