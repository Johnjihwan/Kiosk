package AdminPage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AdminPage extends Product{
    //    클래스의 전역 변수로 최종 value를 선언.
    public static ArrayList<String> value = new ArrayList<String>();

    public static void main(String[] args) {
//        아이템 항목 정의
        String[] items = {"정식", "디저트", "음료", "추가상품"};
        JComboBox combo = new JComboBox(items);
        JTextField field1 = new JTextField("상품명을 입력하세요");
        JTextField field2 = new JTextField("가격을 입력하세요");
        JPanel panel = new JPanel(new GridLayout(0, 1));

//        ui에 들어갈 아이템들을 정의
        panel.add(new JLabel("Category"));
        panel.add(combo);
        panel.add(new JLabel("Product"));
        panel.add(field1);
        panel.add(new JLabel("Value"));
        panel.add(field2);

//        결과 값 console로 반환.
//        result 정의
        int result = JOptionPane.showConfirmDialog(null, panel, "Test",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
//            value에 우항을 저장
            value.add((String) combo.getSelectedItem());
            value.add(field1.getText());
            value.add(field2.getText());
//            value를 출력.
            System.out.println(value);
        } else {
//            cancle btn 눌렀을 때 위와 같이 print
            value.add("Cancelled");
            System.out.println(value);
        }
        CommodityCategory = value.get(0);
        ProductName = value.get(1);
        ProductCost = value.get(2);
    }
}