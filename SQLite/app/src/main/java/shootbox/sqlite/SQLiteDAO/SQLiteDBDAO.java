package shootbox.sqlite.SQLiteDAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/***************************************************************************
 * Created: Administrator
 * Date:    2015/8/8.${time}
 * Project: SQLiteTest
 * Version: ${VERSION}
 ***************************************************************************/
public class SQLiteDBDAO extends SQLiteOpenHelper
{
	private Context m_context;

	// 构造函数
	public SQLiteDBDAO(Context context, String strDB, CursorFactory cursorFactory, int nVersion)
	{
		super(context, strDB, cursorFactory, nVersion);
		m_context = context;

		if (!strDB.contains(Config.DB3_EXT) || !strDB.contains(Config.DB_EXT))
			strDB += Config.DB_EXT;

		m_context.openOrCreateDatabase(strDB, Context.MODE_PRIVATE, cursorFactory);
	}

	/************************************************************
	 * Create: 	    2015-8-11 12:24:33
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-11 12:24:33
	 * Modifier:    刘晔瑛
	 * Method:      onCreate
	 * Function:	第一次创建数据库时被调用，创建表结构在这里执行
	 * Access:
	 * Privalige:   public
	 * Parameter:	SQLiteDatabase sqliteDB			SQLiteDatabase对象
	 * Return:		void
	 ************************************************************/
	@Override
	public void onCreate(SQLiteDatabase sqliteDB)
	{
		// 执行schema/shootbox.sql脚本
		Log.e("aaa","create 0");
		executeSchema(sqliteDB, Config.DB_SHELL_SQL_FILE);
		Log.e("aaa", "create 1");
	}

	/************************************************************
	 * Create: 	    2015-8-11 12:24:33
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-11 12:24:33
	 * Modifier:    刘晔瑛
	 * Method:      onUpgrade
	 * Function:    更新数据库
	 * Access:
	 * Privalige:   public
	 * Parameter:	SQLiteDatabase sqliteDB			SQLiteDatabase对象
	 * 				int nOldVersion					旧版本号
	 *				int nNewVersion					新版本号
	 * Return:		void
	 ************************************************************/
	@Override
	public void onUpgrade(SQLiteDatabase sqliteDB, int nOldVersion, int nNewVersion)
	{
		// 数据库不升级
		if (nNewVersion <= nOldVersion)
			return;

		Config.DB_OLD_VERSION = nOldVersion;

		int nChangeCnt = nNewVersion - nOldVersion;

		// 依次执行updatei_i+1文件 由1更新到2 [1-2]，2更新到3 [2-3]
		for (int i=0; i< nChangeCnt; i++)
		{
			String schemaName = "update" + (nOldVersion + i) + "_" + (nOldVersion + i + 1) + Config.DB_SHELL_SQL_EXT;
			executeSchema(sqliteDB, schemaName);
		}
	}

	/************************************************************
	 * Create: 	    2015-8-11 12:24:33
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-11 12:24:33
	 * Modifier:    刘晔瑛
	 * Method:      executeSchema
	 * Function:    读取数据库文件（.sql），并执行sql语句
	 * Access:
	 * Privalige:   private
	 * Parameter:	SQLiteDatabase sqliteDB			SQLiteDatabase对象
	 * 				String strSchemaName			SQLiteDB执行的Shell脚本
	 * Return:		void
	 ************************************************************/
	private void executeSchema(SQLiteDatabase sqliteDB, String strSchemaName)
	{
		String strLine = "";
		String strBuff = "";
		String strShellSQLPath = "assets/" + Config.DB_PATH + "/" + strSchemaName;

		BufferedReader buffReader = null;

		try {
			// Elicpse中读取assets下文件的用法
			//InputStreamReader inputStreamReader = new InputStreamReader(m_context.getAssets().open(strShellSQLPath));

			//context.getClass().getClassLoader().getResourceAsStream("assets/"+names[i]);
			InputStream inputStream = m_context.getClass().getClassLoader().getResourceAsStream(strShellSQLPath);

			if (inputStream == null)
				return;

			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			buffReader = new BufferedReader(inputStreamReader);

			while ((strLine = buffReader.readLine()) != null)
			{
				strBuff += strLine;

				if (strLine.trim().endsWith(";"))
				{
					//sqliteDB.execSQL(strBuff.replace(";", ""));
					sqliteDB.execSQL(strBuff);
					strBuff = "";
				}
			}
		} catch (IOException e) {
			Log.e(Config.DB_ERROR, e.toString());
		} finally {
			try {
				if (buffReader != null)
					buffReader.close();
			} catch (IOException e) {
				Log.e(Config.DB_ERROR, e.toString());
			}
		}
	}
}
