import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestActionListener{
	public static void main(String[] args){
		JFrame jf = new JFrame("Test");
		jf.setBounds(100,100,400,400);
		
		Container c = jf.getContentPane();
		
		JLabel jl = new JLabel("院系:");
		JTextField jtf = new JTextField(15);
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
	public int i = 0;
	public void actionPerformed(ActionEvent E){
		i++;
		System.out.println("超级喜欢!");
	}
}