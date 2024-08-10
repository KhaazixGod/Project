/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AllMenu;
import Model.User;
import java.util.Scanner;
import Event.EventEmployee;
import Event.EventPatient;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class Menu {
    Scanner inp = new Scanner(System.in);
    public Menu()
    {
        
    }
    public User Login()
    {
        System.out.print("Ten dang nhap: ");
        String inp_name = inp.nextLine();
        System.out.print("Mat khau: ");
        String inp_pass = inp.nextLine();
        User user = new User (inp_name,inp_pass);
        return user;
    }
    public void Patient_Menu() throws SQLException
    {
        System.out.println("1. Them benh nhan \n2. Sua thong tin benh nhan \n3. Xoa benh nhan \n4. Tim kiem benh nhan \n5. Thoat");
        String choice = inp.nextLine();
        EventPatient action = new EventPatient();
        if(choice.equals("1"))
        {
            action.Add();
        }
        else if (choice.equals("2"))
        {
            action.Fix();
        }
        else if(choice.equals("3"))
        {
            action.Delete();
        }
        else if (choice.equals("4"))
        {
            action.Search();
        }
        else if (choice.equals("5"))
        {
            return;
        }
        else
        {
            System.out.print("Khong hop le");
        }
        this.Patient_Menu();
    }
    public void Employee_Menu() throws SQLException
    {
        System.out.println("1. Them Nhan vien \n2. Sua thong tin nhan vien \n3. Xoa nhan vien \n4. Tim kiem nhan vien\n5. Thoat");
        String choice = inp.nextLine();
        EventEmployee action = new EventEmployee();
        if(choice.equals("1"))
        {
            action.Add();
        }
        else if (choice.equals("2"))
        {
            action.Fix();
        }
        else if(choice.equals("3"))
        {
            action.Delete();
        }
        else if (choice.equals("4"))
        {
            action.Search();
        }
        else if(choice.equals("5"))
        {
            return;
        }
        else
        {
            System.out.print("Khong hop le");
        }
        this.Employee_Menu();
    }
    public void Big_menu() throws SQLException
    {
        System.out.println("1. Nhan vien \n2. Benh nhan");
        String choice = inp.nextLine();
        if(choice.equals("1"))
        {
            this.Employee_Menu();
        }
        else if(choice.equals("2"))
        {
            this.Patient_Menu();
        }
        else
        {
            System.out.println("Khong hop le");
        }
    }
}
