package school;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import school.students.*;
import school.teacher.TeacInfo;

public class SchoolWindows extends JFrame{

	public void creatSMS(){
		JFrame jf = new JFrame("学校管理系统");
		jf.setBounds(200,400,400,400);
		
		Container contanier = jf.getContentPane();
		
		JButton jb1 = new JButton("学生");
		JButton jb2 = new JButton("教师");
		
		Monitor m = new Monitor();
		jb1.addActionListener(m);
		Monitor2 m2 = new Monitor2();
		jb2.addActionListener(m2);
		
		contanier.add(jb1);
		contanier.add(jb2);
		
		FlowLayout fl = new FlowLayout();
		contanier.setLayout(fl);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("AHXSchool has finished.");
	}
}

class Monitor implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("打开学生端端信息录入系统");
		StuInfo stu = new StuInfo();
		stu.creatStu();
	}
}

class Monitor2 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("打开教师端信息录入系统");
		TeacInfo tea = new TeacInfo();
		tea.creatTea();
	}
}