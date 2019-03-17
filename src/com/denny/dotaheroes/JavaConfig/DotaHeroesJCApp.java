package com.denny.dotaheroes.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.denny.classes.heroes.Aleria;
import com.denny.classes.heroes.Heroes;

public class DotaHeroesJCApp {

	public static void main(String[] args) {
		// Create IOC container
				AnnotationConfigApplicationContext context =
						new AnnotationConfigApplicationContext(DotaHeroesJavaConfig.class);
				
				// Get bean object
				Heroes hero_1 = context.getBean("Aleria", Heroes.class);
				Aleria aleria = (Aleria)hero_1;
				
				// Use bean object
				System.out.println("Hero 1: " + aleria.heroesName() + "\nElement: " + aleria.getType().getHeroesType()+ "\nAgility: " + aleria.getAgility());
				
				// Close IOC container
				context.close();
	}

}
