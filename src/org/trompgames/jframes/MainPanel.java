package org.trompgames.jframes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import org.tromphome.MainDatabase.Card;

public class MainPanel extends JPanel{

	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		int x = 0;
		int y = 0;
		
		for(Card card : Card.cards){
			
			BufferedImage image = card.getImage();
			
			g2d.drawImage(image, x, y, null);
			x += 200;
		}
		
		
		
		

	}
	
}
