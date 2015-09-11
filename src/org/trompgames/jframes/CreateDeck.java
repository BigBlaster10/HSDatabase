package org.trompgames.jframes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JPanel;

import org.tromphome.MainDatabase.Card;
import org.tromphome.listeners.MouseWheel;
import org.tromphome.utils.Location;

public class CreateDeck extends Panel{

	JButton createDeck;
	JButton openDeck;
	
	public CreateDeck(){
		
		this.addMouseWheelListener(new MouseWheel());
		
		Location loc = new Location(0,0);
		
		for(Card card : Card.cards){
			
			card.setLocation(loc);
			loc = loc.add(200,0);
		}
		
		createDeck = new JButton();
		createDeck.setText("Create Deck");
		this.add(createDeck);
		
		createDeck.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e)
			  {
			    System.out.println("Creating...");
			  }
			});
		
		
		openDeck = new JButton();
		openDeck.setText("Open Deck");
		this.add(openDeck);
		
		openDeck.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e)
			  {
			    System.out.println("Opening...");
			  }
			});
		
		
		
		
		
	}
	

	public void createDeck(Graphics2D g2d){
		g2d.setColor(new Color(150,40,27));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for(Card card : Card.cards){			
			BufferedImage image = card.getImage();			
			//BufferedImage i = ImageUtil.resize(image, image.getWidth()/2, image.getHeight()/2);
			Location loc = card.getLocation();
			g2d.drawImage(image, loc.getX() + xOffset, loc.getY() + yOffset, null);
		}
	}
	
	
}
