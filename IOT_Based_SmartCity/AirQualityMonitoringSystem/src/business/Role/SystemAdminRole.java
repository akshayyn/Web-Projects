/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import business.Area.Area;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import business.City.City;

import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Area area,City city, EcoSystem business) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
    }

    

   
}
