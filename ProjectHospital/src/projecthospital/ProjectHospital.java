    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecthospital;
import Control.ControlUser;
import Model.User;
import Event.EventEmployee;
import java.sql.SQLException;
import java.util.Scanner;
import Control.ControlUser;
import AllMenu.Menu;
import Event.EventUser;
/**
 *
 * @author Admin
 */

public class ProjectHospital {

    public static void main(String[] args) throws SQLException {
        EventUser u = new EventUser();
        u.Connect();
    }
    
}
