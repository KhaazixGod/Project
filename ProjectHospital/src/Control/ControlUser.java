/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.User;
import Model.Connect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class ControlUser {

    public ControlUser() {

    }
    Connect info = new Connect();
    // login and check
    public boolean DangNhap(User user) {
        
        try (Connection con = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassword()); Statement stm = con.createStatement();) {
            String name = user.getLoginName();
            String SQL_ins = "select * from tb_user where name = '" + name + "';";
            ResultSet rs = stm.executeQuery(SQL_ins);
            boolean isExist = false;
            while (rs.next()) {
                if (user.getPassword().equals(rs.getString("password"))) 
                {
                    isExist = true;
                }
            }
            return isExist;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public void ThemTaiKhoan(User user)
    {
        try(Connection con = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());Statement stm = con.createStatement();)
        {
            String SQL_ins = "insert into tb_user values ('"+user.getLoginName()+"','"+user.getPassword()+"');";
            int upd = stm.executeUpdate(SQL_ins);
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void XoaTaiKhoan(User user)
    {
        if (this.DangNhap(user)==false)
        {
            System.out.println("Ten dang nhap hoac mat khau khong dung");
            return;
        }
        try(Connection con = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());Statement stm = con.createStatement(); )
        {
            String SQL_ins = "delete from tb_user where name = '"+user.getLoginName()+"';";
            int upd = stm.executeUpdate(SQL_ins);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
