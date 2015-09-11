package org.trompgames.jframes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MasterPanel extends JPanel{

	
	public static int xOffset = 0;
	public static int yOffset = 0;
	
	public static ArrayList<Panel> panels = new ArrayList<Panel>();
	
	public static Panel currentPanel;	
	
	public MasterPanel(){
		//currentPanel = new CreateDeck();
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		if(currentPanel != null){
			currentPanel.repaint();
		}
	}
	
	public void setPanel(Panel panel){
		if(currentPanel != null){
			MainFrame.frame.remove(currentPanel);
		}
		this.add(panel);
	}
	
	
	
	
	
	
}
