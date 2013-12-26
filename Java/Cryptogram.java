
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cryptogram extends JFrame {

	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton b1,b2;

	public static void main(String[] args) {

	// TODO, add your application code
		new Cryptogram();
	}

	public Cryptogram(){
		JFrame jf=new JFrame();
		jf.setTitle("My frame");
		jf.setSize(500,300);
	
		JLabel l1=new JLabel("Warning!");
		JLabel l2=new JLabel("The buttons make sound!");
	
		JTextField tf1=new JTextField(10);
		JTextField tf2=new JTextField(5);
	
		JButton b1=new JButton("Push me!");
		JButton b2=new JButton("Dont push me!");
	
		tf1.setText("I can be changed");
	
		tf2.setText("I cant be changed");
		tf2.setEditable(false);
	
		Container pane=jf.getContentPane();
		pane.setLayout(new GridLayout(3,2) );
	
		pane.add(l1);
		pane.add(l2);
		pane.add(tf1);
		pane.add(tf2);
		pane.add(b1);
		pane.add(b2);
	
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//Execute when button is pressed
				for(int looper = 0; looper < 1000; looper++){
					Toolkit.getDefaultToolkit().beep();
				}
			}
		});      
	
		b1.addActionListener(new ActionListener() {	 
			public void actionPerformed(ActionEvent e){
				//Execute when button is pressed
				Toolkit.getDefaultToolkit().beep();
			}
		});      
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	
	}

}