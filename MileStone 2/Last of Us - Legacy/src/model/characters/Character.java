package model.characters;

import java.awt.Point;

import exceptions.InvalidTargetException;
import exceptions.NotEnoughActionsException;


public abstract class Character {
	private String name;
	private Point location;
	private int maxHp;
	private int currentHp;
	private int attackDmg;
	private Character target;

	
	public Character() {
	}
	

	public Character(String name, int maxHp, int attackDmg) {
		this.name=name;
		this.maxHp = maxHp;
		this.currentHp = maxHp;
		this.attackDmg = attackDmg;
	}
		
	public Character getTarget() {
		return target;
	}

	public void setTarget(Character target) {
		this.target = target;
	}
	
	public String getName() {
		return name;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int currentHp) {
		if(currentHp < 0) 
			this.currentHp = 0;
		else if(currentHp > maxHp) 
			this.currentHp = maxHp;
		else 
			this.currentHp = currentHp;
	}

	public int getAttackDmg() {
		return attackDmg;
	}
	public void attack() throws NotEnoughActionsException,InvalidTargetException {
		
	}
	public boolean ADJ(Point p) {
		if(((int)this.getLocation().distance(p))==1) {
			return true;
		}
		return false;
	}
	public void defend(Character c) {
		c.setCurrentHp(c.getCurrentHp()-(this.getAttackDmg()/2));
	}
	public void onCharacterDeath() {
		
	}
	

}
