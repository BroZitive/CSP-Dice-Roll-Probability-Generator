// This class let's the user select which type of a simulation they want to run, which then will send them to the corresponding
// input window (SpecificNumber or SpecificNumberSum).

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class WindowSelection extends JFrame {

	private JMenuBar menuBar;
	private JLabel title;
	private JRadioButton radiobutton1;
	private JRadioButton radiobutton2;
	private JButton button1;
	
	//Constructor 
	public WindowSelection(){

		this.setTitle("WindowSelection");
		this.setSize(1280,720);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1280,720));
		contentPane.setBackground(new Color(0,153,153));


		title = new JLabel();
		title.setBounds(293,75,685,77);
		title.setBackground(new Color(214,217,223));
		title.setForeground(new Color(0,0,0));
		title.setEnabled(true);
		title.setFont(new Font("SansSerif",0,60));
		title.setText("Die Probability Simulator");
		title.setVisible(true);

		radiobutton1 = new JRadioButton();
		radiobutton1.setBounds(75,300,600,35);
		radiobutton1.setBackground(new Color(214,217,223));
		radiobutton1.setForeground(new Color(0,0,0));
		radiobutton1.setEnabled(true);
		radiobutton1.setFont(new Font("SansSerif",0,36));
		radiobutton1.setText("Probability of a Specific Number Roll");
		radiobutton1.setVisible(true);
		
		radiobutton2 = new JRadioButton();
		radiobutton2.setBounds(75,500,550,35);
		radiobutton2.setBackground(new Color(214,217,223));
		radiobutton2.setForeground(new Color(0,0,0));
		radiobutton2.setEnabled(true);
		radiobutton2.setFont(new Font("SansSerif",0,36));
		radiobutton2.setText("Probability of a Specific Sum Roll");
		radiobutton2.setVisible(true);
		
		ButtonGroup selectedProcedure = new ButtonGroup();
		selectedProcedure.add(radiobutton1);
		selectedProcedure.add(radiobutton2);
		selectedProcedure.add(radiobutton2);
		
		button1 = new JButton();
		button1.setBounds(900,450,250,100);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("SansSerif",0,36));
		button1.setText("Next");
		button1.setVisible(true);
		//Set action for button click
		//Call defined method
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				NextWindow(evt);
			}
		});
		
		//adding components to contentPane panel
		contentPane.add(title);
		contentPane.add(radiobutton1);
		contentPane.add(radiobutton2);
		contentPane.add(button1);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}

	//Method actionPerformed for buttlon1
	private void NextWindow (ActionEvent evt) {
			if (radiobutton1.isSelected())
			{
			    new SpecificNumber();
			    dispose();
			}
			else if (radiobutton2.isSelected())
			{
			    new SpecificNumberSum();
			    dispose();
			}
	}

	public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WindowSelection();
			}
		});
	}

}