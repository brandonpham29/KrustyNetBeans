package mypackage;

import java.sql.*;
import javax.swing.*;

public class DBSearch {
    dbSetup my;
    Connection conn = null;
    Statement stmt;

    public DBSearch() {
        my = new dbSetup();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://csce-315-db.engr.tamu.edu/db901_group7_project2", my.getUser(), my.getPswd());
            stmt = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public ResultSet query(String sql_query) {
        ResultSet result;
        try {
            result = stmt.executeQuery(sql_query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error with sql query statement");
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            result = null;
        }
        return result;
    }

    public boolean update(String sql_update) {
        try {
            stmt.executeUpdate(sql_update);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error with sql update statement");
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
        return true;
    }

    public boolean insert(String sql_insert) {
        try {
            stmt.executeUpdate(sql_insert);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error with sql insert statement");
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
        return true;
    }

}


