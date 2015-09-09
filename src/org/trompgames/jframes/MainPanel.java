package org.trompgames.jframes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import org.tromphome.MainDatabase.Card;
import org.tromphome.listeners.MouseWheel;
import org.tromphome.utils.ImageUtil;
import org.tromphome.utils.Location;

public class MainPanel extends JPanel{

	
	public static int xOffset = 0;
	public static int yOffset = 0;
	
	
	public MainPanel(){
		this.addMouseWheelListener(new MouseWheel());
		
		Location loc = new Location(0,0);
		
		for(Card card : Card.cards){
			
			card.setLocation(loc);
			loc = loc.add(200,0);
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;

		
		for(Card card : Card.cards){
			
			BufferedImage image = card.getImage();
			
			//BufferedImage i = ImageUtil.resize(image, image.getWidth()/2, image.getHeight()/2);
			Location loc = card.getLocation();
			g2d.drawImage(image, loc.getX() + xOffset, loc.getY() + yOffset, null);
		}
		
		
		
		

	}
	
}
