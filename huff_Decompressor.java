import java.util.*;
import java.io.*;

public class Decompressor {

	Huffmans_Tree temp = new Huffmans_Tree();
	String[][] Dic;
	static int pointer;
	String filename;
	/*
	Decompressor(String s){
		filename=s;
	}
	*/
	// loads the dictionary in the Dic Array
	void LoadDicts() {
		String[][] Dic = temp.importDictionary();
		pointer = temp.importPointer();

		/*for (int i = 0; i < pointer; i++) {
			System.out.println(Dic[i][0] + " " + Dic[i][1]);
		}*/
		
		//
//		System.out.println(Dic.length);
		
		for(int i=0;i<pointer;i++){
			for(int j=0;j<pointer-i-1;j++){
				if( (Dic[j][1].length()) < Dic[j+1][1].length()){
					
					//swap the char
					String letter=Dic[j][0];
					Dic[j][0]=Dic[j+1][0];
					Dic[j+1][0]=letter;
					//swap the path string
					String path=Dic[j][1];
					Dic[j][1]=Dic[j+1][1];
					Dic[j+1][1]=path;
				}
			}
		}
		
		/*for (int i = 0; i < pointer; i++) {
			System.out.println(Dic[i][0] + " " + Dic[i][1]);
		}*/

		Decompress(Dic);
	}

	void Decompress(String [][]Dic) {
		try {
			Scanner scan = new Scanner(new File("BinOut.txt"));
			FileWriter ReverseProcess = new FileWriter("Original.txt");
			PrintWriter writer = new PrintWriter(ReverseProcess);

			
			String str=new String();
			while (scan.hasNextLine()) {
				str = scan.nextLine();
				//System.out.println(str);
				//System.out.println(pointer);
				for (int i = 0; i < pointer; i++) {
					//System.out.println(Dic[i][0]);
					str = str.replaceAll(Dic[i][1], Dic[i][0]);
				}

				str=spaceAdjustmentBureau(str);
				System.out.println(str);
				writer.println(str);
				
			}
			
			ReverseProcess.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	private String spaceAdjustmentBureau(String s){
		s=s.replaceAll("  ", "-");
		s=s.replaceAll(" ", "");
		s=s.replaceAll("-", " ");
		return s;
	}
}
