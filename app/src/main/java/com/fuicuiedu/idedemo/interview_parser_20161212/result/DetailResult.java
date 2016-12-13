package com.fuicuiedu.idedemo.interview_parser_20161212.result;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2016/12/13 0013.
 */

//        "a": "苏州",  /*城市*/
//        "PM2.5": "73",  /*PM2.5指数*/
//        "a1": "98",    /*空气质量指数*/
//        "quality": "良", /*空气质量*/
//        "a2": "50",/*PM10*/
//        "CO": "0.79",  /*一氧化碳*/
//        "NO2": "65",  /*二氧化氮*/
//        "O3": "28",    /*臭氧*/
//        "SO2": "41",  /*二氧化硫*/
//        "time": "2014-12-26 11:48:40"/*更新时间*/

public class DetailResult {

    @SerializedName("a")
    private String city;

    @SerializedName("PM2.5")
    private String PM25;
    @SerializedName("a1")
    private String AQI;
    private String quality;
    @SerializedName("a2")
    private String PM10;
    private String CO;
    private String NO2;
    private String O3;
    private String SO2;
    private String time;

    public DetailResult(String city, String PM25, String AQI, String quality, String PM10, String CO, String NO2, String o3, String SO2, String time) {
        this.city = city;
        this.PM25 = PM25;
        this.AQI = AQI;
        this.quality = quality;
        this.PM10 = PM10;
        this.CO = CO;
        this.NO2 = NO2;
        O3 = o3;
        this.SO2 = SO2;
        this.time = time;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPM25() {
        return PM25;
    }

    public void setPM25(String PM25) {
        this.PM25 = PM25;
    }

    public String getAQI() {
        return AQI;
    }

    public void setAQI(String AQI) {
        this.AQI = AQI;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getPM10() {
        return PM10;
    }

    public void setPM10(String PM10) {
        this.PM10 = PM10;
    }

    public String getCO() {
        return CO;
    }

    public void setCO(String CO) {
        this.CO = CO;
    }

    public String getNO2() {
        return NO2;
    }

    public void setNO2(String NO2) {
        this.NO2 = NO2;
    }

    public String getO3() {
        return O3;
    }

    public void setO3(String o3) {
        O3 = o3;
    }

    public String getSO2() {
        return SO2;
    }

    public void setSO2(String SO2) {
        this.SO2 = SO2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DetailResult{" +
                "city='" + city + '\'' +
                ", PM25='" + PM25 + '\'' +
                ", AQI='" + AQI + '\'' +
                ", quality='" + quality + '\'' +
                ", PM10='" + PM10 + '\'' +
                ", CO='" + CO + '\'' +
                ", NO2='" + NO2 + '\'' +
                ", O3='" + O3 + '\'' +
                ", SO2='" + SO2 + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
