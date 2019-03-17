package com.denny.classes.types;

import org.springframework.stereotype.Component;

@Component()
public class INTtypes implements DotaTypes {

	@Override
	public String getHeroesType() {
		return "Inteligent";
	}

}
