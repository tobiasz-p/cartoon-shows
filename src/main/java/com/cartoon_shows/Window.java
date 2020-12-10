package com.cartoon_shows;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window {
	public static JFrame frame;
	
	public static String updateFrame(String questionValue){
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int dialogResult = JOptionPane.showConfirmDialog(null, questionValue, "Answer the question", dialogButton);
		if(dialogResult == JOptionPane.YES_OPTION)
			return "Yes";
		else
			return "No";
	}
	
	public static void showMatch(List <String> titles){
		String listString = "";
		for (String t : titles){
		    listString += "* " + t + "\n";
		}
		JOptionPane.showMessageDialog(frame, "Best cartoons for you:\n" + listString);
	}
}
