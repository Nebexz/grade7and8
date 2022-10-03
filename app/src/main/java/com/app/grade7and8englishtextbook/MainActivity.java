package com.app.grade7and8englishtextbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView button=findViewById(R.id.imageButton);
        ImageView button1=findViewById(R.id.imageButton2);

        button.setOnClickListener(view -> {
            Intent intent= new Intent(getApplicationContext(),MainActivity2.class);
            intent.putExtra("key_position",0);
            startActivity(intent);
        });
        button1.setOnClickListener(view -> {
            Intent intent= new Intent(getApplicationContext(),MainActivity2.class);
            intent.putExtra("key_position",1);
            startActivity(intent);
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_share) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);

            // type of the content to be shared
            sharingIntent.setType("text/plain");

            // Body of the content
            String shareBody = "https://play.google.com/store/apps/details?id=com.app.grade7and8englishtextbook";

            // subject of the content. you can share anything
            String shareSubject = "Hey, I'm using Grade 7 and 8 Ethiopian English Textbook download it on Playstore";

            // passing body of the content
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);

            // passing subject of the content
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
            startActivity(Intent.createChooser(sharingIntent, "Share using"));
        } else {// If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

}
