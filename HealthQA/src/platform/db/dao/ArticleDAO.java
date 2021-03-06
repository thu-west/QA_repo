package platform.db.dao;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import org.json.JSONObject;

import platform.db.database.ISHCDBConfig;
import platform.util.database.*;


public class ArticleDAO implements DAO{
	@Override
	public String getTableName() { return "article"; }
	@Override
	public String getTypeNamespace() { return type_namespace.divide(ISHCDBConfig.type_namespace_gain).toString(); }
	
	public static BigInteger website_namespace = null;
	public static BigInteger type_namespace = new BigInteger("000000000000000");
	public static BigInteger ID = null;
	public static String root = null;
	
	public String url; // 当前页面的url
	public String path; // 一般位于页面上方，格式xx>xxx>xxx
	public BigInteger author; // 创建人，可能是昵称，真实姓名等等
	public Date date; // 文章创建的日期（也可能是被转载的时间）
	public Time time; // 文章创建的时间（也可能是被转载的时间）
	public String topic; // 包含（新闻资讯，饮食营养，预防治疗，百科知识，视频，其他）
	public String tag; // 文章自己加入的标签，多标签以半角分号间隔。
	public String source; // 如果文章是被转载，会有一个转载来源，这个转载来源，有可能是一个根网站url，也有可能是一个精确url
	public String title; // 文章题目
	public JSONObject content;
	public int like_count; // 喜欢，顶，大拇指，支持……
	public int hate_count; // 不喜欢，踩，倒的大拇指，反对……
	public int click_count; // 阅读数，浏览数，点击数……
	public int share_count; // 分享数，转载数……
	public int favor_count; // 被收藏的次数
	public int reply_count; // 下方回复/评论的个数，有些网站会标明评论的个数

	public ArticleDAO() {
		content = new JSONObject();
		url = null;
		path = null;
		author = null;
		date = null;
		time = null;
		topic = null;
		tag = null;
		source = null;
		title = null;
		like_count = -1;
		hate_count = -1;
		click_count = -1;
		share_count = -1;
		favor_count = -1;
		reply_count = -1;
	}
	
	public BigInteger getID()
	{
		ID = ID.add(new BigInteger("1"));
		return ID;
	}
	
	public void setPosition(String _url, String _path){
		url = _url;
		path = _path;
	}
	
	public void setStatistic(int _like_count, int _hate_count, int _click_count, int _share_count, int _favor_count, int _reply_count){
		like_count = _like_count;
		hate_count = _hate_count;
		click_count = _click_count;
		share_count = _share_count;
		favor_count = _favor_count;
		reply_count = _reply_count;
	}
	
	public void setMetadata(BigInteger _author, String _date, String _time, String _topic, String _tag, String _source, String _title){
		if(_date != null){
			String[] date_temp = _date.split("-");
			String formated_date_string = String.format("%d-%02d-%02d", Integer.parseInt(date_temp[0]), Integer.parseInt(date_temp[1]), Integer.parseInt(date_temp[2]));
			date = Date.valueOf(formated_date_string);
		}
		if(_time != null){
			String[] time_temp = _time.split(":");
			String formated_time_string = String.format("%02d:%02d:%02d", Integer.parseInt(time_temp[0]), Integer.parseInt(time_temp[1]), Integer.parseInt(time_temp[2]));
			time = Time.valueOf(formated_time_string);
		}
		author = _author;
		topic = _topic;
		tag = _tag;
		source = _source;
		title = _title;
	}
	
	public void setAddContent(String _item, String _content){
		if ( content == null )
			content = new JSONObject();
		content.put(_item, _content);
	}
	
	public static void configure( String _root, String _website_namespace, String _start_ID )
	{
		initRootWebsite(_root);
		initWebsiteNamespace(_website_namespace);
		initStartID(_start_ID);
	}
	
	private static void initStartID(String _start_ID) {
		ID = website_namespace.add(type_namespace).add( new BigInteger(_start_ID) ).add(new BigInteger("-1"));
	}

	private static void initRootWebsite(String _root) {
		root = _root;
	}
	
	private static void initWebsiteNamespace(String namespace){
		website_namespace = new BigInteger(namespace).multiply(new BigInteger("10000000000000000"));
	}

	@Override
	public String[] insert() {
		String[] command = new String[1];
		command[0] = "insert into `article` " +
				"(`ID`,`root`,`url`,`path`,`author`," +
				"`date`,`time`,`topic`,`tag`,`source`,`title`," +
				"`content`,`like_count`,`hate_count`,`click_count`," +
				"`share_count`,`favor_count`,`reply_count`)" +
				" values " +
				"( "+ ValueTransfer.SqlValueFor(getID()) +", "+ ValueTransfer.SqlValueFor(root) +", "+ ValueTransfer.SqlValueFor(url) +", "+ ValueTransfer.SqlValueFor(path) +", "+ ValueTransfer.SqlValueFor(author) +", "+ ValueTransfer.SqlValueFor(date) +
				", "+ ValueTransfer.SqlValueFor(time) +", "+ ValueTransfer.SqlValueFor(topic) +", "+ ValueTransfer.SqlValueFor(tag) +", "+ ValueTransfer.SqlValueFor(source) +", "+ ValueTransfer.SqlValueFor(title) +
				", "+ ValueTransfer.SqlValueFor(content.toString()) +", "+ ValueTransfer.SqlValueFor(like_count) +", "+ ValueTransfer.SqlValueFor(hate_count) +", "+ ValueTransfer.SqlValueFor(click_count) +
				", "+ ValueTransfer.SqlValueFor(share_count) +", "+ ValueTransfer.SqlValueFor(favor_count) +", "+ ValueTransfer.SqlValueFor(reply_count) +")";
		return command;
	}

	@Override
	public String[] delete(String website_namespace, String start_ID,
			String end_ID) {
		BigInteger namespace = new BigInteger(website_namespace).multiply(new BigInteger("10000000000000000")).add(ArticleDAO.type_namespace);
		BigInteger lower, higher;
		if(start_ID == null){
			lower = namespace;
		}else{
			lower = namespace.add(new BigInteger(start_ID));
		}
		if(end_ID == null){
			higher = namespace.add(new BigInteger("99999999999999"));
		}else{
			higher = namespace.add(new BigInteger(end_ID));
		}
		String[] command = new String[1];
		command[0] = new String("delete from `article` where `ID`>="+lower.toString()+" and `ID`<="+higher.toString());
		return command;
	}
	
}
