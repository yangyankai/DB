package shootbox.sqlite.SQLiteDAO;

/*******************************************************************
 * Create:	2015-08-11 11:16:39
 * Author:	刘晔瑛
 * Function:配置包名(使用前请修改包名)
 * Version:	1.0
 *******************************************************************/
public class Config
{
	public static final String COLUMN_NAME				= "*";
	public static final String DB_PATH           = "schema";
	public static final String DB_EXT            = ".db";
	public static final String DB3_EXT           = ".db3";
	public static final String DB_SHELL_SQL_EXT = ".sql";
	public static final String DB_NAME           = "shootbox";
	public static final String DB_ALL_NAME      = DB_NAME + DB_EXT;				// 数据库名字shootbox.db
	public static final String DB3_ALL_NAME     = DB_NAME + DB3_EXT;			// 数据名字shootbox.db3
	public static final String DB_SHELL_SQL_FILE = DB_NAME + DB_SHELL_SQL_EXT;	// 组合的脚本名字shootbox.sql

	public static final String DB_ERROR			= "db-error";

	public static final int DB_VERSION = 1;

	public static int DB_OLD_VERSION = -1;
	public static final String SELECTION_TRUE				=" 1=1 ";
	public static final String SELECTION_FALSE				=" 1=0 ";
	public static final String SQL_LIKE							=" like ";
	public static final String SQL_AND							=" and ";
	public static final String SELECTION_TURE_TO_ONE   ="1";
	public static final String SQL_LIKE_ARGS			=" like ? ";
	public static final String COLUMN_QUOTES						= "";
	public static final int PAGENUM						= 1;
	public static final int PAGESIZE						= 300;
}
