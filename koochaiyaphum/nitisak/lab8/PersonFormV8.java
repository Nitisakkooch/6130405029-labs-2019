package koochaiyaphum.nitisak.lab8;
import javax.swing.SwingUtilities;

import java.awt.event.*;
import javax.swing.*;
/**
 * PersonFromV8
 */
public class PersonFormV8 extends PersonFormV7 implements ItemListener{
    public PersonFormV8(String string) {
        super(string);
        // TODO Auto-generated constructor stub
    }

    private static final long serialVersionUID = 1L;

 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
 
    public static void createAndShowGUI() {
        PersonFormV8 msw = new PersonFormV8("Person Form V8");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
 
    @Override
    protected void addListeners() {
        super.addListeners();
        typeCombo.addItemListener(this);
    }
 
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            Object item = e.getItem();
            JOptionPane.showMessageDialog(this,
                "Your sport is now changed to "+ item.toString(),
                "Person Information",
            JOptionPane.INFORMATION_MESSAGE);
         }
    }
    
}