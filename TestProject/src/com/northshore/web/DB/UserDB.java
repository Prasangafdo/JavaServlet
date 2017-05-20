package com.northshore.web.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 150101002 on 5/20/2017.
 */
public class UserDB {
    private Connection connect;
    public void readDatabase() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/AIRPORT_SYS?"
                            + "user=root");
        }
        catch (Exception ex){
            ex.printStackTrace();

        }
    }
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()){
            String ID = resultSet.getString("ID");
            String Password = resultSet.getString("Password");
            String FirstName = resultSet.getString("FirstName");
            String LastName = resultSet.getString("LastName");
        }
    }

    /*public static void main(String[] args) throws Exception {
        MYSQLAccess access = new MYSQLAccess();
        access.readDatabase();
    }*/
}
