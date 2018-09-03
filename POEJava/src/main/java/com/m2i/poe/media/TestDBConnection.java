package com.m2i.poe.media;

import java.sql.Connection;
import java.sql.DriverManager;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public class TestDBConnection {

    public static void main(String[] args) {
        String Url = "jdbc:sqlserver://DESKTOP-A0EMVTR\\SQLEXPRESS;DatabaseName=formation;user=sa;password=cgecge";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            System.out.println("Trying to connect");
            Connection connection = DriverManager.getConnection(Url);

            System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());
        } catch (Exception e) {
            System.out.println("Unable to make connection with DB");
            e.printStackTrace();
        }
    }
}