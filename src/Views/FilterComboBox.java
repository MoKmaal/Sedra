/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author mkamal
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.jdesktop.swingx.JXComboBox;

public class FilterComboBox extends JComboBox {

    private List<String> array;

    public FilterComboBox(List<String> array) {
        super(array.toArray());

        this.array = array;
        this.setEditable(true);
        final JTextField textfield = (JTextField) this.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        comboFilter(textfield.getText());
                        System.out.println(textfield.getText());
                    }
                });
            }
        });

    }

    @Override
    public void setModel(ComboBoxModel aModel) {
        super.setModel(aModel); //To change body of generated methods, choose Tools | Templates.
        DefaultComboBoxModel boxModel = (DefaultComboBoxModel) aModel;
        if (array != null) {
            array.clear();

            for (int i = 0; i < boxModel.getSize(); i++) {
                array.add(String.valueOf(boxModel.getElementAt(i)));
            }
        }
    }

    public void comboFilter(String enteredText) {
        if (!this.isPopupVisible()) {
            this.showPopup();
        }

        List<String> filterArray = new ArrayList<String>();
        System.err.println(array.size());
        for (int i = 0; i < array.size(); i++) {
            System.err.println(array.get(i) + "  " + enteredText);
            if (array.get(i).contains(enteredText)) {
                filterArray.add(array.get(i));

            }
        }
        if (filterArray.size() > 0) {
            DefaultComboBoxModel model = (DefaultComboBoxModel) this.getModel();
            model.removeAllElements();
            for (String s : filterArray) {
                model.addElement(s);
            }

            JTextField textfield = (JTextField) this.getEditor().getEditorComponent();
            textfield.setText(enteredText);
        }
    }

    /* Testing Codes */
    public static List<String> populateArray() {
        List<String> test = new ArrayList<String>();
        test.add("");
        test.add("Mountain Flight");
        test.add("Mount Climbing");
        test.add("Trekking");
        test.add("Rafting");
        test.add("Jungle Safari");
        test.add("Bungie Jumping");
        test.add("Para Gliding");
        return test;
    }

    public static void makeUI() {
//        JFrame frame = new JFrame("Adventure in Nepal - Combo Filter Test");
//        frame.getContentPane().add(acb);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }

}
