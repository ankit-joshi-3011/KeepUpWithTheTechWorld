package com.technewsfeed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstAppPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_app_page);

        Context context = this;

        int[] newsFeedSourceResourceIds = new int[] { R.string.text_dzone_news_feed_source_item };
        String[] newsFeedSourceResourceStrings = Utility.getResourceStringsFromIds(context, newsFeedSourceResourceIds);

        ListView newsFeedSourcesListView = findViewById(R.id.news_feed_sources_list_view);

        ArrayAdapter<String> newsFeedSourcesListViewAdapter = new ArrayAdapter<>(context, R.layout.item_news_feed_sources_list, newsFeedSourceResourceStrings);
        newsFeedSourcesListView.setAdapter(newsFeedSourcesListViewAdapter);

        newsFeedSourcesListView.setOnItemClickListener((parent, view, position, id) -> {
            int newsFeedSourceResourceClicked = newsFeedSourceResourceIds[position];

            if (newsFeedSourceResourceClicked == R.string.text_dzone_news_feed_source_item) {
                Intent dZoneCategoriesAppPageActivityIntent = new Intent(context, DZoneCategoriesAppPageActivity.class);
                context.startActivity(dZoneCategoriesAppPageActivityIntent);
            }
        });
    }
}
