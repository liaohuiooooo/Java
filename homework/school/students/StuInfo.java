package school.students;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class StuInfo extends JFrame{
	
	public static JTextField jtf1;
	public static JTextField jtf2;
	public static JTextField jtf3;
	public static JTextField jtf4;
	public static JTextField jtf5;
	public static JTextField jtf6;

	public void creatStu() {
		JFrame jf = new JFrame("学生信息录入");
		jf.setBounds(400,200,400,800);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		JPanel jpInside1 = new JPanel();
		jtf1  = new JTextField(20);
		JLabel jl1 = new JLabel("院系：");
		jpInside1.add(jl1);
		jpInside1.add(jtf1);
		JPanel jpInside2 = new JPanel();
		jtf2  = new JTextField(20);
		JLabel jl2 = new JLabel("专业：");
		jpInside2.add(jl2);
		jpInside2.add(jtf2);
		JPanel jpInside3 = new JPanel();
		jtf3  = new JTextField(20);
		JLabel jl3 = new JLabel("班级：");
		jpInside3.add(jl3);
		jpInside3.add(jtf3);
		JPanel jpInside4 = new JPanel();
		jtf4  = new JTextField(20);
		JLabel jl4 = new JLabel("学号：");
		jpInside4.add(jl4);
		jpInside4.add(jtf4);
		JPanel jpInside5 = new JPanel();
		jtf5  = new JTextField(20);
		JLabel jl5 = new JLabel("姓名：");
		jpInside5.add(jl5);
		jpInside5.add(jtf5);
		JPanel jpInside6 = new JPanel();
		jtf6  = new JTextField(20);
		JLabel jl6 = new JLabel("年龄：");
		jpInside6.add(jl6);
		jpInside6.add(jtf6);
		
		
		jp1.add(jpInside1);
		jp1.add(jpInside2);
		jp1.add(jpInside3);
		jp1.add(jpInside4);
		jp1.add(jpInside5);
		jp1.add(jpInside6);
		
		FlowLayout fl = new  FlowLayout();
		GridLayout gl = new GridLayout(2,1);
		
		jp1.setLayout(fl);
		
		JButton jb = new JButton("录入");
		JLabel jl = new JLabel("学生端提示");
		MonitorStuSave m = new MonitorStuSave();
		jb.addActionListener(m);
		
		jp2.add(jb);
		jp2.add(jl);
		
		jp2.setLayout(fl);
		
		jf.add(jp1);
		jf.add(jp2);
		
		jf.setLayout(gl);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class MonitorStuSave implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Save StuInfo");
		student stu = new student();
		stu.addInfomation();

	}
}
