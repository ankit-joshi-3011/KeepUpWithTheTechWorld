package com.keepupwiththetechworld;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class DZoneRssFeedAppPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzone_rss_feed_app_page);

        WebView dZoneRssFeedWebView = findViewById(R.id.dzone_rss_feed_web_view);
        dZoneRssFeedWebView.setWebViewClient(new WebViewClientExtended());

        String dZoneRssFeedUrl = getIntent().getStringExtra(Constants.DZONE_RSS_FEED_URL_EXTRA_KEY);
        dZoneRssFeedWebView.loadUrl(dZoneRssFeedUrl);
    }

    static class WebViewClientExtended extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }
}
