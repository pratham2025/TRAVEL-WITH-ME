package com.example.exploreease;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class KeHotels extends AppCompatActivity {
    WebView w1;
    public ProgressDialog progress1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ke_hotels);

        w1=(WebView) findViewById(R.id.webViewb);
        w1.getSettings().setJavaScriptEnabled(true);

        w1.loadUrl("https://www.google.com/search?q=hotels+in+kerala&rlz=1C1JJTC_enIN990IN990&oq=hotels+in+kerala&aqs=chrome.0.69i59j0i512l9.4497j0j7&sourceid=chrome&ie=UTF-8");
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
