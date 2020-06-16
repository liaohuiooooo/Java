import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class AHXSchool extends JFrame{
	public void creatSMS(){
		JFrame jf = new JFrame("学校管理系统");
		jf.setBounds(200,400,400,400);
		
		Container contanier = jf.getContentPane();
		
		JButton jb1 = new JButton("学生");
		JButton jb2 = new JButton("教师");
		
		Monitor m = new Monitor();
		jb1.addActionListener(m);
	//	Monitor m2 = new Monitor();
	//	jb2.addActionListener(m2);
		
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
	//	System.out.println("Success");
	}
}

public class ManagerST {
	public static void main(String[] args){
		
		AHXSchool ahx = new AHXSchool();
		ahx.creatSMS();
	}
}


