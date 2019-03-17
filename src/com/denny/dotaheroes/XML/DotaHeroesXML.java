package com.denny.dotaheroes.XML;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.denny.classes.heroes.Axe;
import com.denny.classes.heroes.Heroes;

public class DotaHeroesXML {
	public static void main(String[] args) {
		
		// Create IOC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("DotaConfig.xml"); 
		
		// Get bean object
		Heroes hero_1 = context.getBean("myHero_1", Heroes.class);			
		Axe axe1 = (Axe)hero_1;
		

		// Use the bean object
		System.out.println("Pokemon 1: " + axe1.heroesName() + "\nTypes: " + axe1.getType().getHeroesType());
		
		
		// Close IOC container
		context.close();
	}
}
