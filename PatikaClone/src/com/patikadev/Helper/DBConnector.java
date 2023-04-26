package com.patikadev.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private  Connection connect = null;

    public  Connection connectDB(){

        //sql sıkıntısı için
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            // handle the error
        }

        try {
            this.connect= DriverManager.getConnection(Config.DB_URL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return this.connect;
    }


    public static  Connection getInstance(){
        DBConnector dbConnector = new DBConnector();
        return dbConnector.connectDB();

    }
}

