package com.denny.classes.heroes;

import com.denny.classes.types.DotaTypes;

public class Slark implements Heroes {
	
	private DotaTypes type;
	private int strength;
	private int inteligent;
	private int agility;
	
	public Slark() {
		super();
	}
	public Slark( DotaTypes type,int strength,int inteligent,int agility) {
		super();
		this.strength= strength;
		this.type = type;
		this.inteligent= inteligent;
		this.agility=agility;
	}
	
	@Override
	public String heroesName() {
		return "Slark~";
	}

	public DotaTypes getType() {
		return type;
	}

	public void setType(DotaTypes type) {
		this.type = type;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getInteligent() {
		return inteligent;
	}

	public void setInteligent(int inteligent) {
		this.inteligent = inteligent;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

}
