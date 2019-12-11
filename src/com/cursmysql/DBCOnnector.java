package com.cursmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBCOnnector {
    private static Connection connection=null;

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/test";
        String pass="";
        String user = "root";
        try{
            Class.forName("com.cursmysql.jdbc.Driver");
            connection=DriverManager.getConnection(url,user,pass);
            System.out.println(connection);
            System.out.println("successfully connected to database!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
