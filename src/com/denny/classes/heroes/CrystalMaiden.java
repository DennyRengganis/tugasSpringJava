package com.denny.classes.heroes;

import com.denny.classes.types.DotaTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CrystalMaiden implements Heroes {

	private DotaTypes type;
	private int strength;
	private int inteligent;
	private int agility;
	
	public CrystalMaiden() {
		super();
	}
	@Autowired
	public CrystalMaiden(@Qualifier("INTtypes")DotaTypes type,
			@Value("${hero1.strength}") int strength,
			@Value("${hero1.inteligent}")int inteligent,
			@Value("${hero1.agility}")int agility) {
		super();
		this.strength= strength;
		this.type = type;
		this.inteligent= inteligent;
		this.agility=agility;
	}
	
	
	@Override
	public String heroesName() {
		return "Rylai as cold as ice";
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
