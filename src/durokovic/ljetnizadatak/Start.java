package durokovic.ljetnizadatak;

import durokovic.ljetnizadatak.view.MainForm;
import javax.swing.UIManager;

/**
 *
 * @author Mata
 */
public class Start {

    public static void main(String[] args) {
        //  SHOWING MAIN FORM
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        MainForm main = new MainForm();
        main.setVisible(true);
    }
    
}
