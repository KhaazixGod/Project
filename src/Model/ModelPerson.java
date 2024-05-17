/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class ModelPerson {
    private String ID;
    private String name;
    private int age;
    public ModelPerson()
    {
        
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return this.ID;
    }
    public ModelPerson(String ID,String name,int age)
    {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: "+this.name);
    }
}
