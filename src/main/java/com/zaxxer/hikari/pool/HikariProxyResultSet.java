package com.zaxxer.hikari.pool;

import java.math.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.sql.*;
import java.sql.Date;

public class HikariProxyResultSet extends ProxyResultSet implements AutoCloseable, Wrapper, ResultSet
{
    public void close() throws SQLException {
        super.delegate.close();
    }
    
    public boolean isWrapperFor(final Class<?> clazz) throws SQLException {
        try {
            return super.delegate.isWrapperFor(clazz);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean next() throws SQLException {
        try {
            return super.delegate.next();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean wasNull() throws SQLException {
        try {
            return super.delegate.wasNull();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public String getString(final int n) throws SQLException {
        try {
            return super.delegate.getString(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean getBoolean(final int n) throws SQLException {
        try {
            return super.delegate.getBoolean(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public byte getByte(final int n) throws SQLException {
        try {
            return super.delegate.getByte(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public short getShort(final int n) throws SQLException {
        try {
            return super.delegate.getShort(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getInt(final int n) throws SQLException {
        try {
            return super.delegate.getInt(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public long getLong(final int n) throws SQLException {
        try {
            return super.delegate.getLong(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public float getFloat(final int n) throws SQLException {
        try {
            return super.delegate.getFloat(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public double getDouble(final int n) throws SQLException {
        try {
            return super.delegate.getDouble(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    @SuppressWarnings("deprecation")
    public BigDecimal getBigDecimal(final int n, final int n2) throws SQLException {
        try {
            return super.delegate.getBigDecimal(n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public byte[] getBytes(final int n) throws SQLException {
        try {
            return super.delegate.getBytes(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Date getDate(final int n) throws SQLException {
        try {
            return super.delegate.getDate(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Time getTime(final int n) throws SQLException {
        try {
            return super.delegate.getTime(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final int n) throws SQLException {
        try {
            return super.delegate.getTimestamp(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public InputStream getAsciiStream(final int n) throws SQLException {
        try {
            return super.delegate.getAsciiStream(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    @SuppressWarnings("deprecation")
    public InputStream getUnicodeStream(final int n) throws SQLException {
        try {
            return super.delegate.getUnicodeStream(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public InputStream getBinaryStream(final int n) throws SQLException {
        try {
            return super.delegate.getBinaryStream(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public String getString(final String s) throws SQLException {
        try {
            return super.delegate.getString(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean getBoolean(final String s) throws SQLException {
        try {
            return super.delegate.getBoolean(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public byte getByte(final String s) throws SQLException {
        try {
            return super.delegate.getByte(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public short getShort(final String s) throws SQLException {
        try {
            return super.delegate.getShort(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getInt(final String s) throws SQLException {
        try {
            return super.delegate.getInt(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public long getLong(final String s) throws SQLException {
        try {
            return super.delegate.getLong(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public float getFloat(final String s) throws SQLException {
        try {
            return super.delegate.getFloat(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public double getDouble(final String s) throws SQLException {
        try {
            return super.delegate.getDouble(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    @SuppressWarnings("deprecation")
    public BigDecimal getBigDecimal(final String s, final int n) throws SQLException {
        try {
            return super.delegate.getBigDecimal(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public byte[] getBytes(final String s) throws SQLException {
        try {
            return super.delegate.getBytes(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Date getDate(final String s) throws SQLException {
        try {
            return super.delegate.getDate(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Time getTime(final String s) throws SQLException {
        try {
            return super.delegate.getTime(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final String s) throws SQLException {
        try {
            return super.delegate.getTimestamp(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public InputStream getAsciiStream(final String s) throws SQLException {
        try {
            return super.delegate.getAsciiStream(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    @SuppressWarnings("deprecation")
    public InputStream getUnicodeStream(final String s) throws SQLException {
        try {
            return super.delegate.getUnicodeStream(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public InputStream getBinaryStream(final String s) throws SQLException {
        try {
            return super.delegate.getBinaryStream(s);
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
    
    public String getCursorName() throws SQLException {
        try {
            return super.delegate.getCursorName();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        try {
            return super.delegate.getMetaData();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Object getObject(final int n) throws SQLException {
        try {
            return super.delegate.getObject(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Object getObject(final String s) throws SQLException {
        try {
            return super.delegate.getObject(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int findColumn(final String s) throws SQLException {
        try {
            return super.delegate.findColumn(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Reader getCharacterStream(final int n) throws SQLException {
        try {
            return super.delegate.getCharacterStream(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Reader getCharacterStream(final String s) throws SQLException {
        try {
            return super.delegate.getCharacterStream(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public BigDecimal getBigDecimal(final int n) throws SQLException {
        try {
            return super.delegate.getBigDecimal(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public BigDecimal getBigDecimal(final String s) throws SQLException {
        try {
            return super.delegate.getBigDecimal(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isBeforeFirst() throws SQLException {
        try {
            return super.delegate.isBeforeFirst();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isAfterLast() throws SQLException {
        try {
            return super.delegate.isAfterLast();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isFirst() throws SQLException {
        try {
            return super.delegate.isFirst();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean isLast() throws SQLException {
        try {
            return super.delegate.isLast();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void beforeFirst() throws SQLException {
        try {
            super.delegate.beforeFirst();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void afterLast() throws SQLException {
        try {
            super.delegate.afterLast();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean first() throws SQLException {
        try {
            return super.delegate.first();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean last() throws SQLException {
        try {
            return super.delegate.last();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getRow() throws SQLException {
        try {
            return super.delegate.getRow();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean absolute(final int n) throws SQLException {
        try {
            return super.delegate.absolute(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean relative(final int n) throws SQLException {
        try {
            return super.delegate.relative(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean previous() throws SQLException {
        try {
            return super.delegate.previous();
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
    
    public int getType() throws SQLException {
        try {
            return super.delegate.getType();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public int getConcurrency() throws SQLException {
        try {
            return super.delegate.getConcurrency();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean rowUpdated() throws SQLException {
        try {
            return super.delegate.rowUpdated();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean rowInserted() throws SQLException {
        try {
            return super.delegate.rowInserted();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public boolean rowDeleted() throws SQLException {
        try {
            return super.delegate.rowDeleted();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNull(final int n) throws SQLException {
        try {
            super.delegate.updateNull(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBoolean(final int n, final boolean b) throws SQLException {
        try {
            super.delegate.updateBoolean(n, b);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateByte(final int n, final byte b) throws SQLException {
        try {
            super.delegate.updateByte(n, b);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateShort(final int n, final short n2) throws SQLException {
        try {
            super.delegate.updateShort(n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateInt(final int n, final int n2) throws SQLException {
        try {
            super.delegate.updateInt(n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateLong(final int n, final long n2) throws SQLException {
        try {
            super.delegate.updateLong(n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateFloat(final int n, final float n2) throws SQLException {
        try {
            super.delegate.updateFloat(n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateDouble(final int n, final double n2) throws SQLException {
        try {
            super.delegate.updateDouble(n, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBigDecimal(final int n, final BigDecimal bigDecimal) throws SQLException {
        try {
            super.delegate.updateBigDecimal(n, bigDecimal);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateString(final int n, final String s) throws SQLException {
        try {
            super.delegate.updateString(n, s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBytes(final int n, final byte[] array) throws SQLException {
        try {
            super.delegate.updateBytes(n, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateDate(final int n, final Date date) throws SQLException {
        try {
            super.delegate.updateDate(n, date);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateTime(final int n, final Time time) throws SQLException {
        try {
            super.delegate.updateTime(n, time);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateTimestamp(final int n, final Timestamp timestamp) throws SQLException {
        try {
            super.delegate.updateTimestamp(n, timestamp);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateAsciiStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            super.delegate.updateAsciiStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBinaryStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        try {
            super.delegate.updateBinaryStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateCharacterStream(final int n, final Reader reader, final int n2) throws SQLException {
        try {
            super.delegate.updateCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateObject(final int n, final Object o, final int n2) throws SQLException {
        try {
            super.delegate.updateObject(n, o, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateObject(final int n, final Object o) throws SQLException {
        try {
            super.delegate.updateObject(n, o);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNull(final String s) throws SQLException {
        try {
            super.delegate.updateNull(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBoolean(final String s, final boolean b) throws SQLException {
        try {
            super.delegate.updateBoolean(s, b);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateByte(final String s, final byte b) throws SQLException {
        try {
            super.delegate.updateByte(s, b);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateShort(final String s, final short n) throws SQLException {
        try {
            super.delegate.updateShort(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateInt(final String s, final int n) throws SQLException {
        try {
            super.delegate.updateInt(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateLong(final String s, final long n) throws SQLException {
        try {
            super.delegate.updateLong(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateFloat(final String s, final float n) throws SQLException {
        try {
            super.delegate.updateFloat(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateDouble(final String s, final double n) throws SQLException {
        try {
            super.delegate.updateDouble(s, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBigDecimal(final String s, final BigDecimal bigDecimal) throws SQLException {
        try {
            super.delegate.updateBigDecimal(s, bigDecimal);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateString(final String s, final String s2) throws SQLException {
        try {
            super.delegate.updateString(s, s2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBytes(final String s, final byte[] array) throws SQLException {
        try {
            super.delegate.updateBytes(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateDate(final String s, final Date date) throws SQLException {
        try {
            super.delegate.updateDate(s, date);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateTime(final String s, final Time time) throws SQLException {
        try {
            super.delegate.updateTime(s, time);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateTimestamp(final String s, final Timestamp timestamp) throws SQLException {
        try {
            super.delegate.updateTimestamp(s, timestamp);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateAsciiStream(final String s, final InputStream inputStream, final int n) throws SQLException {
        try {
            super.delegate.updateAsciiStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBinaryStream(final String s, final InputStream inputStream, final int n) throws SQLException {
        try {
            super.delegate.updateBinaryStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateCharacterStream(final String s, final Reader reader, final int n) throws SQLException {
        try {
            super.delegate.updateCharacterStream(s, reader, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateObject(final String s, final Object o, final int n) throws SQLException {
        try {
            super.delegate.updateObject(s, o, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateObject(final String s, final Object o) throws SQLException {
        try {
            super.delegate.updateObject(s, o);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void insertRow() throws SQLException {
        try {
            super.insertRow();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateRow() throws SQLException {
        try {
            super.updateRow();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void deleteRow() throws SQLException {
        try {
            super.deleteRow();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void refreshRow() throws SQLException {
        try {
            super.delegate.refreshRow();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void cancelRowUpdates() throws SQLException {
        try {
            super.delegate.cancelRowUpdates();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void moveToInsertRow() throws SQLException {
        try {
            super.delegate.moveToInsertRow();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void moveToCurrentRow() throws SQLException {
        try {
            super.delegate.moveToCurrentRow();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Object getObject(final int n, final Map<String, Class<?>> map) throws SQLException {
        try {
            return super.delegate.getObject(n, map);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Ref getRef(final int n) throws SQLException {
        try {
            return super.delegate.getRef(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Blob getBlob(final int n) throws SQLException {
        try {
            return super.delegate.getBlob(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Clob getClob(final int n) throws SQLException {
        try {
            return super.delegate.getClob(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Array getArray(final int n) throws SQLException {
        try {
            return super.delegate.getArray(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Object getObject(final String s, final Map<String, Class<?>> map) throws SQLException {
        try {
            return super.delegate.getObject(s, map);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Ref getRef(final String s) throws SQLException {
        try {
            return super.delegate.getRef(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Blob getBlob(final String s) throws SQLException {
        try {
            return super.delegate.getBlob(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Clob getClob(final String s) throws SQLException {
        try {
            return super.delegate.getClob(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Array getArray(final String s) throws SQLException {
        try {
            return super.delegate.getArray(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Date getDate(final int n, final Calendar calendar) throws SQLException {
        try {
            return super.delegate.getDate(n, calendar);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Date getDate(final String s, final Calendar calendar) throws SQLException {
        try {
            return super.delegate.getDate(s, calendar);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Time getTime(final int n, final Calendar calendar) throws SQLException {
        try {
            return super.delegate.getTime(n, calendar);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Time getTime(final String s, final Calendar calendar) throws SQLException {
        try {
            return super.delegate.getTime(s, calendar);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final int n, final Calendar calendar) throws SQLException {
        try {
            return super.delegate.getTimestamp(n, calendar);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Timestamp getTimestamp(final String s, final Calendar calendar) throws SQLException {
        try {
            return super.delegate.getTimestamp(s, calendar);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public URL getURL(final int n) throws SQLException {
        try {
            return super.delegate.getURL(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public URL getURL(final String s) throws SQLException {
        try {
            return super.delegate.getURL(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateRef(final int n, final Ref ref) throws SQLException {
        try {
            super.delegate.updateRef(n, ref);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateRef(final String s, final Ref ref) throws SQLException {
        try {
            super.delegate.updateRef(s, ref);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBlob(final int n, final Blob blob) throws SQLException {
        try {
            super.delegate.updateBlob(n, blob);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBlob(final String s, final Blob blob) throws SQLException {
        try {
            super.delegate.updateBlob(s, blob);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateClob(final int n, final Clob clob) throws SQLException {
        try {
            super.delegate.updateClob(n, clob);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateClob(final String s, final Clob clob) throws SQLException {
        try {
            super.delegate.updateClob(s, clob);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateArray(final int n, final Array array) throws SQLException {
        try {
            super.delegate.updateArray(n, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateArray(final String s, final Array array) throws SQLException {
        try {
            super.delegate.updateArray(s, array);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public RowId getRowId(final int n) throws SQLException {
        try {
            return super.delegate.getRowId(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public RowId getRowId(final String s) throws SQLException {
        try {
            return super.delegate.getRowId(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateRowId(final int n, final RowId rowId) throws SQLException {
        try {
            super.delegate.updateRowId(n, rowId);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateRowId(final String s, final RowId rowId) throws SQLException {
        try {
            super.delegate.updateRowId(s, rowId);
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
    
    public boolean isClosed() throws SQLException {
        try {
            return super.delegate.isClosed();
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNString(final int n, final String s) throws SQLException {
        try {
            super.delegate.updateNString(n, s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNString(final String s, final String s2) throws SQLException {
        try {
            super.delegate.updateNString(s, s2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNClob(final int n, final NClob nClob) throws SQLException {
        try {
            super.delegate.updateNClob(n, nClob);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNClob(final String s, final NClob nClob) throws SQLException {
        try {
            super.delegate.updateNClob(s, nClob);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public NClob getNClob(final int n) throws SQLException {
        try {
            return super.delegate.getNClob(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public NClob getNClob(final String s) throws SQLException {
        try {
            return super.delegate.getNClob(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public SQLXML getSQLXML(final int n) throws SQLException {
        try {
            return super.delegate.getSQLXML(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public SQLXML getSQLXML(final String s) throws SQLException {
        try {
            return super.delegate.getSQLXML(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateSQLXML(final int n, final SQLXML sqlxml) throws SQLException {
        try {
            super.delegate.updateSQLXML(n, sqlxml);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateSQLXML(final String s, final SQLXML sqlxml) throws SQLException {
        try {
            super.delegate.updateSQLXML(s, sqlxml);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public String getNString(final int n) throws SQLException {
        try {
            return super.delegate.getNString(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public String getNString(final String s) throws SQLException {
        try {
            return super.delegate.getNString(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Reader getNCharacterStream(final int n) throws SQLException {
        try {
            return super.delegate.getNCharacterStream(n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public Reader getNCharacterStream(final String s) throws SQLException {
        try {
            return super.delegate.getNCharacterStream(s);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            super.delegate.updateNCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNCharacterStream(final String s, final Reader reader, final long n) throws SQLException {
        try {
            super.delegate.updateNCharacterStream(s, reader, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateAsciiStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            super.delegate.updateAsciiStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBinaryStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            super.delegate.updateBinaryStream(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            super.delegate.updateCharacterStream(n, reader, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateAsciiStream(final String s, final InputStream inputStream, final long n) throws SQLException {
        try {
            super.delegate.updateAsciiStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBinaryStream(final String s, final InputStream inputStream, final long n) throws SQLException {
        try {
            super.delegate.updateBinaryStream(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateCharacterStream(final String s, final Reader reader, final long n) throws SQLException {
        try {
            super.delegate.updateCharacterStream(s, reader, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBlob(final int n, final InputStream inputStream, final long n2) throws SQLException {
        try {
            super.delegate.updateBlob(n, inputStream, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBlob(final String s, final InputStream inputStream, final long n) throws SQLException {
        try {
            super.delegate.updateBlob(s, inputStream, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateClob(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            super.delegate.updateClob(n, reader, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateClob(final String s, final Reader reader, final long n) throws SQLException {
        try {
            super.delegate.updateClob(s, reader, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNClob(final int n, final Reader reader, final long n2) throws SQLException {
        try {
            super.delegate.updateNClob(n, reader, n2);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNClob(final String s, final Reader reader, final long n) throws SQLException {
        try {
            super.delegate.updateNClob(s, reader, n);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNCharacterStream(final int n, final Reader reader) throws SQLException {
        try {
            super.delegate.updateNCharacterStream(n, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNCharacterStream(final String s, final Reader reader) throws SQLException {
        try {
            super.delegate.updateNCharacterStream(s, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateAsciiStream(final int n, final InputStream inputStream) throws SQLException {
        try {
            super.delegate.updateAsciiStream(n, inputStream);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBinaryStream(final int n, final InputStream inputStream) throws SQLException {
        try {
            super.delegate.updateBinaryStream(n, inputStream);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateCharacterStream(final int n, final Reader reader) throws SQLException {
        try {
            super.delegate.updateCharacterStream(n, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateAsciiStream(final String s, final InputStream inputStream) throws SQLException {
        try {
            super.delegate.updateAsciiStream(s, inputStream);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBinaryStream(final String s, final InputStream inputStream) throws SQLException {
        try {
            super.delegate.updateBinaryStream(s, inputStream);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateCharacterStream(final String s, final Reader reader) throws SQLException {
        try {
            super.delegate.updateCharacterStream(s, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBlob(final int n, final InputStream inputStream) throws SQLException {
        try {
            super.delegate.updateBlob(n, inputStream);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateBlob(final String s, final InputStream inputStream) throws SQLException {
        try {
            super.delegate.updateBlob(s, inputStream);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateClob(final int n, final Reader reader) throws SQLException {
        try {
            super.delegate.updateClob(n, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateClob(final String s, final Reader reader) throws SQLException {
        try {
            super.delegate.updateClob(s, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNClob(final int n, final Reader reader) throws SQLException {
        try {
            super.delegate.updateNClob(n, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public void updateNClob(final String s, final Reader reader) throws SQLException {
        try {
            super.delegate.updateNClob(s, reader);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public <T> T getObject(final int n, final Class<T> clazz) throws SQLException {
        try {
            return super.delegate.getObject(n, (Class<T>)clazz);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    public <T> T getObject(final String s, final Class<T> clazz) throws SQLException {
        try {
            return super.delegate.getObject(s, (Class<T>)clazz);
        }
        catch (SQLException ex) {
            throw this.checkException(ex);
        }
    }
    
    protected HikariProxyResultSet(final ProxyConnection proxyConnection, final ProxyStatement proxyStatement, final ResultSet set) {
        super(proxyConnection, proxyStatement, set);
    }
}
