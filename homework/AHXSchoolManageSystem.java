import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AHXSchool extends JFrame{
	public void creatSMS(){
		JFrame jf = new JFrame("学校管理系统");
		jf.setBounds(200,400,400,400);
		
		Container contanier = jf.getContentPane();
		
		JButton jb1 = new JButton("学生");
		JButton jb2 = new JButton("教师");
		
		Monitor m1 = new Monitor();
		jb1.addActionListener(m1);
		Monitor m2 = new Monitor();
		jb2.addActionListener(m2);
		
		contanier.add(jb1);
		contanier.add(jb2);
		
		FLowLayout fl = FlowLayout();
		contanier.setLayout(fl);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("AHXSchool has finished.");
	}
}

class 

class Monitor implements ActionListener{
	public void actionPerformed(ActionEvent e){
		
	}
}