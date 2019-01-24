package com.boardgame.classes;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private Integer _currentPosition;
	private Integer _currentWorth;
	private List<Integer> _ownedHotels;
	
	public List<Integer> get_ownedHotels() {
		return _ownedHotels;
	}

	public void set_ownedHotels(List<Integer> _ownedHotels) {
		this._ownedHotels = _ownedHotels;
	}

	public Player() {
		// TODO Auto-generated constructor stub
		_currentPosition=0;
		_currentWorth=1000;
		_ownedHotels = new ArrayList<>();
	}

	public Integer get_currentPosition() {
		return _currentPosition;
	}

	public void set_currentPosition(Integer _currentPosition) {
		this._currentPosition = _currentPosition;
	}

	public Integer get_currentWorth() {
		return _currentWorth;
	}

	public void set_currentWorth(Integer _currentWorth) {
		this._currentWorth = _currentWorth;
	}
	
}
