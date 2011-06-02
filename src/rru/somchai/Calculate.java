package rru.somchai;


import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;

public class Calculate extends Activity {
  
	/** Called when the activity is first created. */
	
 TextView tvResult;
 EditText etInput1,etInput2;
 Button btPlus,btMinus,btMultiply,btDiv,btClear;
 float res;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
   tvResult = (TextView)findViewById(R.id.TextView05);
   etInput1 = (EditText)findViewById(R.id.EditText02);
   etInput2 = (EditText)findViewById(R.id.EditText01);
   btPlus = (Button)findViewById(R.id.Button01);
   btMinus = (Button)findViewById(R.id.Button02);
   btMultiply = (Button)findViewById(R.id.Button03);
   btDiv = (Button)findViewById(R.id.Button04);
   btClear = (Button) findViewById(R.id.Button05);
       
   btPlus.setOnClickListener(new View.OnClickListener() {
	
	public void onClick(View v) {
		res = Float.parseFloat(etInput1.getText().toString())+Float.parseFloat(etInput2.getText().toString());
		tvResult.setText(String.valueOf(res));
		// TODO Auto-generated method stub
		
	}
});
    btMinus.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			res = Float.parseFloat(etInput1.getText().toString())- Float.parseFloat(etInput2.getText().toString());
			tvResult.setText(String.valueOf(res));
			
		}
	});
    
    btMultiply.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		res = Float.parseFloat(etInput1.getText().toString())* Float.parseFloat(etInput2.getText().toString());
		tvResult.setText(String.valueOf(res));	
			
		}
	});
    
    btDiv.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			res = Float.parseFloat(etInput1.getText().toString())/ Float.parseFloat(etInput2.getText().toString());
			tvResult.setText(String.valueOf(res));
			
		}
	});
    btClear.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			tvResult.setText("");
			etInput1.setText("");
			etInput2.setText("");
			
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