package com.cursmysql;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection =DBCOnnector.getConnection();
        //STudent.showStudents();
    }
}
