// This class generates the Results window where the results of the simulation are displayed.

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Results extends JFrame {

    private JMenuBar menuBar;
    private JLabel title;
    private JButton button1;
    private JTextField result1;
    private JTextField result2;
    private JTextField result3;
    
    //Constructor 
    public Results(){

        this.setTitle("Results");
        this.setSize(1280,720);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1280,720));
        contentPane.setBackground(new Color(0,153,153));


        title = new JLabel();
        title.setBounds(500,75,685,77);
        title.setBackground(new Color(214,217,223));
        title.setForeground(new Color(0,0,0));
        title.setEnabled(true);
        title.setFont(new Font("SansSerif",0,60));
        title.setText("Results");
        title.setVisible(true);
        
        button1 = new JButton();
        button1.setBounds(900,450,250,100);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("SansSerif",0,36));
        button1.setText("Back");
        button1.setVisible(true);
        //Set action for button click
        //Call defined method
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                NextWindow(evt);
            }
        });
        
        result1 = new JTextField();
        result1.setBounds(75,300,600,40);
        result1.setBackground(new Color(255,255,255));
        result1.setForeground(new Color(0,0,0));
        result1.setEnabled(true);
        result1.setFont(new Font("SansSerif",0,36));
        result1.setText(Calculations.probability[0] + " were wins!");
        result1.setVisible(true);
        result1.setEditable(false);
        
        result2 = new JTextField();
        result2.setBounds(75,400,600,40);
        result2.setBackground(new Color(255,255,255));
        result2.setForeground(new Color(0,0,0));
        result2.setEnabled(true);
        result2.setFont(new Font("SansSerif",0,36));
        result2.setText(Calculations.probability[1] + " were wins!");
        result2.setVisible(true);
        result2.setEditable(false);
        
        result3 = new JTextField();
        result3.setBounds(75,500,600,40);
        result3.setBackground(new Color(255,255,255));
        result3.setForeground(new Color(0,0,0));
        result3.setEnabled(true);
        result3.setFont(new Font("SansSerif",0,36));
        result3.setText(Calculations.probability[2] + " were wins!");
        result3.setVisible(true);
        result3.setEditable(false);
       
        //adding components to contentPane panel
        contentPane.add(title);
        contentPane.add(button1);
        contentPane.add(result1);
        contentPane.add(result2);
        contentPane.add(result3);

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
            new WindowSelection();
            this.dispose();
    }

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Results();
            }
        });
    }

}