package com.zaxxer.hikari.pool;

import java.math.*;
import java.io.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.util.SQLUtil;

import java.net.*;
import java.sql.*;
import java.sql.Date;

public class HikariProxySqlPreparedStatement extends ProxyPreparedStatement implements Wrapper, AutoCloseable, PreparedStatement, Statement
{
    private ArrayList<String> parameterValues;
    /**
     * 原始sql
     */
    private String sql;
    private String sqlTemplate;
    private Logger logger = LoggerFactory.getLogger(HikariProxySqlPreparedStatement.class);
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
    public boolean isWrapperFor(final Class<?> clazz) throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).isWrapperFor(clazz);
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
            ((PreparedStatement)((ProxyStatement)this).delegate).setNull(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBoolean(final int n, final boolean b) throws SQLException {
        try {
            saveQueryParamValue(n, b);
            ((PreparedStatement)((ProxyStatement)this).delegate).setBoolean(n, b);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setByte(final int n, final byte b) throws SQLException {
        try {
            saveQueryParamValue(n, b);
            ((PreparedStatement)((ProxyStatement)this).delegate).setByte(n, b);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setShort(final int n, final short n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((PreparedStatement)((ProxyStatement)this).delegate).setShort(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setInt(final int n, final int n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((PreparedStatement)((ProxyStatement)this).delegate).setInt(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setLong(final int n, final long n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((PreparedStatement)((ProxyStatement)this).delegate).setLong(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setFloat(final int n, final float n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((PreparedStatement)((ProxyStatement)this).delegate).setFloat(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDouble(final int n, final double n2) throws SQLException {
        try {
            saveQueryParamValue(n, n2);
            ((PreparedStatement)((ProxyStatement)this).delegate).setDouble(n, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBigDecimal(final int n, final BigDecimal bigDecimal) throws SQLException {
        try {
            saveQueryParamValue(n, bigDecimal);
            ((PreparedStatement)((ProxyStatement)this).delegate).setBigDecimal(n, bigDecimal);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setString(final int n, final String s) throws SQLException {
        try {
            saveQueryParamValue(n, s);
            ((PreparedStatement)((ProxyStatement)this).delegate).setString(n, s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBytes(final int n, final byte[] array) throws SQLException {
        try {
            saveQueryParamValue(n, array);
            ((PreparedStatement)((ProxyStatement)this).delegate).setBytes(n, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDate(final int n, final Date date) throws SQLException {
        try {
            saveQueryParamValue(n, date);
            ((PreparedStatement)((ProxyStatement)this).delegate).setDate(n, date);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTime(final int n, final Time time) throws SQLException {
        try {
            saveQueryParamValue(n, time);
            ((PreparedStatement)((ProxyStatement)this).delegate).setTime(n, time);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTimestamp(final int n, final Timestamp timestamp) throws SQLException {
        try {
            saveQueryParamValue(n, timestamp);
            ((PreparedStatement)((ProxyStatement)this).delegate).setTimestamp(n, timestamp);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    @SuppressWarnings("deprecation")
    public void setUnicodeStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setUnicodeStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void clearParameters() throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).clearParameters();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final int n, final Object o, final int n2) throws SQLException {
        try {
            saveQueryParamValue(n, o);
            ((PreparedStatement)((ProxyStatement)this).delegate).setObject(n, o, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final int n, final Object o) throws SQLException {
        try {
            saveQueryParamValue(n, o);
            ((PreparedStatement)((ProxyStatement)this).delegate).setObject(n, o);
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
            ((PreparedStatement)((ProxyStatement)this).delegate).addBatch();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final int n, final Reader reader, final int n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setRef(final int n, final Ref ref) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setRef(n, ref);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final int n, final Blob blob) throws SQLException {
        try {
            saveQueryParamValue(n, blob);
            ((PreparedStatement)((ProxyStatement)this).delegate).setBlob(n, blob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final int n, final Clob clob) throws SQLException {
        try {
            saveQueryParamValue(n, clob);
            ((PreparedStatement)((ProxyStatement)this).delegate).setClob(n, clob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setArray(final int n, final Array array) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setArray(n, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getMetaData();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setDate(final int n, final Date date, final Calendar calendar) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setDate(n, date, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTime(final int n, final Time time, final Calendar calendar) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setTime(n, time, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setTimestamp(final int n, final Timestamp timestamp, final Calendar calendar) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setTimestamp(n, timestamp, calendar);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNull(final int n, final int n2, final String s) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setNull(n, n2, s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setURL(final int n, final URL url) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setURL(n, url);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ParameterMetaData getParameterMetaData() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getParameterMetaData();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setRowId(final int n, final RowId rowId) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setRowId(n, rowId);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNString(final int n, final String s) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setNString(n, s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setNCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final int n, final NClob nClob) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setNClob(n, nClob);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setClob(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setBlob(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setNClob(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setSQLXML(final int n, final SQLXML sqlxml) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setSQLXML(n, sqlxml);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setObject(final int n, final Object o, final int n2, final int n3) throws SQLException {
        try {
            saveQueryParamValue(n, o);
            ((PreparedStatement)((ProxyStatement)this).delegate).setObject(n, o, n2, n3);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setAsciiStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setBinaryStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setAsciiStream(n, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setBinaryStream(n, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCharacterStream(final int n, final Reader reader) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setCharacterStream(n, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNCharacterStream(final int n, final Reader reader) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setNCharacterStream(n, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setClob(final int n, final Reader reader) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setClob(n, reader);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setBlob(final int n, final InputStream inputStream) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setBlob(n, inputStream);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setNClob(final int n, final Reader reader) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setNClob(n, reader);
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
            return ((PreparedStatement)((ProxyStatement)this).delegate).getMaxFieldSize();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setMaxFieldSize(final int maxFieldSize) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setMaxFieldSize(maxFieldSize);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getMaxRows() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getMaxRows();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setMaxRows(final int maxRows) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setMaxRows(maxRows);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setEscapeProcessing(final boolean escapeProcessing) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setEscapeProcessing(escapeProcessing);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getQueryTimeout() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getQueryTimeout();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setQueryTimeout(final int queryTimeout) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setQueryTimeout(queryTimeout);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void cancel() throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).cancel();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public SQLWarning getWarnings() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getWarnings();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void clearWarnings() throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).clearWarnings();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setCursorName(final String cursorName) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setCursorName(cursorName);
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
            return ((PreparedStatement)((ProxyStatement)this).delegate).getUpdateCount();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean getMoreResults() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getMoreResults();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setFetchDirection(final int fetchDirection) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setFetchDirection(fetchDirection);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getFetchDirection() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getFetchDirection();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setFetchSize(final int fetchSize) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setFetchSize(fetchSize);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getFetchSize() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getFetchSize();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getResultSetConcurrency() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getResultSetConcurrency();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getResultSetType() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getResultSetType();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void addBatch(final String s) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).addBatch(s);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void clearBatch() throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).clearBatch();
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
            return ((PreparedStatement)((ProxyStatement)this).delegate).getMoreResults(n);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public ResultSet getGeneratedKeys() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getGeneratedKeys();
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
            logger.debug(SQLUtil.formatSQL(s)+"\n"+ SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.executeUpdate(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int executeUpdate(final String s, final String[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+ SQLUtil.arrayToStr(Arrays.asList(array)));
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
            logger.debug(SQLUtil.formatSQL(s)+"\n"+ SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.execute(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean execute(final String s, final String[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+ SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.execute(s, array);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public int getResultSetHoldability() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).getResultSetHoldability();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean isClosed() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).isClosed();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void setPoolable(final boolean poolable) throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).setPoolable(poolable);
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean isPoolable() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).isPoolable();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public void closeOnCompletion() throws SQLException {
        try {
            ((PreparedStatement)((ProxyStatement)this).delegate).closeOnCompletion();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    public boolean isCloseOnCompletion() throws SQLException {
        try {
            return ((PreparedStatement)((ProxyStatement)this).delegate).isCloseOnCompletion();
        }
        catch (SQLException ex) {
            throw ((ProxyStatement)this).checkException(ex);
        }
    }
    
    protected HikariProxySqlPreparedStatement(final ProxyConnection proxyConnection, final PreparedStatement preparedStatement) {
        super(proxyConnection, preparedStatement);
    }
    protected HikariProxySqlPreparedStatement(final ProxyConnection proxyConnection, final PreparedStatement preparedStatement,String sql) {
        super(proxyConnection, preparedStatement);
        parameterValues=new ArrayList<>();
        sqlTemplate=sql;
        this.sql=sql;
    }
}
