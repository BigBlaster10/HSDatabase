package org.tromphome.listeners;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import org.trompgames.jframes.MainPanel;

public class MouseWheel implements MouseWheelListener{

	public MouseWheel(){
		
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent event) {
		System.out.println("MouseWheel");
		int i = event.getWheelRotation(); //forward = -1, backward = 1
		MainPanel.yOffset += -(i*15);
	}
	
}
