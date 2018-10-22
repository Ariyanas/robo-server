package utils;

import com.alee.laf.optionpane.WebOptionPane;
import com.alee.laf.rootpane.WebFrame;
import forms.Home;

/**
 *
 * @author Ariyanas
 */
public class Msg {
    WebFrame parent = null;
    
    public Msg(){
        
    }
    
    public Msg(WebFrame parent) {
        this.parent = parent;
    }
    
    public void showError(String msg) {
        WebOptionPane.showMessageDialog(parent, msg, "Error", WebOptionPane.ERROR_MESSAGE);
    }
    
    public void showInfo(String msg) {
        WebOptionPane.showMessageDialog(parent, msg, "Info", WebOptionPane.INFORMATION_MESSAGE);
    }
}
