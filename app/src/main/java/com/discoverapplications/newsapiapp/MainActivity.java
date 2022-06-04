package com.discoverapplications.newsapiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    NewsListAdapter newsAdapter;

    String monthNames[] = {"Jan, Feb, March, April, May, June, July, Aug, Sep, Oct, Nov, Dec, Jan, Feb, March, April, May, June, July, Aug, Sep, Oct, Nov, Dec"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        recyclerView= findViewById(R.id.rview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        newsAdapter= new NewsListAdapter(monthNames, this);
        recyclerView.setAdapter(newsAdapter);
    }

}