import java.awt.Cursor;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.awt.Color;
import javax.swing.*;
import java.lang.Math;
import java.awt.*;  
import java.awt.event.*;  
import java.util.Scanner;
import javax.swing.JOptionPane;
class Gaming_World
{ 
    public static void main(String[] args)
    {
        
        JOptionPane.showMessageDialog(null,"Welcome to Hashtag's Mini-Games Foundation");
        int a=Integer.parseInt(JOptionPane.showInputDialog("\n   0. For Knowing Time\n   1. Guess The Number Game(CAN YOU???)\n   2. Mind Game(Calulator with twist)\n   3. Number Puzzle(BEAT ME IF YOUR CAN)\n   4. Rock, paper, Scissor ()\n   5. -==---\nEnter your Fun-Choice : "));
    	
    	switch(a)
    	{
        	case 0:
                        DTime class0=new DTime();  
                        break;
    		case 1:
        		//new Games_World2();
        		Guess_Number class1=new Guess_Number();
        		Guess_Number.guess_num();
        		break;
        	case 2:
        		//guessnumber();
        		Calcula class2=new Calcula();
        		break;
        	case 3:
                	puzzle class3=new puzzle();
                	break;
            case 4:
                    RPS_Game c4=new RPS_Game();
                    RPS_Game.RPS();
                        break;
            default:
                	JOptionPane.showMessageDialog(null, "Get new Eye Lens!\\nShutting Down!");
                    break;

                	
    	} 
    }
}
