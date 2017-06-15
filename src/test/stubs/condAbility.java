package test.stubs;

import java.util.ArrayList;

import model.Energy;
import model.Turn;
import model.UserPlayer;

public class condAbility extends model.ability{

	private UserPlayer user;
	private String condition, ability;
	private ArrayList<Energy> EnergyInfo;
	
	public condAbility(String name, String condition, String ability, ArrayList<Energy> EnergyInfo)
	{
		this.name = name;
		this.condition = condition;
		this.ability = ability;
		this.EnergyInfo = EnergyInfo;
	}
	
	public void useAbility() {
		DeckFileReader db;
		if(Turn.getInstance().getCurrentPlayer() == user)
		{
			db = new DeckFileReader(2);
		}
		else
		{
			db = new DeckFileReader(1);
		}
		
		if(condition.equals("flip"))
		{
			db.getAbility(name, ability.split(" "), EnergyInfo);
		}
		else if(condition.equals("choice"))
		{
			
		}
		else if(condition.equals("ability"))
		{
			
		}
		else if(condition.equals("count"))
		{
			
		}
		else if(condition.equals("healed"))
		{
			
		}
	}
	
	public boolean equals(Object o) {
		return false;
	}

}