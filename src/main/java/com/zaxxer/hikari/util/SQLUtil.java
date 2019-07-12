package com.zaxxer.hikari.util;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.format.org.hibernate.engine.jdbc.internal.FormatStyle;

/**功能说明：sql工具类
 * @author:qiaoruhong;e-mail： rhqiao@travelsky.com
 * @time:2018年8月24日下午2:21:59
 * @version:1.0
 *
 */
public class SQLUtil {
    private static Logger logger =LoggerFactory.getLogger(SQLUtil.class);
    /**
     * 
     * 功能说明:格式化sql语句
     * @param sql
     * @return
     * @time:2018年9月27日下午5:05:26
     * @author:qiaoruhong;e-mail： rhqiao@travelsky.com
     *
     */
    public static String formatSQL(String sql) {
	if (sql!=null && !"".equals(sql.trim())) {
	    try {
		// DDL
		if (sql.toLowerCase().trim().startsWith("create")
			|| sql.toLowerCase().trim().startsWith("alter")
			|| sql.toLowerCase().trim().startsWith("comment")) {
		    return FormatStyle.DDL.getFormatter().format(sql);
		} else {
		    return FormatStyle.BASIC.getFormatter().format(sql);
		}
	    }catch (Exception e) {
		logger.error("sql="+sql +"has error "+ e.getMessage(),e);
	    }
	}
	return sql;
    }
    public static <T> String arrayToStr(List<T> array) {
	StringBuffer buffer =new StringBuffer();
	
	for(Object object:array) {
	    buffer.append(object).append(",");
	}
	return buffer.toString();
    }
	/**
	 * 
	 * 功能说明:将日期封装为oracle的to_date函数的形式
	 * @param date
	 * @return
	 * @time 2018年9月18日下午8:55:51
	 * @author qiaoruhong;e-mail： rhqiao@travelsky.com
	 *
	 */
	public static String getOracleToDate(Date date) {
	    StringBuilder builder = new StringBuilder();
	    //时间戳
	    if (date instanceof Timestamp) {
		//判断精度(1-3常见)
		String[] tempDates = date.toString().split("\\.");
		if (tempDates.length==2) {
		    if (tempDates[1].length()==1) {
			builder.append("to_timestamp(").append("'").append(date.toString()).append("'").append(",");
			builder.append("'").append("yyyy-MM-dd HH24:mi:ss.ff1").append("'");
			builder.append(")");
			return builder.toString();
		    }
		    if (tempDates[1].length()==2) {
			builder.append("to_timestamp(").append("'").append(date.toString()).append("'").append(",");
			builder.append("'").append("yyyy-MM-dd HH24:mi:ss.ff2").append("'");
			builder.append(")");
			return builder.toString();
		    }
		    if (tempDates[1].length()==3) {
			builder.append("to_timestamp(").append("'").append(date.toString()).append("'").append(",");
			builder.append("'").append("yyyy-MM-dd HH24:mi:ss.ff3").append("'");
			builder.append(")");
			return builder.toString();
		    }
		    /**
		     * 4-6
		     */
		}
		
	}
	//日期
	if (date instanceof Date) {
	    builder.append("to_date(").append("'").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date)).append("'").append(",");
	    builder.append("'").append("yyyy-MM-dd HH24:mi:ss").append("'");
	    builder.append(")");
	    return builder.toString();
	}
	   return builder.toString();
	    
	}
	/**
	 * 
	 * 功能说明:
	 * @return
	 * @time 2018年9月19日上午9:35:35
	 * @author qiaoruhong;e-mail： rhqiao@travelsky.com
	 *
	 */
	public static String getSQLLog(String sql,String sqlTemplate,List<String> parameterValues) {
	    StringBuilder logBuilder = new StringBuilder();
	    logBuilder.append("\n");
	    logBuilder.append("##############################").append("\n");
	    logBuilder.append("原始sql:").append(SQLUtil.formatSQL(sql)).append(";\n");
	    if (parameterValues==null||parameterValues.size()==0) {
		logBuilder.append("sql参数为空，不需要参数化 \n");
	    }else {
		logBuilder.append("sql对应参数 :").append(getParameterValues(parameterValues)).append("\n");
		logBuilder.append("参数化sql:").append(SQLUtil.formatSQL(getQueryString(sqlTemplate, parameterValues))).append("\n");
	    }
	    
	    logBuilder.append("##############################").append("\n");
	    return logBuilder.toString();
	}
	public static String getSQLLog(String sql,String sqlTemplate,Map<String, String> parameterValues) {
	    throw new RuntimeException("暂未实现");
	}
	/**
	 * 
	 * 功能说明:
	 * @return
	 * @time 2018年9月19日上午9:35:40
	 * @author qiaoruhong;e-mail： rhqiao@travelsky.com
	 *
	 */
	private static String getParameterValues(List<String> parameterValues) {
	    if (parameterValues.size()>0) {
		//第一个为null,简单除去
		if (parameterValues.get(0)==null && parameterValues.size()>1) {
		    return parameterValues.subList(1, parameterValues.size()).toString();
		}
		return parameterValues.toString();
	    }
	    return "null";
	}
	public static String getParameterValue(Object obj) {
		String strValue =null;
		if (obj instanceof String) {
		    // if we have a String or Date , include '' in the saved value
		    strValue = "'" + obj + "'";
		} else if (obj instanceof Date) {
		    strValue = SQLUtil.getOracleToDate((Date) obj);
		} else if (obj instanceof StringReader) {
		    // 反射读取
		    try {
			Field field = StringReader.class.getDeclaredField("str");
			field.setAccessible(true);
			strValue = (String) field.get(obj);
		    } catch (Exception e) {
			e.printStackTrace();
		    }

		} else {

		    if (obj == null) {
			// convert null to the string null
			strValue = "null";
		    } else {
			// unknown object (includes all Numbers), just call toString
			strValue = obj.toString();
		    }
		}
		return strValue;
	    }
	public static String getQueryString(String sqlTemplate,List<String> parameterValues) {
		StringBuffer buf = new StringBuffer();
		int qMarkCount = 0;
		StringTokenizer tok = new StringTokenizer(sqlTemplate+" ", "?");
		while (tok.hasMoreTokens()) {
			String oneChunk = tok.nextToken();
			buf.append(oneChunk);

			try {
				Object value;
				if (parameterValues.size() > 1 + qMarkCount) {
					value = parameterValues.get(1 + qMarkCount++);
				} else {
					if (tok.hasMoreTokens()) {
						value = null;
					} else {
						value = "";
					}
				}
				buf.append("" + value);
			} catch (Throwable e) {
				buf.append("ERROR WHEN PRODUCING QUERY STRING FOR LOG."+ e.toString());
				// catch this without whining, if this fails the only thing wrong is probably this class
			}
		}
		return buf.toString().trim();
	}
}


