/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.ModelPerson;

public class ModelEmployee extends ModelPerson{
    private int salary;
    private String Employee_type;
    public ModelEmployee(String name,String ID,int age,String ty,int sal)
    {
        super(ID,name,age);
        this.Employee_type = ty;
        this.salary = sal;
    }
    public void setSalary(int sal)
    {
        this.salary = sal;
    }
    public int getSalary()
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
