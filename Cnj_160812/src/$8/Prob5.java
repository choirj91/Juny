package $8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prob5 {
	public static void main(String[] args) throws IOException {
		String fileName = "data.txt";
		makeVariable(fileName);
	}

	private static void makeVariable(String fileName) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader(fileName));
		String line= br.readLine();
		
		while(line!=null)
			{
				String result="";
				line=line.toLowerCase();

					for(int i=0; i<line.length(); i++)
						{
							if(line.charAt(i)=='_')
								{
									result+= line.substring(i+1,i+2).toUpperCase();
									i++;
								}
							else
								{
									result+= line.substring(i,i+1);
								}
						}
						line=br.readLine();
						System.out.println(result);
			}
			br.close();
		
	}
}
