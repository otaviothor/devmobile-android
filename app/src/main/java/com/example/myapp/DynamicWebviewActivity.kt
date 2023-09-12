package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DynamicWebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_webview)

        val webView: WebView = findViewById(R.id.WebviewComponent)
        webView.settings.apply {
            javaScriptEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
        }
        webView.loadUrl("http://themekit.frontendmatter.com/dist/themes/social-1/profile.html");
    }
}