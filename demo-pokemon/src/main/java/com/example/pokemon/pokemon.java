package com.example.pokemon;

import java.io.Serializable;

import com.example.enums.PokemonType;

public class pokemon implements Serializable {
  public String name;
  public int num;
  public PokemonType t1, t2;
  public String imgFilename;
  public int evolveFromLvl, evolveToLvl;

  public pokemon(String name, PokemonType t1, int num) {
    this.name = name;
    this.num = num;
    this.t1 = t1;
    this.t2 = PokemonType.NONE;

    evolveFromLvl = 0;
    evolveToLvl = 0;
  }

  public pokemon(String name, PokemonType t1, PokemonType t2, int num) {
    this.name = name;
    this.num = num;
    this.t1 = t1;
    this.t2 = t2;

    evolveFromLvl = 0;
    evolveToLvl = 0;
  }

  public pokemon(String name, PokemonType t1, int num, int evFromLvl, int evToLvl){
		this.name = name;
		this.num = num;
		this.t1 = t1;
		this.t2 = PokemonType.NONE;
		
		evolveFromLvl = evFromLvl;
		evolveToLvl = evToLvl;
	}

  public pokemon(String name, PokemonType t1, PokemonType t2, int num, int evFromLvl, int evToLvl){
		this.name = name;
		this.num = num;
		this.t1 = t1;
		this.t2 = t2;

		evolveFromLvl = evFromLvl;
		evolveToLvl = evToLvl;
	}
}
