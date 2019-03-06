package com.cybertek.utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;


    public static void setQuery(String query){
        try {
            connection = DriverManager.getConnection(ConfigurationReader.getProperty("dbUrl"),ConfigurationReader.getProperty("dbUserName"),
                    ConfigurationReader.getProperty("dbPassword"));
        } catch (SQLException e) {
            throw new RuntimeException("SQL- connection exception");
        }

        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            throw new RuntimeException("SQL- statement exception");
        }

        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            new RuntimeException("SQL- query exception");
        }

    }

    public static List<Map<String,Object>> getDataList() {
        try {
            List<Map<String, Object>> list = new ArrayList<>();
            ResultSetMetaData rsMData = resultSet.getMetaData();

            int colCount = rsMData.getColumnCount();


            while (resultSet.next()) {
                Map<String, Object> rowMap = new HashMap<>();
                for (int i = 1; i <= colCount; i++) {
                    rowMap.put(rsMData.getColumnName(i), resultSet.getObject(i));

                }
                list.add(rowMap);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException("SQL getDataList exception");
        }

    }


    public static List<Map<String, Object>> getQueryResultMap(String query) {
        setQuery(query);
        List<Map<String, Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                Map<String, Object> colNameValueMap = new HashMap<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    colNameValueMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
                }
                rowList.add(colNameValueMap);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rowList;
    }

    public boolean verifyEmployeeExists(String firstname, String lastname){
        String query = "SELECT COUNT(*) WHERE first_name = '%s' lastnam'%s'";
        query = String.format(query,firstname,lastname);
        setQuery(query);
        try {
            boolean exists = resultSet.getInt(1) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }


    public static void close(){
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        catch (SQLException ex){
            throw new RuntimeException("SQL- close exception");
        }
    }
}
