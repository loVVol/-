package my.games.firstgame.database;
import android.database.sqlite.*;
import android.content.*;

public class BASEDBMANAGER
{
	private BASEDBhelper basedbhelper;
	private SQLiteDatabase db;
	public BASEDBMANAGER(Context context)
	{
		this.basedbhelper=new BASEDBhelper(context);
		db=basedbhelper.getWritableDatabase();
	}
	public void reBuildBaseDB()
	{
		
	}
}
