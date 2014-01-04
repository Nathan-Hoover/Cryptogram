import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cryptogram extends JFrame {

	private JFrame frame;
	private JPanel panel1, panel2, panel3, panel4;
	private JLabel replace, convertedLabel, changedLabel, with;
	private JTextField rtf, wtf;
	private JButton change;
	private JMenuBar menuBar;
	private JMenu menu, anothermenu;
	private JMenuItem menuItem;

	public static void main(String[] args) {
		StringConverter objectArray = new StringConverter();
		objectArray.dataStart("tell me a secret and convert it");

		new Cryptogram(objectArray);
	}

	public Cryptogram(final StringConverter object){
		JFrame jf = new JFrame();
		jf.setTitle("Cryptogram");
		jf.setSize(250,150);
		jf.setLocationRelativeTo(null);

/////////////////////////////////////////////////////////////////////
		menuBar = new JMenuBar();
		menu = new JMenu("Level");
		menuBar.add(menu);
		anothermenu = new JMenu("Options");
		menuBar.add(anothermenu);
		jf.setJMenuBar(menuBar);

		panel1 = new JPanel();
		convertedLabel = new JLabel(object.getconvertedString());
		panel1.add(convertedLabel);
		
		panel2 = new JPanel();
		changedLabel = new JLabel(object.getchangedString());
		panel2.add(changedLabel);
		
		panel3 = new JPanel();
		replace = new JLabel("Replace");
		rtf = new JTextField("", 1);
		with = new JLabel("With");
		wtf = new JTextField("", 1);
		change = new JButton("Change");
		panel3.add(replace);
		panel3.add(rtf);
		panel3.add(with);
		panel3.add(wtf);
		panel3.add(change);

		panel4 = new JPanel();
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		
		Container pane = jf.getContentPane();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));
		
		pane.add(panel4);

/////////////////////////////////////////////////////////////////////

		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				object.changeChar(rtf.getText().charAt(0), wtf.getText().charAt(0));
				changedLabel.setText(object.getchangedString());
			}
		});     
		
/////////////////////////////////////////////////////////////////////

		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	
	}

}