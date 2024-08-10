/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import Model.Employee;
import Model.Connect;

/**
 *
 * @author khaaz
 */
public class ControlEmployee {

    Connect info = new Connect();

    public ControlEmployee() {

    }

    // Them, sua, xoa,tim kiem
    public void ThemNhanVien(Employee new_employee) throws SQLException {
        try (Connection con = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassword()); Statement stm = con.createStatement();) {
            String SQL_ins = "insert into tb_employee values ('" + new_employee.getID() + "','" + new_employee.getName() + "'," + new_employee.getAge() + ",'" + new_employee.getType() + "'," + new_employee.getSalary() + ");";
            //System.out.println(SQL_ins);
            int upd = stm.executeUpdate(SQL_ins);

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void XoaNhanVien(String ID) {
        try (Connection con = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassword()); Statement stm = con.createStatement();) {
            String SQL_ins = "delete from Employee where ID ='" + ID + "';";
            System.out.println(SQL_ins);
            int upd = stm.executeUpdate(SQL_ins);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee TimKiemNhanVien(String emp_ID) {
        try (Connection con = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassword()); Statement stm = con.createStatement();) {
            String SQL_ins = "select * from tb_employee where ID = '" + emp_ID + "';";
            boolean isExist = false;
            ResultSet rs = stm.executeQuery(SQL_ins);
            while (rs.next()) {
                isExist = true;
                System.out.println("Ten: " + rs.getString("name") + "\nTuoi: " + rs.getString("age") + "\nChuc vu: " + rs.getString("type") + "\nLuong: " + rs.getString("salary"));
                Employee rt_emp = new Employee(emp_ID,rs.getString("name"),rs.getString("age"),rs.getString("type"),rs.getString("salary"));
                return rt_emp;
            }
            System.out.println("Khong tim thay nhan vien co ten trung khop");
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void SuaNhanVien(Employee emp) {
        try (Connection con = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassword()); Statement stm = con.createStatement();) {
            String SQL_ins = "update tb_employee set name ='"+emp.getName()+"', age = "+emp.getAge()+",type ='"+emp.getType();
            int upd = stm.executeUpdate(SQL_ins);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
