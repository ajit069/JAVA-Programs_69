import java.awt.*;
import java.awt.event.*;

public class Program_26 extends Frame implements ItemListener {

    Label label;
    Checkbox cb1, cb2, cb3;

    Program_26() {
        // Create Label
        label = new Label("Select your hobbies:");
        label.setBounds(100, 100, 200, 30);

        // Create Checkboxes
        cb1 = new Checkbox("Reading");
        cb1.setBounds(100, 140, 100, 30);

        cb2 = new Checkbox("Gaming");
        cb2.setBounds(100, 180, 100, 30);

        cb3 = new Checkbox("Sports");
        cb3.setBounds(100, 220, 100, 30);

        // Add ItemListener
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);

        // Add components
        add(label);
        add(cb1);
        add(cb2);
        add(cb3);

        // Frame settings
        setSize(400, 350);
        setLayout(null);
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle checkbox events
    public void itemStateChanged(ItemEvent e) {
        String result = "Selected: ";

        if (cb1.getState()) result += "Reading ";
        if (cb2.getState()) result += "Gaming ";
        if (cb3.getState()) result += "Sports ";

        label.setText(result);
    }

    public static void main(String[] args) {
        new Program_26();
    }
}