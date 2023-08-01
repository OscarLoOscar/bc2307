package com.example.battle;

import java.util.HashMap;
import java.util.Map;

import com.example.Moves.MovesDB;
import com.example.pokemon.pokemon;
import com.example.pokemon.pokemonDB;

public class battle {
  private final pokemonDB pokemon;
  private final MovesDB moves;

  public battle(pokemonDB pokemon, MovesDB moves) {
    this.pokemon = pokemon;
    this.moves = moves;
  }
public static boolean isVaild = true;

  public static void main(String[] args) {
    
      Map<pokemon, MovesDB> pokemonWithMoves = new HashMap<>();
      if(pokemonWithMoves.containsKey()){
        pokemonWithMoves.put(null, null);
      }
      }
  }

