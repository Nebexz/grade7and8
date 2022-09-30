package com.app.grade7and8englishtextbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pdfView=findViewById(R.id.pdfView);

        int book_position=getIntent().getIntExtra("key_position",0);

        if (book_position==0){
            pdfView.fromAsset("English G 7 .pdf").load();
        }
        else if (book_position==1){
            pdfView.fromAsset("English G 8 .pdf").load();
        }
    }


}