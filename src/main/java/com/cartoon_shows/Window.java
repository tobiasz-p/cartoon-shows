package com.cartoon_shows;

import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window {
	public static JFrame frame;
	
	public static String updateFrame(String questionValue, List<String> options){
		int index = JOptionPane.showOptionDialog(null, questionValue, "Answer the question:",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
                options.toArray(new String[options.size()]), options.get(0));
		
		return options.get(index);
	}
	
	public static void showMatch(List<String> titles){
		String listString = "";
		for (String t : titles){
		    listString += "* " + t + "\n";
		}
		JOptionPane.showMessageDialog(frame, "Best cartoons for you:\n" + listString);
	}
}
