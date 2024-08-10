/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.Patient;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import Model.Employee;
import Model.Connect;

/**
 *
 * @author Admin
 */
public class ControlPatient {
    Connect info = new Connect();
    //them, sua, xoa
    public ControlPatient()
    {
        
    }
    public void ThemBenhNhan (Patient pat)
    {
        try (Connection con = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());Statement stm = con.createStatement();)
        {
            String SQL_ins = "insert into tb_patient values ('"+pat.getID()+"','"+pat.getName()+"',"+pat.getAge()+")";
            int upd = stm.executeUpdate(SQL_ins);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void XoaBenhNhan (String ID)
    {
        try (Connection con = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());Statement stm = con.createStatement();)
        {
            if(this.TimKiemBenhNhan(ID)==null)
            {
                System.out.println("Khong tim thay benh nhan!");
                return;
            }
            String SQL_ins = "delete from tb_patient where ID = '"+ID+"';";
            int upd = stm.executeUpdate(SQL_ins);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public Patient TimKiemBenhNhan(String ID)
    {
        try (Connection con = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());Statement stm = con.createStatement();)
        {
            String SQL_ins = "select * from tb_patient where = '"+ID+"'";
            ResultSet rs = stm.executeQuery(SQL_ins);
            while(rs.next())
            {
                Patient new_pat = new Patient(rs.getString("id"),rs.getString("name"),rs.getString("age"));
                return new_pat;
            }
            return null;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public void SuaBenhNhan(Patient pat)
    {
        try (Connection con = DriverManager.getConnection(info.getUrl(),info.getUser(),info.getPassword());Statement stm = con.createStatement();)
        {
            String SQL_ins = "update tb_employee set name ='"+pat.getName()+"', age = "+pat.getAge()+")";
            int upd = stm.executeUpdate(SQL_ins);
        }
        catch(SQLException e)
        {
            
        }
    }
}
