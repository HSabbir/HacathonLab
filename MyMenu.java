
package iit;


    
    

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MyMenu 
{
	int choice=-1,i=0;
	Scanner cin= new Scanner(System.in);
	
	public void option() throws FileNotFoundException, ClassNotFoundException, IOException
	{
		Function func=new Function();
		
		while(true)
		{
			System.out.println("WELCOME TO STUDENTSHIP CERTIFICATE!\n1.Sign In\n2..Exit\n");
			
			int choice;
			choice = cin.nextInt();
			
			if(choice==2) break;
			else if(choice==1) func.beforeLogIn();
			System.out.println();
		}
	}
}


