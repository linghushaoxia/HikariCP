package com.zaxxer.hikari.pool;

import java.sql.*;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.util.SQLUtil;

public class HikariProxySqlStatement extends ProxyStatement implements AutoCloseable, Wrapper, Statement
{
    private String sql;
    private Logger logger  =LoggerFactory.getLogger(HikariProxySqlStatement.class);
    public boolean isWrapperFor(final Class<?> clazz) throws SQLException {
        try {
            return super.delegate.isWrapperFor(clazz);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public ResultSet executeQuery(final String s) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.executeQuery(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int executeUpdate(final String s) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.executeUpdate(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getMaxFieldSize() throws SQLException {
        try {
            return super.delegate.getMaxFieldSize();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setMaxFieldSize(final int maxFieldSize) throws SQLException {
        try {
            super.delegate.setMaxFieldSize(maxFieldSize);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getMaxRows() throws SQLException {
        try {
            return super.delegate.getMaxRows();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setMaxRows(final int maxRows) throws SQLException {
        try {
            super.delegate.setMaxRows(maxRows);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setEscapeProcessing(final boolean escapeProcessing) throws SQLException {
        try {
            super.delegate.setEscapeProcessing(escapeProcessing);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getQueryTimeout() throws SQLException {
        try {
            return super.delegate.getQueryTimeout();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setQueryTimeout(final int queryTimeout) throws SQLException {
        try {
            super.delegate.setQueryTimeout(queryTimeout);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void cancel() throws SQLException {
        try {
            super.delegate.cancel();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public SQLWarning getWarnings() throws SQLException {
        try {
            return super.delegate.getWarnings();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void clearWarnings() throws SQLException {
        try {
            super.delegate.clearWarnings();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setCursorName(final String cursorName) throws SQLException {
        try {
            super.delegate.setCursorName(cursorName);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean execute(final String s) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.execute(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public ResultSet getResultSet() throws SQLException {
        try {
            return super.getResultSet();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getUpdateCount() throws SQLException {
        try {
            return super.delegate.getUpdateCount();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean getMoreResults() throws SQLException {
        try {
            return super.delegate.getMoreResults();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setFetchDirection(final int fetchDirection) throws SQLException {
        try {
            super.delegate.setFetchDirection(fetchDirection);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getFetchDirection() throws SQLException {
        try {
            return super.delegate.getFetchDirection();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setFetchSize(final int fetchSize) throws SQLException {
        try {
            super.delegate.setFetchSize(fetchSize);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getFetchSize() throws SQLException {
        try {
            return super.delegate.getFetchSize();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getResultSetConcurrency() throws SQLException {
        try {
            return super.delegate.getResultSetConcurrency();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getResultSetType() throws SQLException {
        try {
            return super.delegate.getResultSetType();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void addBatch(final String s) throws SQLException {
        try {
            super.delegate.addBatch(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void clearBatch() throws SQLException {
        try {
            super.delegate.clearBatch();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int[] executeBatch() throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(sql));
            return super.executeBatch();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Connection getConnection() throws SQLException {
        try {
            return super.getConnection();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean getMoreResults(final int n) throws SQLException {
        try {
            return super.delegate.getMoreResults(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public ResultSet getGeneratedKeys() throws SQLException {
        try {
            return super.delegate.getGeneratedKeys();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int executeUpdate(final String s, final int n) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.executeUpdate(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int executeUpdate(final String s, final int[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.executeUpdate(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int executeUpdate(final String s, final String[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.executeUpdate(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean execute(final String s, final int n) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s));
            return super.execute(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean execute(final String s, final int[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.execute(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean execute(final String s, final String[] array) throws SQLException {
        try {
            logger.debug(SQLUtil.formatSQL(s)+"\n"+SQLUtil.arrayToStr(Arrays.asList(array)));
            return super.execute(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getResultSetHoldability() throws SQLException {
        try {
            return super.delegate.getResultSetHoldability();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isClosed() throws SQLException {
        try {
            return super.delegate.isClosed();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setPoolable(final boolean poolable) throws SQLException {
        try {
            super.delegate.setPoolable(poolable);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isPoolable() throws SQLException {
        try {
            return super.delegate.isPoolable();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void closeOnCompletion() throws SQLException {
        try {
            super.delegate.closeOnCompletion();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isCloseOnCompletion() throws SQLException {
        try {
            return super.delegate.isCloseOnCompletion();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    protected HikariProxySqlStatement(final ProxyConnection proxyConnection, final Statement statement) {
        super(proxyConnection, statement);
    }
    protected HikariProxySqlStatement(final ProxyConnection proxyConnection, final Statement statement,String sql) {
        super(proxyConnection, statement);
        this.sql=sql;
    }
}
