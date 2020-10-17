package bhsuib;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.Button;

public class Main {
	private String FN1 ="";
	private String LN1="";
	private String FN2="";
	private String LN2="";
	int S1 = 0;
	int S2 = 0;
	private int nPlayersSQ2 = 0;
	int SJTableC=0;
	//Simple Join Strings
	String SJMasterString="";
	String JCurrent1 ="";
	String JCurrent2 ="";
	String SJCol1="";
	String SJCol2="";
	private int SJNcols1 =0;
	private int SJNcols2 =0;
	ArrayList<String> PlayerNames = new ArrayList<String>();
	ArrayList<String> PlayerLastNames = new ArrayList<String>();
	ArrayList<String> HomeTown = new ArrayList<String>();
	private int NameIndex;
	String SJCol3="";
	String SJCol4="";
	private int SJNcols3 =0;
	private int SJNcols4 =0;
	
	dbSetup my = new dbSetup();
	private JFrame frame;
	private JComboBox CondTSharedTable;
	private String SJColumns;
	private JTextField Username_in;
	private JTextField Password_In;
	private JPanel Log_In;
	private JPanel Menu;
	private JMenuBar menuBar;
	Connection conn = null;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	
	private JPanel Simple;
	private JPanel Conditional;
	
	private int Current;
	private JPanel SimpleQuery;
	private JRadioButton RD1;
	private JPanel SQ;
	private JPanel panel;
	private JPanel SQDesc;
	private JPanel SJDesc;
	private JPanel SQ1Desc;
	private JButton Select;
	private String SQstring;
	private String SJstring;
	private String SQ1String;
	private String SQ2String;
	private String SQ3String;
	private String SQString;
	private JPanel SQData;
	private JComboBox SQDataBox;
	private JPanel Simple_Join;
	private JButton SQC;
	private JButton SQDr;
	private JButton SQG;
	private JButton SQK;
	private JButton SQSt;
	private JButton SQP;
	private JButton SQPlay;
	private JButton SQPlayer;
	private JButton btnNewButton_15;
	private JButton SQT;
	private JButton SQPunt;
	private JButton SQPuntR;
	private JButton SQReturn;
	private JButton SQRush;
	private String[] BoxContent= {};
	private JLabel SQLabel;
	private JLabel lblNewLabel_3;
	private JRadioButton SQAll;
	private JRadioButton SQ100;
	private JLabel lblNewLabel_4;
	private JTextField textFieldSQOut;
	private JRadioButton SQY;
	private JRadioButton SQN;
	private JButton btnNewButton_7;
	
	private String SQselect; 	
	private JLabel EntireFile;
	private JRadioButton SQEntireFile;
	private JPanel SJAddR1;
	private JPanel PanelRowsSJ;
	private JPanel SJFilePanel;
	private JRadioButton SJConf;
	private JRadioButton SJDrive;
	private JRadioButton SJGame;
	private JRadioButton SJKick;
	private ButtonGroup SJTable;
	private ButtonGroup SJSC;
	private JRadioButton SJSimple;
	private JRadioButton SJCond;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JButton SJReset;
	private JLabel label;
	private JRadioButton SJALL;
	private JRadioButton SJ100;
	private JLabel label_1;
	private JRadioButton SJY;
	private JRadioButton SJN;
	private JLabel label_2;
	private JTextField SJFileText;
	private JButton SimpleNext;
	private JButton CondNext;
	private JComboBox CondTable2;
	private JComboBox CondTable1;
	private JButton button_3;
	private JButton button_5;
	private JLabel lblNewLabel_15;
	private JRadioButton SJRowsCond;
	private JPanel SQP1;
	private JPanel SQP2;
	private JPanel SQP3;
	private JPanel SQP4;
	private JButton SQB1;
	private JButton SQB2;
	private JButton SQB3;
	private JButton SQB4;
	private JLabel lblNewLabel_6;
	private JLabel label_3;
	private JLabel SQIMG;
	private JLabel lblMergeDataFrom;
	private JLabel label_4;
	private JLabel lblSelectAndAdd;
	private JComboBox PlayersSQ2;
	private JButton SQ2AddTeam;
	private JLabel lblSelectATeam;
	private JComboBox SQ3Box;
	private JButton SQ3AddTeam;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 718);
		frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent a) {
            	try {
            	      conn.close();
            	      JOptionPane.showMessageDialog(null,"Connection Closed.");
            	    } catch(Exception e) {
            	    	if (!Log_In.isVisible()) {
            	    		JOptionPane.showMessageDialog(null,"Connection NOT Closed.");
            	    	}
            	    }
                System.exit(0);
            }
        });
		
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		Log_In = new JPanel();
		frame.getContentPane().add(Log_In, "name_9623127354100");
		Log_In.setLayout(null);
		
		Username_in = new JTextField();
		Username_in.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Username_in.setBounds(755, 251, 215, 36);
		Log_In.add(Username_in);
		Username_in.setColumns(10);
		
		Password_In = new JPasswordField();
		Password_In.setToolTipText("");
		Password_In.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Password_In.setBounds(755, 360, 215, 36);
		Log_In.add(Password_In);
		Password_In.setColumns(10);
		
		JButton LogInButton = new JButton("Log In ");
		LogInButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname = Username_in.getText();
				String psword = Password_In.getText();
				try {
					
					conn = DriverManager.getConnection("jdbc:postgresql://csce-315-db.engr.tamu.edu/team22",
				           uname,psword);
					JOptionPane.showMessageDialog(null,"Opened database successfully");
					Menu.setVisible(true);
					menuBar.setVisible(true);
					Log_In.setVisible(false);	
					Current = 1;
				}
				catch (Exception e) {
			        //e.printStackTrace();
			        System.err.println(e.getClass().getName()+": "+e.getMessage());
			        JOptionPane.showMessageDialog(null,"Wrong Credentials");
			       
			     }//end try catch
				Password_In.setText(null);
				Username_in.setText(null);
				
			}
		});
		LogInButton.setBounds(729, 447, 138, 57);
		Log_In.add(LogInButton);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(608, 244, 123, 45);
		Log_In.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(608, 353, 123, 45);
		Log_In.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image image =new ImageIcon(this.getClass().getResource("/SM_Logo.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(image));
		lblNewLabel_2.setBounds(188, 171, 333, 333);
		Log_In.add(lblNewLabel_2);
		
		Menu = new JPanel();
		frame.getContentPane().add(Menu, "name_9725379146200"); //Panel 1
		Menu.setLayout(null);
		
		RD1 = new JRadioButton("Simple Query");
		RD1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				SQDesc.setVisible(true);
				SJDesc.setVisible(false);
				SQ1Desc.setVisible(false);
			}
		});
		
		RD1.setSelected(false);
		RD1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		RD1.setBounds(100, 90, 191, 35);
		RD1.setActionCommand("1");
		Menu.add(RD1);
		
		JRadioButton RD2 = new JRadioButton("Simple Join");
		RD2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				SQDesc.setVisible(false);
				SJDesc.setVisible(true);
				SQ1Desc.setVisible(false);
			}
		});
		RD2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		RD2.setBounds(100, 250, 191, 35);
		RD2.setActionCommand("2");
		Menu.add(RD2);
		
		JRadioButton RD3 = new JRadioButton("Special Queries");
		RD3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				SQDesc.setVisible(false);
				SJDesc.setVisible(false);
				SQ1Desc.setVisible(true);
			}
		});
		
		RD3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		RD3.setBounds(100, 397, 191, 35);
		RD3.setActionCommand("3");
		Menu.add(RD3);
		
		ButtonGroup group = new ButtonGroup();
		group.add(RD1);
		group.add(RD2);
		group.add(RD3);
		
		
		panel = new JPanel();
		panel.setBounds(450, 90, 680, 390);
		Menu.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		SQDesc = new JPanel();
		SQDesc.setVisible(false);
		panel.add(SQDesc, "name_30577748332800");
		SQDesc.setLayout(null);
		
		lblNewLabel_6 = new JLabel("Basic Data query from multiple tables of the database. \r\n");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_6.setBounds(69, 13, 539, 68);
		SQDesc.add(lblNewLabel_6);
		
		label_3 = new JLabel("New label");
		label_3.setBounds(624, 361, -602, -273);
		SQDesc.add(label_3);
		
		SQIMG = new JLabel("");
		Image image2 =new ImageIcon(this.getClass().getResource("/SQD.PNG")).getImage();
		SQIMG.setIcon(new ImageIcon(image2));
		SQIMG.setBounds(12, 94, 656, 283);
		SQDesc.add(SQIMG);
		
		SJDesc = new JPanel();
		panel.add(SJDesc, "name_30583106424800");
		SJDesc.setLayout(null);
		
		lblMergeDataFrom = new JLabel("Merge data from 2 table, Conditional merge \r\n\r\n");
		lblMergeDataFrom.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblMergeDataFrom.setBounds(119, 13, 442, 70);
		SJDesc.add(lblMergeDataFrom);
		
		label_4 = new JLabel("");
		Image image3 =new ImageIcon(this.getClass().getResource("/SJD.png")).getImage();
		label_4.setIcon(new ImageIcon(image3));
		label_4.setBounds(12, 94, 656, 283);
		SJDesc.setVisible(false);
		SJDesc.add(label_4);
		
		SQ1Desc = new JPanel();
		panel.add(SQ1Desc, "name_30585661819800");
		
		Select = new JButton("Next");
		Select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String s = group.getSelection().getActionCommand();
			 int choice = Integer.valueOf(s);
			 ChangePanel(Current,choice+1);
			 Current=choice+1;
			}
		});
		Select.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Select.setBounds(520, 548, 144, 57);
		Menu.add(Select);
		
		SimpleQuery = new JPanel();
		frame.getContentPane().add(SimpleQuery, "name_9727572082200");
		SimpleQuery.setLayout(null);
		
		SQData = new JPanel();
		SQData.setBounds(612, 0, 638, 644);
		SimpleQuery.add(SQData);
		SQData.setLayout(null);
		
		//Simple Query Data Container
		SQDataBox = new JComboBox(BoxContent);
		SQDataBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SQDataBox.setBounds(262, 90, 236, 22);
		SQData.add(SQDataBox);
		
		SQLabel = new JLabel("What data ?");
		SQLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		SQLabel.setBounds(81, 94, 126, 18);
		SQData.add(SQLabel);
		
		lblNewLabel_3 = new JLabel("How Many Data Points ?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(202, 261, 217, 46);
		SQData.add(lblNewLabel_3);
		
		SQAll = new JRadioButton("All");
		SQAll.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SQAll.setBounds(165, 351, 127, 25);
		SQAll.setActionCommand("1");
		SQData.add(SQAll);
		
		SQ100 = new JRadioButton("First 100");
		SQ100.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SQ100.setBounds(372, 351, 127, 25);
		SQ100.setActionCommand("2");
		SQData.add(SQ100);
		
		ButtonGroup outSQ = new ButtonGroup();
		outSQ.add(SQAll);
		outSQ.add(SQ100);
		
		lblNewLabel_4 = new JLabel("Export to File ?");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(235, 428, 150, 35);
		SQData.add(lblNewLabel_4);
		
		textFieldSQOut = new JTextField();
		textFieldSQOut.setBounds(243, 531, 192, 22);
		SQData.add(textFieldSQOut);
		textFieldSQOut.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("File Name:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(127, 534, 80, 16);
		SQData.add(lblNewLabel_5);
		
		SQY = new JRadioButton("Yes");
		SQY.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SQY.setBounds(215, 472, 80, 25);
		SQY.setActionCommand("1");
		SQData.add(SQY);
		
		SQN = new JRadioButton("No");
		SQN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SQN.setBounds(322, 472, 127, 25);
		SQN.setActionCommand("2");
		SQData.add(SQN);
		
		ButtonGroup sqFile = new ButtonGroup();
		sqFile.add(SQY);
		sqFile.add(SQN);
		
		//Simple Query Handler
		btnNewButton_7 = new JButton("Query");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Query= "Select ";
				String File = textFieldSQOut.getText();
				String S = outSQ.getSelection().getActionCommand();
				String selected_text = "\""+(String) SQDataBox.getItemAt(SQDataBox.getSelectedIndex())+"\"";
				boolean EF = SQEntireFile.isSelected();
				if(EF) {
					Query+= "* ";
				}
				else {
					Query += selected_text +" ";
				}
				Query += "FROM " + SQselect;
				switch(S) {
				case "1":
					//Nothing 
			    break;
				case "2":
					Query += " LIMIT 100";
				break;	
				}
				ResultSet result;
				ResultSetMetaData rsmd;
				//System.out.println(Query);
				try{
					//Output Window Taken from: https://www.zentut.com/java-swing/how-to-use-jtable-to-display-data/
					final JFrame frame2 = new JFrame("Data");
				   //create a statement object
				   Statement stmt = conn.createStatement();
				   //create an SQL statement
				   //String sqlStatement = "SELECT * from \"Conference\"";
				   String sqlStatement = Query;
			       //send statement to DBMS
			       result = stmt.executeQuery(sqlStatement);
			       rsmd = result.getMetaData();
			       JTable table= null;
			       table = new JTable(buildTableModel(result));       
			       String F = sqFile.getSelection().getActionCommand();
					if (F =="1") {
						String FileDes = File+".csv";
						File yourFile = new File(FileDes);
						yourFile.createNewFile(); // if file already exists will do nothing 
						exportToCSV(table,FileDes);
					}
					else {
						JScrollPane scrollPane = new JScrollPane(table);
					    table.setFillsViewportHeight(true);
					    frame2.getContentPane().setLayout(new BorderLayout());
					    frame2.getContentPane().add(scrollPane,BorderLayout.CENTER);
					    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					    frame2.setSize(550, 200);
					    frame2.setVisible(true);
					}
			     } catch (Exception b){
			    	 System.out.println("Error accessing Database.");
			         //e.printStackTrace();
			    }	
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_7.setBounds(262, 580, 112, 40);
		SQData.add(btnNewButton_7);
		
		EntireFile = new JLabel("All rows ");
		EntireFile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EntireFile.setBounds(93, 221, 100, 22);
		SQData.add(EntireFile);
		
		SQEntireFile = new JRadioButton("Yes");
		SQEntireFile.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SQEntireFile.setBounds(262, 222, 63, 25);
		SQData.add(SQEntireFile);
		
		SQC = new JButton("Conference");
		SQC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Conference\"",SQDataBox);
				SQselect = "\"Conference\"";
			}
		});
		SQC.setBounds(65, 90, 97, 40);
		SimpleQuery.add(SQC);
		
		/* ---------------------------------------------------------- */
		
		SQDr = new JButton("Drive");
		SQDr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Drive\"",SQDataBox);
				SQselect = "\"Drive\"";
			}
		});
		SQDr.setBounds(65, 180, 97, 40);
		SimpleQuery.add(SQDr);
		
		SQG = new JButton("Game");
		SQG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Game\"",SQDataBox);
				SQselect = "\"Game\"";
			}
		});
		SQG.setBounds(65, 270, 97, 40);
		SimpleQuery.add(SQG);
		
		SQK = new JButton("Kickoff");
		SQK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Kickoff\"",SQDataBox);
				SQselect = "\"Kickoff\"";
			}
		});
		SQK.setBounds(65, 360, 97, 40);
		SimpleQuery.add(SQK);
		
		SQSt = new JButton("Stadium");
		SQSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Stadium\"",SQDataBox);
				SQselect = "\"Stadium\"";
			}
		});
		SQSt.setBounds(155, 455, 97, 40);
		SimpleQuery.add(SQSt);
		
		SQP = new JButton("Pass");
		SQP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Pass\"",SQDataBox);
				SQselect = "\"Pass\"";
			}
		});
		SQP.setBounds(225, 90, 97, 40);
		SimpleQuery.add(SQP);
		
		SQPlay = new JButton("Play");
		SQPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);	
				UpdateSQ("\"Play\"",SQDataBox);
				SQselect = "\"Play\"";
			}
		});
		SQPlay.setBounds(225, 180, 97, 40);
		SimpleQuery.add(SQPlay);
		
		SQPlayer = new JButton("Player");
		SQPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Player\"",SQDataBox);
				SQselect = "\"Player\"";
			}
		});
		SQPlayer.setBounds(225, 270, 97, 40);
		SimpleQuery.add(SQPlayer);
		
		btnNewButton_15 = new JButton("Kickoff-Rtn");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Kickoff-return\"",SQDataBox);
				SQselect = "\"Kickoff-return\"";
			}
		});
		btnNewButton_15.setBounds(225, 360, 97, 40);
		SimpleQuery.add(btnNewButton_15);
		
		SQT = new JButton("Team");
		SQT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Team\"",SQDataBox);
				SQselect = "\"Team\"";
			}
		});
		SQT.setBounds(385, 90, 97, 40);
		SimpleQuery.add(SQT);
		
		SQPunt = new JButton("Punt");
		SQPunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Punt\"",SQDataBox);
				SQselect = "\"Punt\"";
			}
		});
		SQPunt.setBounds(385, 180, 97, 40);
		SimpleQuery.add(SQPunt);
		
		SQPuntR = new JButton("Punt-Rtn");
		SQPuntR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Punt-Return\"",SQDataBox);
				SQselect = "\"Punt-Return\"";
			}
		});
		SQPuntR.setBounds(385, 270, 97, 40);
		SimpleQuery.add(SQPuntR);
		
		SQReturn = new JButton("Reception");
		SQReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Reception\"",SQDataBox);
				SQselect = "\"Reception\"";
			}
		});
		SQReturn.setBounds(385, 360, 97, 40);
		SimpleQuery.add(SQReturn);
		
		SQRush = new JButton("Rush");
		SQRush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Rush\"",SQDataBox);
				SQselect = "\"Rush\"";
			}
		});
		SQRush.setBounds(305, 455, 97, 40);
		SimpleQuery.add(SQRush);
		SQData.setVisible(false);
		
		SQ = new JPanel();
		frame.getContentPane().add(SQ, "name_24288266837200"); //Panel 4
		SQ.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(580, 0, 682, 644);
		SQ.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		SQP1 = new JPanel();
		panel_1.add(SQP1, "name_190679759793900");
		SQP1.setVisible(false);
		SQP1.setLayout(null);
		
		JComboBox TeamsSQ1 = new JComboBox();
		TeamsSQ1.setBounds(209, 138, 241, 22);
		SQP1.add(TeamsSQ1);
		
		JLabel lblNewLabel_7 = new JLabel("Select and add Two Teams!");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_7.setBounds(190, 66, 299, 27);
		SQP1.add(lblNewLabel_7);
		
		JButton SQ1AddTeam = new JButton("Add Team");
		SQ1AddTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		SQ1AddTeam.setBounds(281, 196, 97, 25);
		SQP1.add(SQ1AddTeam);
		
		JButton SQ1Result = new JButton("Result");
		SQ1Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		SQ1Result.setBounds(281, 254, 97, 25);
		SQP1.add(SQ1Result);
		
		SQP2 = new JPanel();
		SQP2.setVisible(false);
		panel_1.add(SQP2, "name_190683557027400");
		SQP2.setLayout(null);
		
		lblSelectAndAdd = new JLabel("Select and add Two Players!");
		lblSelectAndAdd.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSelectAndAdd.setBounds(193, 66, 299, 27);
		SQP2.add(lblSelectAndAdd);
		
		PlayersSQ2 = new JComboBox();
		PlayersSQ2.setBounds(212, 138, 241, 22);
		SQP2.add(PlayersSQ2);
		
		SQ2AddTeam = new JButton("Add Player");
		SQ2AddTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nPlayersSQ2 == 2) {
					 nPlayersSQ2 = 0;
					 S1 =0;
					 S2=0;
				}
				else if(nPlayersSQ2 == 0){
					S1 = PlayersSQ2.getSelectedIndex();
					//System.out.println(S1);
					FN1 = PlayerNames.get(S1);
					LN1 = PlayerLastNames.get(S1);
					nPlayersSQ2++;
				}
				else if(nPlayersSQ2 == 1){
					S2 =PlayersSQ2.getSelectedIndex();
					//System.out.println(S2);
					FN2 = PlayerNames.get(S2);
					LN2 = PlayerLastNames.get(S2);
					nPlayersSQ2++;
				}
			}
		});
		SQ2AddTeam.setBounds(284, 196, 97, 25);
		SQP2.add(SQ2AddTeam);
		
		JButton SQ2Result = new JButton("New button");
		SQ2Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> HomeTown = new ArrayList<String>();
				ArrayList<String> TeamCode = new ArrayList<String>();
				ArrayList<String> TeamAgainst1 = new ArrayList<String>();
				ArrayList<String> TeamAgainst2 = new ArrayList<String>();
				ArrayList<String> Year1 = new ArrayList<String>();
				ArrayList<String> Year2 = new ArrayList<String>();
				ResultSet result;
				ResultSetMetaData rsmd;
				//System.out.println(Query);
				String HT1=""; //Home town Name 1
				String HT2=""; //Home town Name 2
				String TC1=""; //Team code 1
				String TC2=""; //Team code 2
				String Query3 = "SELECT \"Hometown\", \"Team Code\" FROM \"Player\" ";
				try{
				   //create a statement object
				   Statement stmt = conn.createStatement();
				   //create an SQL statement
				   //String sqlStatement = "SELECT * from \"Conference\"";
				   String sqlStatement = Query3;
			       //send statement to DBMS
			       result = stmt.executeQuery(sqlStatement);
			       rsmd = result.getMetaData();
			       while (result.next()) {
			    	     HomeTown.add(result.getString("Hometown"));
			    	     TeamCode.add(result.getString("Team Code"));
			       }
			     } catch (Exception b){
			    	 System.out.println("Error accessing Database.");
			         //e.printStackTrace();
			    }
				HT1 = HomeTown.get(S1);
				TC1 = TeamCode.get(S1);
				HT2 = HomeTown.get(S2);
				TC2 = TeamCode.get(S2);
				if(HT1.equals(HT2)) {
					System.out.println("Same Hometown!");
					return;
				}
				String TeamName = "SELECT \"Name\" FROM \"Team\" WHERE \"Team\".\"Team Code\" = " + TC1;
				String TeamName2 = "SELECT \"Name\" FROM \"Team\" WHERE \"Team\".\"Team Code\" = " + TC2;
				//System.out.println(stm);
				String TN1 = ""; //Team Name 1
				String TN2 = ""; //Team Name 2
				
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = TeamName2;
				       //send statement to DBMS
				       ResultSet result2 = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd2 = result2.getMetaData();
				       int	N = rsmd2.getColumnCount();
				       result2.next();
			           TN1 = result2.getString(rsmd2.getColumnName(1));
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = TeamName;
				       //send statement to DBMS
				       ResultSet result2 = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd2 = result2.getMetaData();
				       int	N = rsmd2.getColumnCount();
				       result2.next();
			           TN2 = result2.getString(rsmd2.getColumnName(1));
			           
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				 	if(TC1.equals(TC2)){
				 		System.out.println("Same Team");
				 		//Print Team names etc
				 		//System.out.println(TN1 +" "+TN2);
				 		return;
				 	}
				 	
				 	String Ateam1 = "SELECT \"Visit Team Code\", \"Home Team Code\", \"Date\" FROM \"Game\"";
				 	Ateam1 += " WHERE (\"Visit Team Code\" = " + TC1 +")";
				 	Ateam1 += " Or (\"Home Team Code\" = "+ TC1  +")";
				 	String Ateam2 = "SELECT \"Visit Team Code\", \"Home Team Code\", \"Date\" FROM \"Game\"";
				 	Ateam2 += " WHERE (\"Visit Team Code\" = " + TC2 +")";
				 	Ateam2 += " Or (\"Home Team Code\" = "+ TC2  +")";
				 	try{
					     //create a statement object
					       Statement stmt = conn.createStatement();
					       //create an SQL statement
					       //String sqlStatement = "SELECT * from \"Conference\" where false;";
					       String sqlStatement = Ateam1;
					       //send statement to DBMS
					       ResultSet result2 = stmt.executeQuery(sqlStatement);
					       ResultSetMetaData rsmd2 = result2.getMetaData();
					       int	N = rsmd2.getColumnCount();
					       while(result2.next()) {
					    	   String t1 = result2.getString(rsmd2.getColumnName(1));
					    	   String t2 = result2.getString(rsmd2.getColumnName(2));
					    	   if(t1.equals(TC1)) { 
					    		   TeamAgainst1.add(t2); 
					    	   }
					    	   else {
					    		   TeamAgainst1.add(t1); 
					    	   }
					    	   Year1.add(result2.getString(rsmd2.getColumnName(3)));  
					       }   
					   } catch (Exception b){
					     System.out.println("Error accessing Database.");
					     //e.printStackTrace();
					   }
				 	try{
					     //create a statement object
					       Statement stmt = conn.createStatement();
					       //create an SQL statement
					       //String sqlStatement = "SELECT * from \"Conference\" where false;";
					       String sqlStatement = Ateam2;
					       //send statement to DBMS   	
					       ResultSet result2 = stmt.executeQuery(sqlStatement);
					       ResultSetMetaData rsmd2 = result2.getMetaData();
					       int	N = rsmd2.getColumnCount();
					       while(result2.next()) {
					    	   String t1 = result2.getString(rsmd2.getColumnName(1));
					    	   String t2 = result2.getString(rsmd2.getColumnName(2));
					    	   if(t1.equals(TC1)) {
					    		   TeamAgainst2.add(t2); 
					    	   }
					    	   else {
					    		   TeamAgainst2.add(t1); 
					    	   } 
					       }
				           
					   } catch (Exception b){
					     System.out.println("Error accessing Database.");
					     //e.printStackTrace();
					   }
				 	String Date1 = "";
				 	String Date2 = "";
				 	String TCN = "";
				 	String TeamInCommon="";
				 	for (int i = 0;i<TeamAgainst1.size();i++) {
				    	   for(int j = 0;j<TeamAgainst2.size();j++) {	    		   
				    		   String F = TeamAgainst1.get(i);
				    		   String G = TeamAgainst2.get(j);  
				    		   if(F.equals(G)) {
				    			   TCN = G;
				    			   Date1 = Year1.get(i);
				    			   Date2 = Year2.get(j);
				    			   String TeamName3 = "SELECT \"Name\" FROM \"Team\" WHERE \"Team\".\"Team Code\" = " + TCN;
				    			   try{
				  				     //create a statement object
				  				       Statement stmt = conn.createStatement();
				  				       //create an SQL statement
				  				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				  				       String sqlStatement = TeamName3;
				  				       //send statement to DBMS
				  				       ResultSet result2 = stmt.executeQuery(sqlStatement);
				  				       ResultSetMetaData rsmd2 = result2.getMetaData();
				  				       int	N = rsmd2.getColumnCount();
				  				       result2.next();
				  			           TeamInCommon = result2.getString(rsmd2.getColumnName(1));
				  			         String Out = PlayerNames.get(S1) + PlayerLastNames.get(S1)+ " played for " + TN1;
				  			         Out += " which played against " + TeamInCommon +" in "+ Date1 + ",";
				  			         Out += " which played against "+TN2+ " in "+ Date2 + " which has " + PlayerNames.get(S2)  + PlayerLastNames.get(S2) + "on their team.";
				  			         System.out.println(Out);
				  			         return;
				  				   } catch (Exception b){
				  				     System.out.println("Error accessing Database.");
				  				     //e.printStackTrace();
				  				   }
				    		   }
				    	   }
				 	}
			}
		});
		SQ2Result.setBounds(284, 262, 97, 25);
		SQP2.add(SQ2Result);
		
		SQP3 = new JPanel();
		SQP3.setVisible(false);
		panel_1.add(SQP3, "name_190685695725600");
		SQP3.setLayout(null);
		
		lblSelectATeam = new JLabel("Select a Team!");
		lblSelectATeam.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSelectATeam.setBounds(256, 61, 146, 27);
		SQP3.add(lblSelectATeam);
		
		SQ3Box = new JComboBox();
		SQ3Box.setBounds(212, 131, 241, 22);
		SQP3.add(SQ3Box);
		
		SQ3AddTeam = new JButton("Choose Team ");
		SQ3AddTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SQ3AddTeam.setBounds(274, 189, 118, 25);
		SQP3.add(SQ3AddTeam);
		
		JButton SQ3Result = new JButton("Result");
		SQ3Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SQ3Result.setBounds(284, 255, 97, 25);
		SQP3.add(SQ3Result);
		
		SQP4 = new JPanel();
		SQP4.setVisible(false);
		panel_1.add(SQP4, "name_190688150888400");
		SQP4.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Select a Conference ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(242, 81, 208, 25);
		SQP4.add(lblNewLabel_8);
		
		JButton SQ4Button = new JButton("Result ");
		SQ4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SQ4Button.setBounds(284, 197, 97, 25);
		SQP4.add(SQ4Button);
		
		JComboBox SQ4Box = new JComboBox();
		SQ4Box.setBounds(222, 135, 228, 22);
		SQP4.add(SQ4Box);
		
		SQB1 = new JButton("Victory Chain");
		SQB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQP1.setVisible(true);
				SQP2.setVisible(false);
				SQP3.setVisible(false);
				SQP4.setVisible(false);
				String stm = "SELECT \"Name\" FROM \"Team\"";
				//System.out.println(stm);
			
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = stm;
				       //send statement to DBMS
				       ResultSet result = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd = result.getMetaData();
				       int	N = rsmd.getColumnCount();
				       
				       
				       TeamsSQ1.removeAllItems();
				       while (result.next()) {
				           //System.out.println(result.getString("Name"));
				           TeamsSQ1.addItem(result.getString("Name"));
				         }	
				        
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				
				
			}
		});
		SQB1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SQB1.setBounds(212, 64, 158, 52);
		SQ.add(SQB1);
		
		SQB2 = new JButton("Player Connection");
		SQB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQP1.setVisible(false);
				SQP2.setVisible(true);
				SQP3.setVisible(false);
				SQP4.setVisible(false);
				String stm = "SELECT \"First Name\" FROM \"Player\"";
				String stm2 = "SELECT \"Last Name\" FROM \"Player\"";
				//System.out.println( stm2);
				
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = stm;
				       //send statement to DBMS
				       ResultSet result = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd = result.getMetaData();
				       int	N = rsmd.getColumnCount();   
				       PlayersSQ2.removeAllItems();
				      
				       while (result.next()) {
				    	  //System.out.println(result.getString("First Name"));
				    	   //System.out.println(result.getString("Last Name"));
				    	  // String R=result.getString("First Name") + " " + result2.getString("Last Name");
				    	   PlayerNames.add(result.getString("First Name"));
				    		
				         }
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				 try{
				     //create a statement object
				       Statement stmt2 = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement2 = stm2;
				       //send statement to DBMS
				       ResultSet result2 = stmt2.executeQuery("SELECT \"Last Name\" FROM \"Player\"");
				       ResultSetMetaData rsmd2 = result2.getMetaData();
				       PlayersSQ2.removeAllItems();
				    
				       while (result2.next()) {
				    	   PlayerLastNames.add(" " +result2.getString("Last Name"));	
				    	   
				         }
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				 for(int i =0;i<PlayerNames.size();i++) {
					 PlayersSQ2.addItem(PlayerNames.get(i)+PlayerLastNames.get(i));
				 }
				 for (String value : PlayerNames) { 
					 //PlayersSQ2.addItem(value);
					  //System.out.print(value); 
					  //System.out.print(" "); 
				}   
				  	
			}
		});
		SQB2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SQB2.setBounds(212, 210, 158, 49);
		SQ.add(SQB2);
		
		SQB3 = new JButton("Rushing Yards ");
		SQB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQP1.setVisible(false);
				SQP2.setVisible(false);
				SQP3.setVisible(true);
				SQP4.setVisible(false);
				
				String stm = "SELECT \"Name\" FROM \"Team\"";
				//System.out.println(stm);
			
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = stm;
				       //send statement to DBMS
				       ResultSet result = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd = result.getMetaData();
				       int	N = rsmd.getColumnCount();
				       TeamsSQ1.removeAllItems();
				       
				       SQ3Box.removeAllItems();
				       while (result.next()) {
				           //System.out.println(result.getString("Name"));
				           SQ3Box.addItem(result.getString("Name"));
				         }	
				        
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
				
			}
		});
		SQB3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SQB3.setBounds(212, 360, 158, 52);
		SQ.add(SQB3);
		
		SQB4 = new JButton("Home Field Adv ");
		SQB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQP1.setVisible(false);
				SQP2.setVisible(false);
				SQP3.setVisible(false);
				SQP4.setVisible(true);
				String stm = "SELECT \"Name\" FROM \"Conference\" ";
				
				
				 try{
				     //create a statement object
				       Statement stmt = conn.createStatement();
				       //create an SQL statement
				       //String sqlStatement = "SELECT * from \"Conference\" where false;";
				       String sqlStatement = stm;
				       //send statement to DBMS
				       ResultSet result = stmt.executeQuery(sqlStatement);
				       ResultSetMetaData rsmd = result.getMetaData();
				       int	N = rsmd.getColumnCount();
				       //System.out.println(stm);
				       SQ4Box.removeAllItems();
				       while (result.next()) {
				           //System.out.println(result.getString("Name"));
				           SQ4Box.addItem(result.getString("Name"));
				         }	
						
   
				   } catch (Exception b){
				     System.out.println("Error accessing Database.");
				     //e.printStackTrace();
				   }
			}
		});
		SQB4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SQB4.setBounds(212, 496, 158, 52);
		SQ.add(SQB4);
		
		Simple_Join = new JPanel();
		frame.getContentPane().add(Simple_Join, "name_82420281814600");
		Simple_Join.setLayout(null);
		
		SJAddR1 = new JPanel();
		SJAddR1.setBounds(552, 0, 698, 200);
		Simple_Join.add(SJAddR1);
		SJAddR1.setVisible(false);
		SJAddR1.setLayout(null);
		
		SJSimple = new JRadioButton("");
		SJSimple.setBounds(167, 108, 70, 25);
		SJSimple.setActionCommand("1");
		SJAddR1.add(SJSimple);
		
		SJCond = new JRadioButton("");
		SJCond.setBounds(485, 108, 61, 25);
		SJCond.setActionCommand("2");
		SJAddR1.add(SJCond);
		
		SJSC = new ButtonGroup();
		SJSC.add(SJSimple);
		SJSC.add(SJCond);
		
		lblNewLabel_10 = new JLabel("Simple ?");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(141, 54, 100, 25);
		SJAddR1.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Conditional ?");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(446, 51, 122, 30);
		SJAddR1.add(lblNewLabel_11);
		
		JButton SJNext = new JButton("Next");
		SJNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String S = SJSC.getSelection().getActionCommand();
				if(S == "1" || S=="2") {
					PanelRowsSJ.setVisible(true);
					if (S == "1") {
						Simple.setVisible(true);
						Conditional.setVisible(false);
					}
					else {
						Conditional.setVisible(true);
						CheckJoin( JCurrent1 ,JCurrent2,CondTSharedTable);
						Simple.setVisible(false);
					}
				}
			}
		});
		SJNext.setBounds(293, 162, 97, 25);
		SJAddR1.add(SJNext);
		
		PanelRowsSJ = new JPanel();
		PanelRowsSJ.setBounds(552, 204, 698, 210);
		Simple_Join.add(PanelRowsSJ);
		PanelRowsSJ.setLayout(new CardLayout(0, 0));
		
		Simple = new JPanel();
		PanelRowsSJ.add(Simple, "name_95581366132900");
		Simple.setLayout(null);
		
		JComboBox SimpTable1 = new JComboBox();
		SimpTable1.setBounds(53, 60, 229, 22);
		Simple.add(SimpTable1);
		
		JComboBox SimpTable2 = new JComboBox();
		SimpTable2.setBounds(412, 60, 229, 22);
		Simple.add(SimpTable2);
		
		JButton SJSimpleAdd1 = new JButton("Add row");
		SJSimpleAdd1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SJSimpleAdd1
				//JCurrent1
				//String SJCol="";
				//private int SJNcols;
				if(SJNcols1>0) {
					SJCol1 = SJCol1+ "," ;
				}
				else {
					SJCol1 = SJCol1;
				}
				SJCol1 = SJCol1 + JCurrent1 + ".\""+(String) SimpTable1.getItemAt(SimpTable1.getSelectedIndex())+"\"";
				//String SJColumn = ".\""+(String) SimpTable1.getItemAt(SimpTable1.getSelectedIndex())+"\"";
				SJNcols1++;
			}
		});
		SJSimpleAdd1.setBounds(118, 109, 97, 25);
		Simple.add(SJSimpleAdd1);
		
		JButton SJSimpleAdd2 = new JButton("Add row");
		SJSimpleAdd2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SJSimpleAdd1
				//JCurrent1
				//String SJCol="";
				//private int SJNcols;
				if(SJNcols2>0) {
					SJCol2 = SJCol2+ "," ;
				}
				else {
					SJCol2 = SJCol2;
				}
				SJCol2 = SJCol2 + JCurrent2 + ".\""+(String) SimpTable2.getItemAt(SimpTable2.getSelectedIndex())+"\"";
				//String SJColumn = ".\""+(String) SimpTable1.getItemAt(SimpTable1.getSelectedIndex())+"\"";
				SJNcols2++;
			}
		});
		SJSimpleAdd2.setBounds(485, 109, 97, 25);
		Simple.add(SJSimpleAdd2);
		
		JLabel lblNewLabel_13 = new JLabel("Table 1");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(118, 31, 97, 22);
		Simple.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Table 2");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_14.setBounds(485, 31, 84, 22);
		Simple.add(lblNewLabel_14);
		
		SimpleNext = new JButton("Next");
		SimpleNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SJFilePanel.setVisible(true);
				PanelRowsSJ.setVisible(false);
				SJAddR1.setVisible(false);
				
			}
		});
		SimpleNext.setBounds(302, 172, 97, 25);
		Simple.add(SimpleNext);
		
		JRadioButton SJAllRows = new JRadioButton("All Rows");
		SJAllRows.setBounds(302, 109, 127, 25);
		SJAllRows.setActionCommand("1");
		Simple.add(SJAllRows);
		
		Conditional = new JPanel();
		PanelRowsSJ.add(Conditional, "name_95585147762200");
		Conditional.setLayout(null);
		
		CondTSharedTable = new JComboBox();
		CondTSharedTable.setBounds(468, 57, 201, 22);
		Conditional.add(CondTSharedTable);
		
		JLabel lblNewLabel_12 = new JLabel("Condition");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_12.setBounds(477, 22, 128, 22);
		Conditional.add(lblNewLabel_12);
		
		CondNext = new JButton("Next");
		CondNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SJFilePanel.setVisible(true);
				PanelRowsSJ.setVisible(false);
				SJAddR1.setVisible(false);
			}
		});
		CondNext.setBounds(294, 172, 97, 25);
		Conditional.add(CondNext);
		
		CondTable2 = new JComboBox();
		CondTable2.setBounds(242, 57, 201, 22);
		Conditional.add(CondTable2);
		
		CondTable1 = new JComboBox();
		CondTable1.setBounds(12, 57, 201, 22);
		Conditional.add(CondTable1);
		
		button_3 = new JButton("Add row");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//JCurrent1
				//String SJCol="";
				//private int SJNcols;
				if(SJNcols4>0) {
					SJCol4 = SJCol4+ "," ;
				}
				else {
					SJCol4 = SJCol4;
				}
				SJCol4 = SJCol4 + JCurrent2 + ".\""+(String) CondTable1.getItemAt(CondTable1.getSelectedIndex())+"\"";
				//String SJColumn = ".\""+(String) SimpTable1.getItemAt(SimpTable1.getSelectedIndex())+"\"";
				SJNcols4++;
			}
		});
		button_3.setBounds(294, 92, 97, 25);
		Conditional.add(button_3);
		
		button_5 = new JButton("Add row");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JCurrent1
				//String SJCol="";
				//private int SJNcols;
				if(SJNcols3>0) {
					SJCol3 = SJCol3+ "," ;
				}
				else {
					SJCol3 = SJCol3;
				}
				SJCol3 = SJCol3 + JCurrent1 + ".\""+(String) CondTable1.getItemAt(CondTable2.getSelectedIndex())+"\"";
				//String SJColumn = ".\""+(String) SimpTable1.getItemAt(SimpTable1.getSelectedIndex())+"\"";
				SJNcols3++;
			}
		});
		button_5.setBounds(70, 92, 97, 25);
		Conditional.add(button_5);
		
		lblNewLabel_15 = new JLabel("If empty, no conditional Join");
		lblNewLabel_15.setBounds(493, 92, 160, 48);
		Conditional.add(lblNewLabel_15);
		
		SJRowsCond = new JRadioButton("All Rows");
		SJRowsCond.setBounds(170, 126, 127, 25);
		Conditional.add(SJRowsCond);
		PanelRowsSJ.setVisible(false);
		
		SJFilePanel = new JPanel();
		SJFilePanel.setBounds(552, 415, 698, 216);
		Simple_Join.add(SJFilePanel);
		SJFilePanel.setVisible(false);
		SJFilePanel.setLayout(null);
		
		label = new JLabel("How Many Data Points ?");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(240, 0, 217, 32);
		SJFilePanel.add(label);
		
		SJALL = new JRadioButton("All");
		SJALL.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SJALL.setActionCommand("1");
		SJALL.setBounds(221, 30, 127, 25);
		SJFilePanel.add(SJALL);
		
		SJ100 = new JRadioButton("First 100");
		SJ100.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SJ100.setActionCommand("2");
		SJ100.setBounds(377, 30, 127, 25);
		SJFilePanel.add(SJ100);
		
		ButtonGroup SJA100 = new ButtonGroup();
		SJA100.add(SJALL);
		SJA100.add(SJ100);
		
		label_1 = new JLabel("Export to File ?");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(277, 53, 150, 35);
		SJFilePanel.add(label_1);
		
		SJY = new JRadioButton("Yes");
		SJY.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SJY.setActionCommand("1");
		SJY.setBounds(221, 97, 80, 25);
		SJFilePanel.add(SJY);
		
		SJN = new JRadioButton("No");
		SJN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SJN.setActionCommand("2");
		SJN.setBounds(377, 98, 127, 25);
		SJFilePanel.add(SJN);
		
		ButtonGroup SJFileB = new ButtonGroup();
		SJFileB.add(SJY);
		SJFileB.add(SJN);
		
		label_2 = new JLabel("File Name:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(137, 130, 80, 16);
		SJFilePanel.add(label_2);
		
		SJFileText = new JTextField();
		SJFileText.setColumns(10);
		SJFileText.setBounds(252, 128, 192, 22);
		SJFilePanel.add(SJFileText);
		
		JButton SJQuery = new JButton("Query");
		SJQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JCurrent1 
				//JCurrent2
				//SJColumns
				String File = SJFileText.getText();
				String S = SJA100.getSelection().getActionCommand();
				String Sel;
				String From;
				String Final="";
				boolean EF = SJAllRows.isSelected();
				boolean EF2 = SJRowsCond.isSelected();
				boolean Condition = SJCond.isSelected();
				if(!Condition) {
					if(EF) {
						Sel = "SELECT *"; 
					}
					else {
						Sel = "SELECT " + SJCol1 + "," + SJCol2;
					}
					From = "FROM " + JCurrent1 + " FULL OUTER JOIN " + JCurrent2;
					
					Final = Sel + " " + From + " ON true";
					switch(S) {
					case "1":
						//Nothing 
				    break;
					case "2":
						Final += " LIMIT 100";
					break;	
					}
				}
				else {
					//SJRowsCond
					if(EF2) {
						Sel = "SELECT " + JCurrent1 +".*," + JCurrent2 +".*" ; 
					}
					else {
						Sel = "SELECT " + SJCol3 + "," + SJCol4;
					}
					From = "FROM " + JCurrent1 + " FULL OUTER JOIN " + JCurrent2;
					//String cond = CondTSharedTable.
					String selected_text = "\""+(String) CondTSharedTable.getItemAt(CondTSharedTable.getSelectedIndex())+"\"";
					String A = JCurrent1 + "." + selected_text;
					String B = JCurrent2 +  "." + selected_text;
					String C = A + "=" + B;
					Final = Sel + " " + From + " ON " + C;
					switch(S) {
					case "1":
						//Nothing 
				    break;
					case "2":
						Final += " LIMIT 100";
					break;	
					}
				}

				System.out.println(Final);
				
				ResultSet result;
				ResultSetMetaData rsmd;
				try{
					//Output Window Taken from: https://www.zentut.com/java-swing/how-to-use-jtable-to-display-data/
					final JFrame frame2 = new JFrame("Data");
				   //create a statement object
				   Statement stmt = conn.createStatement();
				   //create an SQL statement
				   //String sqlStatement = "SELECT * from \"Conference\"";
				   String sqlStatement = Final;
			       //send statement to DBMS
				   System.out.println(Final);
			       result = stmt.executeQuery(sqlStatement);
			       rsmd = result.getMetaData();
			       JTable table= null;
			       table = new JTable(buildTableModel(result));       
			       
			       String F = SJFileB.getSelection().getActionCommand();
					if (F =="1") {
						String FileDes = File +".csv";
						File yourFile = new File(FileDes);
						yourFile.createNewFile(); // if file already exists will do nothing 
						exportToCSV(table,FileDes);
					}
					else {
						JScrollPane scrollPane = new JScrollPane(table);
					    table.setFillsViewportHeight(true);
					    frame2.getContentPane().setLayout(new BorderLayout());
					    frame2.getContentPane().add(scrollPane,BorderLayout.CENTER);
					    frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					    frame2.setSize(550, 200);
					    frame2.setVisible(true);
					}
			     } catch (Exception b){
			    	 System.out.println("Error accessing Database.");
			         //e.printStackTrace();
			    }
			}
		});
		SJQuery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SJQuery.setBounds(288, 163, 112, 40);
		SJFilePanel.add(SJQuery);
		
		SJConf = new JRadioButton("Conference");
		SJConf.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJConf.setBounds(50, 70, 127, 25);
		SJConf.setActionCommand("1");
		Simple_Join.add(SJConf);
		
		SJDrive = new JRadioButton("Drive");
		SJDrive.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJDrive.setBounds(50, 170, 127, 25);
		SJDrive.setActionCommand("2");
		Simple_Join.add(SJDrive);
		
		SJGame = new JRadioButton("Game");
		SJGame.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJGame.setBounds(50, 270, 127, 25);
		SJGame.setActionCommand("3");
		Simple_Join.add(SJGame);
		
		SJKick = new JRadioButton("Kickoff");
		SJKick.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJKick.setBounds(50, 370, 127, 25);
		SJKick.setActionCommand("4");
		Simple_Join.add(SJKick);
		
		JRadioButton SJPass = new JRadioButton("Pass");
		SJPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJPass.setBounds(200, 70, 127, 25);
		SJPass.setActionCommand("5");
		Simple_Join.add(SJPass);
		
		JRadioButton SJPlay = new JRadioButton("Play");
		SJPlay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJPlay.setBounds(200, 170, 127, 25);
		SJPlay.setActionCommand("6");
		Simple_Join.add(SJPlay);
		
		JRadioButton SJPlayer = new JRadioButton("Player");
		SJPlayer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJPlayer.setBounds(200, 270, 127, 25);
		SJPlayer.setActionCommand("7");
		Simple_Join.add(SJPlayer);
		
		JRadioButton SJKickR = new JRadioButton("Kickoff -return");
		SJKickR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJKickR.setBounds(200, 370, 127, 25);
		SJKickR.setActionCommand("8");
		Simple_Join.add(SJKickR);
		
		JRadioButton SJStadium = new JRadioButton("Stadium");
		SJStadium.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJStadium.setBounds(127, 460, 127, 25);
		SJStadium.setActionCommand("9");
		Simple_Join.add(SJStadium);
		
		JRadioButton SJRush = new JRadioButton("Rush");
		SJRush.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJRush.setBounds(292, 460, 127, 25);
		SJRush.setActionCommand("10");
		Simple_Join.add(SJRush);
		
		JButton btnNewButton_8 = new JButton("Add Table (Only 2)");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String S = SJTable.getSelection().getActionCommand();
				
				if(SJTableC>=2) {
					return;
				}
				else if(SJTableC==0) {
					switch(S) {
					  case "1":
						  UpdateSQ("\"Conference\"",SimpTable1);
						  UpdateSQ("\"Conference\"",CondTable1);
						  JCurrent1 ="\"Conference\"";
					    break;
					  case "2":
						  UpdateSQ("\"Drive\"",SimpTable1);
						  UpdateSQ("\"Drive\"",CondTable1);
						  JCurrent1 = "\"Drive\"";
					    break;
					  case "3":
						  UpdateSQ("\"Game\"",SimpTable1);
						  UpdateSQ("\"Game\"",CondTable1);
						  JCurrent1 ="\"Game\"";
						break;
					  case "4":
						  UpdateSQ("\"Kickoff\"",SimpTable1);
						  UpdateSQ("\"Kickoff\"",CondTable1);
						  JCurrent1 ="\"Kickoff\"";
					    break;
					  case "5":
						  UpdateSQ("\"Pass\"",SimpTable1);
						  UpdateSQ("\"Pass\"",CondTable1);
						  JCurrent1 ="\"Pass\"";
					    break;
					  case "6":
						  UpdateSQ("\"Play\"",SimpTable1);
						  UpdateSQ("\"Play\"",CondTable1);
						  JCurrent1 ="\"Play\"";
						break;
					  case "7":
						  UpdateSQ("\"Player\"",SimpTable1);
						  UpdateSQ("\"Player\"",CondTable1);
						  JCurrent1 ="\"Player\"";
					    break;
					  case "8":
						  UpdateSQ("\"Kickoff-return\"",SimpTable1);
						  UpdateSQ("\"Kickoff-return\"",CondTable1);
						  JCurrent1 ="\"Kickoff-return\"";
					    break;
					  case "9":
						  UpdateSQ("\"Stadium\"",SimpTable1);
						  UpdateSQ("\"Stadium\"",CondTable1);
						  JCurrent1 ="\"Stadium\"";
					    break;
					  case "10":
						  UpdateSQ("\"Rush\"",SimpTable1);
						  UpdateSQ("\"Rush\"",CondTable1);
						  JCurrent1 ="\"Rush\"";
					    break;
					  case "11":
						  UpdateSQ("\"Punt\"",SimpTable1);
						  UpdateSQ("\"Punt\"",CondTable1);
						  JCurrent1 ="\"Punt\"";
					    break;
					  case "12":
						  UpdateSQ("\"Team\"",SimpTable1);
						  UpdateSQ("\"Team\"",CondTable1);
						  JCurrent1 ="\"Team\"";
					    break;
					  case "13":
						  UpdateSQ("\"Punt-Return\"",SimpTable1);
						  UpdateSQ("\"Punt-Return\"",CondTable1);
						  JCurrent1 ="\"Punt-Return\"";
					    break;
					  case "14":
						  UpdateSQ("\"Reception\"",SimpTable1);
						  UpdateSQ("\"Reception\"",CondTable1);
						  JCurrent1 ="\"Reception\"";
					    break;
					  default:
					    // code block
						  
					}
				}
				else if(SJTableC==1) {
					switch(S) {
					  case "1":
						  UpdateSQ("\"Conference\"",SimpTable2);
						  UpdateSQ("\"Conference\"",CondTable2);
						  JCurrent2 ="\"Conference\"";
					    break;
					  case "2":
						  UpdateSQ("\"Drive\"",SimpTable2);
						  UpdateSQ("\"Drive\"",CondTable2);
						  JCurrent2 = "\"Drive\"";
					    break;
					  case "3":
						  UpdateSQ("\"Game\"",SimpTable2);
						  UpdateSQ("\"Game\"",CondTable2);
						  JCurrent2 ="\"Game\"";
						break;
					  case "4":
						  UpdateSQ("\"Kickoff\"",SimpTable2);
						  UpdateSQ("\"Kickoff\"",CondTable2);
						  JCurrent2 ="\"Kickoff\"";
					    break;
					  case "5":
						  UpdateSQ("\"Pass\"",SimpTable2);
						  UpdateSQ("\"Pass\"",CondTable2);
						  JCurrent2 ="\"Pass\"";
					    break;
					  case "6":
						  UpdateSQ("\"Play\"",SimpTable2);
						  UpdateSQ("\"Play\"",CondTable2);
						  JCurrent2 ="\"Play\"";
						break;
					  case "7":
						  UpdateSQ("\"Player\"",SimpTable2);
						  UpdateSQ("\"Player\"",CondTable2);
						  JCurrent2 ="\"Player\"";
					    break;
					  case "8":
						  UpdateSQ("\"Kickoff-return\"",SimpTable2);
						  UpdateSQ("\"Kickoff-return\"",CondTable2);
						  JCurrent2 ="\"Kickoff-return\"";
					    break;
					  case "9":
						  UpdateSQ("\"Stadium\"",SimpTable2);
						  UpdateSQ("\"Stadium\"",CondTable2);
						  JCurrent2 ="\"Stadium\"";
					    break;
					  case "10":
						  UpdateSQ("\"Rush\"",SimpTable2);
						  UpdateSQ("\"Rush\"",CondTable2);
						  JCurrent2 ="\"Rush\"";
					    break;
					  case "11":
						  UpdateSQ("\"Punt\"",SimpTable2);
						  UpdateSQ("\"Punt\"",CondTable2);
						  JCurrent2 ="\"Punt\"";
					    break;
					  case "12":
						  UpdateSQ("\"Team\"",SimpTable2);
						  UpdateSQ("\"Team\"",CondTable2);
						  JCurrent2 ="\"Team\"";
					    break;
					  case "13":
						  UpdateSQ("\"Punt-Return\"",SimpTable2);
						  UpdateSQ("\"Punt-Return\"",CondTable2);
						  JCurrent2 ="\"Punt-Return\"";
					    break;
					  case "14":
						  UpdateSQ("\"Reception\"",SimpTable2);
						  UpdateSQ("\"Reception\"",CondTable2);
						  JCurrent2 ="\"Reception\"";
					    break;
					  default:
					    // code block  
					}
				}
				SJTableC++;
				if (SJTableC==2) {
					SJAddR1.setVisible(true);
				}
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_8.setBounds(171, 508, 183, 49);
		Simple_Join.add(btnNewButton_8);
		
		JRadioButton SJPunt = new JRadioButton("Punt");
		SJPunt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJPunt.setBounds(350, 170, 127, 25);
		SJPunt.setActionCommand("11");
		Simple_Join.add(SJPunt);
		
		JRadioButton SJTeam = new JRadioButton("Team");
		SJTeam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJTeam.setBounds(350, 70, 127, 25);
		SJTeam.setActionCommand("12");
		Simple_Join.add(SJTeam);
		
		JRadioButton SJPuntR = new JRadioButton("Punt-Return");
		SJPuntR.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJPuntR.setBounds(350, 270, 127, 25);
		SJPuntR.setActionCommand("13");
		Simple_Join.add(SJPuntR);
		
		JRadioButton SJReturn = new JRadioButton("Return");
		SJReturn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		SJReturn.setBounds(350, 370, 127, 25);
		SJReturn.setActionCommand("14");
		Simple_Join.add(SJReturn);
		
		SJTable = new ButtonGroup();
		SJTable.add(SJReturn);
		SJTable.add(SJConf);
		SJTable.add(SJPuntR);
		SJTable.add(SJTeam);
		SJTable.add(SJPunt);
		SJTable.add(SJRush);
		SJTable.add(SJStadium);
		SJTable.add(SJKickR);
		SJTable.add(SJPlayer);
		SJTable.add(SJPlay);
		SJTable.add(SJPass);
		SJTable.add(SJKick);
		SJTable.add(SJGame);
		SJTable.add(SJDrive);
		
		SJReset = new JButton("Reset");
		SJReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SJTableC=0;
				SJMasterString="";
				SJAddR1.setVisible(false);
				PanelRowsSJ.setVisible(false);
				SJFilePanel.setVisible(false);
				String JCurrent1 ="";
				String JCurrent2 ="";
				SimpTable1.removeAllItems();
				SimpTable2.removeAllItems();
				CondTable1.removeAllItems();
				CondTable2.removeAllItems();
				CondTSharedTable.removeAllItems();
				SJCol1="";
				SJNcols1 =0;
				SJCol2="";
				SJNcols2 =0;
				SJCol3="";
				SJNcols3 =0;
				SJCol4="";
				SJNcols4 =0;
			}
		});
		SJReset.setBounds(12, 606, 97, 25);
		Simple_Join.add(SJReset);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		btnNewButton = new JButton("Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChangePanel(Current,1);
				Current = 1;
			}
		});
		menuBar.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Simple Query");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Current,2);
				Current = 2;
			}
		});
		menuBar.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Simple Joins ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Current,3);
				Current = 3;
			}
		});
		menuBar.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Special Queries");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Current,4);
				Current = 4;
			}
		});
		menuBar.add(btnNewButton_3);
		
		menuBar.setVisible(false);
		
				
	}
public void ChangePanel(int C, int N) {
		
		switch(C) {
		  case 1:
		    // code block
			Menu.setVisible(false);
			
		    break;
		  case 2:
		    // code block
			  SimpleQuery.setVisible(false);
		    break;
		  case 3:
		    // code block
			  Simple_Join.setVisible(false);
			break;
		  case 4:
		    // code block
			  SQ.setVisible(false);
		    break;
		  
		  default:
		    // code block
		}
		switch(N) {
		  case 1:
			  // code block
			  Menu.setVisible(true);
		    break;
		  case 2:
			  // code block
			  SimpleQuery.setVisible(true);
		    break;
		  case 3:
		    // code block
			  Simple_Join.setVisible(true);
			break;
		  case 4:
		    // code block
			  SQ.setVisible(true);
		    break;
		 
		  default:
		    // code block
			}
	}
public void UpdateSQ(String A, JComboBox C) {
	String stm = "SELECT * from ";
	stm += A;
	stm += "where false;";
	 try{
	     //create a statement object
	       Statement stmt = conn.createStatement();
	       //create an SQL statement
	       //String sqlStatement = "SELECT * from \"Conference\" where false;";
	       String sqlStatement = stm;
	       //send statement to DBMS
	       ResultSet result = stmt.executeQuery(sqlStatement);
	       ResultSetMetaData rsmd = result.getMetaData();
	       int	N = rsmd.getColumnCount();
	    	  C.removeAllItems();
			  for (int i = 1; i <= N; i++) {
				 C.addItem(rsmd.getColumnName(i));
	       }
	        
	   } catch (Exception e){
	     System.out.println("Error accessing Database.");
	     //e.printStackTrace();
	   }
}
private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
//Table Creator tool from: https://stackoverflow.com/questions/42773776/how-to-copy-one-row-from-jtable-into-another-jtable
public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}

//Code From: https://stackoverflow.com/questions/3709799/how-to-export-data-from-jtable-to-csv
public static boolean exportToCSV(JTable tableToExport,
        String pathToExportTo) {

	try {

        TableModel model = tableToExport.getModel();
        FileWriter csv = new FileWriter(new File(pathToExportTo));

        for (int i = 0; i < model.getColumnCount(); i++) {
            csv.write(model.getColumnName(i) + ",");
        }

        csv.write("\n");

        for (int i = 0; i < model.getRowCount(); i++) {
            for (int j = 0; j < model.getColumnCount(); j++) {
                csv.write(model.getValueAt(i, j).toString() + ",");
            }
            csv.write("\n");
        }

        csv.close();
        JOptionPane.showMessageDialog(null,"File Creation Done");
        return true;
    } catch (IOException e) {
        e.printStackTrace();
    }
    return false;
}
public void CheckJoin(String A,String B, JComboBox C) {
	//CondTSharedTable
	String stm = "SELECT * from ";
	stm += A;
	stm += "where false;";
	String stm2 = "SELECT * from ";
	stm2 += B;
	stm2 += "where false;";
	 try{
	     //create a statement object
	       Statement stmt = conn.createStatement();
	       Statement stmt2 = conn.createStatement();
	       //create an SQL statement
	       //String sqlStatement = "SELECT * from \"Conference\" where false;";
	       String sqlStatement = stm;
	       String sqlStatement2 = stm2;
	       //send statement to DBMS
	       ResultSet result = stmt.executeQuery(sqlStatement);
	       ResultSetMetaData rsmd = result.getMetaData();
	       ResultSet result2 = stmt2.executeQuery(sqlStatement2);
	       ResultSetMetaData rsmd2 = result2.getMetaData();
	       Vector<String> vector1 = new Vector<String>(); 
	       Vector<String> vector2 = new Vector<String>(); 
	       int	N = rsmd.getColumnCount();
		   for (int i = 1; i <= N; i++) {
				 vector1.add(rsmd.getColumnName(i));
	       }
		   int	M = rsmd2.getColumnCount();
		   for (int i = 1; i <= M; i++) {
				 vector2.add(rsmd2.getColumnName(i));
	       }
		   int K = Math.max(N,M);
		   int k = Math.min(N,M);
	       for (int i = 0;i<K;i++) {
	    	   for(int j = 0;j<k;j++) {
	    		   
	    		   String F = vector1.get(i);
	    		   String G = vector2.get(j);  
	    		  
	    		   if(F.equals(G)) {
	    			   C.addItem(F);
	    		   }
	    	   }
	       }
	   } catch (Exception e){
	     System.out.println("Error accessing Database.");
	     //e.printStackTrace();
	   }
	
}
}