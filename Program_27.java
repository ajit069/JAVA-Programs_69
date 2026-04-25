import java.awt.*;
import java.awt.event.*;

public class Program_27 extends Frame implements ItemListener, AdjustmentListener {

    List list;
    Scrollbar sb;
    Label label;

    Program_27() {

        list = new List(4); // 4 visible items
        list.setBounds(50, 80, 120, 80);

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");

        sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
        sb.setBounds(50, 200, 200, 30);

        label = new Label("Select a language & move scrollbar");
        label.setBounds(50, 260, 300, 30);

        list.addItemListener(this);
        sb.addAdjustmentListener(this);

        add(list);
        add(sb);
        add(label);

        setSize(400, 350);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        String selected = list.getSelectedItem();
        label.setText("Selected: " + selected);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int value = sb.getValue();
        label.setText("Scrollbar Value: " + value);
    }

    public static void main(String[] args) {
        new Program_27();
    }
}