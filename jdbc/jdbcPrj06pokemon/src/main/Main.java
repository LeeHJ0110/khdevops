package main;

import pokemon.PokemonManager;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("=====Pokemon=====");
		PokemonManager pm = new PokemonManager();
		pm.process();
	}

}
