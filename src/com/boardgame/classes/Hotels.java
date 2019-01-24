package com.boardgame.classes;

import java.util.HashMap;
import java.util.Map;

public class Hotels {
	private Map<Integer, Player> ownedBy;
	
	public Hotels(){
		ownedBy = new HashMap<>();
	}
	public Map<Integer, Player> getOwnedBy() {
		return ownedBy;
	}

	public void setOwnedBy(Map<Integer, Player> ownedBy) {
		this.ownedBy = ownedBy;
	}

	
	
}
