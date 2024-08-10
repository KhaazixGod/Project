/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Person {
    private String ID;
    private String name;
    private String age;
    public Person()
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
    public void setAge(String age)
    {
        this.age = age;
    }
    public String getAge()
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
    public Person(String ID,String name,String age)
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