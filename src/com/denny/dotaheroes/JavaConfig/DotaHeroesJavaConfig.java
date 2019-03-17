package com.denny.dotaheroes.JavaConfig;

//import javax.lang.model.element.TypeElement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.denny.classes.types.AGItypes;
import com.denny.classes.heroes.Aleria;

import com.denny.classes.heroes.Heroes;
import com.denny.classes.types.DotaTypes;

@Configuration
@PropertySource("classpath:dota.properties")
public class DotaHeroesJavaConfig {
	@Bean
	public DotaTypes AGItypes() {
		return new AGItypes();
	}
	
	@Bean
	public Heroes Aleria(DotaTypes type, 
						   @Value("${hero1.strength}")int strength, 
						   @Value("${hero1.inteligent}")int inteligent,
						   @Value("${hero1.agility}")int agility){
	
		Aleria aleria1 = new Aleria(AGItypes(), strength, inteligent,  agility);
		
		return aleria1;
	}
}
