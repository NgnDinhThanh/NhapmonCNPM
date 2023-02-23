/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhapmoncnpm;

import java.util.Calendar;
import javax.swing.UIManager;
import views.LoginUI;

/**
 *
 * @author Thanh.ND200592
 */
public class NhapmonCNPM {

    public static Calendar calendar = Calendar.getInstance();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
    }

}
