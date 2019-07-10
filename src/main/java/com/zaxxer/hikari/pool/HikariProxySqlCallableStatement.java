package com.zaxxer.hikari.pool;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.util.SQLUtil;

public class HikariProxySqlCallableStatement extends ProxyCallableStatement implements AutoCloseable, Wrapper, PreparedStatement, CallableStatement, Statement{
    private ArrayList<String> parameterValues;
    private Map<String, Object> parameterNameValue;
    /**
     * 原始sql
     */
    private String sql;
    private String sqlTemplate;
    private Logger logger = LoggerFactory.getLogger(HikariProxySqlCallableStatement.class);

	
	
	/**
	 * Saves the parameter value <code>obj</code> for the specified <code>position</code> for use in logging output
	 *
	 * @param position position (starting at 1) of the parameter to save
	 * @param obj java.lang.Object the parameter value to save
	 */
    private void saveQueryParamValue(int position, Object obj) {
	
	// if we are setting a position larger than current size of
	// parameterValues, first make it larger
	while (position >= parameterValues.size()) {
	    parameterValues.add(null);
	}
	// save the parameter
	parameterValues.set(position, SQLUtil.getParameterValue(obj));
    }
    private void saveQueryParamValue(String parameterName, Object obj) {
	parameterNameValue.put(parameterName,SQLUtil.getParameterValue(obj));
    }
    


    public  boolean isWrapperFor(final Class<?> clazz) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).isWrapperFor(clazz);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ResultSet executeQuery() throws SQLException {
        try {
            logger.debug(SQLUtil.getSQLLog(sql, sqlTemplate, parameterValues));
            return super.executeQuery();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int executeUpdate() throws SQLException {
        try {
            logger.debug(SQLUtil.getSQLLog(sql, sqlTemplate, parameterValues));
            return super.executeUpdate();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNull(final int n, final int n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNull(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBoolean(final int n, final boolean b) throws SQLException {
        try {
            saveQueryParamValue(n, b);
            ((CallableStatement)((ProxyStatement)this).delegate).setBoolean(n, b);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setByte(final int n, final byte b) throws SQLException {
        try {
            saveQueryParamValue(n, b);
            ((CallableStatement)((ProxyStatement)this).delegate).setByte(n, b);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setShort(final int n, final short n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((CallableStatement)((ProxyStatement)this).delegate).setShort(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setInt(final int n, final int n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((CallableStatement)((ProxyStatement)this).delegate).setInt(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setLong(final int n, final long n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((CallableStatement)((ProxyStatement)this).delegate).setLong(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setFloat(final int n, final float n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((CallableStatement)((ProxyStatement)this).delegate).setFloat(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDouble(final int n, final double n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((CallableStatement)((ProxyStatement)this).delegate).setDouble(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBigDecimal(final int n, final BigDecimal bigDecimal) throws SQLException {
        try {
            saveQueryParamValue(n, bigDecimal);
            ((CallableStatement)((ProxyStatement)this).delegate).setBigDecimal(n, bigDecimal);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setString(final int n, final String s) throws SQLException {
        try {
            saveQueryParamValue(n, s);
            ((CallableStatement)((ProxyStatement)this).delegate).setString(n, s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBytes(final int n, final byte[] array) throws SQLException {
        try {
            saveQueryParamValue(n, array);
            ((CallableStatement)((ProxyStatement)this).delegate).setBytes(n, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDate(final int n, final Date date) throws SQLException {
        try {
            saveQueryParamValue(n, date);
            ((CallableStatement)((ProxyStatement)this).delegate).setDate(n, date);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTime(final int n, final Time time) throws SQLException {
        try {
            saveQueryParamValue(n, time);
            ((CallableStatement)((ProxyStatement)this).delegate).setTime(n, time);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTimestamp(final int n, final Timestamp timestamp) throws SQLException {
        try {
            saveQueryParamValue(n, timestamp);
            ((CallableStatement)((ProxyStatement)this).delegate).setTimestamp(n, timestamp);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    @SuppressWarnings("deprecation")
    public void setUnicodeStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setUnicodeStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void clearParameters() throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).clearParameters();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final int n, final Object o, final int n2) throws SQLException {
        try {
            saveQueryParamValue(n, o);
            ((CallableStatement)((ProxyStatement)this).delegate).setObject(n, o, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final int n, final Object o) throws SQLException {
        try {
            saveQueryParamValue(n, o);
            ((CallableStatement)((ProxyStatement)this).delegate).setObject(n, o);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean execute() throws SQLException {
        try {
            logger.debug(SQLUtil.getSQLLog(sql, sqlTemplate, parameterValues));
            return super.execute();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void addBatch() throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).addBatch();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final int n, final Reader reader, final int n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setRef(final int n, final Ref ref) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setRef(n, ref);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final int n, final Blob blob) throws SQLException {
        try {
            saveQueryParamValue(n, blob);
            ((CallableStatement)((ProxyStatement)this).delegate).setBlob(n, blob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final int n, final Clob clob) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setClob(n, clob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setArray(final int n, final Array array) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setArray(n, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getMetaData();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDate(final int n, final Date date, final Calendar calendar) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setDate(n, date, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTime(final int n, final Time time, final Calendar calendar) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setTime(n, time, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTimestamp(final int n, final Timestamp timestamp, final Calendar calendar) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setTimestamp(n, timestamp, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNull(final int n, final int n2, final String s) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNull(n, n2, s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setURL(final int n, final URL url) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setURL(n, url);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ParameterMetaData getParameterMetaData() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getParameterMetaData();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setRowId(final int n, final RowId rowId) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setRowId(n, rowId);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNString(final int n, final String s) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNString(n, s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final int n, final NClob nClob) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNClob(n, nClob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setClob(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBlob(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNClob(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setSQLXML(final int n, final SQLXML sqlxml) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setSQLXML(n, sqlxml);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final int n, final Object o, final int n2, final int n3) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setObject(n, o, n2, n3);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setAsciiStream(n, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBinaryStream(n, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final int n, final Reader reader) throws SQLException {
        try {
            saveQueryParamValue(n, reader);
            ((CallableStatement)((ProxyStatement)this).delegate).setCharacterStream(n, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNCharacterStream(final int n, final Reader reader) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNCharacterStream(n, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final int n, final Reader reader) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setClob(n, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final int n, final InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBlob(n, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final int n, final Reader reader) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNClob(n, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void registerOutParameter(final int n, final int n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).registerOutParameter(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void registerOutParameter(final int n, final int n2, final int n3) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).registerOutParameter(n, n2, n3);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean wasNull() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).wasNull();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public String getString(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getString(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean getBoolean(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBoolean(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public byte getByte(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getByte(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public short getShort(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getShort(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getInt(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getInt(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public long getLong(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getLong(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public float getFloat(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getFloat(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public double getDouble(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getDouble(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    @SuppressWarnings("deprecation")
    public BigDecimal getBigDecimal(final int n, final int n2) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBigDecimal(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public byte[] getBytes(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBytes(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Date getDate(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getDate(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Time getTime(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTime(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTimestamp(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Object getObject(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getObject(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public BigDecimal getBigDecimal(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBigDecimal(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Object getObject(final int n, final Map<String, Class<?>> map) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getObject(n, map);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Ref getRef(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getRef(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Blob getBlob(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBlob(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Clob getClob(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getClob(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Array getArray(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getArray(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Date getDate(final int n, final Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getDate(n, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Time getTime(final int n, final Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTime(n, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final int n, final Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTimestamp(n, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void registerOutParameter(final int n, final int n2, final String s) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).registerOutParameter(n, n2, s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void registerOutParameter(final String s, final int n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).registerOutParameter(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void registerOutParameter(final String s, final int n, final int n2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).registerOutParameter(s, n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void registerOutParameter(final String s, final int n, final String s2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).registerOutParameter(s, n, s2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public URL getURL(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getURL(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setURL(final String s, final URL url) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setURL(s, url);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNull(final String s, final int n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNull(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBoolean(final String s, final boolean b) throws SQLException {
        try {
            saveQueryParamValue(s, b);
            ((CallableStatement)((ProxyStatement)this).delegate).setBoolean(s, b);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setByte(final String s, final byte b) throws SQLException {
        try {
            saveQueryParamValue(s, b);
            ((CallableStatement)((ProxyStatement)this).delegate).setByte(s, b);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setShort(final String parameterName, final short n) throws SQLException {
        try {
            saveQueryParamValue(parameterName, n);
            ((CallableStatement)((ProxyStatement)this).delegate).setShort(parameterName, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setInt(final String s, final int n) throws SQLException {
        try {
            saveQueryParamValue(s, n);
            ((CallableStatement)((ProxyStatement)this).delegate).setInt(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setLong(final String s, final long n) throws SQLException {
        try {
            saveQueryParamValue(s, n);
            ((CallableStatement)((ProxyStatement)this).delegate).setLong(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setFloat(final String s, final float n) throws SQLException {
        try {
            saveQueryParamValue(s, n);
            ((CallableStatement)((ProxyStatement)this).delegate).setFloat(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDouble(final String s, final double n) throws SQLException {
        try {
            saveQueryParamValue(s, n);
            ((CallableStatement)((ProxyStatement)this).delegate).setDouble(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBigDecimal(final String s, final BigDecimal bigDecimal) throws SQLException {
        try {
            saveQueryParamValue(s, bigDecimal);
            ((CallableStatement)((ProxyStatement)this).delegate).setBigDecimal(s, bigDecimal);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setString(final String s, final String s2) throws SQLException {
        try {
            saveQueryParamValue(s, s2);
            ((CallableStatement)((ProxyStatement)this).delegate).setString(s, s2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBytes(final String s, final byte[] array) throws SQLException {
        try {
            saveQueryParamValue(s, array);
            ((CallableStatement)((ProxyStatement)this).delegate).setBytes(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDate(final String s, final Date date) throws SQLException {
        try {
            saveQueryParamValue(s, date);
            ((CallableStatement)((ProxyStatement)this).delegate).setDate(s, date);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTime(final String s, final Time time) throws SQLException {
        try {
            saveQueryParamValue(s, time);
            ((CallableStatement)((ProxyStatement)this).delegate).setTime(s, time);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTimestamp(final String s, final Timestamp timestamp) throws SQLException {
        try {
            saveQueryParamValue(s, timestamp);
            ((CallableStatement)((ProxyStatement)this).delegate).setTimestamp(s, timestamp);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final String s, final InputStream inputStream, final int n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setAsciiStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final String s, final InputStream inputStream, final int n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBinaryStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final String s, final Object o, final int n, final int n2) throws SQLException {
        try {
            saveQueryParamValue(s, o);
            ((CallableStatement)((ProxyStatement)this).delegate).setObject(s, o, n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final String s, final Object o, final int n) throws SQLException {
        try {
            saveQueryParamValue(s, o);
            ((CallableStatement)((ProxyStatement)this).delegate).setObject(s, o, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final String s, final Object o) throws SQLException {
        try {
            saveQueryParamValue(s, o);
            ((CallableStatement)((ProxyStatement)this).delegate).setObject(s, o);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final String s, final Reader reader, final int n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setCharacterStream(s, reader, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDate(final String s, final Date date, final Calendar calendar) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setDate(s, date, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTime(final String s, final Time time, final Calendar calendar) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setTime(s, time, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTimestamp(final String s, final Timestamp timestamp, final Calendar calendar) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setTimestamp(s, timestamp, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNull(final String s, final int n, final String s2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNull(s, n, s2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public String getString(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getString(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean getBoolean(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBoolean(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public byte getByte(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getByte(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public short getShort(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getShort(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getInt(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getInt(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public long getLong(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getLong(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public float getFloat(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getFloat(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public double getDouble(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getDouble(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public byte[] getBytes(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBytes(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Date getDate(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getDate(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Time getTime(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTime(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTimestamp(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Object getObject(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getObject(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public BigDecimal getBigDecimal(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBigDecimal(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Object getObject(final String s, final Map<String, Class<?>> map) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getObject(s, map);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Ref getRef(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getRef(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Blob getBlob(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getBlob(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Clob getClob(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getClob(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Array getArray(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getArray(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Date getDate(final String s, final Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getDate(s, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Time getTime(final String s, final Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTime(s, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final String s, final Calendar calendar) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getTimestamp(s, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public URL getURL(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getURL(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public RowId getRowId(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getRowId(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public RowId getRowId(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getRowId(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setRowId(final String s, final RowId rowId) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setRowId(s, rowId);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNString(final String s, final String s2) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNString(s, s2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNCharacterStream(final String s, final Reader reader, final long n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNCharacterStream(s, reader, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final String s, final NClob nClob) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNClob(s, nClob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final String s, final Reader reader, final long n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setClob(s, reader, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final String s, final InputStream inputStream, final long n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBlob(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final String s, final Reader reader, final long n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNClob(s, reader, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public NClob getNClob(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getNClob(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public NClob getNClob(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getNClob(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setSQLXML(final String s, final SQLXML sqlxml) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setSQLXML(s, sqlxml);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public SQLXML getSQLXML(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getSQLXML(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public SQLXML getSQLXML(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getSQLXML(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public String getNString(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getNString(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public String getNString(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getNString(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Reader getNCharacterStream(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getNCharacterStream(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Reader getNCharacterStream(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getNCharacterStream(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Reader getCharacterStream(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getCharacterStream(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Reader getCharacterStream(final String s) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getCharacterStream(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final String s, final Blob blob) throws SQLException {
        try {
            saveQueryParamValue(s, blob);
            ((CallableStatement)((ProxyStatement)this).delegate).setBlob(s, blob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final String s, final Clob clob) throws SQLException {
        try {
            parameterNameValue.put(s, clob);
            ((CallableStatement)((ProxyStatement)this).delegate).setClob(s, clob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final String s, final InputStream inputStream, final long n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setAsciiStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final String s, final InputStream inputStream, final long n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBinaryStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final String s, final Reader reader, final long n) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setCharacterStream(s, reader, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final String s, final InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setAsciiStream(s, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final String s, final InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBinaryStream(s, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final String s, final Reader reader) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setCharacterStream(s, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNCharacterStream(final String s, final Reader reader) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNCharacterStream(s, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final String s, final Reader reader) throws SQLException {
        try {
            saveQueryParamValue(s, reader);
            ((CallableStatement)((ProxyStatement)this).delegate).setClob(s, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final String s, final InputStream inputStream) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setBlob(s, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final String s, final Reader reader) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setNClob(s, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public <T> T getObject(final int n, final Class<T> clazz) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getObject(n, (Class<T>)clazz);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public <T> T getObject(final String s, final Class<T> clazz) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getObject(s, (Class<T>)clazz);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ResultSet executeQuery(final String s) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.executeQuery(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int executeUpdate(final String s) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.executeUpdate(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getMaxFieldSize() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getMaxFieldSize();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setMaxFieldSize(final int maxFieldSize) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setMaxFieldSize(maxFieldSize);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getMaxRows() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getMaxRows();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setMaxRows(final int maxRows) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setMaxRows(maxRows);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setEscapeProcessing(final boolean escapeProcessing) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setEscapeProcessing(escapeProcessing);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getQueryTimeout() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getQueryTimeout();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setQueryTimeout(final int queryTimeout) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setQueryTimeout(queryTimeout);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void cancel() throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).cancel();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public SQLWarning getWarnings() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getWarnings();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void clearWarnings() throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).clearWarnings();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCursorName(final String cursorName) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setCursorName(cursorName);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean execute(final String s) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.execute(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ResultSet getResultSet() throws SQLException {
        try {
            return super.getResultSet();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getUpdateCount() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getUpdateCount();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean getMoreResults() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getMoreResults();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setFetchDirection(final int fetchDirection) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setFetchDirection(fetchDirection);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getFetchDirection() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getFetchDirection();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setFetchSize(final int fetchSize) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setFetchSize(fetchSize);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getFetchSize() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getFetchSize();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getResultSetConcurrency() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getResultSetConcurrency();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getResultSetType() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getResultSetType();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void addBatch(final String s) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).addBatch(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void clearBatch() throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).clearBatch();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int[] executeBatch() throws SQLException {
        try {
            logger.debug(SQLUtil.getSQLLog(sql, sqlTemplate, parameterValues));
            return super.executeBatch();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public Connection getConnection() throws SQLException {
        try {
            return super.getConnection();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean getMoreResults(final int n) throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getMoreResults(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ResultSet getGeneratedKeys() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getGeneratedKeys();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int executeUpdate(final String s, final int n) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.executeUpdate(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int executeUpdate(final String s, final int[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.executeUpdate(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int executeUpdate(final String s, final String[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.executeUpdate(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean execute(final String s, final int n) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.execute(s, n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean execute(final String s, final int[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.execute(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean execute(final String s, final String[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.execute(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getResultSetHoldability() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).getResultSetHoldability();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean isClosed() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).isClosed();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setPoolable(final boolean poolable) throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).setPoolable(poolable);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean isPoolable() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).isPoolable();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void closeOnCompletion() throws SQLException {
        try {
            ((CallableStatement)((ProxyStatement)this).delegate).closeOnCompletion();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean isCloseOnCompletion() throws SQLException {
        try {
            return ((CallableStatement)((ProxyStatement)this).delegate).isCloseOnCompletion();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    protected HikariProxySqlCallableStatement(final ProxyConnection proxyConnection, final CallableStatement callableStatement) {
        super(proxyConnection, callableStatement);
    }
    protected HikariProxySqlCallableStatement(final ProxyConnection proxyConnection, final CallableStatement callableStatement,String sql) {
        super(proxyConnection, callableStatement);
        parameterValues=new ArrayList<>();
        parameterNameValue=new HashMap<>();
        sqlTemplate=sql;
        this.sql=sql;
    }
}
