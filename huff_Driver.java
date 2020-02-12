/*
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
 */

import java.util.*;
import java.io.*;

public class Driver {

	public static void main(String[] args) {

		Freq_Link_List list = new Freq_Link_List();
		// READING THE INFORMATION OUT OF THE FILE AND MAKING A HUFFMAN TREE OUT
		// OF IT
		try {
			Scanner scan = new Scanner(new File("ToBeCompressed.txt"));

			while (scan.hasNextLine()) {
				String s = scan.nextLine();
				char[] arr = s.toCharArray();

				for (int i = 0; i < arr.length; i++) {
					List_Node n = new List_Node(arr[i]);
					list.insert(n);
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		list.displayList();
		// makes a compressor class object
		Compressor x = new Compressor();
		// translate the list into priority queue
		x.ListToPriorityQ(list);
		// makes the tree out of the PQ
		x.Tree_Construct();

		Decompressor abc = new Decompressor();
		abc.LoadDicts();
		// abc.arrange_Dictionary();
	}

}

/*
 public class Driver extends JFrame implements ActionListener {
 
 private JPanel mainMenu; static JTextField logo, Path, status; static JLabel
 Message, form1; static JButton Compress, DeCompress;
 
 Driver() { this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default
 close // operation->action
 this.setTitle("Huffman Memorial Data Compressor (Junaid__Waleed)");
 this.setResizable(false); // non-extending this.setSize(800, 600); // frame
 dimensions. allocated pixels on screen this.setLocationRelativeTo(null); //
 default panel setting-> screen mid
 
 mainMenu = new JPanel(); mainMenu.setSize(800, 600);
 mainMenu.setLayout(null); mainMenu.setBackground(Color.lightGray);
 
 logo = new JTextField("Enter file path here with extension: ");
 logo.setFont(new Font("Courier New", Font.BOLD, 14)); logo.setSize(285, 40);
 logo.setBorder(null); logo.setBackground(Color.LIGHT_GRAY);
 logo.setEditable(false); logo.setLocation(2, 165); mainMenu.add(logo);
 
 form1 = new JLabel("Status"); form1.setFont(new Font("Courier New",
 Font.BOLD, 14)); form1.setSize(285, 40); form1.setBorder(null);
 form1.setBackground(Color.LIGHT_GRAY); // form1.setEditable(false);
 form1.setLocation(700, 480); mainMenu.add(form1);
 
 Path = new JTextField(""); Path.setFont(new Font("Courier New", Font.BOLD,
 14)); Path.setSize(270, 35); Path.setBorder(null);
 Path.setBackground(Color.WHITE); Path.setEditable(true);
 Path.setLocation(290, 165); mainMenu.add(Path);
 
 status = new JTextField(""); status.setFont(new Font("Courier New",
 Font.BOLD, 14)); status.setSize(120, 45); status.setBorder(null);
 status.setBackground(Color.WHITE); status.setEditable(false);
 status.setLocation(680, 510); mainMenu.add(status);
 
 Compress = new JButton(); Compress.setSize(180, 60);
 Compress.setText("Compress"); Compress.setFont(new Font("Courier New",
 Font.BOLD, 18)); Compress.setLocation(160, 300);
 Compress.setBackground(Color.WHITE); mainMenu.add(Compress);
 
 DeCompress = new JButton(); DeCompress.setSize(180, 60);
 DeCompress.setText("De-Compress"); DeCompress.setFont(new Font("Courier New",
 Font.BOLD, 18)); DeCompress.setLocation(380, 300);
 DeCompress.setBackground(Color.WHITE); mainMenu.add(DeCompress);
 
 Compress.addActionListener(this); DeCompress.addActionListener(this);
 
 this.add(mainMenu);
 
 }
 
 public void actionPerformed(ActionEvent axl) {
 
 if (axl.getSource() == Compress) { Path.setText(""); String fileName =
 Path.getText();
 
 Freq_Link_List list = new Freq_Link_List(); // READING THE INFORMATION OUT OF
 THE FILE AND MAKING A HUFFMAN TREE // OUT OF IT try { Scanner scan = new
 Scanner(new File(fileName));
 
 while (scan.hasNextLine()) { String s = scan.nextLine(); char[] arr =
 s.toCharArray();
 
 for (int i = 0; i < arr.length; i++) { List_Node n = new List_Node(arr[i]);
 list.insert(n); }
 
 }
 
 } catch (FileNotFoundException e) { e.printStackTrace(); }
 
 //list.displayList(); // makes a compressor class object Compressor x = new
 Compressor(); // translate the list into priority queue
 x.ListToPriorityQ(list); // makes the tree out of the PQ x.Tree_Construct();
 status.setText("Done"); }
 
 if (axl.getSource() == DeCompress) { Path.setText(""); status.setText("");
 String fileName = Path.getText();
 
 Decompressor abc = new Decompressor(fileName); abc.LoadDicts();
 
 }
 
 } static Driver GUI=new Driver(); public static void main(String []args){
 GUI.setVisible(true); } }
*/