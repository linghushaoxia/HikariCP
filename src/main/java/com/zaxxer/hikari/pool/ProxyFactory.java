package com.zaxxer.hikari.pool;

import com.zaxxer.hikari.util.*;
import java.sql.*;

public final class ProxyFactory
{
    private ProxyFactory() {
    }
    
    static ProxyConnection getProxyConnection(final PoolEntry poolEntry, final Connection connection, final FastList<Statement> list, final ProxyLeakTask proxyLeakTask, final long n, final boolean b, final boolean b2) {
        return new HikariProxyConnection(poolEntry, connection, list, proxyLeakTask, n, b, b2);
    }
    
    static Statement getProxyStatement(final ProxyConnection proxyConnection, final Statement statement) {
        return new HikariProxySqlStatement(proxyConnection, statement);
    }
    static Statement getProxyStatement(final ProxyConnection proxyConnection, final Statement statement,String sql) {
        return new HikariProxySqlStatement(proxyConnection, statement,sql);
    }
    
    static CallableStatement getProxyCallableStatement(final ProxyConnection proxyConnection, final CallableStatement callableStatement,String sql) {
        return (CallableStatement)new HikariProxySqlCallableStatement(proxyConnection, callableStatement);
    }
    static CallableStatement getProxyCallableStatement(final ProxyConnection proxyConnection, final CallableStatement callableStatement) {
        return (CallableStatement)new HikariProxySqlCallableStatement(proxyConnection, callableStatement);
    }
    
    static PreparedStatement getProxyPreparedStatement(final ProxyConnection proxyConnection, final PreparedStatement preparedStatement) {
        return new HikariProxySqlPreparedStatement(proxyConnection, preparedStatement);
    }
    static PreparedStatement getProxyPreparedStatement(final ProxyConnection proxyConnection, final PreparedStatement preparedStatement,String sql) {
        return new HikariProxySqlPreparedStatement(proxyConnection, preparedStatement,sql);
    }
    
    static ResultSet getProxyResultSet(final ProxyConnection proxyConnection, final ProxyStatement proxyStatement, final ResultSet set) {
        return new HikariProxyResultSet(proxyConnection, proxyStatement, set);
    }
    
}
