package own.game;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.List;
//import java.util.random.*;
import java.util.Random;
import java.util.ArrayList;
public class SpsGame {
	
	static int answer,playerinput;
	static String[] options={"Exit","Stone","Paper","Scissors"};
	
	
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null,"Welcome to Stone,Paper and Scissors game");
		
		int key =1;
		
		
		do {
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			
			Random rn = new Random();
			answer = rn.nextInt(3) + 1;
	//player();
			
			playerinput = JOptionPane.showOptionDialog(null, 
							"Choose the option", 
							"Option", 
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.INFORMATION_MESSAGE, 
							null,
							options, 
							0);

			int flag = 0;
			
			switch(playerinput) {
				case 1:
					flag =1;
					compare(answer,flag);
					break;
				case 2:
					flag=2;
					compare(answer,flag);
					break;
				case 3:
					flag = 3;
					compare(answer,flag);
					break;
				case 0:
					key = 0;
					JOptionPane.showMessageDialog(null, "Thankyou! Visit again.");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Wrong Choice!\\n Try Again :");
					continue;
			}
			

	}while(key!=0);
		
	}	
	public static void compare(int c1,int p1) 
	{
		int c,p;
		c=c1;
		p=p1;
		JOptionPane.showMessageDialog(null,"Computer Chose "+options[answer]+" and you chose "+options[playerinput]);
		if(c == p) 
		{	
			JOptionPane.showMessageDialog(null, "\nDraw\n\tRetry : ");
		
		}
		
		else if(c==1 && p ==2 || c==2 && p==3 || c==3 && p==1) 
		{
			JOptionPane.showMessageDialog(null,"\n\tYou  win!\n Retry : ");
		}
		
		else if(c==1 && p==3 || c==3 && p==2 || c==2 && p==1) 
		{
			JOptionPane.showMessageDialog(null,"\n\tYou  lose :)\n Retry : ");

		}
	}
}