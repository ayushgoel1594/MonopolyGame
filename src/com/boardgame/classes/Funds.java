package com.boardgame.classes;

public class Funds {
	public static final int jailFine = -150;
	public static final int treasureValue = 200;
	public static final int hotelWorth = -200;
	public static final int hotelRent = -50;

	public static void updatedFunds(Game g1, Player player, Hotels hotels){
		String cell = g1.get_cellPositions().get(player.get_currentPosition());
		if(cell=="J"){
			player.set_currentWorth(player.get_currentWorth() + jailFine);
		}
		else if(cell=="T"){
			

			player.set_currentWorth(player.get_currentWorth() + treasureValue);
		}
		else if(cell=="H"){
			Integer currentPosition = player.get_currentPosition();
			if(g1.get_bookedHotels().contains(currentPosition)){
				if(!player.get_ownedHotels().contains(currentPosition)){
					player.set_currentWorth(player.get_currentWorth() + hotelRent);
					
					Player owner = hotels.getOwnedBy().get(currentPosition);
					owner.set_currentWorth(owner.get_currentWorth() -  hotelRent);
				}
				
			}
			else{
				hotels.getOwnedBy().put(currentPosition, player);
				player.get_ownedHotels().add(currentPosition);
				g1.get_bookedHotels().add(currentPosition);
				if(player.get_currentWorth()>= -(hotelWorth))
					player.set_currentWorth(player.get_currentWorth() + hotelWorth);
			}
		}
		
	}
}
