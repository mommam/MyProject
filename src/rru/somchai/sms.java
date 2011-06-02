package rru.somchai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sms extends Activity {
    /** Called when the activity is first created. */
	public static EditText et1,et2;
	Button bt1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main7);
        et1=(EditText)findViewById(R.id.EditText01);
        et2=(EditText)findViewById(R.id.EditText02);
        bt1=(Button)findViewById(R.id.Button01);
        bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendSMS(et1.getText().toString(),et2.getText().toString());
				Toast t=new Toast(sms.this);
				t.setText("Sent Completel");
				t.setDuration(20);
				t.show();
				
			}
        });
    }
          private void sendSMS(String phoneNumber, String message)
        {                 
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNumber, null, message,null, null);        
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
