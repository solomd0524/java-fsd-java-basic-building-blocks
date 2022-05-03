package com.dell.simplilearn.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class ConnectOracleJdbc {
    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String connectionString = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS = (PROTOCOL = TCP)(HOST = xxx.xxx.COM)(PORT = 111)) (CONNECT_DATA = (SERVER = DEDICATED) (SERVICE_NAME = xxx.xxxx.xxx.xxx.COM)))";
            String username = "xxx";
            String password = "xxxxxx";

            Connection con = getConnection(connectionString, username, password);
            if (Objects.nonNull(con)) {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sdr.customer_product where svc_tag_id = '27BGLM1'");

                while (rs.next()) {
                    System.out.println("orderNumber = " + rs.getString("order_num"));
                    System.out.println("orderBuid = " + rs.getString("order_business_unit_id"));
                    System.out.println("customerNumber = " + rs.getString("customer_num"));
                    System.out.println("serviceTag = " + rs.getString("svc_tag_id"));
                }
            }

            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(String connectionString, String username, String password) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(connectionString + "?user=" + username + "&password=" + password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
