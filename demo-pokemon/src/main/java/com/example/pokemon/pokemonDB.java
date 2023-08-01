package com.example.pokemon;

import java.util.ArrayList;
import android.graphics.Color;

import com.example.enums.PokemonType;

public class pokemonDB extends ArrayList<pokemon> {
  public static ArrayList<pokemon> list;

  public pokemonDB() {
    list = new ArrayList<pokemon>();
    // becareful of abstract class
    list.add(new pokemon("Bulbasaur", PokemonType.GRASS, PokemonType.POISON, 1));
    list.add(new pokemon("Ivysaur", PokemonType.GRASS, PokemonType.POISON, 2));
    list.add(new pokemon("Venusaur", PokemonType.GRASS, PokemonType.POISON, 3));
    list.add(new pokemon("Charmander", PokemonType.FIRE,4));
    list.add(new pokemon("Charmeleon", PokemonType.FIRE, 5));
    list.add(new pokemon("Charizard", PokemonType.FIRE, PokemonType.FLYING, 6));
    list.add(new pokemon("Squirtle", PokemonType.WATER, 7));
    list.add(new pokemon("Wartortle", PokemonType.WATER, 8));
    list.add(new pokemon("Blastoise", PokemonType.WATER, 9));
    list.add(new pokemon("Caterpie", PokemonType.BUG, 10));
    list.add(new pokemon("Metapod", PokemonType.BUG, 11));
    list.add(new pokemon("Butterfree", PokemonType.BUG, PokemonType.FLYING,12));
    list.add(new pokemon("Weedle", PokemonType.BUG, PokemonType.POISON,13));
    list.add(new pokemon("Kakuna", PokemonType.BUG, PokemonType.POISON, 14));
    list.add(new pokemon("Beedrill", PokemonType.BUG, PokemonType.POISON, 15));
    list.add(new pokemon("Pidgey", PokemonType.NORMAL, PokemonType.FLYING, 16));
    list.add(new pokemon("Pidgeotto", PokemonType.NORMAL, PokemonType.FLYING, 17));
    list.add(new pokemon("Pidgeot", PokemonType.NORMAL, PokemonType.FLYING, 18));
  }
  public static int getTypeColor(PokemonType type){
		String color;
		switch(type){
		case GRASS: color = "#a5e65f"; break;
		case FIRE: color = "#ffa518"; break;
		case FIGHTING: color = "#e12f2f"; break;
		case GROUND: color = "#e0c068"; break;
		case PSYCHIC: color = "#f386a7"; break;
		case ROCK: color = "#bfaf6a"; break;
		case ICE: color = "#94e2e2"; break;
		case WATER: color = "#81b3ea"; break;
		case BUG: color = "#bcc477"; break;
		case DRAGON: color = "#8456f5"; break;
		case POISON: color = "#ad68ad"; break;
		case GHOST: color = "#7a669a"; break;
		case DARK: color = "#634d3e"; break;
		case STEEL: color = "#b8b8d0"; break;
		case NORMAL: color = "#a4a481"; break;
		case FLYING: color = "#aba1f4"; break;
		case ELECTRIC: color = "#000000"; break;
		
		default: color = "#000000"; break;
		}
		
		return Color.parseColor(color);
	}
}
