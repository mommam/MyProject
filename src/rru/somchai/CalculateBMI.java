package rru.somchai;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
public class CalculateBMI extends Activity {
    /** Called when the activity is first created. */
	
	 TextView tvResult1,tvResult2;
	 EditText etHigh,etWeigh;
	 Button btOK,btClear;
	 float result,High,Weigh;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        
        tvResult1 = (TextView) findViewById(R.id.TextView01);
        tvResult2 = (TextView)findViewById(R.id.TextView02);
        etHigh = (EditText)findViewById(R.id.EditText01);
        etWeigh = (EditText)findViewById(R.id.EditText02);
        btOK = (Button)findViewById(R.id.Button01);
        btClear = (Button)findViewById(R.id.Button02);
        
        btOK.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			High = (Float.parseFloat(etHigh.getText().toString()))/100;
			Weigh = Float.parseFloat(etWeigh.getText().toString());
			result = (float) (Weigh /(Math.pow(High,2))) ;
			if(result<18.5){
				tvResult1.setText(String.valueOf(result));
				tvResult2.setText("Slim");
			}else if ((result>=18.5)&&(result<=23.4)) {
				tvResult1.setText(String.valueOf(result));
				tvResult2.setText("Normal");
				
			}else {
				tvResult1.setText(String.valueOf(result));
				tvResult2.setText("Fat");
			}
			}
		});
        btClear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tvResult1.setText("");
		        tvResult2.setText("");
		        etHigh.setText("");
		        etWeigh.setText("");
			}
		});
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