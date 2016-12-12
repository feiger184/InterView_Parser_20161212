package com.fuicuiedu.idedemo.interview_parser_20161212.xml;

import com.fuicuiedu.idedemo.interview_parser_20161212.entity.Book;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by Administrator on 2016/12/12 0012.
 */

public class DomBookParser {

    public List<Book> parse(InputStream inputStream) throws ParserConfigurationException, IOException, SAXException {
        List<Book> books = new ArrayList<>();

        //取得工厂实例
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //从工厂获取DocumentBuilder实例
        DocumentBuilder builder = factory.newDocumentBuilder();
        //解析输入流，得到Document(文件)实例
        Document document = builder.parse(inputStream);

        //获取Document中的所有元素
        Element rootElement = document.getDocumentElement();
        //获取元素中的节点列表
        NodeList items = rootElement.getElementsByTagName("book");

        //for循环节点列表
        for (int i = 0; i < items.getLength(); i++) {
            Book book = new Book();
            //拿到当前第i个节点
            Node item = items.item(i);
            //获取节点的子节点列表
            NodeList properties = item.getChildNodes();

            //for循环子节点列表
            for (int j = 0; j < properties.getLength(); j++) {
                //拿到子节点列表里的第j个节点
                Node property = properties.item(j);
                //获取几点名称
                String nodeName = property.getNodeName();
                if (nodeName.equals("id")) {
                    book.setId(Integer.parseInt(property.getFirstChild().getNodeValue()));
                } else if (nodeName.equals("name")) {
                    book.setName(property.getFirstChild().getNodeValue());
                } else if (nodeName.equals("price")) {
                    book.setPrice(Float.parseFloat(property.getFirstChild().getNodeValue()));
                }
            }
            //将构建好的book对象添加到集合中
            books.add(book);
        }
        return books;
    }
}
