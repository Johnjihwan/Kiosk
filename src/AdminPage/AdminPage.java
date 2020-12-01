package AdminPage;

import java.awt.GridLayout;
import javax.swing.*;

class AdminPage {

    public static void main(String[] args) {
//        아이템 항목 정의
        String[] items = {"One", "Two", "Three", "Four", "Five"};
        JComboBox combo = new JComboBox(items);
        JTextField field1 = new JTextField("0");
        JTextField field2 = new JTextField("0");
        JPanel panel = new JPanel(new GridLayout(0, 1));

//        ui에 들어갈 아이템들을 정의
        panel.add(combo);
        panel.add(new JLabel("상품명:"));
        panel.add(field1);
        panel.add(new JLabel("Field 2:"));
        panel.add(field2);

//        결과 값 console로 반환.
        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println(combo.getSelectedItem()
                    + " " + field1.getText()
                    + " " + field2.getText());
        } else {
            System.out.println("Cancelled");
        }
    }
}