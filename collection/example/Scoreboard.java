package com.collection.example;

import java.util.HashMap;

public class Scoreboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		Score sb = new Score(map);
		sb.addPlayer("Anurag");
		sb.addPlayer("Sam");
		
		sb.addRuns("Anurag", 60);
		sb.addRuns("Sam", 70);
		sb.addRuns("Smith", 99);
		
		sb.displayScore();
		
	}

}

class Score{
	HashMap<String, Integer> map = new HashMap<>();
	public Score(HashMap<String, Integer> map) {
		this.map=map;
		
	}
	
	public void addPlayer(String playerName){
		map.put(playerName, 0);
	}
	
	public void addRuns(String name, int runs) {
		int currentScore = map.getOrDefault(name, 0);
		map.put(name, currentScore+runs);
	}
	public void displayScore() {
		System.err.println("SCOREBOARD:  ");
		for(String n: map.keySet()) {
			System.out.println(n+" : "+ map.get(n)+" runs ");
		}
	}
}