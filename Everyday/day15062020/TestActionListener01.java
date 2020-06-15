import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class TestActionListener01{
	public static JTextField jtf;
	public static void main(String[] args){
		JFrame jf = new JFrame("Test");
		jf.setBounds(100,100,400,400);
		
		Container c = jf.getContentPane();
		
		JLabel jl = new JLabel("院系:");
		//JTextField jtf = new JTextField(15);
		jtf =  new JTextField(15);
		jtf.setText("例如:信息技术学院");
		JButton jb = new JButton("提交");
		
		c.add(jl);
		c.add(jtf);
		c.add(jb);
		
		FlowLayout fl = new FlowLayout();
		c.setLayout(fl);
		
		Monitor m = new Monitor();
		jb.addActionListener(m);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("OK");
	}
}

class Monitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
		String s = TestActionListener01.jtf.getText();
		try{
			FileWriter bw = new FileWriter("stuInfo.txt",true);
			bw.write(s+"\r\n");
			TestActionListener01.jtf.setText(" ");
			bw.close();
		}catch(FileNotFoundException err){
			System.out.println("该文件未找到.");
		}catch(IOException err2){
			
		}
	}
}