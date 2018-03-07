package com.example.jayde.androidwebviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by jayde on 03/06/2018.
 */

public class Google extends AppCompatActivity {

    private WebView webView;
    private String urlentered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        Intent intent = getIntent();
        urlentered = intent.getStringExtra("url");
        webView = (WebView) findViewById(R.id.webView1);
        webView.loadUrl(urlentered);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
    }
}
