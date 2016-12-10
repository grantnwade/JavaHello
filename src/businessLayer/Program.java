package businessLayer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String");
		String s = br.readLine();
		System.out.print("Enter Integer");
		try{
			int i = Integer.parseInt(br.readLine());
		}catch(NumberFormatException ex){
			System.err.println("Invalid Format!");
		}
		
		
		
	    
	}

}
