package com.denny.dotaheroes.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.denny.classes.heroes.CrystalMaiden;
import com.denny.classes.heroes.Heroes;

public class DotaHeroesAnnotation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("DotaConfigA.xml");
		
		//Get bean objects
		Heroes hero_1 = context.getBean("crystalMaiden", Heroes.class);
		CrystalMaiden crystalMaiden = (CrystalMaiden)hero_1;
		
		//Use the bean
		System.out.println(hero_1.getClass());
		System.out.println(crystalMaiden.getType().getHeroesType());
		System.out.println(crystalMaiden.getInteligent());
		
		//Close context/IOC container
		context.close();

	}

}
