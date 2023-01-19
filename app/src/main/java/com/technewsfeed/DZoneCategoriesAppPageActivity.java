package com.technewsfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DZoneCategoriesAppPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzone_categories_app_page);

        Context context = this;

        String[] categoriesResourceStrings = Utility.getResourceStringsFromIds(
            context,
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
        );

        ListView dZoneCategoriesListView = findViewById(R.id.dzone_categories_list_view);

        ArrayAdapter<String> dZoneCategoriesListViewArrayAdapter = new ArrayAdapter<>(context, R.layout.item_dzone_categories_list, categoriesResourceStrings);
        dZoneCategoriesListView.setAdapter(dZoneCategoriesListViewArrayAdapter);
    }
}
