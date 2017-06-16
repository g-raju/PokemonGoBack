package test.stubs;

import model.Deck;
import model.Player;

public class UserPlayer extends Player {
		
	public UserPlayer(String newName){
		super(newName);
		this.name = newName;
		deck = new Deck(2);
//		((Deck) deck).buildDeck();
		((Deck) deck).buildDeckTest();
	}
		
	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}
	
	public void setTurn(boolean newTurn){
		this.turn = newTurn;
	}
}