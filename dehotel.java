package com.example.exploreease;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class dehotel extends AppCompatActivity {
    WebView w1;
    public ProgressDialog progress1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ka_hotels);

        w1=(WebView) findViewById(R.id.webViewb);
        w1.getSettings().setJavaScriptEnabled(true);

        w1.loadUrl("https://www.booking.com/city/in/new-delhi.html?label=in-new-delhi-e8W1ee8F8u0VtKbPZDZV*wSM110121590789%3Apl%3Ata%3Ap11020%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-186693036%3Alp1007789%3Ali%3Adem%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YZVcNNsENnH02-pWD53qm9c;aid=306395;ws=;" +
                "gclid=CjwKCAjwv-2pBhB-EiwAtsQZFLDHfurkqejCmP22S37PslB6mhW8Fdw3Mw-WyxWKqaMiOmpqDYRLUhoCx3UQAvD_BwE");
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
