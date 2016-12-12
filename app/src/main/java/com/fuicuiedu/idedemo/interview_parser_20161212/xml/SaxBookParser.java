package com.fuicuiedu.idedemo.interview_parser_20161212.xml;

import com.fuicuiedu.idedemo.interview_parser_20161212.entity.Book;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by Administrator on 2016/12/12 0012.
 */

public class SaxBookParser {

    public List<Book> parse(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {

        //取得SaxParserFactory实例
        SAXParserFactory factory = SAXParserFactory.newInstance();
        //从factory获取SaxParser实例
        SAXParser parser = factory.newSAXParser();
        //实例化自定义的Handler（定义自己的事件处理逻辑）
        MyHandler myHandler = new MyHandler();
        //根据自定义的Handler规则解析输入流
        parser.parse(inputStream,myHandler);

        return myHandler.getBooks();
    }

    //自定义的Handler继承DefaultHander
    private class MyHandler extends DefaultHandler{
        //ctrl + 0 .....实现方法

        private List<Book> books;
        private Book book;
        private StringBuilder builder;

        //返回解析后得到的Book对象集合
        public List<Book> getBooks() {
            return books;
        }

        //文件开始，在这个方法里初始化数据
        @Override
        public void startDocument() throws SAXException {
            super.startDocument();
            books = new ArrayList<>();
            builder = new StringBuilder();
        }

        //当执行文档时遇到起始节点，startElement方法将会被调用，我们可以获取起始节点相关信息
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            super.startElement(uri, localName, qName, attributes);
            //找到book节点
            if (localName.equals("book")){
                book = new Book();
            }

            //初始化我们的builder，以便重新开始读取元素内的节点
            builder.setLength(0);
        }

        //然后characters方法被调用，我们可以获取节点内文本信息
        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            super.characters(ch, start, length);
            //将读取的字符数组追加到builder中
            builder.append(ch, start, length);
        }

        //最后endElement方法被调用，我们可以做收尾的相关工作
        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            super.endElement(uri, localName, qName);
            if (localName.equals("id")){
                book.setId(Integer.parseInt(builder.toString()));
            }else if (localName.equals("name")){
                book.setName(builder.toString());
            }else if (localName.equals("price")){
                book.setPrice(Float.parseFloat(builder.toString()));
            }
            //当又遇到book节点时，把构建好的book对象加到集合中
            else if (localName.equals("book")){
                books.add(book);
            }
        }
    }
}
