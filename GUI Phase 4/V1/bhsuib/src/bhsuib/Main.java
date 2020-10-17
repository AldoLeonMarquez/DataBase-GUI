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

public class Main {
	int SJTableC=0;
	dbSetup my = new dbSetup();
	private JFrame frame;
	private JFrame frameOut;
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
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	
	private int Current;
	private JPanel SimpleQuery;
	private JPanel SQ1;
	private JPanel SQ2;
	private JPanel SQ3;
	private JPanel SQ4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JPanel panel;
	private JPanel SQDesc;
	private JPanel SJDesc;
	private JPanel SQ1Desc;
	private JPanel SQ2Desc;
	private JPanel SQ3Desc;
	private JPanel SQ4Desc;
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
	private JComboBox SJBox1;
	private JComboBox SJBox2;
	private JButton button;
	private JButton button_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
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
	private JTextField SJFile;
	
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
            	      JOptionPane.showMessageDialog(null,"Connection NOT Closed.");
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
		
		JRadioButton RD1 = new JRadioButton("Simple Query");
		RD1.setSelected(true);
		RD1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		RD1.setBounds(100, 90, 159, 35);
		RD1.setActionCommand("1");
		Menu.add(RD1);
		
		JRadioButton RD2 = new JRadioButton("Simple Join");
		RD2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		RD2.setBounds(100, 160, 137, 35);
		RD2.setActionCommand("2");
		Menu.add(RD2);
		
		JRadioButton RD3 = new JRadioButton("Special Query 1");
		RD3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		RD3.setBounds(100, 230, 181, 35);
		RD3.setActionCommand("3");
		Menu.add(RD3);
		
		JRadioButton RD4 = new JRadioButton("Special Query 2");
		RD4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		RD4.setBounds(100, 300, 181, 35);
		RD4.setActionCommand("4");
		Menu.add(RD4);
		
		JRadioButton RD5 = new JRadioButton("Special Query 3");
		RD5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		RD5.setBounds(100, 370, 181, 35);
		RD5.setActionCommand("5");
		Menu.add(RD5);
		
		JRadioButton RD6 = new JRadioButton("Special Query 4");
		RD6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		RD6.setBounds(100, 440, 195, 37);
		RD6.setActionCommand("6");
		Menu.add(RD6);
		
		ButtonGroup group = new ButtonGroup();
		group.add(RD1);
		group.add(RD2);
		group.add(RD3);
		group.add(RD4);
		group.add(RD5);
		group.add(RD6);
		
		
		panel = new JPanel();
		panel.setBounds(450, 90, 680, 390);
		Menu.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		SQDesc = new JPanel();
		panel.add(SQDesc, "name_30577748332800");
		
		SJDesc = new JPanel();
		panel.add(SJDesc, "name_30583106424800");
		
		SQ1Desc = new JPanel();
		panel.add(SQ1Desc, "name_30585661819800");
		
		SQ2Desc = new JPanel();
		panel.add(SQ2Desc, "name_30587977524200");
		
		SQ3Desc = new JPanel();
		panel.add(SQ3Desc, "name_30591290181500");
		
		SQ4Desc = new JPanel();
		panel.add(SQ4Desc, "name_30593656286000");
		
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
				UpdateSQ("\"Conference\"",1);
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
				UpdateSQ("\"Drive\"",1);
				SQselect = "\"Drive\"";
			}
		});
		SQDr.setBounds(65, 180, 97, 40);
		SimpleQuery.add(SQDr);
		
		SQG = new JButton("Game");
		SQG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Game\"",1);
				SQselect = "\"Game\"";
			}
		});
		SQG.setBounds(65, 270, 97, 40);
		SimpleQuery.add(SQG);
		
		SQK = new JButton("Kickoff");
		SQK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Kickoff\"",1);
				SQselect = "\"Kickoff\"";
			}
		});
		SQK.setBounds(65, 360, 97, 40);
		SimpleQuery.add(SQK);
		
		SQSt = new JButton("Stadium");
		SQSt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Stadium\"",1);
				SQselect = "\"Stadium\"";
			}
		});
		SQSt.setBounds(155, 455, 97, 40);
		SimpleQuery.add(SQSt);
		
		SQP = new JButton("Pass");
		SQP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Pass\"",1);
				SQselect = "\"Pass\"";
			}
		});
		SQP.setBounds(225, 90, 97, 40);
		SimpleQuery.add(SQP);
		
		SQPlay = new JButton("Play");
		SQPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);	
				UpdateSQ("\"Play\"",1);
				SQselect = "\"Play\"";
			}
		});
		SQPlay.setBounds(225, 180, 97, 40);
		SimpleQuery.add(SQPlay);
		
		SQPlayer = new JButton("Player");
		SQPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Player\"",1);
				SQselect = "\"Player\"";
			}
		});
		SQPlayer.setBounds(225, 270, 97, 40);
		SimpleQuery.add(SQPlayer);
		
		btnNewButton_15 = new JButton("KickoffRtn");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Kickoff-return\"",1);
				SQselect = "\"Kickoff-return\"";
			}
		});
		btnNewButton_15.setBounds(225, 360, 97, 40);
		SimpleQuery.add(btnNewButton_15);
		
		SQT = new JButton("Team");
		SQT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Team\"",1);
				SQselect = "\"Team\"";
			}
		});
		SQT.setBounds(385, 90, 97, 40);
		SimpleQuery.add(SQT);
		
		SQPunt = new JButton("Punt");
		SQPunt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Punt\"",1);
				SQselect = "\"Punt\"";
			}
		});
		SQPunt.setBounds(385, 180, 97, 40);
		SimpleQuery.add(SQPunt);
		
		SQPuntR = new JButton("Punt-Rtn");
		SQPuntR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Punt-Return\"",1);
				SQselect = "\"Punt-Return\"";
			}
		});
		SQPuntR.setBounds(385, 270, 97, 40);
		SimpleQuery.add(SQPuntR);
		
		SQReturn = new JButton("Reception");
		SQReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Reception\"",1);
				SQselect = "\"Reception\"";
			}
		});
		SQReturn.setBounds(385, 360, 97, 40);
		SimpleQuery.add(SQReturn);
		
		SQRush = new JButton("Rush");
		SQRush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SQData.setVisible(true);
				UpdateSQ("\"Rush\"",1);
				SQselect = "\"Rush\"";
			}
		});
		SQRush.setBounds(305, 455, 97, 40);
		SimpleQuery.add(SQRush);
		SQData.setVisible(false);
		
		SQ1 = new JPanel();
		frame.getContentPane().add(SQ1, "name_24288266837200"); //Panel 4
		SQ1.setLayout(null);
		
		lblNewLabel_6 = new JLabel("SQ1");
		lblNewLabel_6.setBounds(225, 284, 56, 16);
		SQ1.add(lblNewLabel_6);
		
		SQ2 = new JPanel();
		frame.getContentPane().add(SQ2, "name_24304350155600"); //Panel 5
		SQ2.setLayout(null);
		
		lblNewLabel_7 = new JLabel("sq2");
		lblNewLabel_7.setBounds(329, 323, 56, 16);
		SQ2.add(lblNewLabel_7);
		
		SQ3 = new JPanel();
		frame.getContentPane().add(SQ3, "name_24312506486600"); //Panel 6
		SQ3.setLayout(null);
		
		lblNewLabel_8 = new JLabel("sq3");
		lblNewLabel_8.setBounds(96, 453, 56, 16);
		SQ3.add(lblNewLabel_8);
		
		SQ4 = new JPanel();
		frame.getContentPane().add(SQ4, "name_24340422056900");//Panel 7
		SQ4.setLayout(null);
		
		lblNewLabel_9 = new JLabel("sq4");
		lblNewLabel_9.setBounds(251, 386, 56, 16);
		SQ4.add(lblNewLabel_9);
		
		Simple_Join = new JPanel();
		frame.getContentPane().add(Simple_Join, "name_82420281814600");
		Simple_Join.setLayout(null);
		
		SJAddR1 = new JPanel();
		SJAddR1.setBounds(552, 0, 698, 200);
		Simple_Join.add(SJAddR1);
		SJAddR1.setVisible(false);
		SJAddR1.setLayout(null);
		
		rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(167, 108, 70, 25);
		SJAddR1.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(485, 108, 61, 25);
		SJAddR1.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_10 = new JLabel("Simple ?");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(141, 54, 100, 25);
		SJAddR1.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Conditional ?");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(446, 51, 122, 30);
		SJAddR1.add(lblNewLabel_11);
		
		JButton SJNext = new JButton("Next");
		SJNext.setBounds(293, 162, 97, 25);
		SJAddR1.add(SJNext);
		
		PanelRowsSJ = new JPanel();
		PanelRowsSJ.setBounds(552, 204, 698, 210);
		Simple_Join.add(PanelRowsSJ);
		PanelRowsSJ.setVisible(false);
		PanelRowsSJ.setLayout(null);
		
		SJBox1 = new JComboBox();
		SJBox1.setBounds(71, 46, 229, 22);
		PanelRowsSJ.add(SJBox1);
		
		SJBox2 = new JComboBox();
		SJBox2.setBounds(388, 46, 229, 22);
		PanelRowsSJ.add(SJBox2);
		
		button = new JButton("Add row");
		button.setBounds(140, 96, 97, 25);
		PanelRowsSJ.add(button);
		
		button_1 = new JButton("Add Row");
		button_1.setBounds(450, 96, 97, 25);
		PanelRowsSJ.add(button_1);
		
		JButton SJRows = new JButton("All Rows");
		SJRows.setBounds(297, 159, 97, 25);
		PanelRowsSJ.add(SJRows);
		
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
		
		label_2 = new JLabel("File Name:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(137, 130, 80, 16);
		SJFilePanel.add(label_2);
		
		SJFile = new JTextField();
		SJFile.setColumns(10);
		SJFile.setBounds(252, 128, 192, 22);
		SJFilePanel.add(SJFile);
		
		JButton SJQuery = new JButton("Query");
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
		
		JRadioButton SJKickR = new JRadioButton("Kickoff Return");
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
				switch(S) {
				  case "1":
					  UpdateSQ("\"Conference\"",2+SJTableC);
				    break;
				  case "2":
					  UpdateSQ("\"Drive\"",2+SJTableC);
				    break;
				  case "3":
					  UpdateSQ("\"Game\"",2+SJTableC);
					break;
				  case "4":
					  UpdateSQ("\"Kickoff\"",2+SJTableC);
				    break;
				  case "5":
					  UpdateSQ("\"Pass\"",2+SJTableC);
				    break;
				  case "6":
					  UpdateSQ("\"Play\"",2+SJTableC);
					break;
				  case "7":
					  UpdateSQ("\"Player\"",2+SJTableC);
				    break;
				  case "8":
					  UpdateSQ("\"Kickoff-return\"",2+SJTableC);
				    break;
				  case "9":
					  UpdateSQ("\"Stadium\"",2+SJTableC);
				    break;
				  case "10":
					  UpdateSQ("\"Rush\"",2+SJTableC);
				    break;
				  case "11":
					  UpdateSQ("\"Punt\"",2+SJTableC);
				    break;
				  case "12":
					  UpdateSQ("\"Team\"",2+SJTableC);
				    break;
				  case "13":
					  UpdateSQ("\"Punt-Return\"",2+SJTableC);
				    break;
				  case "14":
					  UpdateSQ("\"Reception\"",2+SJTableC);
				    break;
				  default:
				    // code block
					  
				}
				SJTableC++;
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
		
		JRadioButton SJPuntR = new JRadioButton("Punt Return");
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
		
		btnNewButton_3 = new JButton("Special Query 1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Current,4);
				Current = 4;
			}
		});
		menuBar.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Special Query 2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Current,5);
				Current = 5;
			}
		});
		menuBar.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Special Query 3");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Current,6);
				Current = 6;
			}
		});
		menuBar.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Special Query 4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePanel(Current,7);
				Current = 7;
			}
		});
		menuBar.add(btnNewButton_6);
		
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
			  SQ1.setVisible(false);
		    break;
		  case 5:
		    // code block
			 SQ2.setVisible(false);
		    break;
		  case 6:
		    // code block
			  SQ3.setVisible(false);
			break;
		  case 7:
		    // code block
			  SQ4.setVisible(false);
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
			  SQ1.setVisible(true);
		    break;
		  case 5:
		    // code block
			 SQ2.setVisible(true);
		    break;
		  case 6:
		    // code block
			  SQ3.setVisible(true);
			break;
		  case 7:
		    // code block
			  SQ4.setVisible(true);
		    break;
		  default:
		    // code block
			}
	}
public void UpdateSQ(String A, int B) {
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
	       if (B == 1) {
	    	  SQDataBox.removeAllItems();
			  for (int i = 1; i <= N; i++) {
				 SQDataBox.addItem(rsmd.getColumnName(i));
			  } 
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
}
