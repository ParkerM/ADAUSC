package edu.sc.cse.adausc;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by dohertsm on 12/4/2014.
 */
public class FullDocumentScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fulldoc);
        WebView oContent = (WebView) findViewById(R.id.fullDoc);
        oContent.loadData(SerializationHelper.LoadFullDoc(), "text/html", null);
    }
}
