package rru.somchai;


import rru.somchai.R.id;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class Webview extends Activity {
  
	/** Called when the activity is first created. */
	WebView mWebView;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main6);
        mWebView = (WebView)findViewById(id.WebView01);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("http://www.google.com");
    }
 // menu
    public  boolean onCreateOptionsMenu(Menu menu){
    	menu.add(0,0,0,"Go to Menu").setIcon(R.drawable.icon);
    	return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
 	   super.onOptionsItemSelected(item);
 	  
 	   if(item.getItemId()==0){
 		   Toast.makeText(this, "Go to Menu", Toast.LENGTH_SHORT).show();
 	       Intent myIntent=new Intent(this,myProject.class);
           startActivity(myIntent);
           }
 	   return true;
   }
}