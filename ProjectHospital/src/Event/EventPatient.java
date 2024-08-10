/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Event;

import Control.ControlPatient;
import Model.Patient;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author khaaz
 */
public class EventPatient {
    Scanner inp = new Scanner(System.in);
    public EventPatient()
    {
        
    }
    public String Fix_str(String col,String col_name,String pre)
    {
        System.out.print(col_name+" cua benh nhan ?: ");
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
        Patient new_pat = new Patient(inp_ID,inp_name,inp_age);
        ControlPatient action = new ControlPatient();
        action.ThemBenhNhan(new_pat);
    }
    public void Delete()
    {
        System.out.print("Nhap ID benh nhan muon xoa: ");
        String inp_ID = inp.nextLine();
        ControlPatient action = new ControlPatient();
        if (action.TimKiemBenhNhan(inp_ID)!=null)
        {
            action.XoaBenhNhan(inp_ID);
        }
    }
    public void Search()
    {
        System.out.print("Nhap ID nhan vien muon tim kiem: ");
        String inp_ID = inp.nextLine();
        ControlPatient search = new ControlPatient();
        search.TimKiemBenhNhan(inp_ID);
    }
    public void Fix()
    {
        System.out.print("Nhap ID nhan vien muon sua doi: ");
        String inp_ID = inp.nextLine();
        ControlPatient action = new ControlPatient();
        Patient fix_emp = action.TimKiemBenhNhan(inp_ID);
        if(fix_emp !=null)
        {
            String fix_name = this.Fix_str("name","ten", fix_emp.getName());
            String fix_age = this.Fix_str("age","tuoi",fix_emp.getAge());
            Patient alt_pat = new Patient(inp_ID,fix_name,fix_age);
            action.SuaBenhNhan(alt_pat);
        }
    }
}
