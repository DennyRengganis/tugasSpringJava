package com.denny.dotaheroes.XML;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.denny.classes.heroes.Axe;
import com.denny.classes.heroes.Heroes;
import com.denny.classes.heroes.Slark;
import com.denny.classes.types.DotaTypes;

public class DotaHeroesXML {
	public static void main(String[] args) {
		
		// Create IOC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("DotaConfig.xml"); 
		
		// Get bean object
		Heroes hero_1 = context.getBean("myHero_1", Heroes.class);			
		Axe axe1 = (Axe)hero_1;
		
		Heroes hero_2 = context.getBean("myHero_2", Heroes.class);
		Slark slark1 = (Slark)hero_2;
		
		Heroes hero_3 = context.getBean("myHero_2", Heroes.class);
		Slark slark2 = (Slark)hero_3;

		DotaTypes strength = context.getBean("myTypes1", DotaTypes.class);
		// Use the bean object
		System.out.println("Heroes 1: " + axe1.heroesName() + "\nTypes: " + axe1.getType().getHeroesType()+"\nStrength: " + axe1.getStrength() +"\nInteligent: " + axe1.getInteligent()+"\nAgility: " + axe1.getAgility() );
		System.out.println("\n\nHeroes 2: " + slark1.heroesName() + "\nTypes: " + slark1.getType().getHeroesType()+"\nStrength: " + slark1.getStrength() +"\nInteligent: " + slark1.getInteligent()+"\nAgility: " + slark1.getAgility() );
		slark2.setType(strength);
		System.out.println("\n\nHeroes 2: " + slark2.heroesName() + "\nTypes: " + slark2.getType().getHeroesType()+"\nStrength: " + slark2.getStrength() +"\nInteligent: " + slark2.getInteligent()+"\nAgility: " + slark2.getAgility() );
		// Close IOC container
		context.close();
	}
}
