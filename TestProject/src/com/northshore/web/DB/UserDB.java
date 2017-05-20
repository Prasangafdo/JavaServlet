package com.northshore.web.DB;

import java.sql.*;

/**
 * Created by 150101002 on 5/20/2017.
 */
public class UserDB {
    private Connection connect;
    private ResultSet resultSet;
    private Statement statement;
    public void readDatabase() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/AIRPORT_SYS?"
                            + "user=root");
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM userdetails");
            writeResultSet(resultSet);
        }
        catch (Exception ex){
            ex.printStackTrace();

        }finally {
            //close();
        }
    }
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        while (resultSet.next()){
            String ID = resultSet.getString("ID");
            String Password = resultSet.getString("Password");
            String FirstName = resultSet.getString("FirstName");
            String LastName = resultSet.getString("LastName");

            System.out.println("ID: "+ID);
            System.out.println("Password: "+Password);
            System.out.println("FirstName: "+FirstName);
            System.out.println("LastName: "+LastName);
        }

    }
    private void close(){
       /* try {

            if (resultSet != null ){
                resultSet.close();
            }
            if (statement != null){
                resultSet.close();
            }
        }*/
    }

    public static void main(String[] args) throws Exception {
        UserDB access = new UserDB();
        access.readDatabase();
    }
}
