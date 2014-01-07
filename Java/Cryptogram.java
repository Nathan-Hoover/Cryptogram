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
	private JMenu level, level1_3, level4_6, level7_9, anothermenu;
	private JMenuItem level1, level2, level3, level4, level5, level6, level7, level8, level9, level10;

	public static void main(String[] args) {
		StringConverter objectArray = new StringConverter();
		objectArray.dataStart("hello cheryl, this is a cryptogram that i made for ricki");

		new Cryptogram(objectArray);
	}

	public Cryptogram(final StringConverter object){
		JFrame jf = new JFrame();
		jf.setTitle("Cryptogram");
		jf.setSize(400,150);
		jf.setLocationRelativeTo(null);

/////////////////////////////////////////////////////////////////////
//The Menu Bar Code
		menuBar = new JMenuBar();
		level = new JMenu("Level");
		menuBar.add(level);
		anothermenu = new JMenu("Options");
		menuBar.add(anothermenu);
		level1_3 = new JMenu("Level 1-3");
		level.add(level1_3);
		level1 = new JMenuItem("Level 1");
		level1_3.add(level1);
		level2 = new JMenuItem("Level 2");
		level1_3.add(level2);
		level3 = new JMenuItem("Level 3");
		level1_3.add(level3);
		level4_6 = new JMenu("Level 4-6");
		level.add(level4_6);
		level4 = new JMenuItem("Level 4");
		level4_6.add(level4);
		level5 = new JMenuItem("Level 5");
		level4_6.add(level5);
		level6 = new JMenuItem("Level 6");
		level4_6.add(level6);
		level7_9 = new JMenu("Level 7-9");
		level.add(level7_9);
		level7 = new JMenuItem("Level 7");
		level7_9.add(level7);
		level8 = new JMenuItem("Level 8");
		level7_9.add(level8);
		level9 = new JMenuItem("Level 9");
		level7_9.add(level9);
		level10 = new JMenuItem("Level 10");
		level.add(level10);
		
		jf.setJMenuBar(menuBar);
//End of Menu bar Code
/////////////////////////////////////////////////////////////////////
//Panel 1
		panel1 = new JPanel();
		convertedLabel = new JLabel(object.getconvertedString());
		panel1.add(convertedLabel);
//End of Panel 1
/////////////////////////////////////////////////////////////////////
//Panel 2
		panel2 = new JPanel();
		changedLabel = new JLabel(object.getchangedString());
		panel2.add(changedLabel);
//End of Panel 2
/////////////////////////////////////////////////////////////////////
//Panel 3
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
//End of Panel 3
/////////////////////////////////////////////////////////////////////
//Panel 4
		panel4 = new JPanel();
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		
		Container pane = jf.getContentPane();
		panel4.setLayout(new BoxLayout(panel4, BoxLayout.PAGE_AXIS));
		
		pane.add(panel4);
//End of Oabek 4
/////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////
//Change Buttons Code
		change.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				object.changeChar(rtf.getText().charAt(0), wtf.getText().charAt(0));
				changedLabel.setText(object.getchangedString());
				if(object.getoriginalString().equals(object.getchangedString())){
					JOptionPane winner = new JOptionPane();
					winner.showMessageDialog(null, "You Won!!!!");
				}
			}
		});     
//End of Change Buttons Code		
/////////////////////////////////////////////////////////////////////

		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setVisible(true);
	
	}

}