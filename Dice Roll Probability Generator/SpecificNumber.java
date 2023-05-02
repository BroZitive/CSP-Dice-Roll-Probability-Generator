/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 


public class SpecificNumber extends JFrame {

    private JMenuBar menuBar;
    private JLabel title;
    private JLabel answerLabel;
    private JButton button1;
    private JButton backButton;
    private JComboBox combobox1;
    private JComboBox combobox2;
    private JComboBox combobox3;
    private JComboBox combobox4;
    private JComboBox combobox5;
    private JComboBox combobox6;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField selectedNumber;
    
    public static int diceInput[] = new int[6];
    public static int inputValue[] = new int[1];
    public static int n = 0;

    //Constructor 
    public SpecificNumber(){

        this.setTitle("GUI_project");
        this.setSize(1280,720);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1280,720));
        contentPane.setBackground(new Color(255,102,102));


        title = new JLabel();
        title.setBounds(150,50,1100,77);
        title.setBackground(new Color(214,217,223));
        title.setForeground(new Color(0,0,0));
        title.setEnabled(true);
        title.setFont(new Font("SansSerif",0,60));
        title.setText("Probability of a Specific Number Roll");
        title.setVisible(true);
        
        answerLabel = new JLabel();
        answerLabel.setBounds(75,500,300,45);
        answerLabel.setBackground(new Color(214,217,223));
        answerLabel.setForeground(new Color(0,0,0));
        answerLabel.setEnabled(true);
        answerLabel.setFont(new Font("SansSerif",0,36));
        answerLabel.setText("Selected Number:");
        answerLabel.setVisible(true);
        
        button1 = new JButton();
        button1.setBounds(675,500,300,125);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("SansSerif",0,36));
        button1.setText("Calculate");
        button1.setVisible(true);
        //Set action for button click
        //Call defined method
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculate(evt);
            }
        });
        
        backButton = new JButton();
        backButton.setBounds(1075,500,100,125);
        backButton.setBackground(new Color(214,217,223));
        backButton.setForeground(new Color(0,0,0));
        backButton.setEnabled(true);
        backButton.setFont(new Font("SansSerif",0,24));
        backButton.setText("Back");
        backButton.setVisible(true);
        //Set action for button click
        //Call defined method
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                back(evt);
            }
        });
        
        
        String [] numberOfDice= {"0", "1", "2", "3", "4", "5"};
        
        combobox1 = new JComboBox(numberOfDice);
        combobox1.setBounds(75,275,100,50);
        combobox1.setBackground(new Color(214,217,223));
        combobox1.setForeground(new Color(0,0,0));
        combobox1.setEnabled(true);
        combobox1.setFont(new Font("SansSerif",0,36));
        combobox1.setVisible(true);
        
        combobox2 = new JComboBox(numberOfDice);
        combobox2.setBounds(275,275,100,50);
        combobox2.setBackground(new Color(214,217,223));
        combobox2.setForeground(new Color(0,0,0));
        combobox2.setEnabled(true);
        combobox2.setFont(new Font("SansSerif",0,36));
        combobox2.setVisible(true);
        
        combobox3 = new JComboBox(numberOfDice);
        combobox3.setBounds(475,275,100,50);
        combobox3.setBackground(new Color(214,217,223));
        combobox3.setForeground(new Color(0,0,0));
        combobox3.setEnabled(true);
        combobox3.setFont(new Font("SansSerif",0,36));
        combobox3.setVisible(true);
        
        combobox4 = new JComboBox(numberOfDice);
        combobox4.setBounds(675,275,100,50);
        combobox4.setBackground(new Color(214,217,223));
        combobox4.setForeground(new Color(0,0,0));
        combobox4.setEnabled(true);
        combobox4.setFont(new Font("SansSerif",0,36));
        combobox4.setVisible(true);
        
        combobox5 = new JComboBox(numberOfDice);
        combobox5.setBounds(875,275,100,50);
        combobox5.setBackground(new Color(214,217,223));
        combobox5.setForeground(new Color(0,0,0));
        combobox5.setEnabled(true);
        combobox5.setFont(new Font("SansSerif",0,36));
        combobox5.setVisible(true);
        
        combobox6 = new JComboBox(numberOfDice);
        combobox6.setBounds(1075,275,100,50);
        combobox6.setBackground(new Color(214,217,223));
        combobox6.setForeground(new Color(0,0,0));
        combobox6.setEnabled(true);
        combobox6.setFont(new Font("SansSerif",0,36));
        combobox6.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(75,200,100,45);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("SansSerif",0,36));
        label1.setText("D4:");
        label1.setVisible(true);
        
        label2 = new JLabel();
        label2.setBounds(275,200,100,45);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("SansSerif",0,36));
        label2.setText("D6:");
        label2.setVisible(true);
        
        label3 = new JLabel();
        label3.setBounds(475,200,100,45);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("SansSerif",0,36));
        label3.setText("D8:");
        label3.setVisible(true);
        
        label4 = new JLabel();
        label4.setBounds(675,200,100,45);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("SansSerif",0,36));
        label4.setText("D10:");
        label4.setVisible(true);
        
        label5 = new JLabel();
        label5.setBounds(875,200,100,45);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("SansSerif",0,36));
        label5.setText("D12:");
        label5.setVisible(true);
        
        label6 = new JLabel();
        label6.setBounds(1075,200,100,45);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("SansSerif",0,36));
        label6.setText("D20:");
        label6.setVisible(true);

        selectedNumber = new JTextField();
        selectedNumber.setBounds(75,575,300,50);
        selectedNumber.setBackground(new Color(255,255,255));
        selectedNumber.setForeground(new Color(0,0,0));
        selectedNumber.setEnabled(true);
        selectedNumber.setFont(new Font("SansSerif",0,36));
        selectedNumber.setText("");
        selectedNumber.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(title);
        contentPane.add(answerLabel);
        contentPane.add(button1);
        contentPane.add(backButton);
        contentPane.add(combobox1);
        contentPane.add(combobox2);
        contentPane.add(combobox3);
        contentPane.add(combobox4);
        contentPane.add(combobox5);
        contentPane.add(combobox6);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(selectedNumber);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
    
    public static Integer getN()
    {
        return n;
    }
    
    //Method actionPerformed for button1
    private void calculate (ActionEvent evt) {
        diceInput[0] = Integer.parseInt(combobox1.getSelectedItem().toString());
        diceInput[1] = Integer.parseInt(combobox2.getSelectedItem().toString());
        diceInput[2] = Integer.parseInt(combobox3.getSelectedItem().toString());
        diceInput[3] = Integer.parseInt(combobox4.getSelectedItem().toString());
        diceInput[4] = Integer.parseInt(combobox5.getSelectedItem().toString());
        diceInput[5] = Integer.parseInt(combobox6.getSelectedItem().toString());
        
        if (selectedNumber.getText().toString().equals(""))
        {
            inputValue[0] = 0;
        }
        else
        {
            inputValue[0] = Integer.parseInt(selectedNumber.getText().toString());
        }   
        
        if ((((diceInput[5] > 0) && (inputValue[0] <= 20)) || ((diceInput[4] > 0) && (inputValue[0] <= 12)) || ((diceInput[3] > 0) && (inputValue[0] <= 10)) || ((diceInput[2] > 0) && (inputValue[0] <= 8)) || ((diceInput[1] > 0) && (inputValue[0] <= 6)) || ((diceInput[0] > 0) && (inputValue[0] <= 4))) && !(inputValue[0] == 0))
        {
            n = 1;
            Calculations.simulation(n);
            
            n = 0;
            new Results();
            this.dispose();
        }
    }
    
    public static int[] getInput()
    {
        return inputValue;
    }
    
    public static int[] getDice()
    {
        return diceInput;
    }
    
    //Method actionPerformed for back
    private void back (ActionEvent evt) {
            new WindowSelection();
            dispose();
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
                new SpecificNumber();
            }
        });
    }

}