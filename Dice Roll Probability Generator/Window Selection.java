/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class Window Selection extends JFrame {

	private JMenuBar menuBar;
	private JLabel label1;
	private JRadioButton radiobutton1;

	//Constructor 
	public Window Selection(){

		this.setTitle("Window Selection");
		this.setSize(1280,720);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1280,720));
		contentPane.setBackground(new Color(0,153,153));


		label1 = new JLabel();
		label1.setBounds(293,45,685,77);
		label1.setBackground(new Color(214,217,223));
		label1.setForeground(new Color(0,0,0));
		label1.setEnabled(true);
		label1.setFont(new Font("SansSerif",0,60));
		label1.setText("Die Probability Generator");
		label1.setVisible(true);

		radiobutton1 = new JRadioButton();
		radiobutton1.setBounds(60,254,625,35);
		radiobutton1.setBackground(new Color(214,217,223));
		radiobutton1.setForeground(new Color(0,0,0));
		radiobutton1.setEnabled(true);
		radiobutton1.setFont(new Font("SansSerif",0,36));
		radiobutton1.setText("Probability of a Specific Number Roll");
		radiobutton1.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(label1);
		contentPane.add(radiobutton1);

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



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Window Selection();
			}
		});
	}

}