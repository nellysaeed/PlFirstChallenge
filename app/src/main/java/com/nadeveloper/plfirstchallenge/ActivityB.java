package com.nadeveloper.plfirstchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ActivityB extends AppCompatActivity {

    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        this.webView = findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WvClient());

        webView.loadUrl("https://andela.com/alc/");
    }

}