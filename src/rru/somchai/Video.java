package rru.somchai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.VideoView;

public class Video extends Activity {
	private  VideoView v;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main5);
        VideoView v=(VideoView)findViewById(R.id.VideoView01);
			v.setVideoPath("/sdcard/drugs.3gp");
			v.start();
        Toast.makeText(this, "โปรแกรมเล่นวิดีโอ",4).show();
    }
	public void onDestroy() {
		super.onDestroy();
		android.os.Process.killProcess(android.os.Process.myPid());
		} 

//menu
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