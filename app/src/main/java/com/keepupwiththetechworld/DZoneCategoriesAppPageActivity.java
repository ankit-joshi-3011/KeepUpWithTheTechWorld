package com.keepupwiththetechworld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DZoneCategoriesAppPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzone_categories_app_page);

        Context context = this;

        int[] categoryResourceIds = new int[] {
            R.string.text_dzone_category_agile,
            R.string.text_dzone_category_ai,
            R.string.text_dzone_category_big_data,
            R.string.text_dzone_category_cloud,
            R.string.text_dzone_category_database,
            R.string.text_dzone_category_devops,
            R.string.text_dzone_category_integration,
            R.string.text_dzone_category_iot,
            R.string.text_dzone_category_java,
            R.string.text_dzone_category_microservices,
            R.string.text_dzone_category_open_source,
            R.string.text_dzone_category_performance,
            R.string.text_dzone_category_security,
            R.string.text_dzone_category_web_dev
        };

        String[] categoryResourceStrings = Utility.getResourceStringsFromIds(context, categoryResourceIds);

        ListView dZoneCategoriesListView = findViewById(R.id.dzone_categories_list_view);

        ArrayAdapter<String> dZoneCategoriesListViewArrayAdapter = new ArrayAdapter<>(context, R.layout.item_dzone_categories_list, categoryResourceStrings);
        dZoneCategoriesListView.setAdapter(dZoneCategoriesListViewArrayAdapter);

        dZoneCategoriesListView.setOnItemClickListener((parent, view, position, id) -> {
            int categoryResourceClicked = categoryResourceIds[position];
            final String dZoneRssFeedsBaseUrl = "https://feeds.dzone.com/";
            String urlCategoryAddition = "";

            if (categoryResourceClicked == R.string.text_dzone_category_agile) {
                urlCategoryAddition = "agile";
            } else if (categoryResourceClicked == R.string.text_dzone_category_ai) {
                urlCategoryAddition = "ai";
            } else if (categoryResourceClicked == R.string.text_dzone_category_big_data) {
                urlCategoryAddition = "big-data";
            } else if (categoryResourceClicked == R.string.text_dzone_category_cloud) {
                urlCategoryAddition = "cloud";
            } else if (categoryResourceClicked == R.string.text_dzone_category_database) {
                urlCategoryAddition = "database";
            } else if (categoryResourceClicked == R.string.text_dzone_category_devops) {
                urlCategoryAddition = "devops";
            } else if (categoryResourceClicked == R.string.text_dzone_category_integration) {
                urlCategoryAddition = "integration";
            } else if (categoryResourceClicked == R.string.text_dzone_category_iot) {
                urlCategoryAddition = "iot";
            } else if (categoryResourceClicked == R.string.text_dzone_category_java) {
                urlCategoryAddition = "java";
            } else if (categoryResourceClicked == R.string.text_dzone_category_microservices) {
                urlCategoryAddition = "microservices";
            } else if (categoryResourceClicked == R.string.text_dzone_category_open_source) {
                urlCategoryAddition = "open-source";
            } else if (categoryResourceClicked == R.string.text_dzone_category_performance) {
                urlCategoryAddition = "performance";
            } else if (categoryResourceClicked == R.string.text_dzone_category_security) {
                urlCategoryAddition = "security";
            } else if (categoryResourceClicked == R.string.text_dzone_category_web_dev) {
                urlCategoryAddition = "webdev";
            }

            Intent dZoneRssFeedAppPageActivityIntent = new Intent(context, DZoneRssFeedAppPageActivity.class);
            dZoneRssFeedAppPageActivityIntent.putExtra(Constants.DZONE_RSS_FEED_URL_EXTRA_KEY, dZoneRssFeedsBaseUrl + urlCategoryAddition);
            context.startActivity(dZoneRssFeedAppPageActivityIntent);
        });
    }
}
