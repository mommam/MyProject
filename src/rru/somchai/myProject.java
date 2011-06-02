package rru.somchai;


import rru.somchai.R.id;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class myProject extends Activity {
    /** Called when the activity is first created. */
	Button btMusic, btVDO, btCalculate, btCalculateBMI, btGoogleMap, btWebview, btSMS;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btMusic=(Button)findViewById(id.Button01);
        btVDO=(Button)findViewById(id.Button02);
        btCalculate=(Button)findViewById(id.Button03);
        btCalculateBMI=(Button)findViewById(id.Button04);
        btGoogleMap=(Button)findViewById(id.Button05);
        btWebview=(Button)findViewById(id.Button06);
        btSMS=(Button)findViewById(id.Button07);
        btMusic.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent=new Intent(v.getContext(),Audio.class);
				//myIntent.putExtras(bundle);
				startActivity(myIntent);
			}
		});
        btVDO.setOnClickListener(new View.OnClickListener() {
	       	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent myIntent=new Intent(v.getContext(),Video.class);
        		//myIntent.putExtras(bundle);
        		startActivity(myIntent);
        	}
        });
        btCalculate.setOnClickListener(new View.OnClickListener() {
	       	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent myIntent=new Intent(v.getContext(),Calculate.class);
        		startActivity(myIntent);
        	}
        });
        btCalculateBMI.setOnClickListener(new View.OnClickListener() {
           	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent myIntent=new Intent(v.getContext(),CalculateBMI.class);
        		startActivity(myIntent);
        	}
        });
        btGoogleMap.setOnClickListener(new View.OnClickListener() {
           	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent myIntent=new Intent(v.getContext(),GoogleMap.class);
        		startActivity(myIntent);
        	}
        });
        btWebview.setOnClickListener(new View.OnClickListener() {
           	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent myIntent=new Intent(v.getContext(),Webview.class);
        		startActivity(myIntent);
        	}
        });
        btSMS.setOnClickListener(new View.OnClickListener() {
           	@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		Intent myIntent=new Intent(v.getContext(),sms.class);
        		startActivity(myIntent);
        	}
        });
    }
}