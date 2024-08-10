/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Person;

public class Employee extends Person{
    private String salary;
    private String Employee_type;
    public Employee()
    {
        
    }
    public Employee(String ID,String name,String age,String ty,String sal)
    {
        super(ID,name,age);
        this.Employee_type = ty;
        this.salary = sal;
    }
    public void setSalary(String sal)
    {
        this.salary = sal;
    }
    public String getSalary()
    {
        return this.salary;
    }
    public void setType(String ty)
    {
        this.Employee_type = ty;
    }
    public String getType()
    {
        return this.Employee_type;
    }
}