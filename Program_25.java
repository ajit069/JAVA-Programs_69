import java.awt.*;
import java.awt.event.*;

public class Program_25 extends Frame implements ActionListener {

    Label label;
    Button button;

    // Constructor (fixed name)
    Program_25() {
        label = new Label("Click the button");
        label.setBounds(100, 100, 150, 30);

        button = new Button("Click Me");
        button.setBounds(100, 150, 80, 30);

        button.addActionListener(this);

        add(label);
        add(button);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    // Correct main method
    public static void main(String[] args) {
        new Program_25();
    }
}