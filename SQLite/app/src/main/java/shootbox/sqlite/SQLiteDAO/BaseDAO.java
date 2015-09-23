package shootbox.sqlite.SQLiteDAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/*******************************************************************
 * Create:	2015-08-10 17:10:39
 * Author:	刘晔瑛
 * Function:基础DAO，每个DAO类都继承此类(使用前请修改包名)
 * Version:	1.0
 *******************************************************************/
public class BaseDAO<T>
{
	private Context        m_context;							// 上下文对象
	private SQLiteDatabase m_sqliteDB;						// SQLite数据库操作对象
	private String 			m_strDBName;					//数据库的名字
	// 构造函数
	public BaseDAO(Context context)
	{
		this.m_context = context;
		m_strDBName = Config.DB_ALL_NAME;
		SQLiteDBDAO sqliteDBDAO = new SQLiteDBDAO(m_context, m_strDBName, null, Config.DB_VERSION);
		m_sqliteDB = sqliteDBDAO.getWritableDatabase();
	}

	// 获取上下文
	public Context getContext()
	{
		return m_context;
	}

	/************************************************************
	 * Create: 	    2015-8-10 22:22:11
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 22:22:11
	 * Modifier:    刘晔瑛
	 * Method:      close
	 * Function:    关闭连接
	 * Access:
	 * Privalige:   public
	 * Parameter:
	 * Return:		void
	 ************************************************************/
	public void close()
	{
		if (m_sqliteDB != null && m_sqliteDB.isOpen())
			m_sqliteDB.close();
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:12:54
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:12:54
	 * Modifier:    刘晔瑛
	 * Method:      execSQL
	 * Function:    增加(insert)、删除(delete)、修改(update)
	 * 				执行【SQLite的DDL语句】调用此方法
	 * Access:
	 * Privalige:   public
	 * Parameter:   String strSQL					SQL语句
	 * Return:		void
	 ************************************************************/
	public void execSQL(String strSQL) throws SQLException
	{
		m_sqliteDB.execSQL(strSQL);
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:18:34
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:18:34
	 * Modifier:    刘晔瑛
	 * Method:      delete
	 * Function:    删除数据
	 * Access:
	 * Privalige:   public
	 * Parameter:   String strTable					表名
	 *				String strWhereClause			占位符，即删除条件   如：( id>? and time>?)
	 *				String[] arrStrWhereArgs		条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 * Return:		int								被删除的总数
	 ************************************************************/
	public int delete(	String strTable,
					  	String strWhereClause,
						String[] arrStrWhereArgs)
			throws SQLException
	{
		return m_sqliteDB.delete(strTable, strWhereClause, arrStrWhereArgs);
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:20:11
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:20:11
	 * Modifier:    刘晔瑛
	 * Method:      insert
	 * Function:    插入数据
	 * Access:
	 * Privalige:   public
	 * Parameter:   String strTable					表名
	 *				ContentValues contentValues		ContentValues对象	表示要修改的列，如： name="steven" 即 values.put("name", "steven");
	 * Return:		long							返回当前行ID值，如果失败返回-1
	 ************************************************************/
	public long insert(String strTable, ContentValues contentValues) throws SQLException
	{
		return this.insert(strTable, null, contentValues);
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:24:30
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:24:30
	 * Modifier:    刘晔瑛
	 * Method:      insert
	 * Function:    插入数据
	 * Access:`	1
	 * Privalige:   public
	 * Parameter:   String strTable					表名
	 *				ContentValues contentValues		ContentValues对象
	 *				String strNullColumnHack   		空列
	 * Return:		long							返回当前行ID值，如果失败返回-1
	 ************************************************************/
	public long insert(String strTable,
					   	String strNullColumnHack,
					   	ContentValues contentValues)
			throws SQLException
	{
		return m_sqliteDB.insertOrThrow(strTable, strNullColumnHack, contentValues);
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:33:20
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:33:20
	 * Modifier:    刘晔瑛
	 * Method:      update
	 * Function:    更新数据
	 * Access:
	 * Privalige:   public
	 * Parameter:   String strTable					表名
	 * 				ContentValues contentValues		ContentValues对象	表示要修改的列，如： name="steven" 即 values.put("name", "steven");
	 *				String strWhereClause			占位符，即删除条件   如：( id>? and time>?)
	 *				String[] arrStrWhereArgs		条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 * Return:		int								被更新的总数
	 ************************************************************/
	public int update(	String strTable,
					  	ContentValues contentValues,
						String strWhereClause,
						String[] arrStrWhereArgs)
	{
		return m_sqliteDB.update(strTable, contentValues, strWhereClause, arrStrWhereArgs);
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:43:00
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:43:00
	 * Modifier:    刘晔瑛
	 * Method:      query
	 * Function:    查询数据
	 * Access:
	 * Privalige:   public
	 * Parameter:   String strTable					表名
	 * 				String[] arrStrColumns			需要查询的列名
	 *				String strSelection				占位符，即查询条件    如：( id=?)
	 *				String[] arrStrSelectionArgs	条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 * Return:		Cursor							返回Cursor
	 ************************************************************/
	public Cursor query(	String strTable,
							String[] arrStrColumns,
							String strSelection,
							String[] arrStrSelectionArgs)
			throws SQLException
	{
		return m_sqliteDB.query(strTable, arrStrColumns, strSelection, arrStrSelectionArgs, null, null, null);
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:43:00
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:43:00
	 * Modifier:    刘晔瑛
	 * Method:      query
	 * Function:    查询数据
	 * Access:
	 * Privalige:   public
	 * Parameter:   String strTable					表名
	 * 				String[] arrStrColumns			需要查询的列名
	 *				String strSelection				占位符，即查询条件    如：( id=?)
	 *				String[] arrStrSelectionArgs	条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 *				String strOrderBy				排序              	 如：id desc
	 * Return:		Cursor							返回Cursor
	 ************************************************************/
	public Cursor query(String strTable,
						String[] arrStrColumns,
						String strSelection,
						String[] arrStrSelectionArgs,
						String strOrderBy)
			throws SQLException
	{
		return m_sqliteDB.query(strTable, arrStrColumns, strSelection, arrStrSelectionArgs, null, null, strOrderBy);
	}
	
	/************************************************************
	 * Create: 	    2015-8-10 18:43:00
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:43:00
	 * Modifier:    刘晔瑛
	 * Method:      query
	 * Function:    查询数据
	 * Access:
	 * Privalige:   public
	 * Parameter:   boolean bDistinct				每行是否唯一     	 true:唯一 | false:不唯一
	 * 				String strTable					表名
	 * 				String[] arrStrColumns			需要查询的列名
	 *				String strSelection				占位符，即查询条件    如：( id=?)
	 *				String[] arrStrSelectionArgs	条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 *				String strOrderBy				排序              	 如：id desc
	 *				String strLimit             	查询的条数           如：10
	 * Return:		Cursor							返回Cursor
	 ************************************************************/
	public Cursor query(boolean bDistinct,
						String strTable,
						String[] arrStrColumns,
						String strSelection,
						String[] arrStrSelectionArgs,
						String strOrderBy,
						String strLimit)
			throws SQLException
	{
		return m_sqliteDB.query(	bDistinct,
									strTable,
									arrStrColumns,
									strSelection,
									arrStrSelectionArgs,
									null,
									null,
									strOrderBy,
									strLimit);
	}

	/************************************************************
	 * Create: 	    2015-8-10 18:57:43
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 18:57:43
	 * Modifier:    刘晔瑛
	 * Method:      queryField
	 * Function:    查询某个字段
	 * Access:
	 * Privalige:   public
	 * Parameter:   Class<?> class_t				字节码				 如：String.class
	 * 				String strTable					表名
	 * 				String[] arrStrColumns			需要查询的列名
	 *				String strSelection				占位符，即查询条件    如：(id=?)
	 *				String[] arrStrSelectionArgs	条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 * Return:		Object							返回Object，即对应的类型
	 ************************************************************/
	public Object queryField(Class<?> class_t,
							 String strTable,
							 String[] arrStrColumns,
							 String strSelection,
							 String[] arrStrSelectionArgs)
			throws SQLException
	{
		Object object = null;

		// 查询单条记录
		Cursor cursor = m_sqliteDB.query(strTable, arrStrColumns, strSelection, arrStrSelectionArgs, null, null, null, "1");

		if (cursor.moveToFirst())
		{
			try
			{
				if (class_t == Integer.TYPE)
					object = cursor.getInt(0);
				else if (class_t == Long.TYPE)
					object = cursor.getLong(0);
				else if (class_t == Float.TYPE)
					object = cursor.getFloat(0);
				else if (class_t == Double.TYPE)
					object = cursor.getDouble(0);
				else if (class_t == Short.TYPE)
					object = cursor.getShort(0);
				else if (class_t == Boolean.TYPE)
					object = getBOOLEAN(cursor);
				else if (class_t == boolean.class)
					object = getBoolean(cursor);
				else if (class_t == String.class)
					object = cursor.getString(0);
				// blob
				else if (class_t == byte[].class)
					object = cursor.getBlob(0);

			} catch (Exception e) {
				Log.e("queryField", e.toString());
			}
		}

		cursor.close();

		return object;
	}

	/************************************************************
	 * Create: 	    2015-8-10 21:33:22
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 21:33:22
	 * Modifier:    刘晔瑛
	 * Method:      queryObject
	 * Function:    查询数据    单个对象
	 * Access:
	 * Privalige:   public
	 * Parameter:   Class<?> class_t				字节码				 如：String.class
	 * 				String strTable					表名
	 * 				String[] arrStrColumns			需要查询的列名
	 *				String strSelection				占位符，即查询条件    如：(id=?)
	 *				String[] arrStrSelectionArgs	条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 * Return:		Object							返回Object，即对应的类型
	 ************************************************************/
	// 告诉编译器忽略指定的警告，不用在编译完成后出现警告信息
	@SuppressWarnings("unchecked")
	public T queryObject(Class<?> class_t,
						 String strTable,
						 String[] arrStrColumns,
						 String strSelection,
						 String[] arrStrSelectionArgs)
			throws SQLException
	{
		// 查询单条记录
		Cursor cursor = m_sqliteDB.query(strTable, arrStrColumns, strSelection, arrStrSelectionArgs, null, null, null, "1");

		T templete = null;

		if (cursor.moveToFirst())
		{
			try{
				// 生成新的实例
				templete = (T) class_t.newInstance();
				
				// 把列的值，转换成对象里属性的值
				columnToField(templete, cursor);
				
			} catch(Exception e) {
				Log.e("newInstance error", "生成新实例时出错 ：" + e.toString());
			}
		}

		cursor.close();

		return templete;
	}

	/************************************************************
	 * Create: 	    2015-8-10 21:54:18
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 21:54:18
	 * Modifier:    刘晔瑛
	 * Method:      queryList
	 * Function:    查询数据    带分页功能
	 *
	 *
	 *
	 *
	 *
	 * Access:
	 * Privalige:   public
	 * Parameter:   Class<?> class_t				字节码				 如：String.class
	 * 				String strTable					表名
	 * 				String[] arrStrColumns			需要查询的列名
	 *				String strSelection				占位符，即查询条件    如：(id=?)
	 *				String[] arrStrSelectionArgs	条件里的参数,用来替换"?",第1个参数，代表第1个问号；第2个参数，代表第2个问号；以此类推......
	 *				Integer nPageNum				页码              	 不分页时，为null
	 *				Integer nPageSize				每页的个数        	 不分页时，为null
	 * Return:		List<T>							返回List，即列表
	 ************************************************************/
	// 告诉编译器忽略指定的警告，不用在编译完成后出现警告信息
	@SuppressWarnings("unchecked")
	public List<T> queryList(Class<?> class_t,
							 String strTable,
							 String[] arrStrColumns,
							 String strSelection,
							 String[] arrStrSelectionArgs,
							 String strOrderBy,
							 Integer nPageNum,
							 Integer nPageSize)
	{
		// 分页
		if (!(nPageNum == null || nPageSize ==null))
		{
			// 分页的起始位置
			int nPageStart = (nPageNum - 1) * nPageSize;

			strOrderBy = strOrderBy + " limit " + nPageStart + ", " + nPageSize;
		}
		
		// 查询数据
		Cursor cursor = m_sqliteDB.query(strTable, arrStrColumns, strSelection, arrStrSelectionArgs, null, null, strOrderBy);
		
		List<T> list = new ArrayList<T>();
		T templete = null;

		while (cursor.moveToNext())
		{
			try{
				// 生成新的实例
				templete = (T) class_t.newInstance();
			} catch(Exception e) {
				Log.e("newInstance error", "生成新实例时出错 ：" + e.toString());
			}
			
			// 把列的值，转换成对象里属性的值
			columnToField(templete, cursor);
			
			list.add(templete);
		}

		cursor.close();
		
		return list;
	}

	/************************************************************
	 * Create: 	    2015-8-10 22:24:33
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 22:24:33
	 * Modifier:    刘晔瑛
	 * Method:      beginTransaction
	 * Function:    开始事务
	 * Access:
	 * Privalige:   protected
	 * Parameter:
	 * Return:		void
	 ************************************************************/
	protected void beginTransaction()
	{
		m_sqliteDB.beginTransaction();
	}

	/************************************************************
	 * Create: 	    2015-8-10 22:26:33
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 22:26:33
	 * Modifier:    刘晔瑛
	 * Method:      commit
	 * Function:    提交及结束事务
	 * Access:
	 * Privalige:   protected
	 * Parameter:
	 * Return:		void
	 ************************************************************/
	protected void commit()
	{
		m_sqliteDB.setTransactionSuccessful();
		m_sqliteDB.endTransaction();
	}

	/************************************************************
	 * Create: 	    2015-8-10 22:26:33
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 22:26:33
	 * Modifier:    刘晔瑛
	 * Method:      rollback
	 * Function:    回滚事务
	 * Access:
	 * Privalige:   protected
	 * Parameter:
	 * Return:		void
	 ************************************************************/
	protected void rollback()
	{
		m_sqliteDB.endTransaction();
	}

	/************************************************************
	 * Create: 	    2015-8-10 22:14:18
	 * Author: 	    刘晔瑛
	 * Modify: 	    2015-8-10 22:14:18
	 * Modifier:    刘晔瑛
	 * Method:      columnToField
	 * Function:    把列的值，转换成对象里属性的值
	 * Access:
	 * Privalige:   private
	 * Parameter:   T templete
	 * 				Cursor cursor
	 * Return:		void
	 ************************************************************/
	private void columnToField(T templete, Cursor cursor)
	{
		// 获取T里的所有属性
		Field[] arrField = templete.getClass().getDeclaredFields();

		for (int i = 0; i < arrField.length; i++)
		{
			int columnIndex = cursor.getColumnIndex(arrField[i].getName());

			// 如果为-1，表示不存在此列
			if (columnIndex == -1)
				continue;

			Class<?> class_t = arrField[i].getType();

			// 设置成可访问，否则不能set值
			arrField[i].setAccessible(true);

			try
			{
				if (class_t == Integer.TYPE) {
					arrField[i].set(templete, cursor.getInt(columnIndex));
				}else if (class_t == Long.TYPE)
					arrField[i].set(templete, cursor.getLong(columnIndex));
				else if (class_t == Float.TYPE)
				 	arrField[i].set(templete, cursor.getFloat(columnIndex));
				else if (class_t == Double.TYPE)
				 	arrField[i].set(templete, cursor.getDouble(columnIndex));
				else if (class_t == Short.TYPE)
				 	arrField[i].set(templete, cursor.getShort(columnIndex));

				else if (class_t == boolean.class) {
					arrField[i].set(templete, getBoolean(cursor, columnIndex));
				}

				else if (class_t == Boolean.class) {
					arrField[i].set(templete, getBOOLEAN(cursor, columnIndex));
				}

				else if (class_t == String.class) {
						arrField[i].set(templete, cursor.getString(columnIndex));
					// blob
				}
				else if (class_t == byte[].class)
					arrField[i].set(templete, cursor.getBlob(columnIndex));

			} catch (Exception e) {
				Log.e("column to field error", "字段转换成对象时出错 ：" + e.toString());
			}
		}
	}

	private Object getBOOLEAN(Cursor cursor)
	{
		return (cursor.getInt(0) > 0) ? Boolean.class : null;
	}

	private Boolean getBOOLEAN(Cursor cursor, int nColumnIndex)
	{
		if(cursor.isNull(nColumnIndex))
			return null;
		else
		{
			if (cursor.getShort(nColumnIndex) > 0 || cursor.getLong(nColumnIndex) > 0)
				return true;
			else
				return false;
		}
	}

	private boolean getBoolean(Cursor cursor, int nColumnIndex)
	{
		if(cursor.isNull(nColumnIndex))
			return false;
		else
		{
			if (cursor.getShort(nColumnIndex) > 0 || cursor.getLong(nColumnIndex) > 0)
				return true;
			else
			return false;
		}
	}

	private Object getBoolean(Cursor cursor)
	{
		return (cursor.getInt(0) > 0) ? boolean.class : null;
	}
}
