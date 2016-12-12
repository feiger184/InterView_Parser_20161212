package com.fuicuiedu.idedemo.interview_parser_20161212.xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fuicuiedu.idedemo.interview_parser_20161212.R;
import com.fuicuiedu.idedemo.interview_parser_20161212.entity.Book;

import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class XmlActivity extends AppCompatActivity implements View.OnClickListener{

    Button saxBtn,domBtn,pullBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);

        saxBtn = (Button) findViewById(R.id.main_sax);
        domBtn = (Button) findViewById(R.id.main_dom);
        pullBtn = (Button) findViewById(R.id.main_pull);

        saxBtn.setOnClickListener(this);
        domBtn.setOnClickListener(this);
        pullBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_sax:
                try {
                    InputStream input = getAssets().open("books.xml");
                    SaxBookParser saxParser = new SaxBookParser();
                    List<Book> books = saxParser.parse(input);
                    for (Book book : books){
                        Log.e("SaxParser",book.toString());
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ParserConfigurationException e) {
                    e.printStackTrace();
                } catch (SAXException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.main_dom:
                Toast.makeText(this, "dom解析器", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_pull:
                Toast.makeText(this, "pull解析器", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
