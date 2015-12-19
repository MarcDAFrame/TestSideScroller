package mast.testSideScroller.entites;

import org.newdawn.slick.Color;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Player extends Moveable{
	
	private Input in;

	public Player(GameContainer gc) {
		super(EntityID.Player);
		in = gc.getInput();
	}
	
	@Override
	public void tick(int delta) {
		updateMovement();
	}
	
	public void render(Graphics g){
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), 32, 32);
	}
	
	private void updateMovement() {
		if(movingLeft()){
			addToX(-3);
		}
		
		if(movingRight()){
			addToX(3);
		}
	}
	
	private boolean movingLeft(){
		return in.isKeyDown(Input.KEY_A);
	}
	
	private boolean movingRight(){
		return in.isKeyDown(Input.KEY_D);
	}

}
