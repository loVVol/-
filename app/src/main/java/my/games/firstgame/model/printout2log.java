package my.games.firstgame.model;
import java.io.*;
import my.games.firstgame.database.GameSetting;
import java.util.*;
import java.sql.*;

public class printout2log
{
	File file=new File(GameSetting.LOGADDRESS);

	public void write(String txt)
	{
		if (txt == null)return;
		PrintStream out=null;
		if (!file.getParentFile().exists())
		{
			file.getParentFile().mkdirs();
		}


		try
		{
			out = new PrintStream(new FileOutputStream(file, true));
			;Calendar c=Calendar.getInstance();
			String d="("+String.valueOf(c.get(Calendar.YEAR)) + ".";
			if (c.get(Calendar.MONTH) < 9)
			{
				d = d + "0";
			}
			d = d + String.valueOf((c.get(Calendar.MONTH) + 1) + ".");
			if (c.get(Calendar.DAY_OF_MONTH) < 10)
			{
				d = d + "0";
			}
			d = d + String.valueOf(c.get(Calendar.DAY_OF_MONTH)+" ");
			if (c.get(Calendar.HOUR_OF_DAY) < 10)
			{
				d = d + "0";
			}
			d=d+c.get(Calendar.HOUR_OF_DAY)+":";
			if (c.get(Calendar.MINUTE) < 10)
			{
				d = d + "0";
			}
			d=d+c.get(Calendar.MINUTE)+":";
			if (c.get(Calendar.SECOND) < 10)
			{
				d = d + "0";
			}
			d=d+c.get(Calendar.SECOND)+")";
			
			out.println(d + txt);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (out != null)
			{
				out.close();
			}
		}
	}
	public String read()
	{
		Scanner scan=null;
		StringBuilder sb=new StringBuilder();
		try
		{
			scan = new Scanner(new FileInputStream(GameSetting.LOGADDRESS));
			while (scan.hasNext())
			{
				sb.append(scan.next() + "\n");
			}
			return sb.toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (scan != null)
			{
				scan.close();
			}
		}
		return null;

	}
}
