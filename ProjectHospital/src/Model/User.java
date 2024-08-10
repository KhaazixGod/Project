/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class User {
    private String login_name;
    private String password;
    public User(String name,String password)
    {
        this.login_name = name;
        this.password = password;
    }
    public String getLoginName()
    {
        return this.login_name;
    }
    public String getPassword()
    {
        return this.password;
    }
}
