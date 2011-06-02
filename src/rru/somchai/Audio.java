package rru.somchai;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Audio extends Activity {
    /** Called when the activity is first created. */
	private MediaPlayer mp = new MediaPlayer();
;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main4);
        
			try {
				mp.setDataSource("/sdcard/mumu.mp3");
				mp.prepare();
				mp.start();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        Toast.makeText(this, "โปรแกรมเล่นเพลง",4).show();
    }
	public void onDestroy() {
		super.onDestroy();
		android.os.Process.killProcess(android.os.Process.myPid());
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
 	   mp.stop();
 	   return true;
   }

}