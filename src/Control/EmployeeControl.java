/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managehospital.Control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import managehospital.Model.Employee;

/**
 *
 * @author khaaz
 */
public class ControlEmployee {

    private String link = "jdbc:sqlserver://DESKTOP-RL2N7FO:1433;database=Hospital;integratedSecurity=true";
    private String user = "Pread";
    private String password = "123";

    public ControlEmployee() {

    }
    // Them, sua, xoa,tim kiem
    public void ThemNhanVien(Employee new_employee) throws SQLException {
        try (Connection con = DriverManager.getConnection(link, user, password); Statement stm = con.createStatement();) {
            String SQL_instruction = "insert into Employee values ('" + new_employee.getID() + "','" + new_employee.getName() + "'," + new_employee.getAge() + ",'" + new_employee.getType() + "');";
            int upd = stm.executeUpdate(SQL_instruction);

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public void XoaNhanVien(String ID)
    {
        try (Connection con = DriverManager.getConnection(link, user, password); Statement stm = con.createStatement();) 
        {
            String SQL_ins = "delete from Employee where ID ='"+ID+"';";
            System.out.println(SQL_ins);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void TimKiemNhanVien()
    {
        
    }
}
