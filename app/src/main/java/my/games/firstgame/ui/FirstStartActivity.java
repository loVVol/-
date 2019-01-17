package my.games.firstgame.ui;
import android.app.*;
import android.os.*;
import android.content.pm.*;
import android.view.*;
import my.games.firstgame.*;

public class FirstStartActivity extends Activity
{

	@Override
	public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState, persistentState);
		
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		//设置去除ActionBar 
        requestWindowFeature(Window.FEATURE_NO_TITLE);  
        //设置全屏  
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,   
							 WindowManager.LayoutParams.FLAG_FULLSCREEN);  

        setContentView(R.layout.firststart); 
		
	}
	
}
