package com.fuicuiedu.idedemo.interview_parser_20161212.xml;

import android.util.Xml;

import com.fuicuiedu.idedemo.interview_parser_20161212.entity.Book;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/12 0012.
 */

public class PullBookParser {

    public List<Book> parse(InputStream inputStream) throws XmlPullParserException, IOException {
        List<Book> books = null;
        Book book = null;

        //由系统的XML创建一个XmlPullParser实例
        XmlPullParser parser = Xml.newPullParser();
        //设置输入流，并指明编码方式
        parser.setInput(inputStream,"UTF-8");

        //我们需要自己获取产生的事件然后做出相应的操作
        int eventType = parser.getEventType();
        //判断事件类型做出相应操作
        while (eventType != XmlPullParser.END_DOCUMENT){
            switch (eventType){
                //解析文件开始，数据初始化
                case XmlPullParser.START_DOCUMENT:
                    books = new ArrayList<>();
                    break;
                case XmlPullParser.START_TAG:
                    if (parser.getName().equals("book")){
                        book = new Book();
                    } else if (parser.getName().equals("id")) {
                        //判断有没有下一个
                        eventType = parser.next();
                        book.setId(Integer.parseInt(parser.getText()));
                    } else if (parser.getName().equals("name")){
                        eventType = parser.next();
                        book.setName(parser.getText());
                    } else if (parser.getName().equals("price")){
                        eventType = parser.next();
                        book.setPrice(Float.parseFloat(parser.getText()));
                    }
                    break;
                case XmlPullParser.END_TAG:
                    if (parser.getName().equals("book")){
                        books.add(book);
                        book = null;
                    }
                    break;
            }
            //获取下一个事件类型，判断循环
            eventType = parser.next();
        }
        return books;
    }
}
