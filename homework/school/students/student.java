package school.students;

import school.SchoolManager;

import school.students.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.*;


public class student implements SchoolManager{

	@Override
	public void showInfomation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInfomation() {
		String s1 = StuInfo.jtf1.getText();
		String s2 = StuInfo.jtf2.getText();
		String s3 = StuInfo.jtf3.getText();
		String s4 = StuInfo.jtf4.getText();
		String s5 = StuInfo.jtf5.getText();
		String s6 = StuInfo.jtf6.getText();
		
		try {
			FileWriter bw = new FileWriter("/Users/liaohuiooooo/Desktop/students.txt",true);
			bw.write("院系:\t"+s1+"\t\t"+"专业:\t"+s2+"\t\t"+"班级:\t"+s3+"\t\t"+"学号:\t"+s4+"\t\t"+"姓名:\t"+s5+"\t\t"+"年龄:\t"+s6+"\r\n");
			StuInfo.jtf1.setText(" ");
			StuInfo.jtf2.setText(" ");
			StuInfo.jtf3.setText(" ");
			StuInfo.jtf4.setText(" ");
			StuInfo.jtf5.setText(" ");
			StuInfo.jtf6.setText(" ");
			bw.close();
		}catch(IOException e){
			System.out.println("文件未出错。");
			e.printStackTrace();
		}	
	}
	
}

