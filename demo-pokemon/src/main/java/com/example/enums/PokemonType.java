package com.example.enums;

public enum PokemonType {
  NORMAL,
  GRASS,
  ELECTRIC,
  WATER,
  FIRE,
  BUG,
  GHOST,
  PSYCHIC,
  STEEL,
  DARK,
  FLYING,
  ICE,
  POISON,
  GROUND,
  ROCK,
  DRAGON,
  FIGHTING,
  FAIRY,
  NONE;

  public PokemonType[] weak, strong, noEffect;
  
  static {
    // Normal
    NORMAL.weak = new PokemonType[] { FIGHTING };
    NORMAL.strong = new PokemonType[] {};
    NORMAL.noEffect = new PokemonType[] { GHOST };
    // Grass
    GRASS.weak = new PokemonType[] { FLYING, POISON, BUG, FIRE, ICE };
    GRASS.strong = new PokemonType[] { GROUND, WATER, GRASS, ELECTRIC };
    GRASS.noEffect = new PokemonType[] {};
    // Electric
    ELECTRIC.weak = new PokemonType[] { GROUND };
    ELECTRIC.strong = new PokemonType[] { FLYING, STEEL, ELECTRIC };
    ELECTRIC.noEffect = new PokemonType[] {};
    // Water
    WATER.weak = new PokemonType[] { GRASS, ELECTRIC };
    WATER.strong = new PokemonType[] { STEEL, FIRE, WATER, ICE };
    WATER.noEffect = new PokemonType[] {};
    // Fire
    FIRE.weak = new PokemonType[] { GROUND, ROCK, WATER };
    FIRE.strong = new PokemonType[] { BUG, STEEL, FIRE, GRASS, ICE, FAIRY };
    FIRE.noEffect = new PokemonType[] {};
    // Bug
    BUG.weak = new PokemonType[] { FLYING, ROCK, FIRE };
    BUG.strong = new PokemonType[] { FIGHTING, GROUND, GRASS };
    BUG.noEffect = new PokemonType[] {};
    // Ghost
    GHOST.weak = new PokemonType[] { GHOST, DARK };
    GHOST.strong = new PokemonType[] { POISON, BUG };
    GHOST.noEffect = new PokemonType[] { NORMAL, FIGHTING };
    // Psychic
    PSYCHIC.weak = new PokemonType[] { BUG, GHOST, DARK };
    PSYCHIC.strong = new PokemonType[] { FIGHTING, PSYCHIC };
    PSYCHIC.noEffect = new PokemonType[] {};
    // Steel
    STEEL.weak = new PokemonType[] { FIGHTING, GROUND, FIRE };
    STEEL.strong = new PokemonType[] { NORMAL, FLYING, ROCK, BUG, STEEL, GRASS, PSYCHIC, ICE, DRAGON, FAIRY };
    STEEL.noEffect = new PokemonType[] { POISON };
    // Dark
    DARK.weak = new PokemonType[] { FIGHTING, BUG, FAIRY };
    DARK.strong = new PokemonType[] { GHOST, DARK };
    DARK.noEffect = new PokemonType[] { PSYCHIC };
    // Flying
    FLYING.weak = new PokemonType[] { ROCK, ELECTRIC, ICE };
    FLYING.strong = new PokemonType[] { FIGHTING, BUG, GRASS };
    FLYING.noEffect = new PokemonType[] { GROUND };
    // Ice
    ICE.weak = new PokemonType[] { FIGHTING, ROCK, STEEL, FIRE };
    ICE.strong = new PokemonType[] { ICE };
    ICE.noEffect = new PokemonType[] {};
    // Poison
    POISON.weak = new PokemonType[] { GROUND, PSYCHIC };
    POISON.strong = new PokemonType[] { FIGHTING, POISON, GRASS, FAIRY };
    POISON.noEffect = new PokemonType[] {};
    // Ground
    GROUND.weak = new PokemonType[] { WATER, GRASS, ICE };
    GROUND.strong = new PokemonType[] { POISON, ROCK };
    GROUND.noEffect = new PokemonType[] { ELECTRIC };
    // Rock
    ROCK.weak = new PokemonType[] { FIGHTING, GROUND, STEEL, WATER, GRASS };
    ROCK.strong = new PokemonType[] { NORMAL, FLYING, POISON, FIRE };
    ROCK.noEffect = new PokemonType[] {};
    // Dragon
    DRAGON.weak = new PokemonType[] { ICE, DRAGON, FAIRY };
    DRAGON.strong = new PokemonType[] { FIRE, WATER, GRASS, ELECTRIC };
    DRAGON.noEffect = new PokemonType[] {};
    // Fighting
    FIGHTING.weak = new PokemonType[] { FLYING, PSYCHIC, FAIRY };
    FIGHTING.strong = new PokemonType[] { ROCK, BUG, DARK };
    FIGHTING.noEffect = new PokemonType[] {};
    // Fairy
    FAIRY.weak = new PokemonType[] { POISON, STEEL };
    FAIRY.strong = new PokemonType[] { FIGHTING, BUG, DARK };
    FAIRY.noEffect = new PokemonType[] { DRAGON };
    // None to avoid null reference errors
    NONE.weak = new PokemonType[] {};
    NONE.strong = new PokemonType[] {};
    NONE.noEffect = new PokemonType[] {};
  }
}