package com.zaxxer.hikari.pool;

import java.util.*;
import java.sql.*;
import java.util.concurrent.*;
import com.zaxxer.hikari.util.*;

public class HikariProxyConnection extends ProxyConnection implements AutoCloseable, Wrapper, Connection
{
    public Statement createStatement() throws SQLException {
        try {
            return super.createStatement();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public PreparedStatement prepareStatement(final String s) throws SQLException {
        try {
            return super.prepareStatement(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public CallableStatement prepareCall(final String s) throws SQLException {
        try {
            return super.prepareCall(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public String nativeSQL(final String s) throws SQLException {
        try {
            return super.delegate.nativeSQL(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setAutoCommit(final boolean autoCommit) throws SQLException {
        try {
            super.setAutoCommit(autoCommit);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean getAutoCommit() throws SQLException {
        try {
            return super.delegate.getAutoCommit();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void commit() throws SQLException {
        try {
            super.commit();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void rollback() throws SQLException {
        try {
            super.rollback();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isClosed() throws SQLException {
        try {
            return super.isClosed();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public DatabaseMetaData getMetaData() throws SQLException {
        try {
            return super.delegate.getMetaData();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setReadOnly(final boolean readOnly) throws SQLException {
        try {
            super.setReadOnly(readOnly);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isReadOnly() throws SQLException {
        try {
            return super.delegate.isReadOnly();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setCatalog(final String catalog) throws SQLException {
        try {
            super.setCatalog(catalog);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public String getCatalog() throws SQLException {
        try {
            return super.delegate.getCatalog();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setTransactionIsolation(final int transactionIsolation) throws SQLException {
        try {
            super.setTransactionIsolation(transactionIsolation);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getTransactionIsolation() throws SQLException {
        try {
            return super.delegate.getTransactionIsolation();
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
    
    public Statement createStatement(final int n, final int n2) throws SQLException {
        try {
            return super.createStatement(n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public PreparedStatement prepareStatement(final String s, final int n, final int n2) throws SQLException {
        try {
            return super.prepareStatement(s, n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public CallableStatement prepareCall(final String s, final int n, final int n2) throws SQLException {
        try {
            return super.prepareCall(s, n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        try {
            return super.delegate.getTypeMap();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setTypeMap(final Map<String, Class<?>> typeMap) throws SQLException {
        try {
            super.delegate.setTypeMap(typeMap);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setHoldability(final int holdability) throws SQLException {
        try {
            super.delegate.setHoldability(holdability);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getHoldability() throws SQLException {
        try {
            return super.delegate.getHoldability();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Savepoint setSavepoint() throws SQLException {
        try {
            return super.delegate.setSavepoint();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Savepoint setSavepoint(final String savepoint) throws SQLException {
        try {
            return super.delegate.setSavepoint(savepoint);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void rollback(final Savepoint savepoint) throws SQLException {
        try {
            super.rollback(savepoint);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void releaseSavepoint(final Savepoint savepoint) throws SQLException {
        try {
            super.delegate.releaseSavepoint(savepoint);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Statement createStatement(final int n, final int n2, final int n3) throws SQLException {
        try {
            return super.createStatement(n, n2, n3);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public PreparedStatement prepareStatement(final String s, final int n, final int n2, final int n3) throws SQLException {
        try {
            return super.prepareStatement(s, n, n2, n3);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public CallableStatement prepareCall(final String s, final int n, final int n2, final int n3) throws SQLException {
        try {
            return super.prepareCall(s, n, n2, n3);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public PreparedStatement prepareStatement(final String s, final int n) throws SQLException {
        try {
            return super.prepareStatement(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public PreparedStatement prepareStatement(final String s, final int[] array) throws SQLException {
        try {
            return super.prepareStatement(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public PreparedStatement prepareStatement(final String s, final String[] array) throws SQLException {
        try {
            return super.prepareStatement(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Clob createClob() throws SQLException {
        try {
            return super.delegate.createClob();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Blob createBlob() throws SQLException {
        try {
            return super.delegate.createBlob();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public NClob createNClob() throws SQLException {
        try {
            return super.delegate.createNClob();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public SQLXML createSQLXML() throws SQLException {
        try {
            return super.delegate.createSQLXML();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isValid(final int n) throws SQLException {
        try {
            return super.delegate.isValid(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setClientInfo(final String s, final String s2) throws SQLClientInfoException {
        super.delegate.setClientInfo(s, s2);
    }
    
    public void setClientInfo(final Properties clientInfo) throws SQLClientInfoException {
        super.delegate.setClientInfo(clientInfo);
    }
    
    public String getClientInfo(final String s) throws SQLException {
        try {
            return super.delegate.getClientInfo(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Properties getClientInfo() throws SQLException {
        try {
            return super.delegate.getClientInfo();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Array createArrayOf(final String s, final Object[] array) throws SQLException {
        try {
            return super.delegate.createArrayOf(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Struct createStruct(final String s, final Object[] array) throws SQLException {
        try {
            return super.delegate.createStruct(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setSchema(final String schema) throws SQLException {
        try {
            super.delegate.setSchema(schema);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public String getSchema() throws SQLException {
        try {
            return super.delegate.getSchema();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void abort(final Executor executor) throws SQLException {
        try {
            super.delegate.abort(executor);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void setNetworkTimeout(final Executor executor, final int n) throws SQLException {
        try {
            super.setNetworkTimeout(executor, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getNetworkTimeout() throws SQLException {
        try {
            return super.delegate.getNetworkTimeout();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    protected HikariProxyConnection(final PoolEntry poolEntry, final Connection connection, final FastList<Statement> list, final ProxyLeakTask proxyLeakTask, final long n, final boolean b, final boolean b2) {
        super(poolEntry, connection, list, proxyLeakTask, n, b, b2);
    }
}
