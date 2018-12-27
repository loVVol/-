package my.games.firstgame.data;
import java.util.*;

public class DATA_MAP
{
	private String map_id;//地图编号
	private String name;//地图名字
	private int commend;//地图推荐等级
	private int kind;//地图种类
	private int drop;//掉率
	private int enermy_total_num;//敌人总量
	private int enermy_num;//同时出现敌人最大数
	private int boss_total_num;//boss总量
	private int dropofemeny;//敌人出现几率
	private float F;//地图阻力
	private int drophp;//地图血球血量
	private int dropmp;//地图蓝球蓝量
	private int dropmoney;//地图金钱数量
	private int dropofhp;//血球出现几率
	private int dropofmp;//蓝球出现几率
	private int dropofmoney;//金钱出现几率
	private int time;//时间赛计时
	private Random random;
	class MAP_KIND{
		final static int SINGLE_HANDEDLY_NO_MOVE=1;
		final int PITCHED_BATTLE=2;
		final int SINGLE_HANDEDLY_CAN_MOVE=3;
		final int NOMAL=4;
		final int TIMEGAME=5;
		final int ALLINONE=6;
	}

	public DATA_MAP(String mapid)
	{

	}
	public DATA_MAP()
	{

	}
}
