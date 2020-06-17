package school.teacher;


import java.io.FileWriter;
import java.io.IOException;

import school.SchoolManager;

public class teacher implements SchoolManager {

	@Override
	public void showInfomation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInfomation() {
		String s1 = TeacInfo.jtf1.getText();
		String s2 = TeacInfo.jtf2.getText();
		String s3 = TeacInfo.jtf3.getText();
		String s4 = TeacInfo.jtf4.getText();
		String s5 = TeacInfo.jtf5.getText();
		
		try {
			FileWriter bw = new FileWriter("/Users/liaohuiooooo/Desktop/teacher.txt",true);
			bw.write("院系：\t"+s1+"\t\t"+"专业：\t"+s2+"\t\t"+"工号：\t"+s3+"\t\t"+"姓名：\t"+s4+"\t\t"+"所教课程：\t"+s5+"\t\t"+"\r\n");
			TeacInfo.jtf1.setText(" ");
			TeacInfo.jtf2.setText(" ");
			TeacInfo.jtf3.setText(" ");
			TeacInfo.jtf4.setText(" ");
			TeacInfo.jtf5.setText(" ");
			bw.close();
		}catch(IOException e){
			System.out.println("文件未出错。");
			e.printStackTrace();
		}	
	}
	
}

