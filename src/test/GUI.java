package test;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class GUI extends Frame implements ActionListener, ItemListener,Runnable{

	DTO dto = new DTO();
	Choice list;
	TextField in_id;
	JPasswordField in_pw;
	TextArea in_info;
	Button b1;
	String job="";
	
	public GUI(String str) {
		super(str);

		init();
		start();

		this.setLocation(100, 100);
		super.setVisible(true);
		super.setSize(270, 200);
		super.setResizable(true);
		

	}

	public void init() {

		Panel p = new Panel();
		setLayout(new BorderLayout());
		Label id = new Label("아이디");
		Label password = new Label("비밀번호");
		Label job = new Label("직업");
		Label info = new Label("안내");
		b1 = new Button("전송");
		b1.addActionListener(this);
		
		
		in_id = new TextField(20);
		in_pw = new JPasswordField(20);
		list = new Choice();
		list.add("직업을 선택하세요");
		list.add("공무원");
		list.add("회사원");
		list.add("연구원");
		list.add("자영업");
		list.add("학생");
		list.add("기타");
		in_info = new TextArea(5,20);
		
		
		GridLayout g = new GridLayout(4,2);
		p.setLayout(g);
		p.add(id);
		p.add(in_id);
		p.add(password);
		p.add(in_pw);
		p.add(job);
		p.add(list);
		p.add(info);
		p.add(in_info);
		
		add("Center",p);
		add("South",b1);
		
		
		
	}

	public void start() {
		this.addWindowListener(new WindowAdapter() { // x�� �������� ����
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {

		GUI exam = new GUI("기본프레임");
		
	}

	public void run() {
		
	}

	public void itemStateChanged(ItemEvent e) {


	}
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();


		if ((Button) obj == b1) {
			dto.setId(in_id.getText());
			dto.setPassword(in_pw.getText());
			dto.setInfo(in_info.getText());
			dto.setJob(list.getSelectedItem());
			
			
			try {
				insertDAO.create(dto);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}

}
