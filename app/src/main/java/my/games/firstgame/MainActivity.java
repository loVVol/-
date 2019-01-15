package my.games.firstgame;

import android.app.*;
import android.os.*;
import my.games.firstgame.database.BASEDBhelper;
import android.widget.*;
import my.games.firstgame.model.printout2log;
import android.view.View.*;
import android.view.*;
import android.content.pm.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		//设置去除ActionBar 
        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        //设置全屏  
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,   
							 WindowManager.LayoutParams.FLAG_FULLSCREEN);  

        setContentView(R.layout.main);  
		
		
        setContentView(R.layout.lodingxml);
		textv=(TextView)findViewById(R.id.ttt);
		readbtn=(Button)findViewById(R.id.read);
		writebtn=(Button)findViewById(R.id.write);
		readbtn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					read();
					// TODO: Implement this method
				}
		});
		writebtn.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					write();
					// TODO: Implement this method
				}
			});
		
	}
	
	
	
	Button readbtn;
	Button writebtn;
	TextView textv;
	
	private printout2log pp=new printout2log();
	public void write()
	{
		
		pp.write(textv.getText().toString());
		
	}
	public void read()
	{
		textv.setText(pp.read());
	}
}
