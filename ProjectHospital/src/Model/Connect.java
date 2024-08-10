/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Connect {
    private String url = "jdbc:sqlserver://DESKTOP-PT7K56G:1433;databaseName=Hospital;integratedSecurity=true";
    private String user = "Pread";
    private String password = "123";
    public String getUrl()
    {
        return this.url;
    }
    public String getUser()
    {
        return this.user;
    }
    public String getPassword()
    {
        return this.password;
    }
}
