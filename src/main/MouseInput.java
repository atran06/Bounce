package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import game.Game;
import game.Game.STATE;

public class MouseInput implements MouseListener {

	Game game;
	
	public MouseInput(Game game) {
		this.game = game;
	}
	
	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		System.out.println(mx + " " + my);
		if(Game.state == Game.STATE.menu) {
			if (mx >= 515 * game.getScaleWidth() && mx <= 770 * game.getScaleWidth()) {
				if (my >= 430 * game.getScaleHeight() && my <= 700 * game.getScaleHeight()) {
					Game.state = Game.STATE.game;
				}
			} else if (mx >= 32 && mx <= 220) {
				if (my >= 530 && my <= 690) {
					Game.state = Game.STATE.setting;
				}
			} else if (mx >= 1065 && mx <= 1255) {
				if (my >= 530 && my <= 690) {
					Game.state = Game.STATE.help;
				}
			} 					
		} else if(Game.state == Game.STATE.setting) {
			if(mx >= 40 && mx <= 90) {
				if(my >= 645 && my <= 670) {
					Game.state = Game.STATE.menu;
				}
			}
		} else if(Game.state == Game.STATE.help) {
			if(mx >= 40 && mx <= 90) {
				if(my >= 645 && my <= 670) {
					Game.state = Game.STATE.menu;
				}
			}
		}
	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {

	}

}
