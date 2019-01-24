package com.boardgame.classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
	private List<String> _cellPositions;
	private List<Integer> _bookedHotels;
	
	public Game(List<String> cellPositions){
		_cellPositions = cellPositions;
		_bookedHotels = new ArrayList<>();
	}

	public List<Integer> get_bookedHotels() {
		return _bookedHotels;
	}

	public void set_bookedHotels(List<Integer> _bookedHotels) {
		this._bookedHotels = _bookedHotels;
	}

	public List<String> get_cellPositions() {
		return _cellPositions;
	}
	
	public static Integer diceOutput(){
		Random random = new Random();
		int diceRollOutput = random.nextInt(11) +2;
		return diceRollOutput;
	}
	
}
