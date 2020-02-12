import java.util.*;
import java.io.*;

public class Huffmans_Tree {
	private Node root;

	Huffmans_Tree() {
		this.root = null;
	}

	public Node conceive_parent(Node x, Node y) {

		Node temp = new Node('#', (x.freq + y.freq));
		temp.LChild = x;
		temp.RChild = y;

		return temp;
	}

	public void copyTree(Node newRoot) {
		this.root = newRoot;
	}

	public void DefinePath() {
		String s = new String();
		pathMaker(this.root, s);

	}

	// this function assigns paths
	private void pathMaker(Node localRoot, String s) {

		if (localRoot.RChild == null && localRoot.LChild == null) {
			dataDictionary(localRoot, s);
			return;
		}
		if (localRoot.LChild != null) {
			// s=s.concat("0");
			pathMaker(localRoot.LChild, s.concat("0"));
		}
		if (localRoot.RChild != null) {
			// s=s.concat("1");
			pathMaker(localRoot.RChild, s.concat("1"));
		}

	}

	static int ptr = 0;
	static String[][] DataDictionary = new String[256][2];

	public String [][] importDictionary(){
		return DataDictionary;
	}
	public int importPointer(){
		return ptr;
	}
	
	
	public void dataDictionary(Node temp, String x) {
		char c = temp.letter;
		// makes the data dictionary 2D array here
		DataDictionary[ptr][0] = String.valueOf(c);
		DataDictionary[ptr][1] = x;
		ptr++;

		FileWriter fileWritter;
		try {
			fileWritter = new FileWriter("Data_Dictionary.txt", true); /*
																		 * open
																		 * the
																		 * file
																		 * in
																		 * append
																		 * mode
																		 */

			// perform the operations
			PrintWriter pr = new PrintWriter(fileWritter);

			pr.print(c + " ");// writes character in the data dictionary file
			pr.println(x); // writes the path

			// closes it
			pr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// System.out.println(ptr);
		// this.compress();
	}

	// function to make the data dictionary array
	public void SHOW_ARRAY() {
		System.out.println();
		/*for (int i = 0; i < ptr; i++) {
			System.out.println(DataDictionary[i][0] + " "
					+ DataDictionary[i][1]);
		}*/
		this.compress();

	}

	// the function to compress the file

	public void compress() {
		try {
			Scanner scan = new Scanner(new File("ToBeCompressed.txt"));
			FileWriter File = new FileWriter("BinOut.txt");
			PrintWriter output = new PrintWriter(File);

			while (scan.hasNextLine()) {

				String line = scan.nextLine();
				///* //check1 */System.out.println(line);
				char arr[] = line.toCharArray();

				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < ptr; j++) {
						if (arr[i] == DataDictionary[j][0].charAt(0)) {

							output.print(DataDictionary[j][1]+" ");
							break;
						}
					}
				}
			  output.println();

			}
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println("Compression Done!!!");
		 createTheBinaryFile(); // creates the binary file
	}

	void createTheBinaryFile() {
		try {
			Scanner scan = new Scanner(new File("BinOut.txt"));

			FileOutputStream File = new FileOutputStream("CompressedFile.bin");

			ObjectOutputStream CompressedFile = new ObjectOutputStream(File);

			while (scan.hasNextLine()) {
				String temp = scan.nextLine();
				// String c="\n"; //to go to the next Line
				CompressedFile.writeUTF(temp);
				// CompressedFile.writeChar(0085);
			}
			CompressedFile.close();
			scan.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
