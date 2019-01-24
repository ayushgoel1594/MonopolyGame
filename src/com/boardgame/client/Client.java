package com.boardgame.client;

import java.util.Arrays;
import java.util.Scanner;

import com.boardgame.classes.Funds;
import com.boardgame.classes.Game;
import com.boardgame.classes.Hotels;
import com.boardgame.classes.Player;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g1 = new Game(Arrays.asList("E","E","E","J","H","E","T","J","T","E","E","H","J","T","H","E","E","J","H","E","T","J","T","E","E","H","J","T","H","J","E","E","J","H","E","T","J","T","E","E","H","J","T","E","H","E"));
		System.out.println(g1.get_cellPositions());
		Scanner input = new Scanner(System.in);
		Integer numberOfPlayers = input.nextInt();
		Player[] players = new Player[numberOfPlayers];
		Hotels hotels = new Hotels();
		for(int i=0;i<numberOfPlayers;i++){
			players[i] = new Player();
		}
		Integer[] dice = {4,4,4,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12,2,3,5,6,7,8,5,11,10,12};
		int d=0;
		for(int i=0;i<10;i++){
			for(int j=0;j<numberOfPlayers;j++){
				int diceOutput = dice[d];
				d++;
				System.out.println(diceOutput);
			
				//int diceOutput = Game.diceOutput();
				if(players[j].get_currentPosition()+diceOutput>44)
					players[j].set_currentPosition(players[j].get_currentPosition()+diceOutput-44);
				else
					players[j].set_currentPosition(players[j].get_currentPosition()+diceOutput);
				
				System.out.println("Current position after increment is:P1:"+players[0].get_currentPosition());
				System.out.println("Current position after increment is:P2:"+players[1].get_currentPosition());
				System.out.println("Current position after increment is:P3:"+players[2].get_currentPosition());
				
				
				String cell = g1.get_cellPositions().get(players[j].get_currentPosition());
				System.out.println(cell);
				Funds.updatedFunds(g1,players[j],hotels);
				System.out.println("Current worth is:P1:"+players[0].get_currentWorth());
				System.out.println("Current worth is:P2:"+players[1].get_currentWorth());
				System.out.println("Current worth is:P3:"+players[2].get_currentWorth());
				
			}
		}
		System.out.println(players[0].get_currentWorth());
		System.out.println(players[1].get_currentWorth());
		System.out.println(players[2].get_currentWorth());

	}

}