/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Event;
import java.util.Scanner;
import Model.Employee;
import Control.ControlEmployee;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class EventEmployee {
    Scanner inp = new Scanner(System.in);
    public EventEmployee()
    {
        
    }
    public String Fix_str(String col,String col_name,String pre)
    {
        System.out.print(col_name+" cua nhan vien ?: ");
        String inp_str = inp.nextLine();
        if(inp_str == "\n")
        {
            return pre;
        }
        else
        {
            return inp_str;
        }
    }
    public void Add() throws SQLException
    {
        System.out.println("--------------------------------------");
        System.out.print("Nhap ID: ");
        String inp_ID = inp.nextLine();
        System.out.print("Nhap ten: ");
        String inp_name = inp.nextLine();
        System.out.print("Nhap tuoi: ");
        String inp_age = inp.next();
        String space = inp.nextLine();
        System.out.print("Nhap chuc vu: ");
        String inp_type = inp.nextLine();
        System.out.print("Nhap luong: ");
        String inp_sal = inp.next();
        space = inp.nextLine();
        Employee new_emp = new Employee(inp_ID,inp_name,inp_age,inp_type,inp_sal);
        ControlEmployee action = new ControlEmployee();
        action.ThemNhanVien(new_emp);
    }
    public void Delete()
    {
        System.out.print("Nhap ID nhan vien muon xoa: ");
        String inp_ID = inp.nextLine();
        ControlEmployee action = new ControlEmployee();
        if (action.TimKiemNhanVien(inp_ID)!=null)
        {
            action.XoaNhanVien(inp_ID);
        }
    }
    public void Search()
    {
        System.out.print("Nhap ID nhan vien muon tim kiem: ");
        String inp_ID = inp.nextLine();
        ControlEmployee search = new ControlEmployee();
        search.TimKiemNhanVien(inp_ID);
    }
    public void Fix()
    {
        System.out.print("Nhap ID nhan vien muon sua doi: ");
        String inp_ID = inp.nextLine();
        ControlEmployee action = new ControlEmployee();
        Employee fix_emp = action.TimKiemNhanVien(inp_ID);
        if(fix_emp !=null)
        {
            String fix_name = this.Fix_str("name","ten", fix_emp.getName());
            String fix_age = this.Fix_str("age","tuoi",fix_emp.getAge());
            String fix_type = this.Fix_str("type","chuc vu", fix_emp.getType());
            String fix_salary = this.Fix_str("salary","luong",fix_emp.getSalary());
            Employee alt_emp = new Employee(inp_ID,fix_name,fix_age,fix_type,fix_salary);
            action.SuaNhanVien(alt_emp);
        }
    }
}
