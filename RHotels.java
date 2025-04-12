package com.example.exploreease;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class RHotels extends AppCompatActivity {
    WebView w1;
    public ProgressDialog progress1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhotels);

        w1=(WebView) findViewById(R.id.webViewb);
        w1.getSettings().setJavaScriptEnabled(true);

        w1.loadUrl("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=hotels+in+rajasthan&guccounter=1");
        //w1.loadUrl("file:///android_asset/home.htm");

        //String data="<html><body><h1>Hello,Raj!</h1></body></html>";
        //w1.loadData(data,"text/html","UTF-8");

        progress1=new ProgressDialog(this);
        progress1.setMessage("Web Page Loading");
        progress1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress1.setIndeterminate(false);
        progress1.setProgress(0);
        progress1.setMax(100);


        w1.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode,
                                        String description, String failingUrl) {
                w1.loadUrl("about:blank");
                Toast.makeText(getApplication(), "Oh no! Plz Check Data Connection",Toast.LENGTH_SHORT).show();
            }
        });

        w1.setWebChromeClient(new WebChromeClient()
        {
            public void onProgressChanged(WebView view, int progress)
            {
                if(progress < 100){
                    progress1.show();
                }
                progress1.setProgress(progress);

                if(progress == 100) {
                    progress1.hide();
                }
            }
        });


    }
}
