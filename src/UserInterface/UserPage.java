package UserInterface;

import java.awt.*;

public class UserPage {

    private Frame fr;

    public UserPage (String str){
        initialize(str);
    }

    public static void main(String[] args) {
        UserPage userpage = new UserPage("상품목록");
        userpage.fr.setVisible(true);
    }

    private void initialize(String str) {
//        프레임 및 버튼 생성
        fr =  new Frame();
        Button bt1 = new Button();
        Button bt2 = new Button();
        Button bt3 = new Button();
        Button bt4 = new Button();
//        레이아웃과 버튼 삽입 정의
        fr.setLayout(new GridLayout(2,2,0,0));
        fr.add(bt1);
        fr.add(bt2);
        fr.add(bt3);
        fr.add(bt4);
//        프레임과 버튼의 사이즈를 정의
        fr.setSize(900,900);
        bt1.setSize(100,100);
        bt2.setSize(100,100);
        bt3.setSize(100,100);
        bt4.setSize(100,100);

    }
}
